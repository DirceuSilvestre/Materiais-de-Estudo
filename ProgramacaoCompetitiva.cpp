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

// ans = a ? b : c;                        operador ternário                // simplificando: if (a) ans = b; else ans = c;
// ans += val;                             soma e atribui                   // simplificando: ans = ans + val; e suas variantes
// index = (index + 1) % n;                se proximo for >= n index = 0    // index++; if (index >= n) index = 0;
// index = (index + n - 1) % n;            se index < 0, index = n - 1      // index--; if (index < 0) index = n - 1;
// int ans = (int)((double)d + 0.5);       transformações em tipos iguais para calculos e arredonda para o inteiro mais proximo
// ans = min(ans, new_computation);        retorna o minimo ou o maximo entre esses dois dados
// forma alternativa nao usada no livro: ans <?= new_computation;
// some code use short circuit && (AND) and || (OR)

/*

Programador não competitivo A (também conhecido como o borrado):
Etapa 1: Lê o problema e fica confuso. (Este problema é novo para ele).
Passo 2: Tenta codificar algo: Lendo a entrada e saída não triviais.
Passo 3: Percebe que todas as suas tentativas não são Aceitas (AC):
Greedy(Seção 3.4): Repetidamente emparelhando os dois restantes os alunos com as distâncias de separação mais curtas dão a resposta errada (WA).

Exercício 1.1.1: A estratégia gananciosa do programador não competitivo A acima realmente funciona para o caso de
teste de amostra mostrado na Figura 1.1. Por favor, dê um melhor exemplo de contador!

Resposta: calcularia a distancia de cada ponto com os outros, depois ordenaria do menor pro maior, e somando os dois menores


Exercício 1.1.2: Analise a complexidade de tempo da solução de busca completa ingênua pelo programador não competitivo A acima
para entender por que ele recebe o veredicto TLE!

Resposta: creio que seja porque ele faz um backtracing recurso que cria uma arvore de possibilidades na força bruta, e por isso da TLE


Exercício 1.1.3*: Na verdade, uma solução recursiva inteligente com backtracking ainda pode resolver esse problema.
Resolva este problema sem usar uma tabela DP!

*/
/*
Playlist BixeCamp

Aula 2 concluida
arrays, matrizes e funções

Aula 3 paramos nos 40 minutos do video, proximo topico sera busca binaria
ordenação, busca binária e complexidade
INT_MAX maior valor que cabe em um inteiro
sort(vetor ou &vetor[0], vetor+n ou &vetor[n], cmp)
    cmp é o nome de uma função de comparação dessa forma
        bool cmp(int a, int b){ return (a > b); }
    que a gente passa ela como parâmetro para que a ordenação seja feita do maior para o menor

*/

int main()
{
    cout << INT_MAX << endl;
}

// Problemas
/*
Falta a parte do sort, para colocar o vetor da menor distancia para a maior e somar as duas menores

int fat(int numero)
{
    if (numero <= 1)
    {
        return 1;
    }
    else
    {
        return (numero * fat(numero - 1));
    }
}

//Tentativa de resolsucao do problema da página 1, slide 26
//problema de programação dinamica
int main(int argc, char const *argv[])
{
    int N, quantidade;
    cin >> N;
    ii vetor_pontos[N];
    quantidade = fat(N);
    double vetor_distancias[quantidade];
    memset(vetor_distancias, 0.00, sizeof(vetor_distancias));
    int x, y;
    for (int i = 0; i < (2 * N); i++) {
        cin >> x >> y;
        vetor_pontos[i] = make_pair(x, y);
    }
    for (int i = 0; i < ((2 * N) - 1); i++)
    {
        for (int j = i + 1; j < (2 * N); j++)
        {
            vetor_distancias[i] += hypot(vetor_pontos[i].first - vetor_pontos[j].first, vetor_pontos[i].second - vetor_pontos[j].second);
            cout << vetor_distancias[i] << endl;
        }
    }
    //distancia /= (2 * N);
    //cout << distancia << endl;
    return 0;
}
/*

/*
Testando memset
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
*/
/* contagem de alunos unicos em um array
int main()
{
    int n, entrada, j;
    cin >> n;
    int vetor[n];
    for (size_t i = 0; i < n; i++)
    {
        cin >> entrada;
        for (j = 0; j < i; j++)
        {
            if (vetor[j] == entrada)
            {
                j = i + 1;
            }
        }
        if (j == i)
        {
            vetor[i] = entrada;
        }
        else
        {
            i -= 1;
            n -= 1;
        }
    }
    cout << n << endl;
}
*/
/*

problema 1699B Almost Ternary Matrix
tentativa falha de solucionar


int main()
{
    int entrada, linha, coluna;
    cin >> entrada;
    cin >> linha >> coluna;
    int vetor[linha][coluna];
    for (size_t i = 0; i < linha; i++)
    {
        for (size_t j = 0; j < coluna; j++)
        {
            if (i && j == 0)
            {
                vetor[i][j] = 1;
            }
            else
            {
                if (vetor[i - 1][j] && vetor[i][j + 1] && vetor[i + 1][j] && vetor[i][j - 1] == 0)
                {
                    vetor[i][j] = 1;
                }
                else
                {
                    vetor[i][j] = ;
                }
            }
        }
    }
    for (size_t i = 0; i < linha; i++)
    {
        for (size_t j = 0; j < coluna; j++)
        {
            cout << vetor[i][j] << endl;
        }
    }
}

*/