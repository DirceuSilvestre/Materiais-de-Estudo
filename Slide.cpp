#include <iostream>

using namespace std;

int main()
{
    int var;
    cout << var << endl;
    var++;
    cout << var << endl;
    return 0;
}

/*
    Modelo para Padronização dos Materiais de Apoio das Linguagens



        Arquivo  "Slide.linguagem"



       COMPILAR

    Linux:

    Windows:  F6  -  VsCode



0  -  Sobre a Linguagem

    Desenvolvido em 1979 por Bjarne Stroustrup no Bell Labs como uma extensão para C
    Pode ser programado no paradigma estruturado ou orientado a objeto
    Finaliza cada sentença com ;
    case sensitive, diferencia minusculo de maiusculo na hora de nomear variaveis



1  -  Local de cada coisa no código

    #include bibliotecas

    #define macros

    using namespace std;

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



2  -  Comentarios

    // comentário de linha
    /* comentário de texto
    */

/*
3  -  Atribuição

    Simples

        =

    Composta

        *=      multiplica e atribui
        /=      divide e atribui
        %=      modulo e atribui
        +=      coma e atribui
        -=      subtrai e atribui
        <<=     desloca a esquerda a quantidade de vezes especificada a direita e atribui
        >>=     desloca a direita a quantidade de vezes especificada a direita e atribui
        &=      faz AND do primeiro e segundo e atribui

4  -  Tipos de Dados

    Primitivos

        int             inteiro
        float           ponto flutuante
        double          pf precisao dupla (melhor)
        char            caractere, letra
        wchar_t         caractere do UTF-16
        bool            booleano, true ou false

    Nao primitivos

        string          vetor de char, tem metodos como o .length


5  -  Modificadores

    short           assegura que o numero será de 2 bytes (16bits)
    long            assegura que o numero será de 4 bytes (32bits), o int ja é long
    unsigned        para trabalhar com numeros somente positivos


6  -  Variavel e Constante

    tipo variavel;
    #define CONSTANTE;
    const tipo constante;


7  -  Declaração

8  -  Operadores (matematicos, logicos, comparacao)

9  -  Impressao

    cout << variavel << endl


10  -  Escaneamento

11  -  Estruturas (condicionais, repeticao)

    if (condição) {bloco de código}
    else {bloco de codigo}


12  -  Bibliotecas

13  -  Estrutura de Dados

14  -  Função e Parâmetro

15  -  Tipos específicos da linguagem

16  -  Ponteiro

17  -  Alocação Dinâmica

    sizeof()            retorna a quantidade em bytes que aquele tipo ocupa


18  -  Leitura e Escrita em arquivo

19  -  Topicos Avançados (macro, construir biblioteca, compilação)

*/