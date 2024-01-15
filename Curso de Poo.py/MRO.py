class A:
    pass

class B(A):
    pass

class C(A):
    def hablar(self):
        print("hola desde c")


class D(B,C):
    pass
    
d = D ()
d.hablar()