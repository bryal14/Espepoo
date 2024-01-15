class Persona:
    def __init__(self,nombre,edad):
        self.nombre = nombre
        self.__edad= edad

    def get_edad(self):
        return self.__edad

    def set_edad(self,nuevaedad):
        self.__edad = nuevaedad

bryan = Persona("Bryan", 19)
print(bryan.nombre )
edad = bryan.get_edad()
print(edad)


bryan.set_edad(12345)

edad = bryan.get_edad()
print (edad)
