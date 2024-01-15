class Persona:
    def __init__(self,nombre,edad,nacionlidad):
        self.nombre = nombre
        self.edad = edad
        self.nacionlidad = nacionlidad
    def comer (self):
        print("Comiendo...")


class Artista:
    def __init__(self, habilidad):
        self.habilidad =  habilidad
   
    def habilidad(self):
            print(f"Mi habilidad es: {self.habilidad}")

class EmpleadoArtista (Persona,Artista):
    def __init__(self, nombre, edad, nacionlidad,habilidad,salario,empresa):
        Persona.__init__(self,nombre, edad, nacionlidad)
        Artista.__init__(self,habilidad)
        self.salario = salario
        self.empresa = empresa
    
    def presentarse (self):
            return f'{super().habilidad()}'

P1 = EmpleadoArtista("Bryann", 19, "Ecuatoriano", "Cantar", 11899,"NASA")
P1.presentarse()
