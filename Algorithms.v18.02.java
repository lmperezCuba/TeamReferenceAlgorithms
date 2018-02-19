/*
 ===================             Realease 18.2           ==========================
 ===================        + 3,000  lines  of code       =========================

 Contact
 Ing. Luis Manuel Pérez Batista 
 luismanuelp1992@gmail.com
 (+53) 53855092   (Cuba)

 Maxime achieve UCI-03 Team
 COJ User - lmperez
 Codefight User - lmperez

 ========== >>>>>        Tips      <<<<< ==========
 1.  Use Ctrl + F  to find algorithms
 2.  See the  bibliography at the bottom of this file

 
 Index (60)

 - Code Tips
 ========================================
 1.  SORTING (9)
 -   Selection Sort n^2
 -   Insertion Sort n^2
 -   Bubble Sort    n^2
 -   Merge Sort     nlogn
 -   Heap Sort      nlogn
 -   Quick Sort     nlogn
 -   Sell Sort      n
 -   Radix Sort (Numbers)   n
 -   Radix Sort (Letters)   n

 ========================================
 2. Greedy


 ========================================
 3. Dynamic Programming (11)
 -  Fibonacci
 -  Big Fibonacci Mod n
 -  Pascal Triangle
 -  Greatest Common Subsecuence
 -  InterestBank
 -  Travel Most Cheap for River
 -  Edit Distance
 -  Coin Change
 -  KnapSack 0 - 1
 -  KnapSack Multiples Objects
 -  Longest Increasing Subsequence (LIS)

 ========================================
 4. Data Structure (5)
 -  Union-Find Disjoin-Set
 - Segment Tree
 - RMQ
 - ABI 1D
 - ABI 2D

 ========================================
 5. String Processing (8)
 - Knuth - Morris - Pratt (KMP)
 - JaroWinkler (Edit Distance )
 - Longest Common Subsequence (LCS)
 - Longest Palindrome
 - Suffix Trie
 - Suffix Array
 - Longest Common Prefix (LCP)  O(n)
 - Longest Common SubString (LCSS) O(n*m)

 ========================================
 6. Backtracking (1)
 - 8 Queens

 ========================================
 7. Divide & Conquer (5)
 -  Binary Search
 -  Ternary Search
 -  Matrix Change Order
 -  Tennis Tournament
 -  Chess Horse Jump

 ========================================
 8. Graph Theory (10)
 - Finding Articulation Point And Bridge
 - Strongly Connected Components (Directed Graph)
 - Kruskal MST
 - Minimum Spanning Forest
 - Dijkstra
 - Floyd Warshall
 - Transitive Closure ( Warshall Algorithm )
 - Minimax
 - Bellman Ford
 - Has Negative Cycle

 =========================================
 9. Network Flow (1)
 - Edmonds Karp's (Max Flow Problem)

 =========================================
 10. Combinatory

 =========================================
 11. Simulation

 =========================================
 12. Computational Geometry

 =========================================
 13. Number Theory (8)
 - Eratosthenes's sieve
 -  Greatest Common Divisor (GCD)
 - GCD Faster- Greatest Common Divisor Bitwise
 -  Least Common Multiple (LCM)
 -  Factorial Frequencies
 - Prime Factors
 - Prime Factors - Pollard Rho ***
 - Euler Phi
 - Extended Euclid

 ==========================================
 14. Mathematics (1)
 - Catalan Numbers

 ==========================================
 15. Game Theory

 ==========================================
 16. Bibliography

 */
package algorithms;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.BitSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.Stack;
import java.util.StringTokenizer;

/**
 *
 * @author lmperez
 */
public class Algorithms {

    //      ============= ==========    Code Tips     ===============================
    static Scanner sc = new Scanner(System.in);
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pw = new PrintWriter(System.out, false);
    static StringTokenizer st = new StringTokenizer("word");
    static StringBuffer sbu = new StringBuffer("word");

    //  =====================================================================
    /**
     *
     * Selection Sort
     *
     * @param arreglo array to sort
     */
    public static void Seleccion(int[] arreglo) {
        int n = arreglo.length, aux, pos;
        for (int i = 0; i < n - 1; i++) {
            pos = i;
            for (int j = i + 1; j < n; j++) {
                if (arreglo[j] < arreglo[pos]) {
                    pos = j;
                }
            }
            aux = arreglo[i];
            arreglo[i] = arreglo[pos];
            arreglo[pos] = aux;
        }
    }

    /**
     * Insertion Sort
     *
     * @param arreglo array to sort
     */
    public static void Insercion(int[] arreglo) {
        int n = arreglo.length, aux;
        for (int i = 1; i < n; i++) {
            int j = i;
            aux = arreglo[j];
            for (; j > 0 && arreglo[j - 1] > aux; j--) {
                arreglo[j] = arreglo[j - 1];
            }
            arreglo[j] = aux;
        }
    }

    /**
     * Bubble Sort
     *
     * @param arreglo array to sort
     */
    public static void BubbleSort(int[] arreglo) {
        int n = arreglo.length, aux;
        for (int i = n - 1; i > 0; i--) {
            int j = i;
            for (; j > 0; j--) {
                if (arreglo[j] < arreglo[j - 1]) {
                    aux = arreglo[j];
                    arreglo[j] = arreglo[j - 1];
                    arreglo[j - 1] = aux;
                }
            }
        }
    }

    /**
     * Merge Sort
     *
     * @param A array to sort
     * @param B array empty
     * @param prim first index to sort, normally 0
     * @param ult last index to sort, normally A.length-1
     */
    public static void Merge_Sort(int A[], int B[], int prim, int ult) {
        if (prim < ult) {
            int medio = (prim + ult) / 2;
            Merge_Sort(A, B, prim, medio);
            Merge_Sort(A, B, medio + 1, ult);
            Merge(A, B, prim, medio + 1, ult);
        }
    }

    private static void Merge(int A[], int B[], int prim, int medio, int ult) {
        int p1 = prim, p2 = medio, u1 = medio - 1, u2 = ult;
        int tmpPos = p1;
        while (p1 <= u1 && p2 <= u2) {
            if (A[p1] < A[p2]) {
                B[tmpPos++] = A[p1++];
            } else {
                B[tmpPos++] = A[p2++];
            }
        }
        while (p1 <= u1) {
            B[tmpPos++] = A[p1++];
        }
        while (p2 <= u2) {
            B[tmpPos++] = A[p2++];
        }
        for (int i = prim; i <= ult; i++) {
            A[i] = B[i];
        }
    }

    /**
     * Heap Sort
     *
     * @param A array to sort
     */
    private static int l = 10;

    public static void HeapSort(int A[]) {
        int swap1;
        BuilHeap(A);        // Se crea la cola con prioridad desc
        for (int i = l - 1; i > 0; i--) {
            // Se coloca el mayor en la ultima posicion
            swap1 = A[i];
            A[i] = A[0];
            A[0] = swap1;
            HeapyFy(A, 0, i - 1);
        }
    }

    private static void HeapyFy(int A[], int i, int hoja) {
        int pos = i, m = l / 2, h, swap1;
        while (pos < m) {
            h = pos;
            if (pos * 2 + 1 <= hoja && A[pos * 2 + 1] > A[h]) {
                h = pos * 2 + 1;
            }
            if (pos * 2 + 2 <= hoja && A[pos * 2 + 2] > A[h]) {
                h = pos * 2 + 2;
            }
            if (pos == h) {
                break;
            }
            swap1 = A[h];
            A[h] = A[pos];
            A[pos] = swap1;
            pos = h;
        }
    }

    private static void BuilHeap(int A[]) {
        for (int i = l / 2 - 1; i >= 0; i--) {
            HeapyFy(A, i, l - 1);
        }
    }

    /**
     * Quick Sort
     *
     * @param A array to sort
     */
    static void QuickSort(int A[], int pri, int ult) {
        int m = (ult + pri) / 2;
        int i = pri, j = ult, aux, piv = A[m];
        while (i <= j) {
            while (A[i] < piv) {
                i++;
            }
            while (A[j] > piv) {
                j--;
            }
            if (i <= j) {
                aux = A[i];
                A[i] = A[j];
                A[j] = aux;
                i++;
                j--;
            }
        }
        if (pri < j) {
            QuickSort(A, pri, j);
        }
        if (ult > i) {
            QuickSort(A, i, ult);
        }
    }

    /**
     * Sell Sort
     *
     * @param A array to sort
     * @param prim first index to sort, normally 0
     * @param ult last index to sort, normally A.length-1
     */
    static void SellSort(int A[], int prim, int ult) {
        int i, j, h = 1, n = (ult - prim + 1), v;
        do {
            h = 3 * h + 1;
        } while (h < n);
        do {
            h /= 3;
            for (i = h + 1; i < n; i++) {
                v = A[i];
                j = i;
                while (j > h && A[j - h] > v) {
                    A[j] = A[j - h];
                    j -= h;
                }
                A[j] = v;
            }
        } while (h > 1);

    }

    /**
     * Radix Sort (Numbers)
     *
     * @param A array to sort
     * @param l = 10
     */
    static void RadixSort(int A[], int l) {
        LinkedList<Integer> colas[] = new LinkedList[10];
        for (int i = 0; i < 10; i++) {
            colas[i] = new LinkedList<>();
        }
        int div = 1, num, cantDig;
        do {
            cantDig = 0;
            for (int i = 0; i < l; i++) {
                num = A[i] / div;
                cantDig += num / 10;
                num %= 10;
                colas[num].add(A[i]);
            }
            int k = 0;
            for (int i = 0; i < 10; i++) {
                while (!colas[i].isEmpty()) {
                    A[k++] = colas[i].removeFirst();
                }
            }
            div *= 10;
        } while (cantDig > 0);
    }

    /**
     * Radix Sort
     *
     * @param li list to sort
     * @param intdex to sort the words, index = 0.
     * @param longi length of the vocal
     */
    static int longi;

    public static void RadixSort(LinkedList<String> li, int index) {
        //  Vocabulario
        String voc = "aAbBcCdDeEfFgGhHiIjJkKlLmMnNoOpPqQrRsStTuUvVwWxXyYzZ0123456789";
        longi = voc.length();
        HashMap<Character, Integer> mapa = new HashMap<>();
        for (int i = 0; i < voc.length(); mapa.put(voc.charAt(i++), i));
        // End voc
        LinkedList<String> A[] = new LinkedList[longi + 1];
        for (int i = 0; i < A.length; i++) {
            A[i] = new LinkedList<>();
        }
        int l = li.size(), le;
        for (int i = 0; i < l; i++) {
            le = li.get(i).length();
            if (le > index) {
                A[mapa.get(li.get(i).charAt(index))].add(li.get(i));
            } else {
                A[0].add(li.get(i));
            }
        }
        li.clear();
        int con = 0, lon = A[0].size();
        while (con < lon) {
            li.add(A[0].get(con));
            con++;
        }
        for (int i = 1; i < longi; i++) {
            if (A[i].size() > 1) {
                RadixSort(A[i], index + 1);
            }
            for (int j = 0; j < A[i].size(); j++) {
                li.add(A[i].get(j));
            }
        }
    }

