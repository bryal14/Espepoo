class Celular:
    def __init__(self, marca, modelo, camara) :
        self.marca = marca
        self.modelo= modelo 
        self.camara = camara
    
celular1 = Celular("samsung", "S23", "48MP")
celular2 = Celular("Apple","IPhone14 Pro","789MP")

print(celular2.camara)
    