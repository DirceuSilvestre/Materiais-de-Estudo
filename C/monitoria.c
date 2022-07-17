
/*      PROVA DE MONITORIA      */

/*

    1 Questão:
        Implemente um programa que verifique, para cada numero inteiro dado na entrada, se o seu valor é um número de Fibonacci. Em caso afirmativo, o algoritmo deve imprimir S na tela, caso contrário o algoritmo deve imprimir N.

        Entrada:
        Na primeira linha será informado a quantidade de números inteiros a serem verificados, seguidos dos números (um em cada linha).

        Restrições:
        O numero de entradas é limitado em no maximo 10.
        Os numeros inteiros tem valores positivos menores que 2^30.

*/

/*

        Algoritmo

    ler a quantidade de entradas
    fazer um for para ler as entradas e salvar cada uma em uma casa do vetor
    fazer um numero de 1 ate ficar maior ou igual a entrada e mandar pro fibonacci
    saida S se a entrada estiver na sequencia, e N se nao estiver

*/

/*
#include <stdio.h>

int fib(int x);

int main()
{
    int quantidade_entradas, x = 0, resultado, j = 0, i;
    scanf("%d", &quantidade_entradas);
    int entradas[quantidade_entradas];
    for (i = 0; i < quantidade_entradas; i++)
    {
        scanf("%d", &entradas[i]);
    }
    while (1)
    {
        resultado = fib(x);
        if (j > quantidade_entradas - 1)
        {
            break;
        }
        else
        {
            if (resultado < entradas[j])
            {
                x++;
            }
            else if (resultado == entradas[j])
            {
                printf("S\n");
                x = 0;
                j++;
            }
            else if (resultado > entradas[j])
            {
                printf("N\n");
                x = 0;
                j++;
            }
        }
    }

    return 0;
}

int fib(int x)
{
    if (x == 0 || x == 1)
    {
        return x;
    }
    else
    {
        return (fib(x - 1) + fib(x - 2));
    }
}
*/

/*

    2 Questão:
        Existe o tipo PALAVRA que representa uma palavra,ou seja, um conjunto de caracteres. Diferentemente do vetor de caracteres do C, esse vetor não precisa terminar com o '\0' pois ele armazena dentro de sua estrutura o tamanho da palavra. Esse vetor é alocado dinamicamente.
        A função que você deverá desenvolver será chamada adiciona_prefixo, terá comoentrada um ponteiro para o tipo PALAVRA e um vetor de caracteres do C que será utilizado como prefixo. O objetivo da função é adicionar o conteúdo do vetor de caracteres, excluindo o marcador de final de string, no inicio do conteudo do primeiro argumento.

*/

/*
        Algoritmo

    'prototipo'
    typedef struct
    {
        char *lista;
        int tamanho;
    } PALAVRA;

    PALAVRA * adiciona_prefixo(PALAVRA *, char *);

    receber a palavra e o prefixo

*/