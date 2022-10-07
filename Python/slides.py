#falta padronizar

#0 é False
#1 é True ou qualquer outro numero 

from curses.ascii import isalpha


Comando de Atribuição

   variavel =
   variavel =  variavel2 + 7


Variaveis

    locais
    globais

    type(variavel)  # retorna o tipo do dado ali dentro


Declaração

   variavel  # simples assim
             # só escrever e atribuir qualquer dado


Tipos de Dados:

    Int(inteiro)

       variavel = 18
       variavel = 2002


    Float(ponto flutuante)

       # float sobressai a int 
       variavel = 12.3
       variavel = 0.6666
       .is_integer()        # retorna true se for inteiro


    Complex(complexo)

        # a parte imaginaria é dada por j
        variavel = complex(real[, imag])  # função que cria
        variavel = complex(2, 5)
        variavel = 5+2j


    String(texto)

        # string original é imutavel, pode fazer operações e gerar outra string resultado

        'texto'
        "texto"
        """texto bem...
        ...grande mesmo""" ou com 3 aspas simples
        "marca d'agua"
        'marca d\'agua'
        'Texto com "aspas duplas" dentro'
        "marca d\"agua"

        string = 321123
        str(string)  # transforma em string

        string = '321' + '123'  # concatena os textos
        string = '1' * 3 + '2'  # repete o 1 umas 3 vezes e concatena com o 2 no final

        string[0]       # igual no C
        string[:]       # fatiamento
        string[-1]      # de tras pra frente
        string[-5:]     # pega do -5 e vai até o final -1
        string[:3]      # pega do 0 até o 2, sempre o final menos 1
        string[a:b:c]   # a é o inicio, b é o final, e c é como vai andar
        string[:3:2]    # do inicio até o 2, de 2 em 2
        string[::-1]    # anda do final até o começo 0, anda de tras pra frente

        len(string)         # retorna o tamanho
        string.count('a')   # conta quantas vezes aparece
        string = string.upper()  # texto maiusculo
        string = string.lower()  # texto minusculo
        .replace('a', 'b')  # troca, onde tem a bota b
        .split()            # corta as palavras onde tem espaço
        .split('A')         # corta as palavras onde tem o A e tira o A
        .isalnum()          # retorna true se forem alfanumericos
        .isalpha()          # retorna true se forem letras        
        'py' in string      # retorna true se estiver, diferencia maiuscula de minuscula

        Interpolação

            print('Nome: %s Idade: %.2f' % (nome, idade)) # versão antiga
            print('Nome: {0} Idade: {1}'.format(nome, idade))
            print(f'Nome: {variavel} Idade: {idade} {2 ** 8 + 1}')

            from string import Template

            s = Template('Nome: $Noume Idade: $Idaude')
            print(s.substitute(Noume=nome, Idaude=idade))


    Bool(boleano)

      variavel = True
       variavel = False


    List(listas)

        lista = [1, 3.3, True, "texto"]
        lista = []
        lista[0]        # acessa primeiro item
        lista[-1]       # acessa o ultimo item

        lista.append()  # incluir ao final da lista
        lista.remove()  # remove o que esta entre ()
        lista.reverse() # reverte os itens, de traz pra frente
        lista.index()   # retorna a posição do elemento na lista
        item in lista   # retorna true se item estiver na lista
        item not in lista 

        lista[:]  # fatiamento
        lista[::]  # inicio fim passo

        del lista[2]    # deleta o elemento no indice 2
        del lista[1:]   # deleta do indice 1 pro final

        # lista de lista - praticamente matriz
        lista[[1, 2, 3], [4, 5, 6], [7, 8, 9]]


    Tuple(tuplas)  # lista que nao pode ter seus elementos alterados

        variavel = (1, 3.3, True, "texto")
        tupla = tuple(lista)
        tupla = ()
        tupla = ('um',)    # assim para criar tupla com 1 elemento
        tupla[0]           # acessa o primeiro elemento do indicie
        tupla[-1]
        tupla[1:]
        tupla.index(item)  # retorna o index do item
        tupla.count(item)  # conta quantas vezes o item se repete na tupla
        len(tupla)         # retorna a quantidade de elementos


    Dict(dicionarios)   # lembra struct

        dicionario = {}
        dicionario = {chave: valor, chave: valor}

        dicionario[chave]       # retorna o valor
        dicionario[chave] = valor  # cria uma nova chave com o valor dado
        *essa chave pode ser inteiro ou string
        dicionario[chave][index]    # acessa items dentro da chave
        dicionario[chave].append(item)

        dicionario.pop(chave)   # lê e retira a chave e valor
        dicionario.keys()       # retorna só as chaves
        dicionario.values()     # retorna só os valores
        dicionario.items()      # retorna as chaves e seus valores
        dicionario.get(chave)   # retorna o valor da chave
        dicionario.get(chave, [])   # retorna o [] se não tiver valores
        dicionario.update({chave: valor})   # atualiza a chave e valor
        del dicionario[chave]   # deleta a chave e valor
        dicionario.clear()      # apaga todo o dicionario


    Sets  # imutaveis

        # set não da garantia que os elementos estarão ordenados como na entrada ou atribuição deles no set

        # estrutura que não aceita índice
        set = {1, 2, 3, 4, 5}  # cria um set
        set = set()  # cria um set vazio

        item in set
        item not in set
        {1, 2, 3} == {3, 2, 1, 3}   # true pois os mesmos elementos estão nos dois conjuntos, a ordem não importa e os duplicados serão removidos

        set.add(elemento)  # adiciona
        set.union(set2)     # gera um terceiro conjunto uniao
        set.intersection(set2)  # gera terceiro conjunto interseção
        set.update(set2)    # inclue os elementos nao repetidos no primeiro conjunto

        set2 <= set         # true se set2 é subconjunto de set
        set >= set2         # true se set contém set2
        set - set2          # retorna a diferença entre os conjuntos
        set -= set2         # subtrai o elemento e atribui o resultado
        set.discard(elemento)  # remove
        # inclui cada elemento desordenadamente, inclusive numeros, e nao aceita elementos duplicados

        s3 = s1 | s2  # operação uniao dos conjuntos
        s3 = s1 & s2  # operação intersseção dos conjuntos
        s3 = s1 - s2  # elemento unico do s1, do conjunto a esquerda
        s3 = s1 ^ s2  # elemento unico de cada conjunto, que estão nos dois mas não em ambos


    None (null)

        variavel = None


