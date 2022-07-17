#include "bits/stdc++.h"
#include <sstream>

using namespace std;

#define forn(i, n) for (int i = 0; i <= n; i++)

/*
using ll = long long;
using ii = pair<int, int>;
using ull = unsigned long long;
using vi = vector<int>;

const string ENDL = "\n";
*/

void solve()
{

    int entrada, ligacoes = 0;

    cin >> entrada;

    int polos[entrada];

    for (size_t i = 0; i < entrada; i++)
    {
        if (i != 0)
        {
            cin >> polos[i];
            if (polos[i] != polos[i - 1])
            {
                ligacoes++;
            }
        }
        else
        {
            cin >> polos[i];
        }
    }
    if (ligacoes != 0)
    {
        ligacoes++;
    }

    cout << ligacoes << endl;

    /*
    aux << n;
    aux >> resultado;
    */
    // sim ? cout << "YES\n" : cout << "NO\n";
}

int main()
{
    ios_base ::sync_with_stdio(false);
    cin.tie(0);
    int t = 1;
    // cin >> t;
    while (t--)
        solve();
    return 0;
}