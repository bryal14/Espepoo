import tkinter as tk
from tkinter import ttk
from tkinter import messagebox
from pymongo import MongoClient
from passlib.hash import pbkdf2_sha256

# Configuración de la conexión a MongoDB
MONGO_URI = "mongodb://localhost:27017"
DATABASE_NAME = "TiemposDeCarrera"

class ConexionMongoDB:
    def __init__(self):
        self.client = MongoClient(MONGO_URI)
        self.db = self.client[DATABASE_NAME]

    def cerrar_conexion(self):
        self.client.close()

class InterfazUsuario:
    def __init__(self, root, conexion_mongo):
        self.root = root
        self.conexion_mongo = conexion_mongo

        self.label_usuario = ttk.Label(root, text="Usuario:")
        self.label_usuario.grid(row=0, column=0, pady=10, padx=10)
        self.entry_usuario = ttk.Entry(root)
        self.entry_usuario.grid(row=0, column=1, pady=10, padx=10)

        self.label_contraseña = ttk.Label(root, text="Contraseña:")
        self.label_contraseña.grid(row=1, column=0, pady=10, padx=10)
        self.entry_contraseña = ttk.Entry(root, show="*")
        self.entry_contraseña.grid(row=1, column=1, pady=10, padx=10)

        self.boton_ingresar_crear = ttk.Button(root, text="Ingresar/Crear", command=self.ingresar_crear)
        self.boton_ingresar_crear.grid(row=2, column=0, columnspan=2, pady=10)

    def ingresar_crear(self):
        usuario = self.entry_usuario.get()
        contraseña = self.entry_contraseña.get()

        # Verificar si el usuario ya existe en la base de datos
        usuario_existente = self.conexion_mongo.db.usuarios.find_one({"usuario": usuario})

        if usuario_existente:
            # Usuario existente, verificar la contraseña
            if pbkdf2_sha256.verify(contraseña, usuario_existente["contraseña"]):
                # Contraseña correcta, abrir la ventana de datos
                self.abrir_ventana_datos()
            else:
                self.mostrar_mensaje("Contraseña incorrecta.")
        else:
            # Crear nuevo usuario
            hashed_contraseña = pbkdf2_sha256.hash(contraseña)
            self.conexion_mongo.db.usuarios.insert_one({"usuario": usuario, "contraseña": hashed_contraseña})
            self.mostrar_mensaje("Usuario creado con éxito. Ingresando a la ventana de datos.")
            self.abrir_ventana_datos()

    def abrir_ventana_datos(self):
        self.root.withdraw()
        ventana_datos = tk.Toplevel(self.root)
        interfaz_datos = InterfazDatos(ventana_datos, self.conexion_mongo, self.entry_usuario.get())
        ventana_datos.protocol("WM_DELETE_WINDOW", lambda: self.cerrar_ventana_datos(ventana_datos))
        ventana_datos.mainloop()

    def cerrar_ventana_datos(self, ventana_datos):
        self.root.deiconify()
        ventana_datos.destroy()

    def mostrar_mensaje(self, mensaje):
        messagebox.showinfo("Mensaje", mensaje)

class InterfazDatos:
    def __init__(self, root, conexion_mongo, usuario):
        self.root = root
        self.conexion_mongo = conexion_mongo
        self.usuario = usuario

        self.label_tiempo = ttk.Label(root, text="Tiempo de Carrera:")
        self.label_tiempo.grid(row=0, column=0, pady=10, padx=10)
        self.entry_tiempo = ttk.Entry(root)
        self.entry_tiempo.grid(row=0, column=1, pady=10, padx=10)

        self.label_distancia = ttk.Label(root, text="Distancia de Carrera:")
        self.label_distancia.grid(row=1, column=0, pady=10, padx=10)
        self.entry_distancia = ttk.Entry(root)
        self.entry_distancia.grid(row=1, column=1, pady=10, padx=10)

        self.label_sensaciones = ttk.Label(root, text="Sensaciones durante la Carrera:")
        self.label_sensaciones.grid(row=2, column=0, pady=10, padx=10)
        self.entry_sensaciones = ttk.Entry(root)
        self.entry_sensaciones.grid(row=2, column=1, pady=10, padx=10)

        self.boton_almacenar = ttk.Button(root, text="Almacenar", command=self.almacenar_datos)
        self.boton_almacenar.grid(row=3, column=0, columnspan=2, pady=10)

    def almacenar_datos(self):
        tiempo = self.entry_tiempo.get()
        distancia = self.entry_distancia.get()
        sensaciones = self.entry_sensaciones.get()

        if tiempo and distancia and sensaciones:
            # Almacenar datos en MongoDB
            self.conexion_mongo.db.datos_carrera.insert_one({
                "usuario": self.usuario,
                "tiempo": tiempo,
                "distancia": distancia,
                "sensaciones": sensaciones
            })
            messagebox.showinfo("Mensaje", "Datos almacenados con éxito.")

if __name__ == "__main__":
    root = tk.Tk()
    root.title("Ingreso de Usuario")

    conexion_mongo = ConexionMongoDB()
    interfaz_usuario = InterfazUsuario(root, conexion_mongo)

    root.mainloop()

    # Cerramos la conexión a MongoDB al salir de la aplicación
    conexion_mongo.cerrar_conexion()
