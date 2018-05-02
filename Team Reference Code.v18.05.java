/*
 ===================             Realease 18.05                  =======================                   
 This is the Team Reference Code. This material is just for Code.. 
 If you are looking for some formulas or theorems, please download the Team Reference Notes from GitHub at 
 https://github.com/lmperezCuba/TeamReferenceAlgorithms/tree/18.05.
 ===================        + 4,500  lines of code        ========================                                                                                
 
 Contact                                                                                                                                                                                                                               
 Ing. Luis Manuel Pérez Batista                                                                                                                                                                                   
 luismanuelp1992@gmail.com                                                                                                                                                                                     
 (+53) 53855092   (Cuba)                                                                                                                                                                                                  
 https://www.linkedin.com/in/luis-perez-batista-426326152/                                                                                                                       
   
 Profiles
 - COJ username - (lmperez)                                                                                                                                                                                                         
 - Codefight username - (lmperez)                                                                                                                                                                                             
 
 ======================= >>>>>        Tips      <<<<< =========================                                                                               
 1.  Use Ctrl + F  to find algorithms
 2.  See the  bibliography at the bottom of this file
 3. The NEW algorithms are identified by three asterics (***)         <<--- readme
 4. The main idea is that you import this class as a library and use it in your projects.
 5. Coming soon
 - Gallery Art (Computational Geometry)
 - Z-Algorithm (String)
 - Aho Corasik (String)
 - Kosaraju (Graph Theory)
 
 ======================================================================
 Index (92 Algorithms)

 - Code Tips
 =====================================================================
 1.  SORTING (11)
 -  Selection Sort O(n^2)
 -  Insertion Sort O(n^2)
 -  Bubble Sort    O(n^2)
 -  Merge Sort     O(n*logn)
 -  Heap Sort      O(n*logn)
 -  Quick Sort     O(n*logn)
 -  Sell Sort      O(n)
 -  Radix Sort (Numbers)  O(n)
 -  Radix Sort (Letters)   O(n)
 -  Bin Sort O(n)   
 -  Bucket Sort O(n)    

 =====================================================================
 2. Greedy (1)
 -  Siamese - Magic Square Construction (Odd Size)  ***

 =====================================================================
 3. Dynamic Programming (12)
 -  Fibonacci
 -  Big Fibonacci Mod m
 -  Pascal Triangle
 -  Greatest Common Subsecuence
 -  InterestBank
 -  Travel Most Cheap for River
 -  Edit Distance
 -  Coin Change
 -  KnapSack 0 - 1
 -  KnapSack Multiples Objects
 -  Longest Increasing Subsequence (LIS)
 -  Multiplication Chain Matrix

 ====================================================================
 4. Data Structure (5)
 -  Union-Find Disjoin-Set
 - Segment Tree
 - RMQ
 - ABI 1D
 - ABI 2D

 ====================================================================
 5. String Processing (9)
 - Knuth - Morris - Pratt (KMP)
 - JaroWinkler (Edit Distance )
 - Longest Common Subsequence (LCS)
 - Longest Palindrome
 - Suffix Trie
 - Suffix Array
 - Longest Common Prefix (LCP)  O(n)
 - Longest Common SubString (LCSS) O(n*m)
 - Longest Common SubString (LCS) O(n*logn)

 ===================================================================
 6. Backtracking (2)
 - 8 Queens
 - 8 Queens Revisited  (faster) 

 ===================================================================
 7. Divide & Conquer (4)
 -  Binary Search
 -  Ternary Search
 -  Tennis Tournament
 -  Chess Horse Jump

 ===================================================================
 8. Graph Theory (12)
 - Finding Articulation Point And Bridge
 - Tarjan's SCC  (Directed Graph)
 - Kruskal MST
 - Minimum Spanning Forest
 - Dijkstra
 - Floyd Warshall
 - Transitive Closure ( Warshall Algorithm )
 - Minimax
 - Bellman Ford
 - Has Negative Cycle
 - Chinese Postman  ***
 - LCA (Lowest Common Ancestor) ***


 ==================================================================
 9. Network Flow (3)
 - Edmonds Karp's (Max Flow Problem)
 - Dinic (Max Flow) ***
 - Hopcroft Karp    ***

 ==================================================================
 10. Combinatory    (1)
 - Next Permutation ***

 ==================================================================
 11. Simulation
 - Josephus Problem ***

 ==================================================================
 12. Computational Geometry (16)
 - Rotate Point
 - Calculate Line
 - Parallel Lines
 - Same Lines
 - Intersect Lines
 - Points to Vector
 - Scale Vector
 - Translate Point from Vector
 - Distance Point To Line
 - Angle Between Points
 - Counter Clockwise (CCW) 
 - Center Of Two Intersected Circles    
 - Area of a Polygon    
 - Graham Sacan (Convex Hull)   
 - Great Circle Distance
 - Closest Pair 2D  ***

 =================================================================
 13. Number Theory (11)
 - Eratosthenes's sieve
 - Greatest Common Divisor (GCD)
 - GCD Faster- Greatest Common Divisor Bitwise
 - Least Common Multiple (LCM)
 - Factorial Frequencies
 - Prime Factors
 - Prime Factors - Pollard Rho
 - Euler Phi
 - Extended Euclid
 - Bit Count    
 - Fibonacci O(log(n))  ***
 - Fast Exponentiation  ***

 =================================================================
 14. Mathematics (2)
 - Catalan Numbers
 - Gaussian Elimination ***

 =================================================================
 15. Game Theory

 =================================================================
 16. Rare Problems (2)
 - 2-SAT ( Conjunctive Normal Form - 2-CNF Formula)     
 - Bitonic Traveling Salesman       

 =================================================================
 17. Bibliography

 */
