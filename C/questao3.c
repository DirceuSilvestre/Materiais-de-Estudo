int fat(int n)
{
    if (n <= 1)
    {
        return 1;
    }
    return (n * fat(n - 1));
}

int comb(int n, int p)
{
    int cima = fat(n);
    int baixo = fat(p);
    int ate = fat(n - p);
    int resultado = (cima / (baixo * ate));
    return resultado;
}