class Estudiante:
    def __init__(self, nombre, edad, grado):
        self.nombre = nombre
        self.edad=edad
        self.grado=grado
    def estudio(self):
        print ("Estudiando arduamente......")
    def ejercicio(self):
        print("Yendo al gym y saliendo a correr....")

nombre = input("\nEscriba el nombre del estudiante: ")
edad = input("\nAgrege la edad del estudainte: ")
grado= input("\nAgrege el grado academico del estudiante: ")

alumno = Estudiante (nombre, edad ,grado)

print("\n Los datos del estudiante son: " + "\n"+alumno.edad + "\n"+ alumno.grado + "\n" +alumno.nombre)
print ("Las accinones que realiza el estudiante son : " ) , alumno.estudio() , alumno.ejercicio()