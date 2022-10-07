#include <stdio.h>

int main(void)
{
    int entrada, i, j, um, solved = 0;
    scanf("%d", &entrada);
    int matriz[entrada][3];
    for (i = 0; i < entrada; i++)
    {
        um = 0;
        for (j = 0; j < 3; j++)
        {
            scanf("%d", &matriz[i][j]);
            if (matriz[i][j] == 1)
            {
                um++;
            }
        }
        if (um > 1)
        {
            solved++;
        }
    }
    printf("%d\n", solved);
    return 0;
}