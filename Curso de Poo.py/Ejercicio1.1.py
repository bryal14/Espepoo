class Estudiante:
    def __init__(self, nombre, edad, grado):
        self.nombre = nombre
        self.edad=edad
        self.grado=grado

alumno1 = Estudiante ("Bryan",12,6)

print(alumno1.nombre)