Conversão de Tipos

    int()       #converte pra inteiro
    str()       #converte pra string
    bool()      #converte pra True ou False
    complex()   #converte para um numero com parte real e imaginaria
    float()     #converte para um float


Comentário

    # comentário

        Shebang

            #!/usr/local/bin/python3
            qual interpretador sera usado



Entrada de Dados

    input()  # cuidado, número entra como texto
    int(input())
    float(input())
    # mostra o texto e fica esperando a entrada do usuario
    variavel = input('texto')

Operadores Aritmeticos

    +   soma
    *   multiplicação
    ** potência
    /   divisão
    // divisão pegando só parte inteira
    %   resto da divisão

    '''#pré ou pós fixado
    ++  incremento 
    --  decremento''' #Não funciona em Python

Operadores Relacionais

    >   maior que
    >=  maior ou igual
    <   menor que 
    <=  menor ou igual
    !=  diferente 
    ==  igual
    ==

Operadores de Atribuição 

    +=
    -=
    *=
    /=
    %=
    **=
    //=


Operadores Lógicos   #resulta em True ou False

    and   E
    or    Ou
    !=    XOu
    not   Negação 


Operadores bit a bit

    &     E
    |     Ou
    ^     XOu  


Operadores Unarios 

    que trabalha ao lado de somente um operando
    como o:
    not


Operadores Binários

    que trabalha com dois operandos
    como o:
    +
    -
    and
    e por aí vai 


