# crear un sistema para una escuela vamos a tener dos clases principales 
# 1.- persona 2,. estudiante, la clase persona tendrá 
# atributos edad y un metodo que imprima el nombre y la edad de la persona 
# la clase estudiante heredara de la clase persona y tendrá atributo adicional 
# grado y un metodo que imprima el grado del estudiante 

# usar el init para reutilizar el codigo de la clase 
# padre persona luego crea una instancia de la clase estudiane 
# e imprime sus atributos y utiliza sus metodos 
# para asegurarte que todo funciona correctamente 

class Persona:
    def __init__(self, edad, nombre):
        self.edad = edad
        self.nombre = nombre

    def imprimirNombreyEdad(self):
        print(self.nombre,self.edad)

class Estudiante(Persona):
    def __init__(self, edad, nombre, grado):
        super().__init__(edad, nombre)
        self.grado = grado

    def imprimirgrado(self):
        print(self.grado)

estudiante = Estudiante(11, "Bryan", "6 grado")


estudiante.imprimirNombreyEdad()

estudiante.imprimirgrado()