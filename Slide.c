/*

            Modelo para Padronização dos Materiais de Apoio das Linguagens



        COMPILAR

    Linux:    gcc -o nome_da_saida codigo.c
              ./nome_da_saida

    Windows:  F6  -  VsCode



        SOBRE A LINGUAGEM

    Fundada em 1972 por Dennis Ritchie
    Derivada do BCPL e Algol68
    Imperativa, chamada de funções que mudam o estado do programa
    Facilmente portavel, o mesmo código pode rodar em arquiteturas diferentes
    Modular, pode ser divida em vários blocos de código distintos
    Baixo nível, pois tem recusos para controle de memória da máquina
    Paradigma Estruturado
    Toda linha de comando se encerra com ; linha de comando, não bloco de código



        LOCAL DE CADA COISA NO CODIGO

    #include bibliotecas

    #define macros

    void protótipos(parametros) ou funcoes(parametros){codigo};

    declaração de variaveis globais;

    int main(int argc, char *argv[ ])
    {
        declaração de variaveis locais;

        leitura;

        codigo;

        impressao;

        return 0;
    }

    funcoes(parametros){codigo};

*/
/*
        COMENTARIOS

    //  comentário de linha
    /*
        comentario de texto ou bloco
    */
/*


        ATRIBUIÇÃO

    =   recebe

    variavel = dado;

    variavel[] = {1, 2, 3, 4};

    variavel = 3.333;

    variavel = 'a';

    variavel[] = {"palavra"};

    #define  CONSTANTE  dado ou função



        TIPOS DE DADOS

    Primitivos

        int         numeros inteiros

        float       numeros reais

        double      numeros reais de precisão dupla (menos problemas que float)

        char        letra

        bool        booleano, somente true ou false (1 ou 0)


    Outros      (todos os outros tipos comuns nao primitivos e especificos da linguagem)

        variavel[tamanho]           vetor onde cada casa contem um dado do mesmo tipo da variavel

        variavel[linha][coluna]     matriz onde cada interseção linha x coluna contem um dado do mesmo tipo da variavel

        struct nome                 variavel que contem diversas outras variaveis dentro
        {
            tipo variavel;
            tipo variavel;
            tipo variavel;
        };



        MODIFICADORES

    só em Java



        VARIAVEL E CONSTANTE

    cuidado pois o dado de uma variavel pode ser alterado em qualquer local do codigo

    local                   funciona somente dentro do bloco de código que foi declarado

    global                  funciona em qualquer local do codigo, porem somente dentro do arquivo

    parametro               declarado junto com a função, funciona somente enquanto a função esta sendo executada

    constante               o dado de uma constante permanece o mesmo desde a sua declaração



        DECLARAÇÃO

    tipo variavel;

    tipo variavel1, variavel2, variavel3;

    int variavel[inteiro];

    int variavel[linha][coluna];

    float/double variavel[inteiro];

    char variavel[tamanho];

    char variavel[linha][coluna];

    struct variavel
    {
        tipo variavel;
    };

    #define  CONSTANTE  dado ou função



        OPERADORES

    Matematicos

        +           soma
        -           subtração
        *           multiplicação
        /           divisão
        %           resto da divisao (modulo)
        ++          incremento
        --          decremento

        ++variavel      soma depois atribui
        variavel++      atribui depois soma


    Comparação

        >           maior que
        >=          maior ou igual
        <           menor que
        <=          menor ou igual
        ==          igual
        !=          diferente


    Lógicos

        &&          e       and
        ||          ou      or
        !           negacao not


    Bit a bit

        &           e
        |           ou
        ^           ou exclusivo
        ~           not / complemento de 1
        <<          deslocamento a esquerda
        >>          deslocamento a direita

        variavel<<2     001 deslocando 2 bits a esquerda vira 100


    Atribuição

        +=          soma e atribui
        -=          subtrai e atribui
        *=          multiplica e atribui
        /=          divide e atribui
        %=          resto e atribui



        IMPRESSÃO

    puts("string string")      imprime string

    putchar("a")               imprime letra

    printf("%d\n", variavel)

        % c     caracter
        % d     inteiro
        % e     notação cientifica
        % o     octal
        % x     hexadecimal
        % ld    inteiro long com sinal
        % lld   inteiro com long long
        % f     ponto flutuante
        % .3f   ponto flutuante com 3 casas decimais
        % lf    ponto flutuante de precisão dupla
        % s     string
        % %     imprime caracter %
        % p     endereço da memória em hexadecimal


        sequencia de escape

        \n      pula pra linha de baixo
        \t      espaçamento do tab
        \a      faz um beep no auto falante
        \\      imprime barra invertida
        \"      imprime aspa dupla


        %[opções][largura do campo][.precisão][tamanho da variável]tipo de dado

        essa é a formatação do printf que pode ser utilizada e combinada

        exceto o tipo de dado, os outros parametros sao opcionais e devem ter a ordem respeitada


        opções são parametros que alteram a formatação

            0       ou outro numero, preenche com 0s a esquerda quando necessario se for numero
            -       altera o padrão pra alinhamento a esquerda, o padrão é a direita
            espaço  no caso de formatos que admitem sinal, deixa espaço a esquerda do numero positivo
            +       mostra o sinal do numero a esquerda dele


        largura do campo especifica a largura do campo, preenche com espaço ou zeros

            *       printf("%*d", variavel, 6);   imprime "      3"
            0       ou outro numero para preencher com espaço ou zero


        precisão pode ter varios usos

            printf ("%.5d", 314);               // exibe "00314"
            printf ("%.5f", 2.4);               // exibe "2.40000"
            printf ("%.5g", 23456789012345);    // exibe "2.3457e+13"
            printf ("%.5s", "Bom dia");         // exibe "Bom d"


        tamanho da variavel é usado para algumas conversões ou exibição de modificadores de tipo

            hh      para exibir uma variavel tipo char na base desejada, como %hhd para exibir o inteiro de uma letra
            h       quando usamos short antes do tipo primitivo
            l       quando usamos long antes do tipo primitivo
            ll      quando usamos long long antes do tipo primitivo
            L       quando usamos long double antes do tipo primitivo


    fprintf(*arquivo, "texto/impressor", ...);              imprime / escreve no arquivo

    fprintf(stdout, "texto/impressor", ...);                imprime / escreve no monitor

    sprintf(variavel1, formatação, variaveis2);             pega o conteudo da variavel2, formata e insere na variavel1, como se tivesse imprimindo 
                                                            dentro do vetor de string que é a variavel1



            ESCANEAMENTO

    gets(array)                         faz a captura do teclado para o array inserindo \0 ao final, porém não é seguro 
                                        porque não há controle de entrada, podendo a entrada ser maior que o tamanho do array

    getchar(char)                       faz a leitura de apenas um caractere

    scanf("formatação", &variavel)      como a função printf, porém para leitura

        continuação em https://pt.wikibooks.org/wiki/Programar_em_C/Imprimir#puts()_e_putchar()












#Comando de Atribuição
        ' = '
        variável = 10 ou 'c'   atribui o numero ou a letra, a variavel


#Variáveis

        locais - só funcionam dentro do main ou função onde foram declaradas
        global - são declaradas fora do main e podem ser chamadas onde for no código
        parâmetros formais - dentro dos parenteses ( da função )


#Dados Numéricos

        Inteiros:  1, -10

        Reais:  3.5, -10.3


#Dados Alfanuméricos

        "Olá", "meu nome é Fulano", 'c'


#Dados Booleanos

        Verdadeiro, Falso    true (1), false (0)


#Expressões Aritméticas

        Operadores:   + - * / % -- ++ soma subtração multiplicação divisão resto decremento incremento


#Operadores

        Relacionais:   > >= < <= == != maior/ou igual menor/ou igual igual diferente
        Lógicos:   && || ! e ou negação
        Atribuição:   = += -= *= /= %= atribui soma subtrai multiplica divide resto e atribui


#Tipos básicos de variaveis

        Inteiro - recebe numeros positivos e negativos
        Float - recebe numeros com casas decimais
        Double - mais recomendado para numeros decimais pois tem precisão dupla
        Char - recebe letras e outros caracteres, algumas vezes usa a biblioteca <string.h>
        Bool - recebe true ou false, mas tem que chamar a biblioteca <stdbool.h>

        int primeiro(void)
    {
        int real = -10;
        float decimal = 1.5;
        double decimal = 1.5;
        char letra = 'a';
        char vetor[] = {"Dirceu"};
        bool boleana = true;
        return 0;
    }


    sizeof(variavel) retorna o tamanho da variavel em bits
    sizeof(variavel) /
    sizeof(tipo da variavel) retorna o tamanho do conteudo da variavel

    A função principal de C,
    unica que precisa estar presente é a : MAIN() { }

    Para executar algumas funções, como as mais básicas,
    deve chamar a biblioteca respectiva dessa forma : #INCLUDE<BIBLIOTECA.H>


#Funções de impressão

    Comandos do printf : printf("%d\n", variavel);

        % c caracter
        % d inteiro
        % o octal
        % x hexadecimal
        % lld inteiro com long long
        % f ponto flutuante
        % .3f ponto flutuante com 3 casas decimais
        % lf ponto flutuante de precisão dupla % s string}

        fprintf(*arquivo, "texto/impressor", ...);      imprime / escreve no arquivo
        fprintf(stdout, "texto/impressor", ...);        imprime / escreve no monitor

        sprintf(variavel1, formatos dos dados, variaveis2);      le da variavel2 e escreve na variavel1


#Funções de leitura

    Comandos do scanf : scanf("%d", &variavel);
        % c caracter
        % d inteiro
        % o transforma inteiro em octal
        % x transforma inteiro em hexadecimal
        % f ponto flutuante
        % lf ponto flutuante de precisão dupla
        % s string
        % [^\n] regex para ler até usuário apertar enter
                                                                                                                                                                    fscanf(*arquivo, "leitor", ...);        lê do arquivo
    fscanf(stdin, "leitor", ...);           lê do teclado

    sscanf(variaveis1, formatos dos dados, variaveis2)      le da variavel1 e escreve na variavel2


#Funções Matemáticas(necessário #include <math.h>)

    ceil()      arredonda pra cima
    cos()       cosseno
    exp(x)      e elevado a potencia de x
    fabs()      valor absoluto
    floor()     arredonda para baixo
    log()       logaritmo natural
    log10()     logaritmo decimal
    pow(x, y)   calcula x elevado a potencia y
    sin()       seno
    sqrt()      raiz quadrada
    tan()       tangente


#Funções de String (necessário #include <string.h>)

    strcpy(destino, origem)     copia da origem para o destino,
                                ou coloca a string no lugar origem dentro da variavel destino
    strcmp(s1, s2)              compara e retorna a ordem - -1 = s1<s2 1 = s1> s2 0 = s1 == s2
    strlen(string)              retorna tamanho da string
    strcat(s1, s2)              concatena s1 + s2, retorna uma string


#Estruturas de Decisão

    if (condição verdadeira){bloco de comando}          se

    else if (condição verdadeira){bloco de comando}     ou se

    else {bloco de comando}                             senão

    switch (expressão)          para cada caso
    {
        case 8 ou 'c':
            comando;
            break;

        default:
            comando;
            break;
    }

    for (inicialização; expressão; operação) {bloco de comando}     para            repetição contável

    while (condição verdadeira) {bloco de comando}                  enquanto faça   repetição condicional

    do {bloco de comando} while (condição verdadeira)               faça enquanto   repetição condicional


#Vetor &Matriz

    tipo vetor[tamanho]
    tipo vetor[] = {"String"} / {int, int, ...}
    tipo matriz[linha][coluna]


#Funções

        tipo_retornado nome_da_função(declaração de parâmetros) {bloco da função}

        se declarar uma variavel local com o mesmo nome de uma global, a preferencia vai ser da local

    Protótipo

        declaração antes do main, da mesma forma, porém sem o bloco de comando

        tipo_retornado nome_da_função(declaração de parâmetros);

    Código da função

        pode ser antes, aí não tem protótipo, ja é logo a função toda ou depois do main com o protótipo em cima

        tipo_retornado nome_da_função(declaração de parâmetros) {bloco da função}

    Ativação (chamada da função)

        dentro do main ou de outra função

        void função(int parâmetros ou *parâmetros ou matrizâmetro[][coluna], int *parâmetro)
        {
            bloco da função que usa parâmetros e *parâmetro e matrizâmetro

            return;
        }

        int main()
        {
            função(parâmetros1 ou vetor ou matriz, &parâmetro1);

            o parâmetros1 pode ser vetor ou matriz sem seus[] return 0;
        }


#Ponteiros

    Declaração

        tipo *ponteiro **ponteiro_de_ponteiro, variavel;

        quem envia e quem recebe tem que ser do mesmo tipo


    Passagem

        ponteiro = &variavel;

        ponteiro_de_ponteiro = &ponteiro;

        *ponteiro = conteudo;


        int main()
        {
            função(&variavel)       envia o endereço
        }

        função (int *ponteiro) {bloco da função}    recebe o endereço


        int main()
        {
            função(vetor)           envia o endereço
        }

        função (int *ponteiro) {bloco da função}    recebe o endereço


        int main()
        {
            função(vetor)           envia o endereço

        }

        função(int ponteiro[]) {bloco da função}    recebe o endereço


    Por valor

        passagem normal, parametros copiados tratados como variaveis locais, execução no modelo de pilha,
        função acaba variaveis são liberadas e a original nao se altera


    Por referência

        utiliza ponteiro, o que é passado para o parametro da função é o endereço da memória onde o conteudo se encontra,
        altera o conteudo original dentro da função original


    Impressão

        printf("%d\n", *ponteiro);              conteudo que esta no endereço

        printf("%ld\n", (long int)ponteiro);    endereço do conteudo ao qual aponta em inteiro

        printf("%p\n", (void *)ponteiro);       endereço do conteudo ao qual aponta em hexadecimal

        printf("%p\n", (void *)&ponteiro);      endereço do ponteiro

        printf("%p\n", ponteiro);               endereço do conteudo ao qual aponta

        printf("%p\n", &variavel_apontada);     endereço do conteudo


    Vetor

        int *p;
        p = malloc(100 * sizeof(int));			transforma o ponteiro em vetor de ponteiro

        p-- e p++ 								percorrer o vetor
        p + i = p[i]							outra forma de percorrer o vetor se i for inteiro
        *(p + i)								acessa o conteudo daquela casa do vetor
        printf("%d\n", *v + i);					imprime o conteudo da casa do vetor sendo i do for


    Operações

        apenas duas podem ser usadas com ponteiro

        p-- e p++           adição e subtração

        p + i e p - i       servem para percorrer o vetor

        já com relação ao conteudo apontado vale todas as operações

        (*p)++;
        *p = (*p) * 10;

        == e !=             para saber se dois ponteiros são iguais ou diferentes
        >, <, >=, <=        para saber qual a posição(endereço) mais alta na memória ocupada por um ponteiro


    Struct



*/

#include <stdio.h>

int main()
{
    int var = 3;

    printf("%6d \n", var);

    return 0;
}
