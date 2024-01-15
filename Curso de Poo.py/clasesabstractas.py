from abc import ABC, abstractclassmethod

class Persona(ABC):
    @abstractclassmethod
    def __init__(self, name, age,sex,activity):
      self.name = name
      self.age = age
      self.sex = sex
      self.activity = activity

    @abstractclassmethod
    def hacer_actividad (self):
       pass
    def present (self):
       print (self.name,self.age,self.sex,self.activity)


class Estudiante (Persona):
       def __init__(self, name, age,sex,activity):
           super().__init__(name, age,sex,activity)

       def hacer_actividad(self):
           print (f"Estoy estudiando: {self.hacer_actividad} ")

class Trabajador(Persona):
    def __init__(self,name, age,sex,activity):
        super().__init__( name, age,sex,activity)
        
    def hacer_actividad(self):
        print (f"Estoy trabajanado: {self.hacer_actividad}")

bryan = Estudiante("Bryan", 12, "masculino","estudio")
jose = Trabajador("Jose",45,"masculino","programador")

bryan.hacer_actividad()
bryan.present()
#jose.present()


        
           
           