Operadores Ternários

    que trabalha com três operandos

    esta_chuvendo = True

    'Hoje estou com as roupas ' + ('secas.', 'molhadas.') [esta_chuvendo]

    'Hoje estou com as roupas ' + ('molhadas.' if esta_chuvendo else 'secas.')

Ordem de Precedencia

    ()   parenteses
    ** exponenciação
    # com a mesma precedencia sao executados da esquerda pra direita
    * / // multiplicação, divisão, divisão inteira
    + - soma, subtração


Operadores 

    Operador de Membro #faz parte ou é membro

        lista = [1, 2, 3, 'Ana', 'Carla']
        2 in lista
        'Ana' not in lista


    Operador de Identidade

        #No tipo básico

        x = 3
        y = x 
        z = 3
        x is y       #True pelo fato que eles tem o mesmo valor
        y is z       #True porque eles tem o mesmo valor
        x is not z   #False porque os dois são 3

        #Na lista

        lista_a = [1, 2, 3]
        lista_b = lista_a
        lista_c = [1, 2, 3]
        lista_a is lista_b       #True tanto a A quanto a B apontam pro mesmo espaço de memória, ja a C não aponta pro mesmo local por isso da falso
        lista_b is lista_c       #False
        lista_a is not lista_c   #True

        #as listas ligadas A e B, se alterado o conteudo em uma delas, altera na outra


Saída de Dados

    print()   # variavel ou "texto"
    print("%s" % variavel)   # %d-inteiro
    print("{}" .format(variavel))
    print('{:.2f}' .format(variavel))
    print("{0} {1} {0}" .format(variavel1, variavel2))
    print(f"{variavel}")


Estrutura de Decisão

    if variavel:
        print(variavel)

    elif variavel1:
        print(variavel1)
        
    else:
        print('texto')

    if 'letra' in palavra:

    if 0 < idade < 18:

    elif idade in range(18, 50):

    for i in range(5):
        print(i)  # imprime de 0 a 4

    for i in palavra:
       print(i)  # imprime letra por letra

    for idade in (17, 35, 87, 101, 2, -99):

    for nome in lista:
        print(nome)  # imprime os nomes dentro da lista

    for posicao, nome in enumerate(lista):
        print(f'{posicao + 1} - ', nome)  # imprime o indice de cada nome e o nome desse indice da lista

    # 3 formas de percorrer dicionario
    # pela chave, pelo valor, ou pela chave e valor
    
    for chave in produto: # ou produto.keys() porém é redundante
        print(chave)

    for valor in produto.values():
        print(valor)

    for chave,valor in produto.items():
        print(f'{chave} = {valor}')

    for i in range(1, 11):
        if i % 2 == 0:
            continue   # vai imprimir os numeros impares
        print(x)       # que nao sao divisiveis por 2

    while variavel < 10:
        print(variavel)
        break

Bibliotecas Ou Modulos

  from hashlib import sha3_224
   from io import RawIOBase
    from numpy import var
    import biblioteca
    from biblioteca import livro
    from biblioteca.livro import pagina
    from biblioteca.livro import pagina as pg

    math
    datetime
    os
    random


Builtins

    __builtins__.type('E ai')
    __builtins__.print(10)
    __builtins__.help(__builtins__.dir)
    dir('''sem nada''')         #mostra o que esta dentro do escopo global da aplicação


Funções

  def nome_da_funcao(parametro):
       # o que a funcao faz
       return

Estrutura de Dados


Outros

    sys.argv[0]    # nome do arquivo chamado
    sys.argv[1+]   # argumentos passado apos o nome separados por espaços
    sys.exit(1)    # retorna pro SO que terminou com erro
    len(variavel)  # quantos itens na lista ou outros
    item in variavel  # retorna True or False
    del variavel[0]  # deleta o elemento
    from decimal import Decimal, getcontext     # porque se somar 1.1 + 2.2 dá 3.300...3
    getcontext().prec = 4       # para especificar pro programa a precisão de decimais que deseja
    Decimal(1) / Decimal(7)
    Decimal.max()               # retorna o maior decimal que colocar entre os () 
    # arredondamente também tira as imperfeições que podem ocorrer