#Un metodo es una funcion

class Celular:

    def __init__(self, marca, modelo, camara) :
        self.marca = marca
        self.modelo= modelo 
        self.camara = camara

    def llamar(self):
        print(f'\nEstas llamando desde un:  {self.modelo} ')

    def cortar(self):
        print (f'\nSe ha cortado la llamada desde un : {self.marca}')
    
celular1 = Celular("samsung", "S23", "48MP")
celular2 = Celular("Apple","IPhone14 Pro","789MP")

celular2.llamar()
    