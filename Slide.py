'''Modelo para Padronização dos Materiais de Apoio das Linguagens


       Arquivo  "Slide.linguagem"


       Compilar

Linux:	 
    
    py ou python3 arquivo.py

Windows:    

    py ou python3 arquivo.py


0  -  Sobre a Linguagem		(breve historia, motivacao, paradigma, qualidades)

1  -  Local de cada coisa no código	(como é a estrutura básica da codificação nessa linguagem)

    Estruturado

        bibliotecas
        constantes
        variaveis globais

        funcoes
        main

    Orientado Objeto

        bibliotecas
        classes pai
        {atributos, metodos, construtor}
        classes filho
        main


2  -  Comentarios			(o que usam para fazer comentários no código)

    '''  '''    comentário de texto
    """  """    comentario de texto
    #           comentário de linha


3  -  Atribuição			(simbolo usado para atribuicao dos dados a uma variavel e como atribuir)

    =


4  -  Tipos de Dados			(primitivos, nao primitivos, comum as linguagens e especificos dela)

    Primitivos

        int             1, 2, 3             
        float           1.0, 3.333
        str             letra e texto
        bool            True ou False

    Nao Primitivo

        lista
        tupla
        dicionario
        


5  -  Modificadores			(java e outras linguagens que tenham)

6  -  Variavel e Constante		(local, global, parametro, constante, classe, atributo, metodo)

    local           dentro da função
    global          fora da função, antes do main, logo após as bibliotecas

    variavel
    CONSTANTE

    self            é como o this


7  -  Declaração			(como declaram todos os tipos de dados)

    variavel = modificador(input())             modificador pode ser (int, str, float, bool)
                                                sem o modificador a entrada é string

    lista = []                  declara lista vazia
    lista = list()              converte alguma estrutura em lista
    lista = [10, [1, 2, 3]]     lista de listas

    tupla = ()                  tupla é imutavel
    tupla = tuple()
    tupla = item, item, item

    dicionario = {}
    dicionario = dict()
    dicionario = {'chave': 'valor'}

    Lista

        lista[indice]
        lista[linha][coluna]
        lista[inicio:final - 1:passo]       fatiamento

    Tupla

        tupla[indice]
        tupla[fati:a:mento]

    Dicionario

        dicionario[chave]
        dicionario[nova chave] = item       adiciona nova chave e item nessa chave
        chave in dicionario                 retorna True se tiver

    def funcao(arg, *args):
        for argumentos in arg:
            print(argumentos)

    class Classe:

        def __init__(self, atributo: tipo):         construtor
            self.atributo = atributo    

        def metodo(self, parametro: tipo):


8  -  Operadores (matematicos, logicos, comparacao)

    Matematicos

        +           soma
        -           subtração
        *           multiplicação
        /           divisão
        //          divisão inteira
        %           módulo ou resto da divisão
        **          potenciação

    Atribuição

        +=          soma e atribui
        -=          subtrai e atribui
        *=          multiplica e atribui
        /=          divide e atribui
        %=          calcula o resto e atribui

    Comparação

        >           maior que
        <           menor que
        ==          igual
        !=          diferente
        >=          maior ou igual
        <=          menor ou igual

    Lógico

        and         e
        or          ou
        not         negação

    Identidade

        is          retorna True se forem os mesmos objetos
        is not      retorna True se nao forem os mesmos objetos

    Associação 

        in          True se estiver dentro
        not in      True se não estiver dentro


9  -  Impressao			(formas de imprimir em cada local, como saida padrao no terminal ou arquivo)

    print()


10  -  Escaneamento			(formas de coletar o dado e os locais, como teclado ou arquivo)

    variavel = input()


11  -  Estruturas (condicionais, repeticao)

    Controle

        if:
        elif:
        else:

    Repeticao

        for i in range:
        for item in lista:
        for letra in palavra:
        for chave,valor in dicionario.items()

        for 
        else

        while condicao:

        while
        else


12  -  Bibliotecas			(bibliotecas mais usadas da linguagem)

13  -  Função e Parâmetro		(como se declara uma função e seus parametros)

    Parametros

        *args           usado para receber uma lista de argumentos nao nomeados
        **kwargs        recebe argumentos nomeados, funcionando como um dicionario, onde os nomes são as chaves e os valores valores

    type()              retorna tipo
    len()               retorna tamanho
    range()             retorna numeros até o final - 1
    sum()               retorna a soma de todos os itens
    max()               retorna o maior valor da lista
    min()               retorna o menor valor da lista

    def funcao(parametros):
        return

        parametro='alguma coisa'        entende que se nao passar nada, o 'alguma coisa' sera o valor padrao


14  -  Ponteiro			(como trabalhar com ponteiros na linguagem)

15  -  Alocação Dinâmica		(alocar e desalocar memória)

16  -  Leitura e Escrita em arquivo	(toda a forma de se trabalhar com arquivo exceto impressao e escaneamento)

    with open() as variavel:
    variavel = open(nome_do_arquivo, modo)

        modo                é o que queremos fazer com o arquivo, ler escrever etc

            r               reading, leitura
            w               write, escrita (cuidado pois sobrescreve o arquivo)
            a               de append, adiciona ao final do arquivo
            b               para trabalhar no modo binario

    variavel.write()
    variavel.read()
    variavel.close()


17  -  Topicos Avançados (macro, construir biblioteca, compilação, api)

    Metodos
    
        Lista

            .append()                   adiciona item ao final
            .insert(indice, item)       adiciona o item no indice especificado
            .extend()                   adiciona os itens ao final, concatena
            .pop()                      remove o ultimo item ou item no indice especificado
            .remove()                   remove o item especificado no menor indice, na primeira aparição
            .index()                    retorna o index do item especificado
            .sort()                     ordena de forma crescente os itens
            .sort(reverse=True)         ordena de forma decrescente

        Tupla

            .index()


    
'''
