class Automovil():
    def __init__(self,):
      self.apagado = "Auto apagado"
    
    def encenderauto (self):
       self.encenderauto = "encendiendo auto"
       print ("El carro esta prendido")

    def conducir (self):
       if self.conducir == "apagado":
        self.encenderauto()
    print("El auto esta listo para conducirse ....")

miauto = Automovil()
miauto.conducir()