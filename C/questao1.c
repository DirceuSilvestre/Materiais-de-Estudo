#include <stdio.h>

int main(void)
{
    int I_linha, I_coluna, F_linha, F_coluna, cima, baixo, esquerda, direita, linha, coluna, i, j;
    char matriz[90][90];
    scanf("%d %d", &linha, &coluna);

    cima = baixo = esquerda = direita = 0;

    //Faz a leitura de todas as linhas e descobre onde está o F e o I
    for (i = 0; i < linha; i++)
    {
        scanf("%s", &matriz[i]);
    }
    for (i = 0; i < linha; i++)
    {
        for (j = 0; j < coluna; j++)
        {
            if (matriz[i][j] == 'F')
            {
                F_linha = i;
                F_coluna = j;
            }
            if (matriz[i][j] == 'I')
            {
                I_linha = i;
                I_coluna = j;
            }
        }
    }

    //Se Ii estiver pra baixo de Fi, então Ii sobe
    if (I_linha > F_linha)
    {
        for (i = I_linha; i > F_linha; i--)
        {
            if (matriz[i][I_coluna] == 'X')
            {
                cima = 1;
                break;
            }
            else
            {
                cima = 0;
            }
        }

        //Se subir sem encontrar X, então começa a ver se dá pra ir pra esquerda ou pra direita
        if (i == F_linha && cima == 0)
        {
            if (I_coluna < F_coluna)
            {
                for (j = I_coluna; j < F_coluna; j++)
                {
                    if (matriz[F_linha][j] == 'X')
                    {
                        direita = 1;
                        break;
                    }
                    else
                    {
                        direita = 0;
                    }
                }
            }
            else
            {
                for (j = I_coluna; j > F_coluna; j--)
                {
                    if (matriz[F_linha][j] == 'X')
                    {
                        esquerda = 1;
                        break;
                    }
                    else
                    {
                        esquerda = 0;
                    }
                }
            }
        }
    }

    //Se Fi estiver pra baixo de Ii, então Ii desce
    else
    {
        for (i = I_linha; i < F_linha; i++)
        {
            if (matriz[i][I_coluna] == 'X')
            {
                baixo = 1;
                break;
            }
            else
            {
                baixo = 0;
            }
        }

        //Se descer sem encontrar X, então começa a ver se dá pra ir pra esquerda ou pra direita
        if (i == F_linha && baixo == 0)
        {
            if (I_coluna < F_coluna)
            {
                for (j = I_coluna; j < F_coluna; j++)
                {
                    if (matriz[F_linha][j] == 'X')
                    {
                        direita = 1;
                        break;
                    }
                    else
                    {
                        direita = 0;
                    }
                }
            }
            else
            {
                for (j = I_coluna; j > F_coluna; j--)
                {
                    if (matriz[F_linha][j] == 'X')
                    {
                        esquerda = 1;
                        break;
                    }
                    else
                    {
                        esquerda = 0;
                    }
                }
            }
        }
    }

    //Se Ij estiver pra esquerda de Fj, então Ij anda pra direita
    if (I_coluna < F_coluna)
    {
        for (j = I_coluna; j < F_coluna; j++)
        {
            if (matriz[I_linha][j] == 'X')
            {
                direita = 1;
                break;
            }
            else
            {
                direita = 0;
            }
        }

        //Se for pra direita sem encontrar X, então começa a ver se dá pra ir pra cima ou pra baixo
        if (j == F_coluna && direita == 0)
        {
            if (I_linha > F_linha)
            {
                for (i = I_linha; i > F_linha; i--)
                {
                    if (matriz[i][F_coluna] == 'X')
                    {
                        cima = 1;
                        break;
                    }
                    else
                    {
                        cima = 0;
                    }
                }
            }
            else
            {
                for (i = I_linha; i < F_linha; i++)
                {
                    if (matriz[i][F_coluna] == 'X')
                    {
                        baixo = 1;
                        break;
                    }
                    else
                    {
                        baixo = 0;
                    }
                }
            }
        }
    }

    //Se Ij estiver pra direita de Fj, então Ij anda pra esquerda
    else
    {
        for (j = I_coluna; j > I_coluna; j--)
        {
            if (matriz[I_linha][j] == 'X')
            {
                esquerda = 1;
                break;
            }
            else
            {
                esquerda = 0;
            }
        }

        //Se for pra esquerda sem encontrar X, então começa a ver se dá pra ir pra cima ou pra baixo
        if (j == F_coluna && esquerda == 0)
        {
            if (I_linha > F_linha)
            {
                for (i = I_linha; i > F_linha; i--)
                {
                    if (matriz[i][F_coluna] == 'X')
                    {
                        cima = 1;
                        break;
                    }
                    else
                    {
                        cima = 0;
                    }
                }
            }
            else
            {
                for (i = I_linha; i < F_linha; i++)
                {
                    if (matriz[i][F_coluna] == 'X')
                    {
                        baixo = 1;
                        break;
                    }
                    else
                    {
                        baixo = 0;
                    }
                }
            }
        }
    }

    if (cima == 0 && direita == 0 || cima == 0 && esquerda == 0 || baixo == 0 && direita == 0 || baixo == 0 && esquerda == 0)
    {
        printf("S");
    }
    else
    {
        printf("N");
    }

    return 0;
}