    /**
     * *********************************************************
     *
     * 3. Dynamic Programming
     *
     **********************************************************
     */
    /**
     * Fibonacci
     *
     * Find the n-th Fibonacci number in the range [2 - 1498].
     *
     * @param x number to find
     * @return Fib[x] = Fib[x-1] + Fib[x-2]
     *
     */
    public static long Fibonacci(int x) {
        int maxn = 1499;
        long Fib[] = new long[maxn];
        Fib[0] = Fib[1] = 1;
        for (int i = 2; i < maxn; i++) {
            Fib[i] = Fib[i - 1] + Fib[i - 2];
        }
        return Fib[x]; // until 6688774161928657529
    }

    /**
     * Big Fibonacci Mod n
     *
     * Find the n-th Fibonacci number in the range [1 - MAX_LONG].
     *
     * @param x number to find
     * @param MODFIB mod
     * @return Fib[x] mod MODFIB = Fib[x-1] + Fib[x-2]
     *
     */
    public static long BigFibonacciModn(long x, long MODFIB) {
        long[][] fib = {{1, 1}, {1, 0}};
        long[][] ret = {{1, 0}, {0, 1}};
        long[][] tmp = {{0, 0}, {0, 0}};
        while (x > 0) {
            if (x % 2 == 1) {
                tmp[0][0] = 0;
                tmp[0][1] = 0;
                tmp[1][0] = 0;
                tmp[1][1] = 0;
                for (int i = 0; i < 2; i++) {
                    for (int j = 0; j < 2; j++) {
                        for (int k = 0; k < 2; k++) {
                            tmp[i][j] = (tmp[i][j] + ret[i][k] * fib[k][j]) % MODFIB;
                        }
                    }
                }
                for (int i = 0; i < 2; i++) {
                    for (int j = 0; j < 2; j++) {
                        ret[i][j] = tmp[i][j];
                    }
                }
            }
            tmp[0][0] = 0;
            tmp[0][1] = 0;
            tmp[1][0] = 0;
            tmp[1][1] = 0;

            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < 2; j++) {
                    for (int k = 0; k < 2; k++) {
                        tmp[i][j] = (tmp[i][j] + fib[i][k] * fib[k][j]) % MODFIB;
                    }
                }
            }
            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < 2; j++) {
                    fib[i][j] = tmp[i][j];
                }
            }
            x /= 2;
        }
        return ret[0][1] % MODFIB;
    }

    /**
     * Pascal Triangle
     *
     * Find the (N,K) combinations.
     *
     * @param n number of elements
     * @param k number of set
     * @return C(N,K)
     *
     */
    public static long TP(int n, int k) {
        long C[][] = new long[n + 1][k + 1];
        for (int i = 0; i <= n; i++) {
            C[i][0] = 1;
        }
        for (int i = 1; i <= n; i++) {
            C[i][1] = i;
        }
        for (int i = 2; i <= k; i++) {
            C[i][i] = 1;
        }
        for (int i = 3; i <= n; i++) {
            for (int j = 2; j <= i; j++) {
                if (j <= k) {
                    C[i][j] = C[i - 1][j - 1] + C[i - 1][j];
                }
            }
        }
        return C[n][k];
    }

    /**
     * Greatest Common Subsecuence
     *
     * Find the greatest common subsecuence between two words.
     *
     * @param a first string
     * @param b second string
     * @return the amount of characters that the greatest common subsecuence is
     * composed.
     *
     */
    public static int GreatestCommonSubsecuence(String a, String b) {
        int n = a.length() + 1, m = b.length() + 1;
        int T[][] = new int[m][n];
        char P[][] = new char[m][n];
        for (int i = 0; i < m; i++) {
            T[i][0] = 0;
        }
        for (int i = 0; i < n; i++) {
            T[0][i] = 0;
        }
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (a.charAt(j - 1) == b.charAt(i - 1)) {
                    T[i][j] = T[i - 1][j - 1] + 1;
                    P[i][j] = 'D';
                } else if (T[i - 1][j] >= T[i][j - 1]) {
                    T[i][j] = T[i - 1][j];
                    P[i][j] = 'S';
                } else {
                    T[i][j] = T[i][j - 1];
                    P[i][j] = 'I';
                }

            }

        }
        int solm = m - 1, soln = n - 1;
        DrawAncestor(b, n, m, P);
        return T[solm][soln];
    }

    private static void DrawAncestor(String s, int nn, int mm, char P[][]) {
        int n = nn, m = mm;
        n--;
        m--;
        String sol = "";
        while (m >= 0 && n >= 0) {
            if (P[m][n] == 'D') {
                sol = s.charAt(m - 1) + sol;
                m--;
                n--;
            } else if (P[m][n] == 'S') {
                m--;
            } else {
                n--;
            }
        }
        System.out.println(sol);
    }

    /**
     * Interests Bank
     *
     * Given a n Bank and M pesos we can to know how many pesos we need to put
     * in each bank in order to obtain the maxim benefit. f(xi) is the interest
     * function of the bank i and x0 + x1 + .. + xn = M
     *
     * @param F matrix initial of benefit where F[i,j] retrieve the the benefit
     * given by the bank i for j pesos I matrix of benefit where I[i,j] retrieve
     * the the benefit given by i banks for j pesos
     */
    public static int InterestBank(int F[][], int n, int M) {
        int I[][] = new int[n + 1][M + 1];
        for (int i = 1; i <= n; i++) {
            I[i][0] = 0;
        }
        for (int j = 0; j <= M; j++) {
            I[1][j] = F[1][j];
        }
        for (int i = 2; i <= n; i++) {
            for (int j = 1; j <= M; j++) {
                I[i][j] = Max(I, F, i, j);
            }
        }
        return I[n][M];
    }

    private static int Max(int F[][], int I[][], int i, int j) {
        int max;
        max = I[i - 1][j] + F[i][0];
        for (int t = 1; t <= j; t++) {
            max = Math.max(max, I[i - 1][j - t] + F[i][t]);
        }
        return max;
    }

    /**
     * Travel Most Cheap for River
     *
     * Less cost for travel on the river since a point A until a point B.
     *
     * @param T matrix costs
     * @param C matrix to return
     * @param n amount of points
     */
    public static void Cost(double T[][], int n, double C[][]) {
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                C[j][j + i] = MinCost(T, C, j, j + i);
            }
        }
    }

    private static double MinCost(double T[][], double C[][], int i, int j) {
        double min = 100;//MAX VALUE  
        for (int k = i + 1; k <= j; k++) {
            min = Math.min(min, T[i][k] + C[k][j]);
        }
        return min;
    }

    /**
     * Edit Distance
     *
     * Less cost for travel on the river since a point A until a point B.
     *
     * @param s first string
     * @param d second string
     */
    public static int EditDistance(String s, String d) {
        int i = s.length(), j = d.length();
        int D[][] = new int[1000][1000];
        for (int m = 0; m <= Math.max(i, j); m++) {
            D[m][0] = D[0][m] = m;
        }
        for (int m = 1; m <= i; m++) {
            for (int n = 1; n <= j; n++) {
                if (s.charAt(m - 1) == d.charAt(n - 1)) {
                    D[m][n] = D[m - 1][n - 1];
                } else {
                    D[m][n] = 1 + Math.min(D[m - 1][n - 1], Math.min(D[m - 1][n], D[m][n - 1]));
                }
            }
        }
        return D[i][j];
    }

    /**
     * Coin Change
     *
     * @param DP array empty [for return]
     * @param coins array of coins
     * @param maxChange max value of money
     */
    static void ChangeProblem(int DP[], int coins[], int maxChange) {
        int v;
        for (int i = 1; i < maxChange; i++) {
            DP[i] = maxChange;
        }
        for (int i = 0; i < coins.length; i++) {
            for (int j = coins[i]; j < maxChange; j++) {
                v = DP[j - coins[i]] + 1;
                if (v < DP[j]) {
                    DP[j] = v;
                }
            }
        }
    }

    /**
     * KnapSack 0 - 1
     *
     * @param W array of weight
     * @param B array of profits
     * @param M capacity of KnapSak
     */
    public static int KnapSack_01(int W[], int B[], int M) {
        int N = W.length - 1, limite;
        int Mochila[][] = new int[N + 1][M + 1];
        for (int i = 0; i <= N; i++) {
            Mochila[i][0] = 0;
        }
        for (int i = 0; i <= M; i++) {
            Mochila[0][i] = 0;//Rellenar las columnas de la fila 0 con el valor 0
        }
        for (int i = 1; i <= N; i++) {
            limite = Math.min(M, W[i]) - 1;//Para evitar indice fuera de rango.
            for (int j = 1; j <= limite; j++) {
                Mochila[i][j] = Mochila[i - 1][j];//Copia el valor de arriba porque el actual no cabe en la mochila.
            }
            for (int j = limite + 1; j <= M; j++) {
                Mochila[i][j] = Math.max(Mochila[i - 1][j], B[i] + Mochila[i - 1][j - W[i]]);
            }
        }
        return Mochila[N][M];
    }

    /**
     * KnapSack Multiples objects
     *
     * @param W array of weight
     * @param B array of profits
     * @param M capacity of KnapSak
     * @return DP array of Benefits
     */
    public static int[] KnapSackMultiplesObjects(int W[], int B[], int M) {
        int DP[] = new int[M + 1];
        int l = W.length;
        for (int i = 0; i < W.length; i++) {
            for (int j = W[i]; j <= M; j++) {
                DP[j] = Math.max(DP[j], DP[j - W[i]] + B[i]);
            }
        }
        return DP;
    }

    /**
     * Longest Increasing Subsequence (LIS)
     *
     * @param LIS array of integers
     * @return SOL[res] longest subsequence size
     */
    //Problems COJ 1658
    int longestIncreasingSubsecuence(int[] LIS) {
        int SOL[] = new int[LIS.length];
        Arrays.fill(SOL, 1);
        for (int i = 0; i < SOL.length - 1; i++) {
            for (int j = i + 1; j < SOL.length; j++) {
                if (LIS[j] > LIS[i] && SOL[j] < SOL[i] + 1) {
                    SOL[j] = SOL[i] + 1;
                }
            }
        }
        int res = 0;
        for (int i = 0; i < SOL.length; i++) {
            if (SOL[i] > SOL[res]) {
                res = i;
            }
        }
        return SOL[res];
    }

    /**
     * *********************************************************
     *
     * 4. Data Structure
     *
     **********************************************************
     */
    /**
     * Union-Find Disjoin-Set
     *
     * Problems COJ 1094
     *
     * @param N elements
     * @param M joins
     * @return ns number of sets
     * @return rank rank of each set number of sets
     */
    static int ns;
    static int P[], rank[];

    static void iniSet(int _size) {
        ns = _size;
        P = new int[_size];
        rank = new int[_size];
        for (int i = 0; i < _size; i++) {
            P[i] = i;
            rank[i] = 1;
        }
    }

    static int findSet(int x) {
        return (P[x] == x) ? x : findSet(P[x]);
    }

    static void unionSet(int x, int y) {
        int px = findSet(x);
        int py = findSet(y);
        if (px != py) {
            ns--;
            if (rank[px] == rank[py]) {
                P[px] = py;
                rank[py] += rank[py] + 1;
            } else if (rank[px] > rank[py]) {
                P[py] = px;
            } else {
                P[px] = py;
            }
        }
    }

    static boolean isSameSet(int x, int y) {
        return findSet(x) == findSet(y);
    }

    static int numberOfSet() {
        return ns;
    }

    static int sizeOfSet(int x) {
        return rank[findSet(x)];
    }

    /**
     * Segment Tree
     *
     * Problems COJ 1651, 2395
     *
     * @param A array of integers
     * @return the min/max/sum of a range
     */
    int MAX = 10006;

    int N, Q;
    int A[] = new int[MAX];
    int treeA[] = new int[4 * MAX];

    void create(int a, int b, int node) {

        if (a == b) {
            treeA[node] = A[a];
            return;
        }
        create(a, (a + b) / 2, 2 * node);
        create((a + b) / 2 + 1, b, 2 * node + 1);

        treeA[node] = Math.min(treeA[2 * node], treeA[2 * node + 1]);
    }

    int query(int a, int b, int ini, int fin, int node) {

        if (b < ini || a > fin) {
            return -1;
        }
        if (a >= ini && b <= fin) {
            return treeA[node];
        }

        int A1 = query(a, (a + b) / 2, ini, fin, 2 * node);
        int A2 = query((a + b) / 2 + 1, b, ini, fin, 2 * node + 1);

        if (A1 == -1) {
            return A2;
        }
        if (A2 == -1) {
            return A1;
        } else {
            return Math.min(A1, A2);
        }
    }

    /**
     * RMQ
     *
     * Problems COJ 1651, 2395
     *
     * @param A array of integers
     * @return the min/max/sum of a range
     */
    int MAXN = 10005;
    int M[][] = new int[MAXN][20], q, a, b, c;