package algorithms;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Random;
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
     * Selection Sort [2]
     *
     * @param A array to sort
     * @retun A array sorted by reference
     */
    static void Seleccion(int[] A) {
        int n = A.length, aux, pos;
        for (int i = 0; i < n - 1; i++) {
            pos = i;
            for (int j = i + 1; j < n; j++) {
                if (A[j] < A[pos]) {
                    pos = j;
                }
            }
            aux = A[i];
            A[i] = A[pos];
            A[pos] = aux;
        }
    }

    /**
     * Insertion Sort [2]
     *
     * @param A array to sort
     * @return A array by reference
     */
    public static void Insercion(int[] A) {
        int n = A.length, aux;
        for (int i = 1; i < n; i++) {
            int j = i;
            aux = A[j];
            for (; j > 0 && A[j - 1] > aux; j--) {
                A[j] = A[j - 1];
            }
            A[j] = aux;
        }
    }

    /**
     * Bubble Sort [2] Problems (COJ - 3181)
     *
     * @param A array to sort
     * @return A sorted by reference
     */
    static void BubbleSort(int[] A) {
        int n = A.length, aux;
        for (int i = n - 1; i > 0; i--) {
            int j = i;
            for (; j > 0; j--) {
                if (A[j] < A[j - 1]) {
                    aux = A[j];
                    A[j] = A[j - 1];
                    A[j - 1] = aux;
                }
            }
        }
    }

    /**
     * Merge Sort [2]
     *
     * @param A array to sort
     * @param B array empty
     * @param prim first index to sort, normally 0
     * @param ult last index to sort, normally A.length-1 return A array by
     * reference
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
     * Heap Sort [2]
     *
     * @param A array to sort
     * @return A array sorted by reference
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
     * Quick Sort [2]
     *
     * @param A array to sort
     * @return A array sorted by reference
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
     * Sell Sort [2]
     *
     * @param A array to sort
     * @param prim first index to sort, normally 0
     * @param ult last index to sort, normally A.length-1
     * @return A array sorted by reference
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
     * Radix Sort (Numbers) [2] Problems (COJ - 3182)
     *
     * @param A array to sort
     * @param l = 10
     * @return A array sorted by reference
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
     * Radix Sort [2] Problems (COJ - 2974)
     *
     * @param li list to sort
     * @param intdex to sort the words, index = 0.
     * @param longi length of the vocal
     * @return li sorted by reference
     */
    static int longi;

    static void RadixSort(LinkedList<String> li, int index) {
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
     * Bin Sort [2]
     * <p>
     * For each x belongs to array(A), 1 <= x <= A.lenght, x must be unique.
     * Example A = {4, 5, 1, 3, 2} </p> @param A array to sort
     *
     * @return A array sorted by reference
     */
    static void BinSort(int A[]) {
        int aux;
        for (int i = 0; i < A.length; i++) {
            while (A[i] != i + 1) {
                aux = A[A[i] - 1];
                A[A[i] - 1] = A[i];
                A[i] = aux;
            }
        }
    }

    /**
     * Bucket Sort [2]
     * <p>
     * For each x belongs to array(A), 1 <= x <= K + 1 </p> @
     *
     *
     * param li list to
     *
     * @return li sorted by reference
     */
    static void BucketSort(LinkedList<Integer> lista) {//The second list is not a part of the method ,is only used for print in the main
        LinkedList<LinkedList<Integer>> listaCasilleros = new LinkedList<>();    //We need to create N buckets with max N values
        int N = lista.size(), K = 1;   // Amount of elements and max element + 1
        for (int i = 0; i < N; i++) {
            if (lista.get(i) + 1 > K) {
                K = lista.get(i) + 1;
            }
            listaCasilleros.add(new LinkedList<Integer>());
        }
        for (int i = 0; i < N; i++) {
            int casilla = lista.get(i) * N / K;
            listaCasilleros.get(casilla).add(lista.get(i));//Step 1. Insert the values in the buckets
            //   bucket.add(casilla);//This is not a part of this method
        }
        //  Step 2. Insertion Sort
        for (int i = 0; i < N; i++) {
            int size = listaCasilleros.get(i).size() - 1;
            while (size > 0 && listaCasilleros.get(i).get(size) < listaCasilleros.get(i).get(size - 1)) {
                int aux = listaCasilleros.get(i).get(size);
                listaCasilleros.get(i).set(size, listaCasilleros.get(i).get(size - 1));
                listaCasilleros.get(i).set(size - 1, aux);
            }
        }
        //Step 3. Re-insert
        lista.clear();  //Clear the list
        for (int i = 0; i < N; i++) {
            while (!listaCasilleros.get(i).isEmpty()) {
                lista.add(listaCasilleros.get(i).remove());
            }
        }
    }

    /**
     * *********************************************************
     *
     * 2. Greedy
     *
     **********************************************************
     */
    /**
     * Siamese - Magic Square Construction (Odd Size)
     * <p>
     * [1] page.361 n must be odd UVa 01266 - Magic Square
     * </pre>
     *
     * @param n size of the matrix NxN
     * @return the magic matrix
     *
     */
    static int[][] siamese(int n) {
        int matrix[][] = new int[n][n];
        int i = 0, j = n / 2, step = 0;
        while (step < n * n) {
            matrix[i][j] = ++step;
            i = (i + n - 1) % n;
            j = (j + 1) % n;
            if (matrix[i][j] != 0) {
                i = (i + 2) % n;
                j = (j - 1 + n) % n;
            }
        }
        // print the solution
        for (int k = 0; k < n; k++) {
            for (int o = 0; o < n; o++) {
                System.out.printf("%5s", matrix[k][o] + " ");
            }
            System.out.println("");
        }
        return matrix;
    }

    /**
     * *********************************************************
     *
     * 3. Dynamic Programming
     *
     **********************************************************
     */
    /**
     * Fibonacci [1] Find the n-th Fibonacci number in the range [2 - 1498].
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
     * Big Fibonacci Mod m [1] Find the n-th Fibonacci number in the range [1 -
     * MAX_LONG].
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
     * Pascal Triangle [1] Find the (N,K) combinations.
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
     * Greatest Common Subsecuence [1] Find the greatest common subsecuence
     * between two words.
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
     * Interests Bank [1] Given a n Bank and M pesos we can to know how many
     * pesos we need to put in each bank in order to obtain the maxim benefit.
     * f(xi) is the interest function of the bank i and x0 + x1 + .. + xn = M
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
     * Travel Most Cheap for River [1] Less cost for travel on the river since a
     * point A until a point B.
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
     * Edit Distance [1] Less cost for travel on the river since a point A until
     * a point B.
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
     * Coin Change [1]
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
     * KnapSack 0 - 1 [1]
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
     * KnapSack Multiples objects [1]
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
     * Longest Increasing Subsequence (LIS) [1]
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
     * Multiplication Chain Matrixr
     * <pre>
     * [1] page.362
     * </pre>
     *
     * @param p array of values
     * @param n count of elements
     */
    private static int num;

    public static void matrixChangeMatrix(int p[], int n) {
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
     * *********************************************************
     *
     * 4. Data Structure
     *
     **********************************************************
     */
    /**
     * Union-Find Disjoin-Set [1] Problems COJ 1094
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
     * Segment Tree [1] Problems COJ 1651, 2395
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
     * RMQ [1] Problems COJ 1651, 2395
     *
     * @param A array of integers
     * @return the min/max/sum of a range
     */
    static int MAXN = 10005;
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
     * ABI 1D [1] Problems COJ
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
     * ABI 1D [1] Problems COJ
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
     * Knuth - Morris - Pratt (KMP) [1]
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
     * JaroWinkler (Edit Distance ) [1] A similarity algorithm indicating the
     * percentage of matched characters between two character sequences.
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
     * Longest Common Subsequence (LCS) [1]
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
     * Longest Palindrome [1]
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
     * Suffix Trie [1]
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
     * Suffix Array [1]
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
     * Longest Common Prefix (LCP) O(n) [1] use suffix array first
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
            while (i + L < n && Phi[i] + L < n && T_SA.charAt(i + L) == T_SA.charAt(Phi[i] + L)) {
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
     * Longest Common SubString (LCS) O(n*m) max 10^4 This code is contributed
     * by Sumit Ghosh
     *
     * @param word1
     * @param word2
     * @return long integer: Returns length of longest common substring of
     * X[0..m-1] and Y[0..n-1]
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

    static int longestCommonSubstring(String word1, String word2) {
        int m = word1.length();
        int n = word2.length();
        return LCSubStr(word1.toCharArray(), word2.toCharArray(), m, n);
    }

    /**
     * Longest Common SubString (LCS) O(n) max 10^8, you need to concatenate the
     * both strings GATAGACA$ and CATA# [1]
     *
     * @param word1
     * @param word2
     * @return long integer: Returns length of longest common substring
     */
    static String longestCommonSubstringOptimized(String word1, String word2) {
        T_SA = word1 + "$" + word2 + "#";
        n = T_SA.length();
        suffixArray();
        LCP();
        int pos = 0, max = -1, i;
        for (i = 1; i < n; i++) // compute LCP in O(n)
        {
            LCP[i] = PLCP[SA[i]]; // put the permuted LCP to the correct position
            //  check if the 1st part belongs to the 1st word and the 2nd part belongs to the 2nd word
            if (LCP[i] > max && i > 0 && ((SA[i - 1] <= word1.length() && SA[i] > word1.length()) || (SA[i] <= word1.length() && SA[i - 1] > word1.length()))) {
                max = LCP[i];
                pos = i;
            }
        }
        return T_SA.substring(SA[pos], SA[pos] + max);
    }

    /**
     * *********************************************************
     *
     * 6. Backtracking
     *
     **********************************************************
     */
    /**
     * 8 Queens [1] The classical algorithm (slow).
     * <br/>Problems COJ
     * <pre>
     * n=1 solution_count=1
     * n=2 solution_count=0
     * n=3 solution_count=0
     * n=4 solution_count=2
     * n=5 solution_count=10
     * n=6 solution_count=4
     * n=7 solution_count=40
     * n=8 solution_count=92
     * n=9 solution_count=352
     * n=10 solution_count=724
     * n=11 solution_count=2680
     * n=12 solution_count=14200
     * n=13 solution_count=73712
     * n=14 solution_count=365596
     * </pre>
     *
     * @param n_EQueens number of the board
     * @return the number of possible solutions
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

    /**
     * 8 Queens Revisited (faster) [1] A better algorithm.
     * <pre>
     * With the classical algorithm for n = 14 we need  87,178,291,200 and for this technique just  645,120.
     * With the classical algorithm for n = 16 we need  20,922,789,888,000 and for this technique just  10,321,920.
     * This is amazing.
     * </pre>
     * <br/>Problems COJ
     * <pre>
     * n=14 solution_count=365596
     * n=15 solution_count=2279184
     * n=16 solution_count=14772512
     * n=17 solution_count=95815104
     * </pre>
     *
     * @param n_EQueens number of the board
     * @return the number of possible solutions
     */
    static int ans, OK;

    static int nQueensRevisited(int n) {
        ans = 0;
        OK = (1 << n) - 1;
        backtrackNQueens(0, 0, 0);
        return ans;
    }

    static void backtrackNQueens(int rw, int ld, int rd) {
        if (rw == OK) {
            ans++;
            return;
        } // if all bits in ‘rw’ are on
        int pos = OK & (~(rw | ld | rd)); // the ‘1’s in ‘pos’ are available
        while (pos > 0) { // this loop is faster than O(n)
            int p = pos & -pos; // Least Significant One---this is fast
            pos -= p; // turn off that on bit
            backtrackNQueens(rw | p, (ld | p) << 1, (rd | p) >> 1); // clever
        }
    }

//    int AA[] = {10, 50, 100};
//    int BB[] = {1, 2, 2};
//    int limit;
//
//    void R(int current) {
//        if (current > limit) {
//            return;
//        }
//        for (int i = 0; i < current; i++) {
//
//        }
//    }
    /**
     * *********************************************************
     *
     * 7. Divide & Conquer
     *
     **********************************************************
     */
    /**
     * Binary Search [1]
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
     * Ternary Search [1]
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
     * Tennis Tournament [1] Fill the matrix of player's challenge. Example: for
     * two players the matrix is: 1 against 2 2 against 1 and for four players
     * is: 1| 2 3 4 2| 1 4 3 3| 4 1 2 4| 3 2 1
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
     * Chess Horse Jump [1] Check that the horse can jump around all the cells.
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
        int next, flow;         // for Dinic Max Flow Problem

        public Edge(int x, int y, int weight) {
            this.x = x;
            this.y = y;
            this.weight = weight;
        }

        public Edge(int x, int y, int weight, int next, int flow) {
            this.x = x;
            this.y = y;
            this.weight = weight;
            this.next = next;
            this.flow = flow;
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
     * Finding Articulation Point And Bridge [1] Problems COJ
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
     * Tarjan's SCC (Directed Graph)
     * <pre>
     * [1] Problems COJ
     * </pre>
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
     * Kruskal MST [1] Problems COJ
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
     * Minimum Spanning Forest [1]
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
     * <pre>
     *  [1] page.146
     * </pre>
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
     * <pre>
     *  [1] page.156
     * </pre>
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
     * <pre>
     *  [1] page.159
     * </pre>
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
     * <pre>
     *  [1] page.159
     * </pre>
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
     * Bellman Ford (slower) [1]
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
     * Has Negative Cycle
     * <pre>
     * Use Bellman Ford [1] page.152
     * </pre>
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
     * Chinese Postman
     * <pre>
     * [1] page.342
     * </pre>
     *
     * @params grafo
     * @params nodes [global]
     * @return distance of the Eulerian tour
     *
     * Problems COJ
     */
    static double chinesePostman(LinkedList<Edge> grafo) {
        //  Init
        best = new int[1 << 14];
        floyd = new int[25][25];
        lodd = new int[20];
        deg = new int[25];

        int e = grafo.size();
        Arrays.fill(best, -1);
        for (int i = 0; i < 25; i++) {
            Arrays.fill(floyd[i], 63);
        }
        best[0] = 0;
        int res = 0;
        for (int i = 0; i < e; i++) {
            int a = grafo.get(i).x - 1, b = grafo.get(i).y - 1, c = grafo.get(i).weight;
            res += c;
            deg[a]++;
            deg[b]++;
            floyd[a][b] = Math.min(floyd[a][b], c);
            floyd[b][a] = Math.min(floyd[b][a], c);
        }
        for (int k = 0; k < nodes; k++) {
            for (int i = 0; i < nodes; i++) {
                for (int j = 0; j < nodes; j++) {
                    floyd[i][j] = Math.min(floyd[i][j], (floyd[i][k] + floyd[k][j]));
                }
            }
        }
        int n2 = 0;
        for (int i = 0; i < nodes; i++) {
            if (deg[i] % 2 != 0) {
                lodd[n2++] = i;
            }
        }
        ngen = n2;
        return res + solve((1 << n2) - 1);
    }

    static int best[], floyd[][], lodd[], deg[], ngen;

    static int solve(int x) {
        if (best[x] == -1) {
            best[x] = INF;
            for (int i = 0; i < ngen; i++) {
                for (int j = i + 1; j < ngen; j++) {
                    if ((x >> i) % 2 != 0 && (x >> j) % 2 != 0) {
                        best[x] = Math.min(best[x], (floyd[lodd[i]][lodd[j]] + solve(x - (1 << i) - (1 << j))));
                    }
                }
            }
        }
        return best[x];
    }

    static void runChinesePostman() {
        nodes = 6;
        LinkedList<Edge> grafo = new LinkedList<>();
        grafo.add(new Edge(1, 2, 3));
        grafo.add(new Edge(1, 4, 1));
        grafo.add(new Edge(2, 4, 2));
        grafo.add(new Edge(2, 3, 5));
        grafo.add(new Edge(3, 6, 6));
        grafo.add(new Edge(3, 5, 3));
        grafo.add(new Edge(4, 5, 1));
        grafo.add(new Edge(5, 6, 8));
        System.out.println(chinesePostman(grafo));  // 34
    }

    /**
     * LCA (Lowest Common Ancestor)
     * <pre>
     * [1] page.359
     *  T[i] - Parent of i
     * Problems COJ
     * </pre>
     *
     * @param p first node
     * @param p second node
     *
     */
    static int LCA(int p, int q) {
        int log = 1;
        if (L_LCA[p] < L_LCA[q]) {
            int aux = L_LCA[p];
            L_LCA[p] = L_LCA[q];
            L_LCA[q] = aux;
        }
        while (1 << log <= L_LCA[p]) {
            log++;
        }
        log--;
        for (int i = log; i >= 0; i--) {
            if (L_LCA[p] - 1 << i >= L_LCA[q]) {
                p = P_LCA[p][i];
            }
        }
        if (p == q) {
            return p;
        }
        for (int i = log; i >= 0; i--) {
            if (P_LCA[p][i] != -1 && P_LCA[p][i] != P_LCA[q][i]) {
                p = P_LCA[p][i];
                q = P_LCA[q][i];
            }
        }

        return T_LCA[p];
    }

    static int N_LCA, T_LCA[], P_LCA[][], L_LCA[];

    static void PreprocesarLCA() {
        for (int i = 0; i < N_LCA; i++) {
            for (int j = 0; 1 << j < N_LCA; j++) {
                P_LCA[i][j] = -1;
            }
        }
        for (int i = 0; i < N_LCA; i++) {
            P_LCA[i][0] = T_LCA[i];
        }
        for (int j = 1; 1 << j < N_LCA; j++) {
            for (int i = 0; i < N_LCA; i++) {
                if (P_LCA[i][j - 1] != -1) {
                    P_LCA[i][j] = P_LCA[P_LCA[i][j - 1]][j - 1];
                }
            }
        }
    }

    static void runLCA() {
        MAXN = 100;
        N_LCA = 10;
        T_LCA = new int[MAXN];
        P_LCA = new int[MAXN][20];
        L_LCA = new int[MAXN];
        T_LCA[4] = 3;
        T_LCA[5] = 3;
        T_LCA[3] = 1;
        T_LCA[2] = 1;
        T_LCA[6] = 1;
        T_LCA[1] = 0;
        T_LCA[8] = 7;
        T_LCA[9] = 7;
        T_LCA[7] = 0;
        PreprocesarLCA();
        System.out.println(LCA(4, 6));  // 1
        System.out.println(LCA(8, 4));  // 0
        System.out.println(LCA(0, 2));  // 0
        System.out.println(LCA(8, 9));  //  7
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
     * <pre>
     *  [1] page.164 O(VE^2)
     * </pre>
     *
     * @param AdjList adjacent list
     * @param nodes [global]
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

    static void RunMaxFlow() {  // Test this example Edmons Karp
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
        nodes = 4;
        res = new int[nodes][nodes];
        pmf = new int[nodes];
        res[0][2] = 70;
        res[2][1] = 25;
        res[0][3] = 30;
        res[3][1] = 70;
        res[2][3] = 5;
        LinkedList<Edge>[] AdjList = new LinkedList[nodes];
        for (int i = 0; i < AdjList.length; i++) {
            AdjList[i] = new LinkedList<>();
        }
        AdjList[0].add(new Edge(0, 2, 70));
        AdjList[2].add(new Edge(2, 1, 25));
        AdjList[0].add(new Edge(0, 3, 30));
        AdjList[3].add(new Edge(3, 1, 70));
        AdjList[2].add(new Edge(2, 3, 5));
        s = 0;
        t = 1;
        maxFlow(AdjList);
        // Example 3 sol = 3 (Bipartite Matching)
    }

    /**
     * Dinic (Max Flow) O(V^2 * E)
     * <pre>
     * [1] page.344
     * </pre>
     *
     * @return maxflow integer
     *
     * Problems COJ 3112
     */
    static int Dinic() {
        int maxFlow = 0, flow;
        while (dinic_bfs()) {
            while ((flow = dinic_dfs(src, INF)) > 0) {
                maxFlow += flow;
            }
        }
        return maxFlow;
    }

    static int[] head, d;
    static int E, src, dest, MAXM;
    static Edge[] edges;

    static void Init(int s, int t) {
        E = 0;
        src = s;
        dest = t;
        MAXN = 210;
        MAXM = 3100;
        head = new int[MAXN];
        d = new int[MAXN];
        edges = new Edge[MAXM];
        for (int i = 0; i < MAXM; i++) {
            edges[i] = new Edge(0, 0, 0, 0, 0);
        }
        Arrays.fill(head, -1);
    }

    static void add_edge(int u, int v, int w) {
        edges[E].x = edges[E + 1].y = u;
        edges[E].y = edges[E + 1].x = v;
        edges[E].flow = edges[E + 1].flow = w;
        edges[E].next = head[u];
        head[u] = E++;
        edges[E].next = head[v];
        head[v] = E++;
    }

    static boolean dinic_bfs() {
        int i, j;
        Arrays.fill(d, -1);
        int que[] = new int[MAXN], rear = 1;
        que[0] = src;
        d[src] = 0;
        for (i = 0; i < rear; i++) {
            for (j = head[que[i]]; j != -1; j = edges[j].next) {
                if (d[ edges[j].y] == -1 && edges[j].flow > 0) {
                    d[edges[j].y] = d[que[i]] + 1;
                    que[rear++] = edges[j].y;
                }
            }
        }
        return d[dest] >= 0;
    }

    static int dinic_dfs(int t, int cp) {
        int i, f;
        if (t == dest) {
            return cp;
        }
        for (i = head[t]; i != -1; i = edges[i].next) {
            if (edges[i].flow > 0 && d[ edges[i].y] == d[t] + 1 && (f = dinic_dfs(edges[i].y, Math.min(cp, edges[i].flow))) > 0) {
                edges[i].flow -= f;
                edges[i ^ 1].flow += f;
                return f;
            }
        }
        return 0;
    }

    static void runDinic() {    //  Test this example
        nodes = 5;
        Init(0, 4);
        add_edge(0, 1, 100);
        add_edge(0, 2, 50);
        add_edge(1, 2, 50);
        add_edge(1, 3, 50);
        add_edge(1, 4, 50);
        add_edge(2, 3, 100);
        add_edge(3, 4, 75);
        System.out.println("The max flow is " + Dinic());       //      The max flow is 125
    }

    /**
     * Hopcroft Karp (Unweighted Maximum Cardinality Bipartite Matching)
     * <pre>
     * O(V^2 E)
     * [1] page.353
     * </pre>
     *
     * @return maxflow integer
     */
    static int hopcroftKarp() {
        //init
        MAXV1 = 2 * MAXV_HK;
        Mx = new int[MAXV_HK];
        My = new int[MAXV_HK];
        D_HK = new int[MAXV1];
        // end init
        int i, flowHK = 0;
        for (i = Math.max(N_HK, M_HK); i >= 0; i--) {
            Mx[i] = My[i] = -1;
        }
        while (BFS()) {
            for (i = 0; i < N_HK; i++) {
                if (Mx[i] == -1 && DFS(i) > 0) {
                    ++flowHK;
                }
            }
        }
        return flowHK;
    }

    static int MAXV_HK, N_HK, M_HK;
    static int MAXV1;
    static LinkedList<Integer> ady[];
    static int D_HK[], Mx[], My[];

    static boolean BFS() {
        int u, v, i, e;
        LinkedList<Integer> cola = new LinkedList<>();
        boolean f = false;
        for (i = 0; i < N_HK + M_HK; i++) {
            D_HK[i] = 0;
        }
        for (i = 0; i < N_HK; i++) {
            if (Mx[i] == -1) {
                cola.push(i);
            }
        }
        while (!cola.isEmpty()) {
            u = cola.peek();
            cola.pop();
            for (e = ady[u].size() - 1; e >= 0; e--) {
                v = ady[u].get(e);
                if (D_HK[v + N_HK] > 0) {
                    continue;
                }
                D_HK[v + N_HK] = D_HK[u] + 1;
                if (My[v] != -1) {
                    D_HK[My[v]] = D_HK[v + N_HK] + 1;
                    cola.push(My[v]);
                } else {
                    f = true;
                }
            }
        }
        return f;
    }

    static int DFS(int u) {
        for (int v, e = ady[u].size() - 1; e >= 0; e--) {
            v = ady[u].get(e);
            if (D_HK[v + N_HK] != D_HK[u] + 1) {
                continue;
            }
            D_HK[v + N_HK] = 0;
            if (My[v] == -1 || DFS(My[v]) > 0) {
                Mx[u] = v;
                My[v] = u;
                return 1;
            }
        }
        return 0;
    }

    static void runHK() {    //  Test this example
        N_HK = M_HK = 4;
        MAXV_HK = 1001;
        ady = new LinkedList[MAXV_HK];
        for (int i = 0; i < N_HK + M_HK; i++) {
            ady[i] = new LinkedList<>();
        }
        // The graph must a Bipartite Matching Graph
        ady[0].add(1);
        ady[0].add(2);
        ady[0].add(3);
        ady[1].add(4);
        ady[1].add(5);
        ady[1].add(6);
        ady[2].add(4);
        ady[2].add(5);
        ady[2].add(6);
        ady[3].add(6);
        ady[4].add(7);
        ady[5].add(7);
        ady[6].add(7);
        System.out.println("The max flow is " + hopcroftKarp());       //      The max flow is 125
    }

    /**
     * ***************************************************
     *
     * 10. Combination
     *
     *****************************************************
     */
    /**
     * Next Permutation
     * <pre>
     * </pre>
     *
     * @return all permutations
     */
    // simply prints all permutation - to see how it works
    static void printPermutations(Comparable[] c) {
        System.out.println(Arrays.toString(c));
        while ((c = nextPermutation(c)) != null) {
            System.out.println(Arrays.toString(c));
        }
    }

    // modifies c to next permutation or returns null if such permutation does not exist
    static Comparable[] nextPermutation(final Comparable[] c) {
        // 1. finds the largest k, that c[k] < c[k+1]
        int first = getFirst(c);
        if (first == -1) {
            return null; // no greater permutation
        }		// 2. find last index toSwap, that c[k] < c[toSwap]
        int toSwap = c.length - 1;
        while (c[ first].compareTo(c[ toSwap]) >= 0) {
            --toSwap;
        }
        // 3. swap elements with indexes first and last
        swap(c, first++, toSwap);
        // 4. reverse sequence from k+1 to n (inclusive) 
        toSwap = c.length - 1;
        while (first < toSwap) {
            swap(c, first++, toSwap--);
        }
        return c;
    }

    // finds the largest k, that c[k] < c[k+1]
    // if no such k exists (there is not greater permutation), return -1
    static int getFirst(final Comparable[] c) {
        for (int i = c.length - 2; i >= 0; --i) {
            if (c[ i].compareTo(c[ i + 1]) < 0) {
                return i;
            }
        }
        return -1;
    }

    // swaps two elements (with indexes i and j) in array 
    static void swap(final Comparable[] c, final int i, final int j) {
        final Comparable tmp = c[ i];
        c[ i] = c[ j];
        c[ j] = tmp;
    }

    static void runNextPer() {
        Comparable A[] = {'a', 'b', 'c', 'd'};
        printPermutations(A);
    }

    /**
     * ***************************************************
     *
     * 11. Simulation
     *
     *****************************************************
     */
    /**
     * Josephus Problem
     * <pre>
     * O(n)
     * [1] page.356
     * Formule f(n) = (f(n-1) + k) mod n
     * </pre>
     *
     * @return survivor position
     */
    static int josephusClassic(int n, int k) {
        if (n == 1) {
            return 0;
        }
        return (josephusClassic(n - 1, k) + k) % n;             //  Recursive algorithm vs lineal
    }

    /**
     * ***************************************************
     *
     * 12. Computational Geometry
     *
     *****************************************************
     */
    static class Point {

        double x, y;

        public Point() {
        }

        public Point(double x, double y) {
            this.x = x;
            this.y = y;
        }
    }

    /*We can compute the required line equation if we are given at least two points that pass
     through that line via the following function.[1]*/
    static class Line {

        double a, b, c;    // a*x + b*y + c

        public Line() {
        }

        public Line(double a, double b, double c) {
            this.a = a;
            this.b = b;
            this.c = c;
        }
    }

    static class Vector {

        double x, y;

        public Vector(double x, double y) {
            this.x = x;
            this.y = y;
        }

    }

    static Comparator<Point> compPointByX() {
        return new Comparator() {
            @Override
            public int compare(Object a, Object b) {
                if (((Point) (a)).x < ((Point) (b)).x) {
                    return -1;
                } else if (((Point) (a)).x > ((Point) (b)).x) {
                    return 1;
                } else {
                    return 0;
                }
            }
        };
    }

    static Comparator<Point> compPointByY() {
        return new Comparator() {
            @Override
            public int compare(Object a, Object b) {
                if (((Point) (a)).y < ((Point) (b)).y) {
                    return -1;
                } else if (((Point) (a)).y > ((Point) (b)).y) {
                    return 1;
                } else {
                    return 0;
                }
            }
        };
    }

    // For pi = 3.141592     floating(pi, 3)  = 3.142,  floating(pi, 2) = 3.14 ,  floating(pi, 1) = 3.1
    static double floating(double num, int places) {
        return Double.parseDouble(String.format("%." + places + "f", num));
    }

    /**
     * Rotate Point
     * <pre>
     *  [1] page.272
     * </pre>
     *
     * @param p Point(x, y)
     * @param theta angle to rotate respect the origin (0, 0)
     * @return q the point rotated For p(10, 3) and 180 degrees = q(-3, -10),
     * but for 90 degrees = q(-3, 10)
     */
    static Point rotatePoint(Point p, double theta) {
        double rad = theta * Math.PI / 180.0;
        return new Point(floating(p.x * Math.cos(rad) - p.y * Math.sin(rad), 0), floating(p.x * Math.sin(rad) + p.y * Math.cos(rad), 0));
    }

    /**
     * Calculate Line
     * <pre>
     *  [1] page.273
     * </pre>
     *
     * @param p1 Point(x1, y1)
     * @param p2 Point(x2, y2)
     * @param l Line reference
     * @return l by reference Form a*x + b*y + c
     */
    static void pointsToLine(Point p1, Point p2, Line l) {
        if (Math.abs(p1.x - p2.x) < Double.MIN_VALUE) { // vertical line is fine
            l.a = 1.0;
            l.b = 0.0;
            l.c = -p1.x; // default values
        } else {
            l.a = -(double) (p1.y - p2.y) / (p1.x - p2.x);
            l.b = 1.0; // IMPORTANT: we fix the value of b to 1.0
            l.c = -(double) (l.a * p1.x) - p1.y;
        }
    }

    /**
     * Parallel Lines
     * <pre>
     *  [1] page.273
     * </pre>
     *
     * @param l1 Line 1 Form a*x + b*y + c
     * @param l2 Line 2 Form a*x + b*y + c
     * @return areParallel boolean
     */
    static boolean areParallel(Line l1, Line l2) { // check coefficients a & b
        return (Math.abs(l1.a - l2.a) < Double.MIN_VALUE) && (Math.abs(l1.b - l2.b) < Double.MIN_VALUE);
    }

    /**
     * Same Lines
     * <pre>
     *  [1] page.273
     * </pre>
     *
     * @param l1 Line 1
     * @param l2 Line 2
     * @return areParallel Form a*x + b*y + c
     */
    static boolean areSame(Line l1, Line l2) { // also check coefficient c
        return areParallel(l1, l2) && (Math.abs(l1.c - l2.c) < Double.MIN_VALUE);
    }

    /**
     * Intersect Lines
     * <pre>
     *  [1] page.273
     * </pre>
     *
     * @param l1 Line 1 Form a*x + b*y + c
     * @param l2 Line 2 Form a*x + b*y + c
     * @return p point of intersection, if it exist
     */
    static boolean areIntersect(Line l1, Line l2, Point p) {
        if (areParallel(l1, l2)) {
            return false; // no intersection
        }// solve system of 2 linear algebraic equations with 2 unknowns
        p.x = (l2.b * l1.c - l1.b * l2.c) / (l2.a * l1.b - l1.a * l2.b);
// special case: test for vertical line to avoid division by zero
        if (Math.abs(l1.b) > Double.MIN_VALUE) {
            p.y = -(l1.a * p.x + l1.c);
        } else {
            p.y = -(l2.a * p.x + l2.c);
        }
        return true;
    }

    /**
     * Points to Vector
     * <pre>
     *  [1] page.272
     * </pre>
     *
     * @param p1
     * @param p2
     * @return vector p1 -> p2
     */
    static Vector pointsToVector(Point p1, Point p2) {
        return new Vector(p2.x - p1.x, p2.y - p1.y);
    }

    /**
     * Scale Vector
     * <pre>
     *  [1] page.272
     * </pre>
     *
     * @param v vector
     * @param s scale
     * @return vector scaled
     */
    static Vector scaleVector(Vector v, double s) { // nonnegative s = [<1 .. 1 .. >1]
        return new Vector(v.x * s, v.y * s);
    } // shorter.same.longer

    /**
     * Translate Point from Vector
     * <pre>
     *  [1] page.272
     * </pre>
     *
     * @param p point to translate
     * @param v vector
     * @return pt point translated
     */
    static Point translatePointFromVector(Point p, Vector v) { // translate p according to v
        return new Point(p.x + v.x, p.y + v.y);
    }

    /**
     * Distance Point To Line
     * <pre>
     *   [1] page.275
     * </pre>
     *
     * @param p single point
     * @param a point of the line
     * @param b point of the line
     * @return c, the distance from p to the line defined by two points a and b
     * (a * and b must be different)
     */
// the closest point is stored in the 4th parameter c (byref)
    static double distToLine(Point p, Point a, Point b, Point c) {
// formula: c = a + u * ab
        Vector ap = pointsToVector(a, p), ab = pointsToVector(a, b);
        double u = dot(ap, ab) / norm_sq(ab);
        c = translatePointFromVector(a, scaleVector(ab, u)); // translate a to c
        return dist(p, c);
    } // Euclidean distance between p and c

    static double dist(Point p1, Point p2) { // Euclidean distance
// hypot(dx, dy) returns sqrt(dx * dx + dy * dy)
        return Math.hypot(p1.x - p2.x, p1.y - p2.y);
    }

    static double dot(Vector a, Vector b) {
        return (a.x * b.x + a.y * b.y);
    }

    static double norm_sq(Vector v) {
        return v.x * v.x + v.y * v.y;
    }

    /**
     * Angle Between Points
     * <pre>
     *   [1] page.275
     * </pre>
     *
     * @param a first point
     * @param o center point
     * @param b end point
     * @return angle
     */
    static double angle(Point a, Point o, Point b) { // returns angle aob in rad
        Vector oa = pointsToVector(o, a), ob = pointsToVector(o, b);
        double sol = Math.acos(dot(oa, ob) / Math.sqrt(norm_sq(oa) * norm_sq(ob)));     // radians
        return sol * 180.0 / Math.PI;   //  radians to degrees
    }

    /**
     * Counter Clockwise (CCW)
     * <pre>
     *   [1] page.275
     * </pre>
     *
     * @param p first point
     * @param q center point
     * @param r end point
     * @return angle
     */
    static boolean CCW(Point p, Point q, Point r) {
        int result = (int) ((r.x - q.x) * (p.y - q.y) - (r.y - q.y) * (p.x - q.x));
        if (result < 0) {
            return false; // P->Q->R is a right turn
        }
        if (result >= 0) {
            return true; // P->Q->R is a left turn ,  Note: sometimes, we change the ’> 0’ to ’>= 0’ to accept collinear points
        }
        return false; // P->Q->R is a straight line, i.e. P, Q, R are collinear
    }

    /**
     * Center Of Two Intersected Circles
     * <pre>
     *   [1] page.278
     * Given 2 points on the circle (p1 and p2) and radius r of the
     * corresponding circle, we can determine the location of the centers (c1
     * and c2) of the two possible circles
     * </pre>
     *
     * @param p1 first intersected point
     * @param p2 second intersected point
     * @param r radio of circles
     * @return c center 1
     */
    boolean centerIntersectedCircles(Point p1, Point p2, double r, Point c) {
        double d2 = (p1.x - p2.x) * (p1.x - p2.x)
                + (p1.y - p2.y) * (p1.y - p2.y);
        double det = r * r / d2 - 0.25;
        if (det < 0.0) {
            return false;
        }
        double h = Math.sqrt(det);
        c.x = (p1.x + p2.x) * 0.5 + (p1.y - p2.y) * h;
        c.y = (p1.y + p2.y) * 0.5 + (p2.x - p1.x) * h;
        return true;
    } // to get the other center, reverse p1 and p2

    /**
     * Area of a Polygon
     * <pre>
     * [1] page.285
     * The signed area A of (either convex or concave) polygon with n vertices
     * given in some order (either clockwise or counter-clockwise) can be found
     * by computing the determinant of the matrix as shown below.
     * </pre>
     *
     * @param P The Polygon P = [point1, point2, ...]
     * @return the area, which is half the determinant. 1/2 * [x0 * y1 + x1 * y2
     * + ... + xn-1 * y0 - x1 * y0 - x2 * y1 - ... - x0 * yn-1]
     */
    static double areaOfPolygon(Point[] P) {
        double result = 0.0, x1, y1, x2, y2;
        for (int i = 0; i < (int) P.length - 1; i++) {
            x1 = P[i].x;
            x2 = P[i + 1].x;
            y1 = P[i].y;
            y2 = P[i + 1].y;
            result += (x1 * y2 - x2 * y1);
        }
        return Math.abs(result) / 2.0;
    }

    /**
     * Graham Sacan (Convex Hull)
     * <pre>
     *  [1] page.289
     * The Convex Hull of a set of points P is the smallest convex polygon CH(P) for which each point in P is either on the
     * boundary of CH(P) or in its interior The signed area A of (either convex or concave) polygon with n vertices given in
     * some order (either clockwise or counter-clockwise) can be found by computing the determinant of the matrix as
     * shown below.
     * </pre>
     *
     * @param P The Polygon P = [point1, point2, ...]
     * @return ConvexHull Polygon = [pointx, pointy, ...]
     * @see Algorithms#comp_ang()
     */
    static void GrahamScan(Point[] Polygon) {
        ConvexHull = new LinkedList<>();
// first, find P0 = point with lowest Y and if tie: rightmost X
        int i, P0 = 0, N = Polygon.length;
        for (i = 1; i < N; i++) {
            if (Polygon[i].y < Polygon[P0].y || (Polygon[i].y == Polygon[P0].y && Polygon[i].x > Polygon[P0].x)) {
                P0 = i;
            }
        }
        Point temp = Polygon[0]; // swap selected vertex with Polygon[0]
        Polygon[0] = Polygon[P0];
        Polygon[P0] = temp;
// second, sort points by angle w.r.t. P0, skipping Polygon [0]
        pivot = Polygon[0]; // use this global variable as reference
        Arrays.sort(Polygon, comp_ang());

// third, the ccw tests
        Stack<Point> S = new Stack<>();
        Point prev, now;
        S.push(Polygon[N - 1]); // put two starting vertices into stack S
        S.push(Polygon[0]);
        i = 1; // and start checking the rest
        while (i < N) { // note: N must be >= 3 for this method to work
            now = S.peek();
            S.pop();
            prev = S.peek();
            S.push(now); // trick to get the 2nd item from top of S
            if (CCW(prev, now, Polygon[i])) { // if these 3 points make a left turn
                S.push(Polygon[i]); // accept
                i++;
            } else // otherwise
            {
                S.pop(); // pop this point until we have a left turn
            }
        }
        while (!S.empty()) { // from stack back to vector
            ConvexHull.add(S.peek());
            S.pop();
        }
        ConvexHull.removeLast(); // the last one is a duplicate of first one
//return ConvexHull; // return the result
    }

    static Point pivot;
    static LinkedList<Point> ConvexHull;

    static Comparator<Point> comp_ang() {
        return new Comparator() {
            @Override
            public int compare(Object a, Object b) {
                if (CCW(pivot, (Point) a, (Point) b)) {
                    return -1;
                } else {
                    return 1;
                }
            }
        };
    }

    static void runCovexHull() {
        Point[] Polygon = new Point[5];
        Polygon[0] = new Point(1, 1);
        Polygon[1] = new Point(1, 4);
        Polygon[2] = new Point(3, 3);
        Polygon[3] = new Point(4, 4);
        Polygon[4] = new Point(5, 1);
        GrahamScan(Polygon);
        for (int i = 0; i < ConvexHull.size(); i++) {
            Point p = ConvexHull.get(i);
            System.out.printf("Point %d (%.1f, %.1f)\n", i, p.x, p.y);
        }
    }

    /**
     * Great Circle Distance
     * <pre>
     * [1] page.352
     * Distance between two points of a sphere with radio r..
     * </pre>
     *
     * @param aLat Latitude of point a
     * @param aLong Longitude of point a
     * @param bLat Latitude of point b
     * @param bLong Longitude of point b
     * @return the distance between (a, b)
     */
    static double greatCircleDistance(double aLat, double aLong, double bLat, double bLong, double r) {
        double radian = Math.PI / 180.0;
        aLat *= radian;
        aLong *= radian;
        bLat *= radian;
        bLong *= radian;
        return r * Math.acos(Math.cos(aLat) * Math.cos(aLong) * Math.cos(bLat) * Math.cos(bLong)
                + Math.cos(aLat) * Math.sin(aLong) * Math.cos(bLat) * Math.sin(bLong) + Math.sin(aLat) * Math.sin(bLat));
    }

    /**
     * Closest Pair 2D
     * <br/>
     * [1] page.343 Given a set S of n points on a 2D plane, find two points
     * with the closest. Euclidean distance.
     *
     * @param nodes [global]
     * @return the distance between the closest pair of points
     */
    static double closestPair() {
        nodes = 5;
        Poly = new Point[nodes];
        Poly[0] = new Point(1, 4);
        Poly[1] = new Point(2, 1);
        Poly[2] = new Point(10, 2);
        Poly[3] = new Point(7, 2);
        Poly[4] = new Point(9, 6);
        Arrays.sort(Poly, compPointByX());
        return closest_pair(0, nodes - 1);
    }

    static double closest_pair(int ini, int fin) {
        if (ini == fin) {
            return 10001; //infinito
        }
        int mid = (ini + fin) / 2;
        double dl = closest_pair(ini, mid);
        double dr = closest_pair(mid + 1, fin);
        double mid_x = Poly[mid].x;
        double delta = Math.min(dl, dr);
        /* seleccionar los puntos que están como máximo a una distancia delta de la linea */
        LinkedList<Point> Ql = selectCandidatos(ini, mid, delta, mid_x);
        LinkedList<Point> Qr = selectCandidatos(mid + 1, fin, delta, mid_x);
        double dm = deltaM(Ql.toArray(new Point[0]), Qr.toArray(new Point[0]), delta);
        return Math.min(dm, delta);
    }

    static LinkedList<Point> selectCandidatos(int ini, int fin, double delta, double midx) {
        LinkedList<Point> Q = new LinkedList();
        for (int i = ini; i <= fin; i++) {
            if (Math.abs(Poly[i].x - midx) <= delta) {
                Q.addLast(Poly[i]);
            }
        }
        return Q;
    }

    static double deltaM(Point[] Ql, Point[] Qr, double delta) {
        Arrays.sort(Qr, compPointByY());
        double dm = delta;
        /* para cada elemento de Ql determinar los elemenos en Qr que estan en el rectangulo y comprobar la distancia*/
        int bottom = 0;
        for (int i = 0; i < Ql.length; i++) {
            bottom = 0;
            while (bottom < Qr.length && Qr[ bottom].y < Ql[i].y - delta) {
                bottom++;
            }
            while (bottom < Qr.length && Qr[bottom].y <= Ql[i].y + delta) {
                dm = Math.min(dm, dist(Qr[bottom], Ql[i]));
                bottom++;
            }
        }
        return dm;
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
     * <pre>
     * [1] page.210
     * </pre>
     *
     * @param n max prime number
     * @return list prime numbers 2 3 5 7 11 13 17 19 23 29
     */
    static BitSet Criba;

    static int[] sieve(int n) {
        Criba = new BitSet(n + 1);
        int r = (int) Math.sqrt(n + 1);
        int Primes[] = new int[n], l = 1;
        Primes[0] = 2;
        for (int i = 4; i <= n; i += 2) {
            Criba.set(i, true);
        }
        for (int i = 3; i <= r; i += 2) {
            if (!Criba.get(i)) {
                for (int j = i * i; j < n; j += i * 2) {
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
     * <pre>
     * [1] page.201
     * </pre>
     *
     * @param a number one
     * @param b number two
     * @return gcd(a, b) Problems
     */
    static long gcd(long a, long b) {
        return (b == 0 ? a : gcd(b, a % b));
    }

    /**
     * GCD Faster- Greatest Common Divisor Bitwise
     *
     * @param a number one
     * @param b number two
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
     * <pre>
     * [1] page.212
     * </pre>
     *
     * @param a number one
     * @param b number two
     * @return gcd(a, b) Problems
     */
    static long lcm(long a, long b) {
        return (a * (b / gcd(a, b)));
    } // divide before multiply!

    /**
     * Factorial Frequencies
     * <pre>
     * [1]
     *  How many digits in N factorials
     * </pre>
     *
     * @param n factorial
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
     * Prime Factors
     * <pre>
     * [1] page.212
     * For n=100 = 2^2 * 5^2 the solution is [2, 5] [1]
     * </pre>
     *
     * @param n factorial
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
     * Prime Factors - Pollard Rho
     * <pre>
     * For n=100 = 2^2 * 5^2 the solution is [2, 5]
     * </pre>
     *
     * @param num number to factorize
     * @param c random number initial, c < num, in many case c = 1 @return sum
     * numbe r of digits
     */
    static long factores[];
    static int nfactor;
    static Random ran;

    static long pollardRho(long c, long num) {
        long x = (long) (ran.nextInt((int) (num + 1)));
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

    static void fFindFactor(long num) {
        if (!Criba.get((int) num)) {
            factores[nfactor++] = num;
            return;
        }
        long factor = num + 1;
        while (factor >= num) {
            factor = pollardRho((long) (ran.nextInt((int) (num)) + 1), num);
        }
        fFindFactor(factor);
        fFindFactor(num / factor);
    }

    static void runPollarRho() {
        sieve(10000);
        factores = new long[70];
        ran = new Random();
        fFindFactor(750);
        Arrays.sort(factores, 0, nfactor);
        for (int i = 0; i < nfactor; i++) {
            System.out.print(factores[i] + " ");// 2 3 5 5 5
        }

    }

    /**
     * Euler Phi
     * <pre>
     *  [1] page.215
     * Count the number of positive integers < N that are relatively prime (coprime) to N.
     * </pre> @params n
     *
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
     * <pre>
     * [1] page.217
     * Suppose a housewife buys apples and oranges with cost of 8.39 SGD. An apple is 25 cents. An orange is 18 cents.
     * How many of each fruit does she buy? 25x + 18y = 839.
     * </pre>
     *
     * @param a
     * @param b
     * @return x,y
     */
    static int dd, x, y;

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
            dd = a;
            return;
        } // base case
        extendedEuclid(b, a % b); // similar as the original gcd
        int y1 = x - (a / b) * y;
        x = x1;
        y = y1;
    }

    /**
     * Bit Count
     * <pre>
     * Count the numbers active bits of a number quickly.
     * </pre>
     *
     * @param n
     * @return the number of active bits. For n = 10 returns
     */
    static int bitCount(long n) {
        int bits = 0;
        while (n > 0) {
            bits++;
            n -= (n & -n);
        }
        return bits;
    }

    /**
     * Fibonacci O(log(n))
     * <pre>
     * [1] page.364
     * Use matrix power
     * </pre>
     *
     * @param n
     * @return the number of active bits. For n = 10 returns
     */
    static int fibonacciFast(int n) {
        int i, h, j, k, t;
        i = h = 1;
        j = k = 0;
        while (n > 0) {
            if (n % 2 == 1) { // if n is odd
                t = j * h;
                j = i * h + j * k + t;
                i = i * k + t;
            }
            t = h * h;
            h = 2 * k * h + t;
            k = k * k + t;
            n = (int) n / 2;
        }
        return j;
    }

    /**
     * Fast Exponentiation
     * <pre>
     * [1] page.365
     * </pre>
     *
     * @param n
     * @return the number of active bits. For n = 10 returns
     */
    long fastExp(long base, long power) {
        if (power == 0) {
            return 1;
        } else if (power % 2 == 0) {
            return square(fastExp(base, power / 2));
        } else {
            return base * (fastExp(base, power - 1));
        }
    }

    long square(long n) {
        return n * n;
    }

    /**
     * ***************************************************
     *
     * 14. Mathematics
     *
     *****************************************************
     */
    /**
     * Catalan Numbers [1]
     *
     * @params n integer
     * @return number integer 1 1 2 5 14 42 132 429 1430 4862 16796
     */
    static long catalanNumber(int n) {
        long C[] = new long[n + 1];
        C[0] = 1;
        for (int m = 1; m <= n; m++) {
            C[m] = ((2 * m * (2 * m - 1) * C[m - 1]) / ((m + 1) * m));
        }
        return C[n];
    }

    /**
     * Gaussian Elimination
     * <pre>
     * [1] page.346
     * </pre>
     *
     * @params N the amount of variables
     * @params mat the augmenting matrix
     * @return the solutions for X,Y and Z
     */
    static double[] gaussianElimination(int N) { // O(N^3)
// input: N, Augmented Matrix Aug, output: Column vector X, the answer
        int i, j, k, l;
        double t;
        for (j = 0; j < N - 1; j++) { // the forward elimination phase
            l = j;
            for (i = j + 1; i < N; i++) // which row has largest column value
            {
                if (Math.abs(mat[i][j]) > Math.abs(mat[l][j])) {
                    l = i; // remember this row l
                }// swap this pivot row, reason: to minimize floating point error
            }
            for (k = j; k <= N; k++) {
// t is a temporary double variable
                t = mat[j][k];
                mat[j][k] = mat[l][k];
                mat[l][k] = t;
            }
            for (i = j + 1; i < N; i++) // the actual forward elimination phase
            {
                for (k = N; k >= j; k--) {
                    mat[i][k] -= mat[j][k] * mat[i][j] / mat[j][j];
                }
            }
        }
        for (j = N - 1; j >= 0; j--) { // the back substitution phase
            for (t = 0.0, k = j + 1; k < N; k++) {
                t += mat[j][k] * vec[k];
            }
            vec[j] = (mat[j][N] - t) / mat[j][j]; // the answer is here
        }
        return vec;
    }

    static double mat[][];
    static double vec[];

    static void runLinearEcuations() {
        MAX_N = 3;
        //  Init
        mat = new double[MAX_N][MAX_N + 1];
        vec = new double[MAX_N];
        char C[] = {'X', 'Y', 'Z'};
        // double AM[][] = new double[MAX_N][MAX_N];
        int values[] = {1, 1, 2, 9, 2, 4, -3, 1, 3, 6, -5, 0}, current = 0;
        for (int i = 0; i < MAX_N; i++) {
            for (int j = 0; j <= MAX_N; j++) {
                mat[i][j] = values[current++];
            }
        }
        double A[] = gaussianElimination(MAX_N);
        for (int i = 0; i < MAX_N; i++) {
            System.out.println(C[i] + " = " + (int) (A[i] + 0.5));             //  X = 1, Y = 2, Z = 3 
        }
    }

    /**
     * ***************************************************
     *
     * 16. Rare Problems
     *
     *****************************************************
     */
    /**
     * 2-SAT ( Conjunctive Normal Form - 2-CNF Formula)
     * <pre>
     * [1] page.336
     *  (x1 ||  x2) &&∧ (¬x1 ||∨ ¬x2) = true
     * (x1 ||∨ x2) ∧&& (¬x1 ||∨ x2) ∧&& (¬x2 ||∨ x3) &&∧ (¬x2 ||∨¬x3) = false
     * You need to apply the formula (a ||∨ b) ===≡ (¬a =>⇒ b) ===≡ (¬b =>⇒ a).
     * </pre>
     *
     * @param variables amount of variables Ej. x1, x2, x3
     * @param pairs matrix [variables][2] of relationships
     * @return true if the formula is satisfiable
     */
    static boolean sat(int variables, int pairs[][]) {
        // Begin Init SCC 
        nodes = variables * 2;   // x and ¬x
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
        // End SCC
        for (int i = 0; i < pairs[0].length; i++) {
            AdjList[(pairs[0][i] + variables) % nodes].add(pairs[1][i]);      //  Applying the formula (a ||∨ b) ===≡ (¬a =>⇒ b) .
            AdjList[(pairs[1][i] + variables) % nodes].add(pairs[0][i]);    //  Applying the formula (a ||∨ b) ===≡(¬b =>⇒ a).
        }
        dfsNumberCounter = numSCC = 0;
        for (int i = 0; i < nodes; i++) {
            if (dfs_num[i] == UNVISITED) {
                tarjanSCC(i);
            }
        }
        if (numSCC > 1) {
            return true;
        }
        return false;
    }

    static void runSAT() {  // Test this example
        // For   (x1 ||  x2) &&∧ (¬x1 ||∨ ¬x2) = true, there is just 2 variables and pairs [x1 = 0, x2 = 1, ¬x1 = 2, ¬x2 = 3]
        int pairs[][] = new int[2][2];
        pairs[0][0] = 0;
        pairs[1][0] = 1;
        pairs[0][1] = 2;
        pairs[1][1] = 3;
        System.out.println(sat(2, pairs));
        /*
         SCC  1
         3 0
         SCC  2
         2 1
         true
         */
        //  For (x1 ||∨ x2) ∧&& (¬x1 ||∨ x2) ∧&& (¬x2 ||∨ x3) &&∧ (¬x2 ||∨¬x3) = false, there is just 3 variables and pairs [x1 = 0, x2 = 1, x3 = 2, ¬x1 = 3, ¬x2 = 4, ¬x3 = 5]
        pairs = new int[2][4];
        pairs[0][0] = 0;
        pairs[1][0] = 1;
        pairs[0][1] = 3;
        pairs[1][1] = 1;
        pairs[0][2] = 4;
        pairs[1][2] = 2;
        pairs[0][3] = 4;
        pairs[1][3] = 5;
        System.out.println(sat(3, pairs));
        /*
         SCC  
         1
         5 3 4 2 1 0
         false
         */
    }

    /**
     * Bitonic Traveling Salesman
     * <pre>
     *  [1] page.339
     * Given a list of coordinates of n vertices on 2D Euclidean space that are already sorted by x-coordinates (and  if tie,
     * by y-coordinates), find a tour that starts from the leftmost vertex, then goes strictly from left to right, and then
     * upon reaching the rightmost vertex, the tour goes strictly from right to left back to the starting vertex.
     * This tour behavior is called ‘bitonic’.
     * </pre>
     *
     * @param p1 vertex initial Left to Right
     * @param p2 vertex initial Right to Left
     * @return the distance of the entire route
     */
    static Point[] Poly;
    static double memo2d[][];

    static double bitonicTravelingSalesman(int p1, int p2) {             // called with dp2(0, 0)
        int v = 1 + Math.max(p1, p2); // this single line speeds up Bitonic TSP tour
        if (v == n - 1) {
            return dist(Poly[p1], Poly[v]) + dist(Poly[v], Poly[p2]);
        }
        if (memo2d[p1][p2] > -0.5) {
            return memo2d[p1][p2];
        }
        return memo2d[p1][p2] = Math.min(
                dist(Poly[p1], Poly[v]) + bitonicTravelingSalesman(v, p2), // extend LR path: p1->v, RL stays: p2
                dist(Poly[v], Poly[p2]) + bitonicTravelingSalesman(p1, v)); // LR stays: p1, extend RL path: p2<-v
    }

    static void runBitonicTravelingSalesman() { // Test this example
        n = 7;
        Poly = new Point[n];
        Poly[0] = new Point(0, 6);          //This points are already sorted, see [1], but you can sort it with compPointByX method
        Poly[1] = new Point(1, 0);
        Poly[2] = new Point(2, 3);
        Poly[3] = new Point(5, 4);
        Poly[4] = new Point(6, 1);
        Poly[5] = new Point(7, 5);
        Poly[6] = new Point(8, 2);
        memo2d = new double[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                memo2d[i][j] = -1;
            }
        }
        System.out.println(bitonicTravelingSalesman(0, 0)); // 25.584024594691332
    }

    public static void main(String[] args) {
        //Test your code here
    }

    /**
     * **********************************************************************************************
     * <pre>
     * Bibliography
     * - [1] Competitive Programming 3, 2013, (Steven Halim, Felix Halim)
     * - [2] Análisis y diseño de algoritmos (Antonio Vallecillo - Univ. Málaga)
     *
     * </pre>
     * *********************************************************************************************
     */
}
