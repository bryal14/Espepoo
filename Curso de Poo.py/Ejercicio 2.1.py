class Animal():
    def comer(self):
        print ("comiendo....")
    
class Ave (Animal):
    def volar(self):
        print ("volando....")
    
class Murcielago (Animal):
    def amamantar(self):
        print ("Amamantando...")

class anima(Murcielago,Ave):
    pass

animal1 = anima()

animal1.comer()
animal1.volar()
animal1.amamantar()