// int A[] = new int[MAXN], N

    void RMQNlogN() {
        int i, j;
        //initialize M for the intervals with length 1
        for (i = 0; i < N; i++) {
            M[i][0] = i;
        }
        //compute values from smaller to bigger intervals
        for (j = 1; (1 << j) <= N; j++) {
            for (i = 0; i + (1 << j) - 1 < N; i++) {
                if (A[M[i][j - 1]] < A[M[i + (1 << (j - 1))][j - 1]]) {
                    M[i][j] = M[i][j - 1];
                } else {
                    M[i][j] = M[i + (1 << (j - 1))][j - 1];
                }
            }
        }
    }
    /*Once we have these values preprocessed, let's show
     how we can use them to calculate RMQA(i, j).
     The idea is to select two blocks that entirely cover
     the interval [i..j] and  find the minimum between them.
     Let k = [log(j - i + 1)]. For computing RMQA(i, j)
     we can use the following formula: */

    int Query(int i, int j) {
        if (i == j) {
            return A[i];
        }
        int k = (int) (Math.log10(j - i + 1) / Math.log10(2.0));
        return Math.min(A[ M[i][k]], A[M[j - (1 << k) + 1][k]]);
    }

    /**
     * ABI 1D
     *
     * Problems COJ
     *
     * @param A array of integers
     * @return the min/max/sum of a range
     *
     * @autor Gregorio Ferrer Cordova Complejidad : O(N log N); Dev Cpp ABI
     * (arbol binario indexado), bueno este algoritmo es una tabla acumulativa,
     * pero a diferencia de la otra que hace responde las preguntas en O(1) y
     * actualiza en O(n), esta pregunta y actualiza en O(log N). Primero lo voy
     * explicar para una dimension En la posicion i del arreglo voy a tener la
     * suma en el intervalo desde [i+lowbit(i)-1,i], el lowbit de un numero es
     * el bit activado mas a la derecha ejemplo: 5 se representa 101 el bit
     * activado mas a la derecha es el que esta en la potencia 2^0, es decir en
     * la posicion 5 tengo la suma acumaltiva desde [5-2^0+1,5] es decir de
     * [5,5], para 4 es lo mismo 100, el bit mas a la derecha 2^2, [4-2^2+1,4],
     * [1,4], y asi, ahora como hacer esto primero para calcular el lowbit de un
     * numero es asi x and -x, en c x & -x, de esta manera hallo el bit mas a la
     * derecha esto me devuelve la potencia anteriormente explicada,
     *
     * lo que vamos hacer es lo siguiente entramos el numero que va en la
     * posicion uno y vamos a sumarle ese numero a todas las posiciones que
     * contengan ese numero en su lowbit es decir lo si la lista es de uno a 5,
     * vamos a sumar lo que esta en la posicion 1, a la posicion 2 y 4 porque el
     * 2 contiene la suma desde [1,2] y el 4 de [1,4] es decir que contiene al
     * 1. Para esto lo que hacemos es sumar el lowbit del numero hasta que sea
     * menor o igual que n. Ahora para hallar la suma en un intervalo por
     * ejemplo de 3 5, tenemos que hallar lo que esta en 5 y lo que esta en 3-1,
     * y restarlo eso me da la suma de 3 a 5. Para saber la suma de hasta i, lo
     * que hacemos es restarle el lowbit del numero y ir sumando esas posiciones
     * hasta que i = 0;
     *
     * Se tiene cuando se inicializa: Para x 1 2 3 4 5 1) 1 1 0 1 0 2) 1 3 0 3 0
     * 3) 1 3 3 6 0 4) 1 3 3 10 0 5) 1 3 3 10 5
     *
     * Ejemplo de [1,5] = [5,5] + [1,4] = 15
     */
    static int n = 11;
    static int abi[] = new int[1001];

    static int lowbit(int x) {
        return x & -x;
    }

    static void update(int i, int valor) {
        while (i <= n) {
            abi[i] += valor;
            i += lowbit(i);
        }
    }//update

    static int sum(int x, int y) {
        int su1 = 0, su2 = 0;
        while (x > 0) {
            su1 += abi[x];
            x -= lowbit(x);
        }

        while (y > 0) {
            su2 += abi[y];
            y -= lowbit(y);
        }

        return su2 - su1;
    }

    /**
     * ABI 1D
     *
     * Problems COJ
     *
     * @param ABI matrix of integers
     * @return the min/max/sum of a range
     *
     *
     */
    int fil, col;
    int ABI[][] = new int[101][101];
    int z;

//int lowbit (int x) {return x & -x;}
    void update(int i, int j, int valor) {
        int y;
        while (i <= fil) {
            y = j;
            while (y <= col) {
                ABI[i][y] += valor;
                y += lowbit(y);
            }
            i += lowbit(i);
        }
    }//update

    int sumABI2(int x, int y) {
        int yi, su = 0;
        while (x > 0) {
            yi = y;
            while (yi > 0) {
                su += ABI[x][yi];
                yi -= lowbit(yi);
            }
            x -= lowbit(x);
        }
        return su;
    }//sum
