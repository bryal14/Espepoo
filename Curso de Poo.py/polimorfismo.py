class Perro:
    def sonido(self):
        return "wauw"
    def imprimirsonido(self):
        print (self.sonido)
    
class Gato:
    def sonido(self):
        return "miau"
    def imprimirsonidos(self):
        print (self.sonido)
    
perro = Perro ()
gato = Gato ()

print (perro.sonido())
print (gato.sonido())