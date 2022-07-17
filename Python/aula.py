import ctypes

NUM = 16

fun = ctypes.cdll.LoadLibrary(".\libfun.dll")

fun.imprimir.argtypes = []

fun.imprimir()


'''# Desafio Operadores Lógicos

def saida_ao_shopping(terca, quinta):

    if (terca and quinta):

        print("sair, comprar tv de 50p, e tomar sorvete")

    elif (terca or quinta):

        print("sair, comprar tv de 32p, e tomar sorvete")

    else:

        print("vamos ter que ficar em casa mesmo")


trabalho_de_terca = False
trabalho_de_quinta = False


saida_ao_shopping(trabalho_de_terca, trabalho_de_quinta)

wn = t.Screen()
alex = t.Turtle()

for i in range(1):      # repita 4 vezes
    alex.forward(50)
    alex.left(90)

wn.exitonclick()

apelido = sys.argv[1]
print('Ola, '+ apelido[3:])
print(len(apelido))

d = {'c': 97, 'a': 96, 'b': 98}
for _ in sorted(d):
    print(d[_], end=' ')


variavel = [1, 3.3, True, "texto"]
#variavel[1] = 'Dirceu'
print(variavel[:], end='\n')
print('Dirceu' in variavel)

string = 'dirceu'
print(string.isalnum())'''
