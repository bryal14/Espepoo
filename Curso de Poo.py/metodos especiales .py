class Persona:
    def __init__(self, nombre, edad):
      self.nombre = nombre
      self.edad = edad

    def __str__(self):
       return f"Persona(nombre={self.nombre},edad ={self.edad})"

    def repr(self):
       return f"Persona({self.nombre},{self.edad})"
    
    def __add__ (self,otro):
       nuevo_valor = self.edad + otro.edad
       return Persona(self.nombre+otro.nombre,nuevo_valor)
    
Bryan= Persona ("Bryan",21)
jose=Persona ("jose",14)
ernesto=Persona ("maria",11)

nueva_persona = Bryan + jose + ernesto

print (nueva_persona.nombre)