// The solution is int suma = sum (x2,y2) - sum (x1-1,y2) - sum (x2,y1-1) + sum (x1-1,y1-1);

    /**
     * *********************************************************
     *
     * 5. String Processing
     *
     **********************************************************
     */
    /**
     * Knuth - Morris - Pratt (KMP)
     *
     * @param P prefix
     * @param T text
     * @return Arrays of positions of where appear P on T
     */
    static int b_KMP[], lm, lp; // DP array and lengths
    static String T_KMP, P_KMP;

    static void kmpPreprocess() { // call this before calling kmpSearch()
        int i = 0, j = -1;
        b_KMP[0] = -1; // starting values
        while (i < lp) { // pre-process the pattern string P
            while (j >= 0 && P_KMP.charAt(i) != P_KMP.charAt(j)) {
                j = b_KMP[j]; // different, reset j using b
            }
            i++;
            j++; // if same, advance both pointers
            b_KMP[i] = j; // observe i = 8, 9, 10, 11, 12, 13 with j = 0, 1, 2, 3, 4, 5
        }
        for (int k = 0; k < b_KMP.length; k++) {
            System.out.print(b_KMP[k]);
        }
    } // in the example of P = "SEVENTY SEVEN" above

    static void kmpSearch() { // this is similar as kmpPreprocess(), but on string T
        int i = 0, j = 0; // starting values
        lm = T_KMP.length();
        lp = P_KMP.length();
        b_KMP = new int[lp + 1];
        kmpPreprocess();
        while (i < lm) { // search through string T
            while (j >= 0 && T_KMP.charAt(i) != P_KMP.charAt(j)) {
                j = b_KMP[j]; // different, reset j using b
            }
            i++;
            j++; // if same, advance both pointers
            if (j == lp) { // a match found when j == m
                System.out.printf("P is found at index %d in T\n", i - j);
                System.out.println(T_KMP.substring(i - j, i - j + lp));
                j = b_KMP[j]; // prepare j for the next possible match
            }
        }
    }

    /**
     * JaroWinkler (Edit Distance )
     *
     * A similarity algorithm indicating the percentage of matched characters
     * between two character sequences.
     *
     * <p>
     * The Jaro measure is the weighted sum of percentage of matched characters
     * from each file and transposed characters. Winkler increased this measure
     * for matching initial characters.
     * </p>
     *
     */
    /**
     * The default prefix length limit set to four.
     */
    private static final int PREFIX_LENGTH_LIMIT = 4;
    /**
     * Represents a failed index search.
     */
    public static final int INDEX_NOT_FOUND = -1;

    /**
     * Find the Jaro Winkler Distance which indicates the similarity score
     * between two CharSequences.
     *
     * <pre>
     * distance.apply(null, null)          = IllegalArgumentException
     * distance.apply("","")               = 0.0
     * distance.apply("","a")              = 0.0
     * distance.apply("aaapppp", "")       = 0.0
     * distance.apply("frog", "fog")       = 0.93
     * distance.apply("fly", "ant")        = 0.0
     * distance.apply("elephant", "hippo") = 0.44
     * distance.apply("hippo", "elephant") = 0.44
     * distance.apply("hippo", "zzzzzzzz") = 0.0
     * distance.apply("hello", "hallo")    = 0.88
     * distance.apply("ABC Corporation", "ABC Corp") = 0.91
     * distance.apply("D N H Enterprises Inc", "D &amp; H Enterprises, Inc.") = 0.93
     * distance.apply("My Gym Children's Fitness Center", "My Gym. Childrens Fitness") = 0.94
     * distance.apply("PENNSYLVANIA", "PENNCISYLVNIA")    = 0.9
     * </pre>
     *
     * @param left the first String, must not be null
     * @param right the second String, must not be null
     * @return result distance
     * @throws IllegalArgumentException if either String input {@code null}
     */
    static public Double apply(CharSequence left, CharSequence right) {
        final double defaultScalingFactor = 0.1;
        final double percentageRoundValue = 100.0;

        if (left == null || right == null) {
            throw new IllegalArgumentException("Strings must not be null");
        }

        final double jaro = score(left, right);
        final int cl = commonPrefixLength(left, right);
        final double matchScore = Math.round((jaro + defaultScalingFactor
                * cl * (1.0 - jaro)) * percentageRoundValue) / percentageRoundValue;

        return matchScore;
    }

    /**
     * Calculates the number of characters from the beginning of the strings
     * that match exactly one-to-one, up to a maximum of four (4) characters.
     *
     * @param first The first string.
     * @param second The second string.
     * @return A number between 0 and 4.
     */
    private static int commonPrefixLength(final CharSequence first,
            final CharSequence second) {
        final int result = getCommonPrefix(first.toString(), second.toString())
                .length();

        // Limit the result to 4.
        return result > PREFIX_LENGTH_LIMIT ? PREFIX_LENGTH_LIMIT : result;
    }

    /**
     * Compares all Strings in an array and returns the initial sequence of
     * characters that is common to all of them.
     *
     * <p>
     * For example,
     * <code>getCommonPrefix(new String[] {"i am a machine", "i am a robot"}) -&gt; "i am a "</code>
     * </p>
     *
     * <pre>
     * getCommonPrefix(null) = ""
     * getCommonPrefix(new String[] {}) = ""
     * getCommonPrefix(new String[] {"abc"}) = "abc"
     * getCommonPrefix(new String[] {null, null}) = ""
     * getCommonPrefix(new String[] {"", ""}) = ""
     * getCommonPrefix(new String[] {"", null}) = ""
     * getCommonPrefix(new String[] {"abc", null, null}) = ""
     * getCommonPrefix(new String[] {null, null, "abc"}) = ""
     * getCommonPrefix(new String[] {"", "abc"}) = ""
     * getCommonPrefix(new String[] {"abc", ""}) = ""
     * getCommonPrefix(new String[] {"abc", "abc"}) = "abc"
     * getCommonPrefix(new String[] {"abc", "a"}) = "a"
     * getCommonPrefix(new String[] {"ab", "abxyz"}) = "ab"
     * getCommonPrefix(new String[] {"abcde", "abxyz"}) = "ab"
     * getCommonPrefix(new String[] {"abcde", "xyz"}) = ""
     * getCommonPrefix(new String[] {"xyz", "abcde"}) = ""
     * getCommonPrefix(new String[] {"i am a machine", "i am a robot"}) = "i am a "
     * </pre>
     *
     * @param strs array of String objects, entries may be null
     * @return the initial sequence of characters that are common to all Strings
     * in the array; empty String if the array is null, the elements are all
     * null or if there is no common prefix.
     */
    public static String getCommonPrefix(final String... strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }
        final int smallestIndexOfDiff = indexOfDifference(strs);
        if (smallestIndexOfDiff == INDEX_NOT_FOUND) {
            // all strings were identical
            if (strs[0] == null) {
                return "";
            }
            return strs[0];
        } else if (smallestIndexOfDiff == 0) {
            // there were no common initial characters
            return "";
        } else {
            // we found a common initial character sequence
            return strs[0].substring(0, smallestIndexOfDiff);
        }
    }

    /**
     * This method returns the Jaro-Winkler score for string matching.
     *
     * @param first the first string to be matched
     * @param second the second string to be machted
     * @return matching score without scaling factor impact
     */
    protected static double score(final CharSequence first,
            final CharSequence second) {
        String shorter;
        String longer;

        // Determine which String is longer.
        if (first.length() > second.length()) {
            longer = first.toString().toLowerCase();
            shorter = second.toString().toLowerCase();
        } else {
            longer = second.toString().toLowerCase();
            shorter = first.toString().toLowerCase();
        }

        // Calculate the half length() distance of the shorter String.
        final int halflength = shorter.length() / 2 + 1;

        // Find the set of matching characters between the shorter and longer
        // strings. Note that
        // the set of matching characters may be different depending on the
        // order of the strings.
        final String m1 = getSetOfMatchingCharacterWithin(shorter, longer,
                halflength);
        final String m2 = getSetOfMatchingCharacterWithin(longer, shorter,
                halflength);

        // If one or both of the sets of common characters is empty, then
        // there is no similarity between the two strings.
        if (m1.length() == 0 || m2.length() == 0) {
            return 0.0;
        }

        // If the set of common characters is not the same size, then
        // there is no similarity between the two strings, either.
        if (m1.length() != m2.length()) {
            return 0.0;
        }

        // Calculate the number of transposition between the two sets
        // of common characters.
        final int transpositions = transpositions(m1, m2);

        final double defaultDenominator = 3.0;

        // Calculate the distance.
        final double dist = (m1.length() / ((double) shorter.length())
                + m2.length() / ((double) longer.length()) + (m1.length() - transpositions)
                / ((double) m1.length())) / defaultDenominator;
        return dist;
    }

    /**
     * Calculates the number of transposition between two strings.
     *
     * @param first The first string.
     * @param second The second string.
     * @return The number of transposition between the two strings.
     */
    protected static int transpositions(final CharSequence first,
            final CharSequence second) {
        int transpositions = 0;
        for (int i = 0; i < first.length(); i++) {
            if (first.charAt(i) != second.charAt(i)) {
                transpositions++;
            }
        }
        return transpositions / 2;
    }

    /**
     * Compares all CharSequences in an array and returns the index at which the
     * CharSequences begin to differ.
     *
     * <p>
     * For example,
     * <code>indexOfDifference(new String[] {"i am a machine", "i am a robot"}) -&gt; 7</code>
     * </p>
     *
     * <pre>
     * distance.indexOfDifference(null) = -1
     * distance.indexOfDifference(new String[] {}) = -1
     * distance.indexOfDifference(new String[] {"abc"}) = -1
     * distance.indexOfDifference(new String[] {null, null}) = -1
     * distance.indexOfDifference(new String[] {"", ""}) = -1
     * distance.indexOfDifference(new String[] {"", null}) = 0
     * distance.indexOfDifference(new String[] {"abc", null, null}) = 0
     * distance.indexOfDifference(new String[] {null, null, "abc"}) = 0
     * distance.indexOfDifference(new String[] {"", "abc"}) = 0
     * distance.indexOfDifference(new String[] {"abc", ""}) = 0
     * distance.indexOfDifference(new String[] {"abc", "abc"}) = -1
     * distance.indexOfDifference(new String[] {"abc", "a"}) = 1
     * distance.indexOfDifference(new String[] {"ab", "abxyz"}) = 2
     * distance.indexOfDifference(new String[] {"abcde", "abxyz"}) = 2
     * distance.indexOfDifference(new String[] {"abcde", "xyz"}) = 0
     * distance.indexOfDifference(new String[] {"xyz", "abcde"}) = 0
     * distance.indexOfDifference(new String[] {"i am a machine", "i am a robot"}) = 7
     * </pre>
     *
     * @param css array of CharSequences, entries may be null
     * @return the index where the strings begin to differ; -1 if they are all
     * equal
     */
    protected static int indexOfDifference(final CharSequence... css) {
        if (css == null || css.length <= 1) {
            return INDEX_NOT_FOUND;
        }
        boolean anyStringNull = false;
        boolean allStringsNull = true;
        final int arrayLen = css.length;
        int shortestStrLen = Integer.MAX_VALUE;
        int longestStrLen = 0;

        // find the min and max string lengths; this avoids checking to make
        // sure we are not exceeding the length of the string each time through
        // the bottom loop.
        for (int i = 0; i < arrayLen; i++) {
            if (css[i] == null) {
                anyStringNull = true;
                shortestStrLen = 0;
            } else {
                allStringsNull = false;
                shortestStrLen = Math.min(css[i].length(), shortestStrLen);
                longestStrLen = Math.max(css[i].length(), longestStrLen);
            }
        }

        // handle lists containing all nulls or all empty strings
        if (allStringsNull || longestStrLen == 0 && !anyStringNull) {
            return INDEX_NOT_FOUND;
        }

        // handle lists containing some nulls or some empty strings
        if (shortestStrLen == 0) {
            return 0;
        }

        // find the position with the first difference across all strings
        int firstDiff = -1;
        for (int stringPos = 0; stringPos < shortestStrLen; stringPos++) {
            final char comparisonChar = css[0].charAt(stringPos);
            for (int arrayPos = 1; arrayPos < arrayLen; arrayPos++) {
                if (css[arrayPos].charAt(stringPos) != comparisonChar) {
                    firstDiff = stringPos;
                    break;
                }
            }
            if (firstDiff != -1) {
                break;
            }
        }

        if (firstDiff == -1 && shortestStrLen != longestStrLen) {
            // we compared all of the characters up to the length of the
            // shortest string and didn't find a match, but the string lengths
            // vary, so return the length of the shortest string.
            return shortestStrLen;
        }
        return firstDiff;
    }

    /**
     * Gets a set of matching characters between two strings.
     *
     * <p>
     * Two characters from the first string and the second string are considered
     * matching if the character's respective positions are no farther than the
     * limit value.
     * </p>
     *
     * @param first The first string.
     * @param second The second string.
     * @param limit The maximum distance to consider.
     * @return A string contain the set of common characters.
     */
    protected static String getSetOfMatchingCharacterWithin(
            final CharSequence first, final CharSequence second, final int limit) {
        final StringBuilder common = new StringBuilder();
        final StringBuilder copy = new StringBuilder(second);

        for (int i = 0; i < first.length(); i++) {
            final char ch = first.charAt(i);
            boolean found = false;

            // See if the character is within the limit positions away from the
            // original position of that character.
            for (int j = Math.max(0, i - limit); !found
                    && j < Math.min(i + limit, second.length()); j++) {
                if (copy.charAt(j) == ch) {
                    found = true;
                    common.append(ch);
                    copy.setCharAt(j, '*');
                }
            }
        }
        return common.toString();
    }

    /**
     * Longest Common Subsequence (LCS)
     *
     * @param s1
     * @param s2
     * @return s3 longest subsequence
     */
    static String s1, s2;
    static int m;
    static char[][] P_LCM;

    static int LCS() {
        n = s1.length() + 1;
        m = s2.length() + 1;
        int[][] T = new int[m][n];
        P_LCM = new char[m][n];
        for (int i = 0; i < m; i++) {
            T[i][0] = 0;
        }
        for (int i = 0; i < n; i++) {
            T[0][i] = 0;
        }
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (s1.charAt(j - 1) == s2.charAt(i - 1)) {
                    T[i][j] = T[i - 1][j - 1] + 1;
                    P_LCM[i][j] = 'D';
                } else if (T[i - 1][j] >= T[i][j - 1]) {
                    T[i][j] = T[i - 1][j];
                    P_LCM[i][j] = 'S';
                } else {
                    T[i][j] = T[i][j - 1];
                    P_LCM[i][j] = 'I';
                }
            }
        }
        int solm = m - 1, soln = n - 1;
        printPrecedence();
        return T[solm][soln];
    }

    static void printPrecedence() {
        n--;
        m--;
        StringBuilder sb = new StringBuilder();
        while (m >= 0 && n >= 0) {
            if (P_LCM[m][n] == 'D') {
                sb.append(s2.charAt(m - 1));
                m--;
                n--;
            } else if (P_LCM[m][n] == 'S') {
                m--;
            } else {
                n--;
            }
        }
        System.out.printf("%s\n", sb.reverse().toString());
    }

    /**
     * Longest Palindrome
     *
     * @param s prefix
     * @return sol longest palindrome
     */
    static String longestPalindrome(String s) {
        int l = s.length();
        int DP[][] = new int[l][l];
        char P[][] = new char[l][l];
        for (int i = 0; i < l; i++) {   // for n=1
            DP[0][i] = 1;
            P[0][i] = 'D';
        }
        for (int i = 1; i < l; i++) {   // for n=2
            DP[1][i] = 1;
            if (s.charAt(i) == s.charAt(i - 1)) {
                DP[1][i] = 2;
            }
        }
        // for n >= 3
        for (int i = 2; i < l; i++) {
            for (int j = i; j < l; j++) {
                if (s.charAt(j) == s.charAt(j - i)) {
                    DP[i][j] = 2 + DP[i - 2][j - 1];
                    P[i][j] = 'D';
                } else {
                    DP[i][j] = Math.max(DP[i - 1][j - 1], DP[i - 1][j]);
                    if (DP[i][j] == DP[i - 1][j - 1]) {
                        P[i][j] = 'I';
                    } else {
                        P[i][j] = 'S';
                    }
                }
            }
        }
        return printLongestPalindrome(s, P, DP[l - 1][l - 1]);
    }

    static String printLongestPalindrome(String s, char P[][], int len) {
        StringBuilder sb = new StringBuilder();
        int i = P.length - 1;
        int j = i;
        while (i >= 0) {
            if (P[i][j] == 'D') {
                sb.append(s.charAt(j));
                i -= 2;
                j--;
            } else if (P[i][j] == 'S') {
                i--;
            } else {
                i--;
                j--;
            }
        }
        StringBuilder sol = new StringBuilder(sb.toString() + sb.reverse().toString());
        if (len % 2 == 1) {
            sol.deleteCharAt(len - 1);
        }
        return sol.toString();
    }

    /**
     * Suffix Trie
     *
     * @param wordList list of words to save
     * @return exist [true if the prefix exist or false in other case]
     */
    static int MAXNODE = 100000; //( cant of words) *( max size)
    static int trie[][] = new int[MAXNODE][27];
    static int words; // cant of words
    static LinkedList<String> wordsList;       // list of words

    static void suffixTrie() {
        for (int j = 'A'; j <= 'Z'; ++j) {
            trie[0][j - 'A'] = -1;
        }
        int nodos = 0;
        for (int i = 0; i < words; ++i) {
            String cad = wordsList.get(i);
            int p = 0;
            for (int j = 0; j < cad.length(); ++j) {
                if (trie[p][cad.charAt(j) - 'A'] == -1) {
                    trie[p][cad.charAt(j) - 'A'] = ++nodos;
                    for (int k = 'A'; k <= 'Z'; ++k) {
                        trie[nodos][k - 'A'] = -1;
                    }
                }
                p = trie[p][cad.charAt(j) - 'A'];
            }
        }
    }

    static boolean findWordTrie(String s) {
        int i = 0, l = s.length();
        int pos = 0;
        while (i < l) {
            if (trie[pos][s.charAt(i) - 'A'] == -1) {
                return false;
            }
            pos = trie[pos][s.charAt(i++) - 'A'];
        }
        return true;
    }

    /**
     * Suffix Array
     *
     * @param wordList list of words to save
     * @return exist [true if the prefix exist or false in other case]
     */
    static int MAX_N = 100010;          // second approach: O(n log n)
    static int C_SA[];         //= new int[MAX_N]
    static String T_SA; //  the input string, up to 100K characters [MAX_N]
    static int RA[], tempRA[]; // rank array and temporary rank array [MAX_N]
    static int SA[], tempSA[]; // suffix array and temporary suffix array [MAX_N]

    static void countingSort(int k) { // O(n)
        int i, sum, maxi = Math.max(300, n);   // up to 255 ASCII chars or length of n
        Arrays.fill(C_SA, 0);                                    // clear frequency table
        for (i = 0; i < n; i++) // count the frequency of each integer rank
        {
            C_SA[i + k < n ? RA[i + k] : 0]++;
        }
        for (i = sum = 0; i < maxi; i++) {
            int t = C_SA[i];
            C_SA[i] = sum;
            sum += t;
        }
        for (i = 0; i < n; i++) // shuffle the suffix array if necessary
        {
            tempSA[C_SA[SA[i] + k < n ? RA[SA[i] + k] : 0]++] = SA[i];
        }
        for (i = 0; i < n; i++) // update the suffix array SA
        {
            SA[i] = tempSA[i];
        }
    }

    static void suffixArray() { // this version can go up to 100000 characters
        C_SA = new int[MAX_N];
        RA = new int[MAX_N];
        tempRA = new int[MAX_N];
        SA = new int[MAX_N];
        tempSA = new int[MAX_N];
        int i, k, r;
        for (i = 0; i < n; i++) {
            RA[i] = T_SA.charAt(i); // initial rankings
        }
        for (i = 0; i < n; i++) {
            SA[i] = i; // initial SA: {0, 1, 2, ..., n-1}
        }
        for (k = 1; k < n; k <<= 1) { // repeat sorting process log n times
            countingSort(k); // actually radix sort: sort based on the second item
            countingSort(0); // then (stable) sort based on the first item
            tempRA[SA[0]] = r = 0; // re-ranking; start from rank r = 0
            for (i = 1; i < n; i++) // compare adjacent suffixes
            {
                tempRA[SA[i]] = // if same pair => same rank r; otherwise, increase r
                        (RA[SA[i]] == RA[SA[i - 1]] && RA[SA[i] + k] == RA[SA[i - 1] + k]) ? r : ++r;
            }
            for (i = 0; i < n; i++) // update the rank array RA
            {
                RA[i] = tempRA[i];
            }
            if (RA[SA[n - 1]] == n - 1) {
                break; // nice optimization trick
            }
        }
    }

    static void runSuffixArrays() {
        T_SA = "GATAGACA$";
        n = T_SA.length();
        suffixArray();
        for (int i = 0; i < n; i++) {
            System.out.println(SA[i] + "    " + T_SA.substring(SA[i], T_SA.length()));
        }
    }

    /**
     * Longest Common Prefix (LCP)  O(n)
     * use suffix array first
     * 
     * @param word
     * @return LCP array
     */
    static int Phi[], PLCP[], LCP[];

    static void LCP() {
        Phi = new int[MAX_N];
        PLCP = new int[MAX_N];
        LCP = new int[MAX_N];
        int i, L;
        Phi[SA[0]] = -1; // default value
        for (i = 1; i < n; i++) // compute Phi in O(n)
        {
            Phi[SA[i]] = SA[i - 1]; // remember which suffix is behind this suffix
        }
        for (i = L = 0; i < n; i++) { // compute Permuted LCP in O(n)
            if (Phi[i] == -1) {
                PLCP[i] = 0;
                continue;
            } // special case
            while (i+L < n && Phi[i]+L < n && T_SA.charAt(i + L) == T_SA.charAt(Phi[i] + L)) {
                L++; // L increased max n times
            }
            PLCP[i] = L;
            L = Math.max(L - 1, 0); // L decreased max n times
        }
        for (i = 0; i < n; i++) // compute LCP in O(n)
        {
            LCP[i] = PLCP[SA[i]]; // put the permuted LCP to the correct position
            System.out.println(LCP[i] + " " + T_SA.substring(SA[i], T_SA.length()));
        }
    }

        /**
     * Longest Common SubString (LCS)  O(n*m)
     * max 10^4
     * This code is contributed by Sumit Ghosh
     * 
     * @param word1
     * @param word2
     * @return long integer:  Returns length of longest common substring  of X[0..m-1] and Y[0..n-1] 
     */

    static int LCSubStr(char X[], char Y[], int m, int n) {
        // Create a table to store lengths of longest common suffixes of
        // substrings. Note that LCSuff[i][j] contains length of longest
        // common suffix of X[0..i-1] and Y[0..j-1]. The first row and
        // first column entries have no logical meaning, they are used only
        // for simplicity of program
        int LCStuff[][] = new int[m + 1][n + 1];
        int result = 0;  // To store length of the longest common substring

        // Following steps build LCSuff[m+1][n+1] in bottom up fashion
        for (int i = 0; i <= m; i++) {
            for (int j = 0; j <= n; j++) {
                if (i == 0 || j == 0) {
                    LCStuff[i][j] = 0;
                } else if (X[i - 1] == Y[j - 1]) {
                    LCStuff[i][j] = LCStuff[i - 1][j - 1] + 1;
                    result = Integer.max(result, LCStuff[i][j]);
                } else {
                    LCStuff[i][j] = 0;
                }
            }
        }
        return result;
    }

    static int longestCommonSubstring(String s, String t) {
        int m = s.length();
        int n = t.length();
        return LCSubStr(s.toCharArray(), t.toCharArray(), m, n);
}
    
    /**
     * *********************************************************
     *
     * 6. Backtracking
     *
     **********************************************************
     */
    /**
     * 8 Queens
     *
     * Problems COJ
     *
     * @param n_EQueens number of the board
     * @return the number of possible solutions
     *
     *
     */
    static int NMAX = 100;
    static int a_EQueens[] = new int[NMAX], count_solutions, n_EQueens;
    static boolean val;

