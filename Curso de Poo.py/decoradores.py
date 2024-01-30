def decorador(funcion):
    def funcion_modificada():
        print("Antes de llamr a la funcion")
        funcion()
        return funcion_modificada()
    
    # def saludo():
    #     print("hola kevin")

    # saludo_modificado = decorador(saludo)
    # saludo_modificado()

    @decorador
    def saludo():
        print("Hola como estas ")

    saludo()