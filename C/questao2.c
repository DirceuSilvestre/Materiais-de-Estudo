#include <stdio.h>

struct DATA
{
    int dia;
    int mes;
    int ano;
};

struct FUNCIONARIO
{
    int numero;
    struct DATA entrada;
    float salario;
};
int main()
{

    struct DATA hoje;
    struct FUNCIONARIO cadastro;
    char nome_arquivo;
    float salario_minimo, salario_aumento, aumento;
    int i = 0;

    scanf("%s", &nome_arquivo);
    scanf("%d %d %d", &hoje.dia, &hoje.mes, &hoje.ano);
    scanf("%f", &salario_minimo);

    FILE *arquivo;

    arquivo = fopen("nome_arquivo.dat", "rb");

    for (i = 0; fscanf(arquivo, "%s", &nome_arquivo) != EOF; i++)
    {

        fscanf(arquivo, "%d %d %d %d %f", &cadastro.numero, &cadastro.entrada.dia, &cadastro.entrada.mes, &cadastro.entrada.ano, &cadastro.salario);

        if (cadastro.salario <= (3 * salario_minimo))
        {
            salario_aumento = cadastro.salario + (cadastro.salario * 1.15);
        }
        else if (cadastro.salario <= (5 * salario_minimo))
        {
            salario_aumento = cadastro.salario + (cadastro.salario * 1.125);
        }
        else if (cadastro.salario <= (10 * salario_minimo))
        {
            salario_aumento = cadastro.salario + (cadastro.salario * 1.1);
        }
        else
        {
            salario_aumento = cadastro.salario + (cadastro.salario * 1.05);
        }
        if ((hoje.ano - cadastro.entrada.ano) > 10)
        {
            salario_aumento = cadastro.salario + (cadastro.salario * 1.10);
        }

        aumento = ((salario_aumento - cadastro.salario) / cadastro.salario) * 100;

        printf("%d R$ %.2f R$ %.2f %.1f\n", cadastro.numero, cadastro.salario, salario_aumento, aumento);
    }

    fclose(arquivo);

    return 0;
}