//Check that don't exist colisions
    static boolean can_move(int row, int col) {
        for (int i = 1; i < col; i++) {
            if (a_EQueens[i] == row || (Math.abs(row - a_EQueens[i]) == Math.abs(col - i))) {
                return false;
            }
        }
        return true;
    }

//Count a new step
    static void next_moved(int k) {
        if (k > n_EQueens) {
            count_solutions++;
            return;
        }
        for (int i = 1; i <= n_EQueens; i++) {
            if (can_move(i, k)) {
                a_EQueens[k] = i;
                next_moved(k + 1);
            }
        }
    }

    static void n_Queens() {
        count_solutions = 0;
        next_moved(1);
    }

    int AA[] = {10, 50, 100};
    int BB[] = {1, 2, 2};
    int limit;

    void R(int current) {
        if (current > limit) {
            return;
        }
        for (int i = 0; i < current; i++) {

        }
    }

    /**
     * *********************************************************
     *
     * 7. Divide & Conquer
     *
     **********************************************************
     */
    /**
     * Binary Search
     *
     * @param A array sorted
     * @param x element to find
     * @return position of the element or where should be find out.
     */
    public static int BinarySearch(int A[], int x) {
        Arrays.sort(A);
        int m, begin = 0, end = A.length - 1;
        while (begin <= end) {
            m = (begin + end) / 2;
            if (A[m] == x) {
                if (m - 1 >= begin && A[m - 1] == x) {//Para el caso de que existan numeros repetidos tenemos que buscar la primera ocurrencia.
                    end = m - 1;
                } else {
                    return m;
                }
            } else if (A[m] < x) {
                begin = m + 1;
            } else {
                end = m - 1;
            }
        }
        return begin;//retorna la posicion en que esta y si no lo encuentra retorna donde deberia estar antes. 
    }

    /**
     * Ternary Search
     *
     * @param A array sorted
     * @param x element to find
     * @return position of the element or - the position where should be find
     * out.
     */
    public static int TernarySearch(int A[], int x) {
        int begin = 0, end = A.length - 1, nterc;
        while (true) {
            if (begin >= end) {
                return A[end] == x ? end : -end;
            }
            nterc = (end - begin + 1) / 3;
            if (x == A[begin + nterc]) {
                return begin + nterc;
            } else if (x < A[begin + nterc]) {
                end = begin + nterc - 1;
            } else {
                begin += nterc + 1;
            }
        }
    }

    /**
     * Matrix Change Order
     *
     * @param p array of values
     * @param n count of elements
     */
    private static int num;

    public static void matrix_chan_order(int p[], int n) {
        int MAX = 15;
        long INF = Long.MAX_VALUE;
        long m[][] = new long[MAX][MAX];
        int s[][] = new int[MAX][MAX];
        int q;
        int ll, j, i, k;
        for (ll = 2; ll <= n; ll++) {
            for (i = 1; i <= n - ll + 1; i++) {
                j = i + ll - 1;
                m[i][j] = INF;
                for (k = i; k < j; k++) {
                    q = (int) (m[i][k] + m[k + 1][j] + p[i - 1] * p[k] * p[j]);
                    if (q < m[i][j]) {
                        m[i][j] = q;
                        s[i][j] = k;
                    }
                }
            }
        }
        num = 1;
        print(s, 1, n);
    }

    private static void print(int s[][], int i, int j) {
        if (i == j) {
            System.out.printf("A%d", num++);
        } else {
            System.out.printf("(");
            print(s, i, s[i][j]);
            System.out.print(" x ");
            print(s, s[i][j] + 1, j);
            System.out.print(")");
        }
    }

    /**
     * Tennis Tournament
     *
     * Fill the matrix of player's challenge. Example: for two players the
     * matrix is: 1 against 2 2 against 1 and for four players is: 1| 2 3 4 2| 1
     * 4 3 3| 4 1 2 4| 3 2 1
     *
     * @param table matrix to fill, player's challenge
     * @param n count of players
     * @return count of days
     */
    public static int TennisTournamment(int n, int table[][]) {
        int powOfTwo = (int) (Math.log10(n) / Math.log10(2));
        if (Math.pow(powOfTwo, 2) == n) {
            Pow2(n, table);
            return n - 1;
        } else {
            return EvenOrOdd(n, table);
        }
    }

    // n pow of two (n-1 days)
    private static void Pow2(int n, int table[][]) {
        if (n == 2) {
            table[1][1] = 2;
            table[2][1] = 1;
        } else {
            //Part upper left
            Pow2(n / 2, table);
            //Part lower left
            int player, day;
            for (player = n / 2 + 1; player <= n; player++) {
                for (day = 1; day <= n / 2 - 1; day++) {
                    table[player][day] = table[player - n / 2][day] + n / 2;
                }
            }
            // Part upper right
            for (player = 1; player <= n / 2; player++) {
                for (day = n / 2; day <= n - 1; day++) {
                    if (player + day <= n) {
                        table[player][day] = player + day;
                    } else {
                        table[player][day] = player + day - n / 2;
                    }
                }
            }
            //Part lower right
            for (player = n / 2 + 1; player <= n; player++) {
                for (day = n / 2; day <= n - 1; day++) {
                    if (player > day) {
                        table[player][day] = player - day;
                    } else {
                        table[player][day] = player + n / 2 - day;
                    }
                }

            }
        }
    }

    //  Even count of elements
    private static int EvenOrOdd(int n, int table[][]) {
        int player, day;
        if (n == 2) {
            table[1][1] = 2;
            table[2][1] = 1;
        } else if (n % 2 != 0) {//odd
            EvenOrOdd(n + 1, table);
            for (player = 1; player <= n; player++) {
                for (day = 1; day <= n; day++) {
                    if (table[player][day] == n + 1) {
                        table[player][day] = 0;
                    }
                }
            }
            return n;
        } else {//even
            int m = n / 2;
            EvenOrOdd(m, table);//Part upper left
            if (m % 2 == 0) {
                for (player = m + 1; player <= n; player++) {//Part lower left
                    for (day = 1; day <= m - 1; day++) {
                        table[player][day] = table[player - m][day] + m;
                    }
                }
                for (player = 1; player <= m; player++) {//Part upper right
                    for (day = m; day <= n - 1; day++) {
                        if (player + day <= n) {
                            table[player][day] = player + day;
                        } else {
                            table[player][day] = player + day - m;
                        }
                    }
                }
                for (player = m + 1; player <= n; player++) {//Part lower right
                    for (day = m; day <= n - 1; day++) {
                        if (player > day) {
                            table[player][day] = player - day;
                        } else {
                            table[player][day] = player + m - day;
                        }
                    }

                }
            } else {
                for (player = m + 1; player <= n; player++) {//Part lower left
                    for (day = 1; day <= m; day++) {
                        if (table[player - m][day] == 0) {
                            table[player][day] = 0;
                        } else {
                            table[player][day] = table[player - m][day] + m;
                        }
                    }
                }
                for (player = 1; player <= m; player++) {//Zeros part left
                    for (day = 1; day <= m; day++) {
                        if (table[player][day] == 0) {
                            table[player][day] = player + m;
                            table[player + m][day] = player;
                        }
                    }
                }
                for (player = 1; player <= m; player++) {//Part upper right
                    for (day = m + 1; day <= n - 1; day++) {
                        if (player + day <= n) {
                            table[player][day] = player + day;
                        } else {
                            table[player][day] = player + day - m;
                        }
                    }
                }
                for (player = m + 1; player <= n; player++) {//Part lower right
                    for (day = m + 1; day <= n - 1; day++) {
                        if (player > day) {
                            table[player][day] = player - day;
                        } else {
                            table[player][day] = player + m - day;
                        }
                    }
                }
            }
            return n - 1;
        }
        return 0;
    }

    /**
     * Chess Horse Jump
     *
     * Check that the horse can jump around all the cells.
     *
     * @param n grid dimension
     * @param x pos X
     * @param y pos Y
     * @return true | false
     *
     */
    public static boolean Horse(int n, int x, int y) {
        int i;
        for (i = 1; i <= n * n; i++) {
            T[x][y] = i;
            if (!NewMov(n, x, y) && (i < n * n - 1)) {
                return false;
            }
        }
        return true;
    }

    private static final int TAMMAX = 500; // Board dimensions
    private static int T[][] = new int[TAMMAX][TAMMAX];

    private static boolean Jump(int n, int i, int x, int y, int nx, int ny) {
        int X[] = {0, -2, -1, 1, 2, 2, 1, -1, -2};
        int Y[] = {0, 1, 2, 2, 1, -1, -2, -2, -1};
        nx += X[i];
        ny += Y[i];
        return ((1 <= nx) && (nx <= n) && (1 <= ny) && (ny <= n) && (T[nx][ny] == 0));
    }

    private static int Count(int n, int x, int y) {
        int acc = 0, i, nx = 0, ny = 0;
        for (i = 1; i <= 8; i++) {
            if (Jump(n, i, x, y, nx, ny)) {
                acc++;
            }
        }
        return acc;
    }

    private static boolean NewMov(int n, int x, int y) {
        int acc, min_acc = 9, i, solx = x, soly = y, nuevax = 0, nuevay = 0;
        for (i = 1; i <= 8; i++) {
            if (Jump(n, i, x, y, nuevax, nuevay)) {
                acc = Count(n, nuevax, nuevay);
                if (acc > 0 && acc < min_acc) {
                    min_acc = acc;
                    solx = nuevax;
                    soly = nuevay;
                }
            }
        }
        x = solx;
        y = soly;
        return (min_acc < 9);

    }

    /**
     * ***************************************************
     *
     * 8 . Graph Theory
     *
     *****************************************************
     */
    static class Edge implements Comparable<Edge> {

        int x, y, weight;

        public Edge(int x, int y, int weight) {
            this.x = x;
            this.y = y;
            this.weight = weight;
        }

        @Override
        public int compareTo(Edge o) {
            if (this.weight == o.weight) {
                return 0;
            }
            if (this.weight < o.weight) {
                return -1;
            }
            return 1;
        }
    }
    /**
     * Finding Articulation Point And Bridge
     *
     * Problems COJ
     *
     * @param n_EQueens number of the board
     * @return the number of possible solutions
     *
     */
    static int nodes, dfs_root, rootChildren;
    static final int UNVISITED = -1;
    static int dfsNumberCounter;
    static int dfs_num[];
    static int dfs_low[];
    static int dfs_parent[];
    static boolean articulation_vertex[];
    static LinkedList<Integer>[] AdjList;

    static void findingArticulationPointAndBridge(int u) {
        dfs_low[u] = dfs_num[u] = dfsNumberCounter++; // dfs_low[u] <= dfs_num[u]
        for (int i = 0; i < AdjList[u].size(); i++) {
            int v = AdjList[u].get(i);
            if (dfs_num[v] == UNVISITED) {                                                               // a tree adge
                dfs_parent[v] = u;
                if (u == dfs_root) {
                    rootChildren++;                         // special case if u is a root
                }
                findingArticulationPointAndBridge(v);
                if (dfs_low[v] >= dfs_num[u]) // for articulation point
                {
                    articulation_vertex[u] = true;                              // store this information first
                }
                if (dfs_low[v] > dfs_num[u]) // for bridge
                {
                    System.out.println(" Edge " + u + " " + v + " is a bridge");
                }
                dfs_low[u] = Math.min(dfs_low[u], dfs_low[v]);  // update dfs_low[u]
            } else if (v != dfs_parent[u]) // a back edge and not direct cicle
            {
                dfs_low[u] = Math.min(dfs_low[u], dfs_num[v]);  // update dfs_low[u]
            }
        }

    }

    static void Runfapab() {
        // Init
        nodes = 6; // Amount of nodes
        dfsNumberCounter = rootChildren = 0;
        dfs_low = new int[nodes];
        dfs_num = new int[nodes];
        dfs_parent = new int[nodes];
        articulation_vertex = new boolean[nodes];
        AdjList = new LinkedList[nodes];
        for (int i = 0; i < nodes; i++) {
            AdjList[i] = new LinkedList<>();
            dfs_num[i] = UNVISITED;
        }
        /*
         Graph 1
         AdjList[0].add(1);
         AdjList[1].add(0);
         AdjList[1].add(2);
         AdjList[1].add(4);
         AdjList[2].add(1);
         AdjList[3].add(4);
         AdjList[4].add(1);
         AdjList[4].add(3);
         AdjList[4].add(5);
         AdjList[5].add(4);
  
         Solution
        
         Bridges:
         Edge 1 2 is a bridge
         Edge 4 3 is a bridge
         Edge 4 5 is a bridge
         Edge 1 4 is a bridge
         Edge 0 1 is a bridge
         Articulation Points:
         Vertex 1
         Vertex 4
         */

        // Graph 2
        AdjList[0].add(1);
        AdjList[1].add(0);
        AdjList[1].add(2);
        AdjList[1].add(4);
        AdjList[1].add(3);
        AdjList[2].add(1);
        AdjList[3].add(1);
        AdjList[4].add(1);
        AdjList[4].add(5);
        AdjList[5].add(4);
        AdjList[5].add(1);
        /*
         Solution
          
         Bridges:
         Edge 1 2 is a bridge
         Edge 1 3 is a bridge
         Edge 0 1 is a bridge
         Articulation Points:
         Vertex 1
         */

        System.out.println("Bridges:");
        for (int i = 0; i < nodes; i++) {
            if (dfs_num[i] == UNVISITED) {
                dfs_root = i;
                rootChildren = 0;
                findingArticulationPointAndBridge(i);
                articulation_vertex[dfs_root] = (rootChildren > 1);     // special case
            }
        }
        System.out.println("Articulation Points:");
        for (int i = 0; i < nodes; i++) {
            if (articulation_vertex[i]) {
                System.out.println(" Vertex " + i);
            }
        }
    }

    /**
     * Strongly Connected Components (Directed Graph)
     *
     * Problems COJ
     *
     * @param u current node
     *
     */
    static Stack<Integer> S;
    static int[] visited;
    static int numSCC;

    static void tarjanSCC(int u) {
        dfs_low[u] = dfs_num[u] = dfsNumberCounter++;       // dfs_low[u] <= dfs_num[u]
        S.add(u);                          // store u in a vector based on order of visitation
        visited[u] = 1;
        for (int i = 0; i < AdjList[u].size(); i++) {
            int v = AdjList[u].get(i);
            if (dfs_num[v] == UNVISITED) {
                tarjanSCC(v);
            }
            if (visited[v] > 0) {                                 // condition for update
                dfs_low[u] = Math.min(dfs_low[u], dfs_low[v]);
            }
        }
        if (dfs_low[u] == dfs_num[u]) { // if this is a root (start) of an SCC
            System.out.println(" SCC  " + (++numSCC));  // this part is done after recursion
            while (true) {
                int v = S.pop();
                visited[v] = 0;
                System.out.print(" " + v);
                if (u == v) {
                    break;
                }
            }
            System.out.println("");
        }
    }

    static void RunTarjanSCC() {
        nodes = 8;
        S = new Stack<>();
        AdjList = new LinkedList[nodes];
        dfs_low = new int[nodes];
        dfs_num = new int[nodes];
        visited = new int[nodes];
        for (int i = 0; i < nodes; i++) {
            AdjList[i] = new LinkedList<>();
            dfs_num[i] = UNVISITED;
            dfs_low[i] = 0;
            visited[i] = 0;
        }
        AdjList[0].add(1);
        AdjList[1].add(3);
        AdjList[3].add(2);
        AdjList[2].add(1);
        AdjList[3].add(4);
        AdjList[4].add(5);
        AdjList[5].add(7);
        AdjList[7].add(6);
        AdjList[6].add(4);
        /*
         Solution
        
         SCC  1
         6 7 5 4
         SCC  2
         2 3 1
         SCC  3
         0
         */
        dfsNumberCounter = numSCC = 0;
        for (int i = 0; i < nodes; i++) {
            if (dfs_num[i] == UNVISITED) {
                tarjanSCC(i);
            }
        }
    }

    /**
     * Kruskal MST
     *
     * Problems COJ
     */
    int kruskalMST(PriorityQueue<Edge> EdgeList) {
        // for each edge with (i, j, weight) format
        // EdgeList.push(make_pair(-weight, make_pair(i, j)));
        int mst_cost = 0;
        iniSet(nodes); // all V are disjoint sets initially, see Section 2.3.2
        while (!EdgeList.isEmpty()) { // while there exist more edges, O(E)
            Edge front = EdgeList.poll();
            if (!isSameSet(front.x, front.y)) { // if no cycle
                mst_cost += front.weight;
                unionSet(front.x, front.y); // link these two vertices
            }
        }
        return mst_cost;
    }

    /**
     * Minimum Spanning Forest
     *
     * @params k number of spanning trees
     * @description Divide the graph in k spanning trees
     *
     * Problems COJ
     */
    static int minimumSpanningForest(PriorityQueue<Edge> pq) {
        // for each edge with (i, j, weight) format
        // pq.push(make_pair(-weight, make_pair(i, j)));
        PriorityQueue<Edge> EdgeList = new PriorityQueue<>();
        int mst_cost = 0, com = 0, k = 2;
        boolean V[] = new boolean[nodes];
        // 1st Fase
        iniSet(nodes);
        while (!pq.isEmpty()) {
            if (com < k) {
                Edge front = pq.poll();
                if (!(V[front.x] || V[front.y])) {       //1st change if no assigned
                    V[front.x] = V[front.y] = true;
                    mst_cost += front.weight;
                    System.out.println(front.x + ", " + front.y + " = " + front.weight);
                    unionSet(front.x, front.y);         // link these two vertices
                    com++;
                } else {
                    EdgeList.add(front);
                }
            } else {
                EdgeList.add(pq.poll());
            }
        }
        // 2nd Fase
        while (!EdgeList.isEmpty()) {             // while there are more adges, O(E)
            Edge front = EdgeList.poll();
            if (!(V[front.x] && V[front.y])) {        // if no cycle
                mst_cost += front.weight;
                unionSet(front.x, front.y);
            }
        }
        return mst_cost;
    }

    static void RunMSF() {
        nodes = 5;
        PriorityQueue<Edge> EdgeList = new PriorityQueue<>();
        EdgeList.add(new Edge(0, 1, 25));
        EdgeList.add(new Edge(0, 3, 10));
        EdgeList.add(new Edge(1, 2, 13));
        EdgeList.add(new Edge(2, 3, 17));
        /*
         Solution
        
         0, 3 = 10
         1, 2 = 13
         23
         */
        System.out.println(minimumSpanningForest(EdgeList));
    }

    /**
     * Dijkstra
     *
     * @params s source node
     * @return dist array of distances
     *
     * Problems COJ
     */
    static int[] Dijkstra(int s, LinkedList<Edge>[] AdjList) {
        int dist[] = new int[nodes];
        int d, u, weight_u_v, v;
        PriorityQueue<Edge> pq = new PriorityQueue<>();
        pq.add(new Edge(s, 0, 0));
        for (int i = 0; i < nodes; i++) {
            dist[i] = Integer.MAX_VALUE;
        }
        dist[s] = 0;
        while (!pq.isEmpty()) {               // mainloop
            Edge front = pq.poll();         // greedy: pick shortest unvisited vertex
            u = front.x;
            d = front.weight;
            if (d == dist[u]) // This check is important! We want to process vertex u only once but we can actually enqueue u several times in priority_queue... Fortunately, other occurrences of u in priority_queue will have greater distances and can be ignored (the overhead is small) :)
            {
                for (int i = 0; i < AdjList[u].size(); i++) {
                    // all outgoing edges from u
                    weight_u_v = AdjList[u].get(i).weight;
                    v = AdjList[u].get(i).x;
                    if (dist[u] + weight_u_v < dist[v]) { // if can relax
                        dist[v] = dist[u] + weight_u_v; // relax
                        pq.add(new Edge(v, 0, dist[v])); // enqueue this neighbor
                    }
                }
            }
        }
        return dist;
    }

    static void RunDijkstra() {
        nodes = 6;
        LinkedList<Edge>[] AdjList = new LinkedList[nodes];
        for (int i = 0; i < nodes; i++) {
            AdjList[i] = new LinkedList<>();
        }
        AdjList[0].add(new Edge(1, 0, 3));
        AdjList[1].add(new Edge(0, 0, 3));
        AdjList[0].add(new Edge(3, 0, 1));
        AdjList[3].add(new Edge(0, 0, 1));
        AdjList[1].add(new Edge(2, 0, 4));
        AdjList[2].add(new Edge(1, 0, 4));
        AdjList[1].add(new Edge(4, 0, 2));
        AdjList[4].add(new Edge(1, 0, 2));
        AdjList[2].add(new Edge(5, 0, 2));
        AdjList[5].add(new Edge(2, 0, 2));
        AdjList[3].add(new Edge(4, 0, 4));
        AdjList[4].add(new Edge(3, 0, 4));
        AdjList[5].add(new Edge(4, 0, 9));
        AdjList[4].add(new Edge(5, 0, 9));
        /*
         Solution
        
         El camino mas corto desde %d hasta : 0
         0 es : 0
         1 es : 3
         2 es : 7
         3 es : 1
         4 es : 5
         5 es : 9
         */
        int dist[] = Dijkstra(0, AdjList);
        System.out.println("El camino mas corto desde %d hasta : " + 0);
        for (int i = 0; i < dist.length; i++) {
            System.out.printf("%d es : %d\n", i, dist[i]);
        }
    }

    /**
     * Floyd Warshall
     *
     * @params matrix adjacent list
     * @return matrix distances
     *
     * Problems COJ
     */
    int[][] floydWarshall(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                for (int k = 0; k < matrix.length; k++) {
                    matrix[i][j] = Math.min(matrix[i][j], matrix[i][k] + matrix[k][j]);
                }
            }
        }
        return matrix;
    }

    /**
     * Transitive Closure ( Warshall Algorithm )
     *
     * @params matrix adjacent matrix
     * @return matrix distances
     *
     * Problems COJ
     */
    int[][] transitiveClosure(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                for (int k = 0; k < matrix.length; k++) {
                    matrix[j][k] |= (matrix[j][i] & matrix[i][k]);
                }
            }
        }
        return matrix;
    }

    /**
     * Minimax ( Revisited )
     *
     * @params matrix adjacent matrix V <= 400
     * @return matrix distances
     *
     * Problems COJ
     */
    int[][] minimax(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (matrix[i][j] == 0) {
                    matrix[i][j] = Integer.MAX_VALUE;
                }
            }
        }
        for (int k = 0; k < matrix.length; k++) {
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix.length; j++) {
                    matrix[i][j] = Math.min(matrix[i][j], Math.max(matrix[i][k], matrix[k][j]));
                }
            }
        }
        return matrix;
    }

    /**
     * Bellman Ford (slower)
     *
     * @params AdjList adjacent list
     * @params s source
     * @params nodes [global]
     * @return array distances
     *
     * Problems COJ
     */
    static int[] bellmanFord(int s, LinkedList<Edge>[] AdjList) {
        int dist[] = new int[nodes];
        for (int i = 0; i < dist.length; i++) {
            dist[i] = Integer.MAX_VALUE;
        }
        dist[s] = 0;
        for (int i = 0; i < nodes - 1; i++) {                        // relax all E edges V-1 times
            for (int u = 0; u < nodes; u++) {                     // these two loops = O(E), overall O(VE)
                for (int j = 0; j < AdjList[u].size(); j++) {
                    Edge v = AdjList[u].get(j);
                    dist[v.y] = Math.min(dist[v.y], dist[u] + v.weight);    // relax
                }
            }
        }
        return dist;
    }

    static void RunBellmanFord() {
        nodes = 3;
        LinkedList<Edge>[] AdjList = new LinkedList[nodes];
        for (int i = 0; i < nodes; i++) {
            AdjList[i] = new LinkedList<>();
        }
        AdjList[0].add(new Edge(0, 1, 1000));
        AdjList[1].add(new Edge(1, 2, 15));
        AdjList[2].add(new Edge(2, 1, -42));
        /*
         Solution
        
         El camino mas corto desde %d hasta : 0
         0 es : 0
         1 es : 946
         2 es : 188
         */
        int dist[] = bellmanFord(0, AdjList);
        System.out.println("El camino mas corto desde %d hasta : " + 0);
        for (int i = 0; i < dist.length; i++) {
            System.out.printf("%d es : %d\n", i, dist[i]);
        }
    }

    /**
     * Has Negative Cycle - use Bellman Ford
     *
     * @params AdjList adjacent list
     * @params nodes [global]
     * @return array distances
     *
     * Problems COJ
     */
    boolean checkNegativeCycle(int dist[], LinkedList<Edge>[] AdjList) {
        boolean hasNegativeCycle = false;
        for (int i = 0; i < nodes; i++) {                      //  one more pass to check
            for (int j = 0; j < AdjList[i].size(); j++) {
                Edge v = AdjList[i].get(j);
                if (dist[v.y] > dist[i] + v.weight) //  if this is still possible
                {
                    hasNegativeCycle = true;
                }
            }
        }
        return hasNegativeCycle;
    }

    /**
     * ***************************************************
     *
     * 9. Network Flow
     *
     *****************************************************
     */
    /**
     * Edmonds Karp's (Max Flow Problem)
     *
     * @params AdjList adjacent list
     * @params nodes [global]
     * @return maxflow integer
     *
     * Problems COJ 3112
     */
    static final int INF = Integer.MAX_VALUE;
    static int res[][], mf, flow, s, t;    // global variables
    static int pmf[];                        //  pmf stores the BFS spanning tree tree from

    static void augment(int v, int minEdge) {       // traverse BFS spanning tree from s-t
        if (v == s) {
            flow = minEdge;
            return;
        } else if (pmf[v] != -1) {
            augment(pmf[v], Math.min(minEdge, res[pmf[v]][v]));
            res[pmf[v]][v] -= flow;
            res[v][pmf[v]] += flow;
        }
    }

    static void maxFlow(LinkedList<Edge>[] AdjList) {
        mf = 0;
        while (true) {  //  O(VE^2) (actually O(V^3 E) Edmonds Karp's algorithm)
            flow = 0;
            // run BFS, compare with the original BFS shown in Section 4.2.2
            int dist[] = new int[nodes];
            for (int i = 0; i < nodes; dist[i++] = INF) ;
            dist[s] = 0;
            LinkedList<Integer> cola = new LinkedList<>();
            cola.add(s);
            for (int i = 0; i < nodes; pmf[i++] = -1) ;
            while (!cola.isEmpty()) {
                int u = cola.pop();
                if (u == t) {
                    break;    // immediately stop BFS if we already reach sink
                }
                for (int i = 0; i < AdjList[u].size(); i++) {
                    int v = AdjList[u].get(i).y;
                    if (res[u][v] > 0 && dist[v] == INF) {
                        dist[v] = dist[u] + 1;
                        cola.add(v);
                        pmf[v] = u;
                    }
                }
            }
            augment(t, INF);     // find the min adge weight f in this path, if any
            if (flow == 0) {
                break;                        // we cannot send any more flow f=0, terminated
            }
            mf += flow;                       //  we can still send a flow, increase the max flow

        }
    }

    static void RunMaxFlow() {
         // Example 1 sol = 200
          /*nodes = 4;
         res = new int[nodes][nodes];
         pmf = new int [nodes];
         res[0][1] = 100;
         res[1][2] = 100;
         res[0][3] = 100;
         res[3][2] = 100;
         res[1][3] = 1;
         LinkedList<Edge> [] AdjList = new LinkedList [nodes];
         for (int i = 0; i < AdjList.length; i++) {
         AdjList[i] = new LinkedList<>();
         }
         AdjList[0].add(new Edge(0, 1, 100));
         AdjList[1].add(new Edge(1, 2, 100));
         AdjList[0].add(new Edge(0, 3, 100));
         AdjList[3].add(new Edge(3, 2, 100));
         AdjList[1].add(new Edge(1, 3, 1));
         s = 0;
         t = 2;*/

          // Example 2 sol = 60
          /*nodes = 4;
         res = new int[nodes][nodes];
         pmf = new int [nodes];
         res[0][2] = 70;
         res[2][1] = 25;
         res[0][3] = 30;
         res[3][1] = 70;
         res[2][3] = 5;
         LinkedList<Edge> [] AdjList = new LinkedList [nodes];
         for (int i = 0; i < AdjList.length; i++) {
         AdjList[i] = new LinkedList<>();
         }
         AdjList[0].add(new Edge(0, 2, 70));
         AdjList[2].add(new Edge(2, 1, 25));
         AdjList[0].add(new Edge(0, 3, 30));
         AdjList[3].add(new Edge(3, 1, 70));
         AdjList[2].add(new Edge(2, 3, 5));
         s = 0;
         t = 1;*/
        // Example 3 sol = 3 (Bipartite Matching)
        nodes = 8;
        res = new int[nodes][nodes];
        pmf = new int[nodes];
        res[0][1] = 1;
        res[0][2] = 1;
        res[0][3] = 1;
        res[1][4] = 1;
        res[1][5] = 1;
        res[1][6] = 1;
        res[2][4] = 1;
        res[2][5] = 1;
        res[3][6] = 1;
        res[4][7] = 1;
        res[5][7] = 1;
        res[6][7] = 1;
        LinkedList<Edge>[] AdjList = new LinkedList[nodes];
        for (int i = 0; i < AdjList.length; i++) {
            AdjList[i] = new LinkedList<>();
        }
        AdjList[0].add(new Edge(0, 1, 1));
        AdjList[0].add(new Edge(0, 2, 1));
        AdjList[0].add(new Edge(0, 3, 1));
        AdjList[1].add(new Edge(1, 4, 1));
        AdjList[1].add(new Edge(1, 5, 1));
        AdjList[1].add(new Edge(1, 6, 1));
        AdjList[2].add(new Edge(2, 4, 1));
        AdjList[2].add(new Edge(2, 5, 1));
        AdjList[3].add(new Edge(3, 6, 1));
        AdjList[4].add(new Edge(4, 7, 1));
        AdjList[5].add(new Edge(5, 7, 1));
        AdjList[6].add(new Edge(6, 7, 1));
        s = 0;
        t = 7;
        maxFlow(AdjList);
        System.out.println("The max flow is " + mf);
    }

    /**
     * ***************************************************
     *
     * 13. Number Theory
     *
     *****************************************************
     */
    /**
     * Eratosthenes's sieve
     *
     * @params n max prime number
     * @return list prime numbers 2 3 5 7 11 13 17 19 23 29 Problems
     */
    static BitSet Criba;

    static int[] sieve(int n) {
        Criba = new BitSet(n);
        int r = (int) Math.sqrt(n);
        int Primes[] = new int[n], l = 1;
        Primes[0] = 2;

        for (int i = 3; i <= r; i += 2) {
            if (!Criba.get(i)) {
                for (int j = i * i; j < n; j += i) {
                    Criba.set(j, true);
                }
            }
        }
        for (int i = 3; i < n; i += 2) {
            if (!Criba.get(i)) {
                Primes[l++] = i;
            }
        }
        return Primes;
    }

    /**
     * Greatest Common Divisor (GCD)
     *
     * @params a number one
     * @params b number two
     * @return gcd(a, b) Problems
     */
    static long gcd(long a, long b) {
        return (b == 0 ? a : gcd(b, a % b));
    }

    /**
     * GCD Faster- Greatest Common Divisor Bitwise
     *
     * @params a number one
     * @params b number two
     * @return gcd(a, b) Problems
     */
    int GCD(int a, int b) {
        while (b > 0) {
            a = a % b;
            a ^= b;
            b ^= a;
            a ^= b;
        }
        return a;
    }

    /**
     * Least Common Multiple (LCM)
     *
     * @params a number one
     * @params b number two
     * @return gcd(a, b) Problems
     */
    static long lcm(long a, long b) {
        return (a * (b / gcd(a, b)));
    } // divide before multiply!

    /**
     * Factorial Frequencies - How many digits in N factorials
     *
     * @params n factorial
     * @return sum number of digits
     */
    double factorialFrequencies(long n) {
        double sum;
        long i;
        if (n == 0) {
            return 1;
        } else {
            sum = 0;
            for (i = 1; i <= n; i++) {
                sum += Math.log10(i);
            }
            return Math.floor(sum) + 1;
        }
    }

    /**
     * Prime Factors For n=100 = 2^2 * 5^2 the solution is [2, 5]
     *
     * @params n factorial
     * @return sum number of digits
     */
    static LinkedList<Integer> primeFactors(int N) {
        LinkedList<Integer> factors = new LinkedList<>();
        BitSet marcas = new BitSet(N);
        marcas.flip(0, N); // set all numbers to 1
        int[] primes = sieve(N); // vi "primes" (generated by sieve) is optional
        int PF_idx = 0, PF = primes[PF_idx]; // using PF = 2, 3, 4, ..., is also ok.
        while (N != 1 && (PF * PF <= N)) { // stop at sqrt(N), but N can get smaller
            while (N % PF == 0) {
                N /= PF;
                if (marcas.get(PF)) {
                    factors.add(PF);
                }
                marcas.set(PF, false);
            } // remove this PF
            PF = primes[++PF_idx]; // only consider primes!
        }
        if (N != 1) {
            factors.add(N); // special case if N is actually a prime
        }
        return factors;
    }

    /**
     * Prime Factors - Pollard Rho For n=100 = 2^2 * 5^2 the solution is [2, 5]
     *
     * @params n factorial
     * @return sum number of digits
     */
    long factores[];
    int nfactor;

    long pollardRho(long c, long num) {
        factores = new long[70];
        long x = (long) (Math.random() % num);
        long i = 1, k = 2, y = x, comDiv;
        do {
            i++;
            if ((x = x * x % num - c) < 0) {
                x += num;
            }
            if (x == y) {
                break;
            }
            comDiv = gcd((y - x + num) % num, num);
            if (comDiv > 1 && comDiv < num) {
                return comDiv;
            }
            if (i == k) {
                y = x;
                k <<= 1;
            }
        } while (true);
        return num;
    }

    void fFindFactor(long num) {
        if (Criba.get((int) num)) {
            factores[nfactor++] = num;
            return;
        }
        long factor = num + 1;
        while (factor >= num) {
            factor = pollardRho((long) (Math.random() % (num - 1) + 1), num);
        }
        fFindFactor(factor);
        fFindFactor(num / factor);
    }

    /**
     * Euler Phi
     *
     * @params n
     * @return sum
     */
    static int eulerPhi(int N) {
        LinkedList<Integer> factors = primeFactors(N);
        int result = N;
        for (Iterator<Integer> it = factors.iterator(); it.hasNext();) {
            result = result - result / it.next();
        }
        return result;
    }

    /**
     * Extended Euclid
     *
     * Suppose a housewife buys apples and oranges with cost of 8.39 SGD. An
     * apple is 25 cents. An orange is 18 cents. How many of each fruit does she
     * buy? 25x + 18y = 839.
     *
     * @params a
     * @params b
     * @return x,y
     */
    static int d, x, y;

    static void extendedEuclid(int a, int b) {
        int x1 = y;
        if (b > a) {
            x1 = a;//if b>a so I used this if condition
            a = b;// result is ok but x and y swaped
            b = x1;
        }
        if (b == 0) {
            x = 1;
            y = 0;
            d = a;
            return;
        } // base case
        extendedEuclid(b, a % b); // similar as the original gcd
        int y1 = x - (a / b) * y;
        x = x1;
        y = y1;
    }

    /**
     * ***************************************************
     *
     * 14. Mathematics
     *
     *****************************************************
     */
    /**
     * Catalan Numbers
     *
     * @params n integer
     * @return number integer 1 1 2 5 14 42 132 429 1430 4862 16796 Problems
     */
    static long catalanNumber(int n) {
        long C[] = new long[n + 1];
        C[0] = 1;
        for (int m = 1; m <= n; m++) {
            C[m] = ((2 * m * (2 * m - 1) * C[m - 1]) / ((m + 1) * m));
        }
        return C[n];
    }

    public static void main(String[] args) {
runSuffixArrays();
        LCP();
    }

}


/*
 Bibliography

 1. General
 -   Competitive Programming 3


 */
