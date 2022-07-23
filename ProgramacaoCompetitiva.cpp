#include "bits/stdc++.h"

// Atalhos para os tipos de dados mais usados em concurso
using namespace std;

typedef long long ll;
typedef pair<int, int> ii;
typedef vector<ii> vii;
typedef vector<int> vi;
#define INF 1000000000 // para Floyd Warshall’s 1 bilhão é mais seguro que 2
                       // Configurações comuns do memset
                       // memset(memo, -1, sizeof memo);
                       // inicializa a tabela de memorização da programação dinamica com a flag -1
                       // memset(arr, 0, sizeof arr);
                       // coloca 0 em todas as posições do array de memória
                       // We have abandoned the use of "REP" and "TRvii" since the second edition
                       // in order to reduce the confusion encountered by new programmers

/*Os atalhos a seguir são frequentemente usados em códigos C/C++ e Java:*/

// ans = a ? b : c;                                                         operador ternário
// to simplify: if (a) ans = b; else ans = c;
// ans += val;                                                              soma e atribui
// to simplify: ans = ans + val; and its variants
// index = (index + 1) % n;
// index++; if (index >= n) index = 0;
// index = (index + n - 1) % n;
// index--; if (index < 0) index = n - 1;
// int ans = (int)((double)d + 0.5);                                        transformações em tipos iguais para calculos
// for rounding to nearest integer                                          e arredonda para o inteiro mais proximo
// ans = min(ans, new_computation);                                         retorna o minimo ou o maximo entre esses dois dados
// min/max shortcut
// alternative form but not used in this book: ans <?= new_computation;
// some code use short circuit && (AND) and || (OR)

int main()
{
    int array[10];
    memset(array, 0, sizeof(array));
    for (size_t i = 0; i < 10; i++)
    {
        cout << array[i] << endl;
    }

    cout << max(5, 7) << endl;

    return 0;
}