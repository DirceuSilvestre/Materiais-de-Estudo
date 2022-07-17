#include <stdlib.h>

typedef struct
{
    int *lista;
    int size;
} VETOR;

VETOR *ordena(VETOR *a)
{
    int change, i = 0, j = 0;
    VETOR *funcao = (VETOR *)malloc(sizeof(VETOR));
    funcao->size = a->size;
    for (i = 0; i < a->size - 1; i++)
    {
        for (j = i; j < a->size - 1; j++)
        {
            if (a->lista[j] < a->lista[i])
            {
                change = a->lista[i];
                a->lista[i] = a->lista[j];
                a->lista[j] = change;
            }
        }
    }
    funcao->lista = (int *)malloc(30 * sizeof(int));
    funcao->lista = a->lista;
    return funcao;
}
