/*
 ===================             Realease 18.08                  =======================                   
 This is the Team Reference Code. This material is just for Code.. 
 If you are looking for some formulas or theorems, please download the Team Reference Notes from GitHub at 
 https://github.com/lmperezCuba/TeamReferenceAlgorithms/tree/18.08.
 ===================        + 6000  lines of code        ========================                                                                                
 
 Contact                                                                                                                                                                                                                               
 Ing. Luis Manuel Pérez Batista                                                                                                                                                                                   
 luismanuelp1992@gmail.com                                                                                                                                                                                     
 (+53) 53855092   (Cuba)                                                                                                                                                                                                  
 https://www.linkedin.com/in/luis-perez-batista-426326152/                                                                                                                       
   
 Profiles
 - COJ username - (lmperez)                                                                                                                                                                                                         
 - Codefight username - (lmperez)                                                                                                                                                                                             
 
 ======================= >>>>>        Tips      <<<<< =========================                                                                               
 1.  Use Ctrl + F  to find the algorithms
 2.  See the  bibliography at the bottom of this file
 3. The NEW algorithms are identified by three asterics (***)         <<--- readme
 4. The main idea is that you import this class as a library and use it in your projects.
 5. If you want to use it as your team reference print it in the Netbeans IDE (in the print options mark the wrap lines checkbox)  
 6. Coming soon on December
 ____ Gallery Art (Computational Geometry)
 ____ Z-Algorithm (String)
 ____ Kosaraju (Graph Theory)
 ____ Strassen’s Problem (Divide & Conquer)
 ____ Shunting yard’ (Simulation)
 
 ======================================================================
 Index (121 Algorithms)

 - Code Tips
 =====================================================================
 1.  SORTING (12)
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
 -  Counting Sort O(n)                      

 =====================================================================
 2. Greedy (3)
 -  Siamese - Magic Square Construction (Odd Size)
 - Roman Numerals                   
 - Huffman Codes

 =====================================================================
 3. Dynamic Programming (15)
 -  Fibonacci
 -  Big Fibonacci Mod m
 -  Pascal Triangle
 -  InterestBank
 -  Travel Most Cheap for River
 -  Edit Distance
 -  Coin Change
 - Counting Change 
 -  KnapSack 0 - 1
 -  KnapSack Multiples Objects
 -  Longest Increasing Subsequence (LIS) O(n^2)
 - Longest Increasing Subsequence (LIS) O(n log k) 
 -  Multiplication Chain Matrix
 -  Max Sum Interval 
 - Subset Sum Up To (Hit) K                 ***

 ====================================================================
 4. Data Structure (7)
 -  Union-Find Disjoin-Set
 - Segment Tree
 - RMQ
 - ABI 1D
 - ABI 2D
 - Next Bigger                                          ***
 - Bit Mask                                               ***

 ====================================================================
 5. String Processing (14)
 - Knuth - Morris - Pratt (KMP)
 - Rabin Karp                                           ***
 - Boyer Moore                                       ***
 - JaroWinkler (Edit Distance )
 - Longest Common Subsequence (LCS)
 - Suffix Trie
 - Suffix Array
 - Longest Common Prefix (LCP)  O(n)
 - Longest Common SubString (LCSS) O(n*m)
 - Longest Common SubString (LCS) O(n*logn)
 - Longest Palindrome
 - Longest Palindrome DP
 - Aho-Corasick Classic                      ***
 - Aho-Corasick Inner                         ***

 ===================================================================
 6. Backtracking (5)
 - 8 Queens
 - 8 Queens Revisited  (faster) 
 - Tower of Hanoi
 - Tower of Hanoi with requirements  
 - The N^2 - 1 Puzzle   

 ===================================================================
 7. Divide & Conquer (4)
 -  Binary Search
 -  Ternary Search
 -  Tennis Tournament
 -  Chess Horse Jump

 ===================================================================
 8. Graph Theory (16)    
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
 - Chinese Postman
 - LCA (Lowest Common Ancestor)
 - Bidirectional BFS                
 - Shortest Path Faster        
 - Hamiltonian Cycle Detection
 - Shortest Path with Number of Steps Given

 ==================================================================
 9. Network Flow (4)
 - Edmonds Karp's (Max Flow Problem)
 - Dinic (Max Flow)
 - Hopcroft Karp
 - Min Cost Max Flow            

 ==================================================================
 10. Combinatory    (3)
 - Next Permutation
 - Combination Large Numbers
 -Combination with repeated objects

 ==================================================================
 11. Simulation (2)
 - Josephus Problem
 - Postfix Notation                 

 ==================================================================
 12. Computational Geometry (17)
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
 - Closest Pair 2D
 -  Best Triangulation                  ***

 =================================================================
 13. Number Theory (14)
 - Eratosthenes's sieve
 - Greatest Common Divisor (GCD)
 - GCD Faster- Greatest Common Divisor Bitwise
 - Least Common Multiple (LCM)
 - Factorial Frequencies O(n)
 - Factorial Frequencies O(1)
 - Factorial Trailing Zeros  
 - Prime Factors
 - Prime Factors - Pollard Rho
 - Euler Phi
 - Extended Euclid
 - Bit Count    
 - Fibonacci O(log(n)) 
 - Fast Exponentiation
 - Big Mod (b^p % m) 

 =================================================================
 14. Mathematics (2)
 - Catalan Numbers
 - Gaussian Elimination

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
import java.math.BigInteger;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Random;
import java.util.Scanner;
import java.util.Stack;
import java.util.StringTokenizer;
import javafx.util.Pair;

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
     * <pre>
     * [2, [5] page.42
     * UVA Problem 10194
     * </pre>
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
     * Insertion Sort
     * <pre>
     * [2], [5] page.4
     * </pre>
     *
     * @param A array to sort
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
     * Bubble Sort
     *
     * <pre>
     * [2], [3] page.107
     * Problems (COJ - 3181)
     * UVA Problems 299, 612, 10327t
     * </pre>
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
     * Merge Sort
     * <pre>
     * [2], [5] page.120
     * </pre>
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
     * Quick Sort
     * <pre>
     * [2], [5] page.123
     * </pre>
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
     * Radix Sort (Numbers)
     * <pre>
     * [2], [3] page.111
     * Problems (COJ - 3182)
     * </pre>
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
     * Counting Sort
     * <pre>
     *  [1] page.386
     * See Suffix Array Algorithm for an application of this sorting.
     * Used for sort an small range on an array with positive integers.
     *
     * @param  A array unsorted
     * @return the array B sorted
     */
    static int[] countingSort(int[] A) {
        int k = -1;
        for (int i = 0; i < A.length; i++) {
            if (A[i] >= k) {
                k = A[i] + 1;
            }
        }
        int f[] = new int[k];
        for (int i = 0; i < A.length; f[A[i++]]++);
        for (int i = 1; i < k; f[i] += f[i++ - 1]);
        int B[] = new int[A.length];
        for (int i = A.length - 1; i >= 0; i--) {
            B[f[A[i]] - 1] = A[i];
        }
        return B;
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
     * <pre>
     * [1] page.361
     * n must be odd UVa 01266 - Magic Square
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
     * Roman Numerals
     * <pre>
     * [1] page.378, [3] page.198
     * UVa 11616 - Roman Numerals
     * </pre>
     *
     * @param A number to convert
     * @return the roman number
     *
     */
    static String toRoman(int A) {
        int N[] = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String R[] = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        StringBuilder rom = new StringBuilder();
        for (int i = 0; i < 13; i++) {
            while (A >= N[i]) {
                rom.append(R[i]);
                A -= N[i];
            }
        }
        return rom.toString();
    }

    static int romanTo(String roman) {
        int RtoA[] = new int[255];
        char R[] = {'I', 'V', 'X', 'L', 'C', 'D', 'M'};
        int N[] = {1, 5, 10, 50, 100, 500, 1000};
        for (int i = 0; i < 7; RtoA[R[i]] = N[i++]);
        int value = 0;
        for (int i = 0; i < roman.length(); i++) {
            if (i + 1 < roman.length() && RtoA[roman.charAt(i)] < RtoA[roman.charAt(i + 1)]) { // check next char first
                value += RtoA[roman.charAt(i + 1)] - RtoA[roman.charAt(i)]; // by definition
                i++;
            } // skip this char
            else {
                value += RtoA[roman.charAt(i)];
            }
        }
        return value;
    }

    /**
     * Huffman Codes
     * <pre>
     * [4] page.385
     * </pre>
     *
     * @param text
     * @return huffman's code
     */
    static String Table[] = new String[260];     //   Store the keys
    static int keysCount = 0;

    static String encodeHuffman(String text) {
        // Count frequencies
        int Letters[] = new int[260];                 // Store the frequencies
        char Words[] = new char[260];           //  Store the words in the text
        int length = text.length(), count = 0;
        for (int i = 0; i < length; i++) {
            if (Letters[text.charAt(i)] == 0) {
                Words[count++] = text.charAt(i);
            }
            Letters[text.charAt(i)]++;
        }
        //  Fill the list
        PriorityQueue<HuffmanNode> lista = new PriorityQueue<>();
        for (int i = 0; i < count; i++) {
            lista.add(new HuffmanNode(Words[i], Letters[Words[i]]));
        }
        // Merge the trees
        HuffmanNode first = null, second, temp;
        while (!lista.isEmpty()) {
            first = lista.poll();
            if (lista.isEmpty()) {
                break;
            }
            second = lista.poll();
            temp = new HuffmanNode('*', first.frequency + second.frequency);
            temp.left = second;
            temp.right = first;
            lista.add(temp);
        }
        //  Find the keys
        encode(first.left, "1");
        encode(first.right, "0");
        //  Encode the text
        StringBuilder compress = new StringBuilder();
        for (int i = 0; i < length; i++) {
            compress.append(Table[text.charAt(i)]);
        }
        //  Fill the rest to be a multiple of 8
//        int rest = compress.toString().length() % 8;
//        if (rest != 0) {
//            for (; rest < 8; rest++) {
//                compress.append("0");
//            }
//        }
        return compress.toString();
    }

    static void encode(HuffmanNode tree, String key) {
        if (tree.right == null) {
            Table[tree.character] = key;
            keysCount++;
        } else {
            encode(tree.left, key + "1");
            encode(tree.right, key + "0");
        }
    }

    static String decode(String s) {
        String[] keys = new String[keysCount];
        HashMap<String, Character> mapa = new HashMap<>();
        for (int i = 0; i < 260; i++) {
            if (Table[i] != null) {
                keys[--keysCount] = Table[i];
                mapa.put(Table[i], (char) (i));
            }
        }
        Arrays.sort(keys);
        int i = 0;
        StringBuilder text = new StringBuilder();
        while (i < s.length()) {
            for (int j = keys.length - 1; j >= 0; j--) {
                int ll = keys[j].length();
                if (i + ll <= s.length() && s.substring(i, i + ll).equals(keys[j])) {
                    i += ll;
                    text.append("" + mapa.get(keys[j]));
                    break;
                }
            }
        }
        return text.toString();
    }

    static class HuffmanNode implements Comparable<HuffmanNode> {

        char character;
        int frequency;
        HuffmanNode right;
        HuffmanNode left;

        public HuffmanNode(char character, int frequency) {
            this.character = character;
            this.frequency = frequency;
            this.right = null;
            this.left = null;
        }

        @Override
        public int compareTo(HuffmanNode o) {
            if (this.frequency <= o.frequency) {
                return -1;
            }
            return 1;
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
     * <pre>
     * [1] , [3] page.98
     * Find the n-th Fibonacci number in the range [2 - 1498].
     * </pre>
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
     * MAX_LONG]. [1] page.366 UVa 10229 - Modular Fibonacci
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
     * <pre>
     * [1] , [3] page.203
     * Find the (N,K) combinations.
     * </pre>
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
     * Edit Distance
     * <pre>
     * [1], [3] page.127
     * COJ Problem  1478
     * UVA Problems 164, 526
     * Less cost for travel on the river since a point A until a point B.
     * </pre>
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
     * <pre>
     * [1]
     * COJ Problem 2616
     * </pre>
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
     * Counting Change
     * <pre>
     * [3] page.131
     * COJ Problems 1103
     * UVA Problems 147, 357, 674
     * Suppose you have coins of 1 cent, 5 cents and 10 cents. You are asked to pay 16 cents,
     * therefore you have to give 1 one cent, 1 five cents, and 1 ten cents. Counting Change
     * algorithm can be used to determine how many ways you can use to pay an amount of
     * money.
     * </pre>
     *
     * @param n coins to change
     * @return the number of different ways
     */
    static long countingChange(int n) {
        long nway[] = new long[n + 1];
        int coin[] = {50, 25, 10, 5, 1};
        int i, j, v, c;
        v = 5;
        nway[0] = 1;
        for (i = 0; i < v; i++) {
            c = coin[i];
            for (j = c; j <= n; j++) {
                nway[j] += nway[j - c];
            }
        }
        return nway[n];
    }

    /**
     * KnapSack 0 - 1
     * <pre>
     * [1] , [2] page.202, [3] page.130
     * UVA Problem 10130
     * </pre>
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
     * <pre>
     * [1], [2] page.205
     * </pre>
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
     * Longest Increasing Subsequence (LIS) O(n^2)
     * <pre>
     * [1], [3] page.128
     * COJ Problem 1658
     * UVA Problems 111, 231, 481, 497, 10051, 10131
     * </pre>
     *
     * @param LIS array of integers
     * @return SOL[res] longest subsequence size
     */
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
     * Longest Increasing Subsequence (LIS) O(n log k)
     * <pre>
     * [3] page.128
     * COJ Problem 1658
     * UVA Problems 111, 231, 481, 497, 10051, 10131
     * </pre>
     *
     * @param LIS array of integers
     * @return len longest subsequence size
     */
    static int longestIncreasingSubsecuenceFast(int LIS[]) {
        int A[] = new int[LIS.length + 1], Predec[] = new int[LIS.length], P[] = new int[LIS.length + 1], len = 0;
        Arrays.fill(A, Integer.MAX_VALUE);
        Arrays.fill(Predec, -1);
        A[0] = Integer.MIN_VALUE;
        for (int i = 0; i < LIS.length; i++) {
            int pos = BinarySearch(A, LIS[i]);
            if (A[pos] == Integer.MAX_VALUE) {
                len++;
            }
            if (A[pos - 1] != Integer.MIN_VALUE) {
                Predec[i] = P[pos - 1];
            }
            A[pos] = LIS[i];
            P[pos] = i;
        }
        // Print Precedence
        int pos = P[len];
        System.out.print(LIS[pos]);
        while (Predec[pos] != -1) {
            System.out.print(" <- " + LIS[Predec[pos]]);
            pos = Predec[pos];
        }
        return len;
    }

    /**
     * Multiplication Chain Matrix
     * <pre>
     * [1] page.362, [3] page.123, [3] page.209, [4] page.331, [5] page.45
     * COJ Problem 3036
     * UVA Problem 348
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
     * Max Sum Interval
     * <pre>
     * [2] page.136, [3] page.132
     * UVA Problem 507
     *  For A = [ –2,11,–4,13,–5,–2 ] the solution will be 20, i = 1: j = 3
     * </pre>
     *
     * @param A array of numbers
     * @return the sum of the interval
     */
    static int maxSumInterval(int[] A) {
        int max_prev = 0, max_aux = 0, beg = 0, end = 0;
        for (int i = 0; i < A.length; i++) {
            if (max_aux <= 0) {
                beg = i;
            }
            max_aux = Math.max(max_aux + A[i], 0);
            if (max_aux > max_prev) {
                end = i;
            }
            max_prev = Math.max(max_prev, max_aux);
        }
        System.out.println("Interval " + beg + " " + end);
        return max_prev;
    }

    /**
     * Subset Sum Up To (Hit) K
     * <pre>
     * [7] page.1
     *  The max sum of a subset K <= M, For {2, 4, 5, 9} and M = 8 return subset {2, 5} (K = 7) <= 8
     * </pre>
     *
     * @param a array of numbers
     * @param M max value
     * @return the max sum K <= M
     */
    static int subsetSumUpToK(int a[], int M) {
        int m[] = new int[M + 10], i, j, K = 0, n = a.length;
        m[0] = 1;
        for (i = 0; i < n; i++) {
            for (j = M; j >= a[i]; j--) {
                m[j] |= m[j - a[i]];
            }
        }
        for (j = M; j >= 0; j--) {
            if (m[j] == 1) {
                return j;
            }
        }
        return K;
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
     * <pre>
     * [1] Problems COJ 1094
     * </pre>
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
     * <pre>
     * [1] Problems COJ 1651, 2395
     * </pre>
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
     * ABI 2D
     * <pre>
     * [1] Problems COJ
     * </pre>
     *
     * @param ABI matrix of integers
     * @return the min/max/sum of a range
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
     * Next Bigger
     * <pre>
     * COJ Problem  3239
     * Determine the next number that is bigger than me in O(n).
     * For   numbers       4,      9,      1,        2,        3,         6
     *           sols is            1       -1     3         4         5          -1    // Positions of the next bigger number in the array numbers
     * </pre>
     *
     * @param numbers arrays of elements
     * @return sols array of solutions
     */
    static int[] nextBigger(int numbers[]) {
        Stack<Integer> stack = new Stack<>();
        int[] sols = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            if (stack.empty()) {
                stack.push(i);
            } else if (numbers[stack.peek()] >= numbers[i]) {
                stack.push(i);
            } else {
                while (!stack.empty() && numbers[stack.peek()] < numbers[i]) {
                    sols[stack.pop()] = i;
                }
                stack.push(i);
            }
        }
        while (!stack.empty()) {
            sols[stack.pop()] = -1;
        }
        return sols;
    }

    /**
     * Bit Mask
     * <pre>
     *Combinations for abcd in  this case, but you can use numbers. the limit of N is max 16 elements only.
     * a, b, ab,  c, ac, bc, abc, d, ad, bd, abd, cd, acd, bcd
     * </pre>
     *
     * @param numbers arrays of elements
     * @return sols array of solutions
     */
    static void bitMask() {
        char cad[] = {'a', 'b', 'c', 'd'};
        int n = cad.length; // amount of elements
        int com = (1 << n) - 1; // combinations
        for (int i = 1; i < com; i++) {
            StringBuilder newComb = new StringBuilder();
            for (int j = 0; j < n; j++) {
                if ((i & (1 << j)) > 0) {
                    newComb.append(cad[j]);
                }
            }
            System.out.println(newComb.toString());
        }
    }
    /**
     * *********************************************************
     *
     * 5. String Processing
     *
     **********************************************************
     */
    /**
     * Knuth - Morris - Pratt (KMP)
     * <pre>
     *  Search for a substring p int t
     * COJ Problem 2352
     * </pre>
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
     * Rabin Karp
     *
     * <pre>
     *  Search for a substring p int t
     * </pre>
     *
     * @param Tptext
     * @param p prefix
     * @return the positions
     */
    static void rabinKarp(String t, String p) {
        int d, hx, hy, i, j = 0;
        int m = p.length(), n = t.length();
        /* Preprocessing */
        /* computes d = 2^(m-1) with  the left-shift operator */
        for (d = i = 1; i < m; ++i) {
            d = (d << 1);
        }
        for (hy = hx = i = 0; i < m; ++i) {
            hx = ((hx << 1) + p.charAt(i));
            hy = ((hy << 1) + t.charAt(i));
        }
        /* Searching */
        while (j <= n - m) {
            if (hx == hy && p.equals(t.substring(j, j + m))) {
                System.out.println(j);
            }
            if (j == n - m) {
                break;    //the end
            }
            hy = REHASH(t.charAt(j), t.charAt(j + m), hy, d);
            ++j;
        }
    }

    static int REHASH(int a, int b, int h, int d) {
        return ((((h) - (a) * d) << 1) + (b));
    }

    /**
     * Boyer Moore
     *
     * <pre>
     *  Search for a substring p int t
     * </pre>
     *
     * @param T text
     * @param P prefix
     * @return the positions
     */
    static void boyerMooreMatcher(String T, String P) {
        int N = T.length(), M = P.length();
        int i = M - 1;
        int j = M - 1;
        int bmNext[] = new int[255];//255 para tener todo el codigo asci
        preBM(P, bmNext);
        while ((i < N) && (j >= 0)) {
            if (T.charAt(i) == P.charAt(j)) {
                i--;
                j--;
            } else {
                i += bmNext[T.charAt(i)];
                j = M - 1;
            }
            if (j < 0) {
                System.out.println("Match " + (i + 1));
                i += M + 1;
                j = M - 1;
            }
        }
    }

    static void preBM(String P, int bmNext[]) {
        int M = P.length();
        for (int i = 0; i < 255; i++) {
            bmNext[i] = M;
        }
        for (int i = 0; i < M; i++) {
            bmNext[P.charAt(i)] = M - 1 - i;
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
     * Longest Common Subsequence (LCS)
     * <pre>
     * [1], [3] page.125, [3] page.205, [4] page.350
     * UVA Problems 531, 10066, 10100, 10192, 10405
     * </pre>
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
     * Suffix Trie
     * <pre>
     * [1]
     * COJ Problem 2352
     * </pre>
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
     * Longest Palindrome
     *
     * @param word
     * @return the max subsequence palindrome
     */
    static int maxPalindrome(String word, int i, int j) {
        if (i == j) {
            return 1;
        }
        if (i + 1 == j) {
            return (word.charAt(i) == word.charAt(j)) ? 2 : 1;
        }
        if (word.charAt(i) == word.charAt(j)) {
            return 2 + maxPalindrome(word, i + 1, j - 1);
        } else {
            return Math.max(maxPalindrome(word, i + 1, j), maxPalindrome(word, i, j - 1));
        }
    }

    /**
     * Longest Palindrome DP
     *
     * Please this algorithm has not been tested yet, by @lmperez.
     *
     * @param word
     * @return the max subsequence palindrome
     */
    static String maxPalindromeDP(String s) {
        char sol[] = new char[100];
        int M[][] = new int[1001][1001];  //Almacena el contador del mayor palindrome por intervalos.
        char PP[][] = new char[1001][1001];  /*Almacena la precedencia de la mayor palabra.O -> origen (inicio de la palabra)
         Si los caracteres se incluyen entoces su precedencia se marca con Mayuscula
         I -> Izquierda , S -> Superior o arriva y D -> Diagonal y si no se incluyen se marca con minuscula
         i,s,d al finalizar si la cadena es par se dopla el camino y se impar se dobla a partir del 2 caracter.
         Ej, DAM con long 5 es impar por lo que se dobla la cadena desde la A -> MADAM
         sino ROSA long 8 es par por lo que se vira completa ASORROSA.*/

        char c;
        l = s.length();
        if (l > 0) {
            for (int i = 0; i < l; i++) {//Inicializar las diagonales.Caso base para n=1
                M[i][i] = 1;
                PP[i][i] = 'O';
            }
            for (int i = 1; i < l; i++) {//Para n=2
                if (s.charAt(i) == s.charAt(i - 1)) {
                    M[i - 1][i] = 2;
                    PP[i - 1][i] = 'i';
                } else {
                    M[i - 1][i] = 1;
                    PP[i - 1][i] = 'a';
                }
            }
//Para n>2
            for (int i = 2; i < l; i++) {   //  i+1 es el tamanno de la nueva palabra.
                for (int j = i, k = 0; j < l; j++, k++) {
                    int aux;
                    if (M[k][j - 1] > M[k + 1][j]) {
                        aux = M[k][j - 1];
                        c = 'i';
                    } else {
                        aux = M[k + 1][j];
                        c = 'a';
                    }
                    if (s.charAt(j) == s.charAt(k)) {
                        if (M[k + 1][j - 1] + 2 > aux) {
                            aux = M[k + 1][j - 1] + 2;
                            c = 'D';
                        }
                    }
                    M[k][j] = aux;
                    PP[k][j] = (char) c;
                }
            }
//------------------------------
            int longitud = M[0][l - 1];
            int i = 0, j = l - 1, k = 0, r;
            while (PP[i][j] != 'O') {
                if (PP[i][j] == 'D') {
                    sol[k++] = s.charAt(j);
                    j--;
                    i++;
                } else if (PP[i][j] == 'I') {
                    sol[k++] = s.charAt(j);
                    j--;
                } else if (PP[i][j] == 'i') {
                    j--;
                } else if (PP[i][j] == 'a') {
                    i++;
                }
            }
            sol[k++] = s.charAt(j);
            r = k - 1;
            if (longitud % 2 != 0) {
                r--;
            }
            while (r >= 0) {
                sol[k++] = s.charAt(r);
                r--;
            }
//Print the solution
            StringBuilder sb = new StringBuilder();
            for (int q = 0; q < k; q++) {
                sb.append(sol[q]);
            }
            return sb.toString();
        }
        return "null";
    }

    /**
     * Aho-Corasick Classic
     *
     * Aho-Corasick's algorithm, as explained in
     * http://dx.doi.org/10.1145/360825.360855
     *
     * @param keywords
     * @param text
     * @return all the ocurrences of the keywords in the text
     */
    /*
     1. Modify the MAXS and MAXC constants as appropriate.
     2. Call buildMatchingMachine with the set of keywords to  search for.
     3. Start at state 0. Call findNextState to incrementally transition between states.
     4. Check the out function to see if a keyword has been matched.
     */
    //      This algorithm find the occurrences of the keywords in the text, in this example finds 2 words
    static void AhoCorasikClassic() {
        String keywords[] = {"word", "this"};
        String text = "this is a wowordrd";
        buildMatchingMachine(keywords);
        int currentState = 0;
        for (int i = 0; i < text.length(); ++i) {
            currentState = findNextState(currentState, text.charAt(i));
            //  Nothing new, let's move on to the next character.
            if (out[currentState] == 0) {
                continue;
            }

            for (int j = 0; j < keywords.length; ++j) {
                if ((out[currentState] & (1 << j)) > 0) {
                    //Matched keywords[j]
                    System.out.println("Keyword " + keywords[j] + " appears from " + (i - keywords[j].length() + 1) + " to " + i);
                }
            }
        }
    }

    /**
     * Aho-Corasick Inner
     *
     */
    // This finds all the occurrences deletening each occurrence finded, in this example finds 4 occurrences.
    static void AhoCorasikInner() {
        String keywords[] = {"word", "this"};
        String text = "*this is a wowordrwordd*";      // use * for avoid overflow
        buildMatchingMachine(keywords);
        int currentState = 0;
        // This block has been improved
        int len = text.length();
        int[] transitions = new int[len];  // This allows me back to bad edges, Ex. for keys = {words} and text =  {wowordswords} i go back after the first occurence od words and i fine 2 occurrences in the text
        int[] transitinosBack = new int[len];
        for (int i = 0; i < len; i++) {
            transitions[i] = i + 1;
            transitinosBack[i] = i - 1;
        }// End block
        for (int i = 0; i < text.length();) {
            currentState = findNextState(currentState, text.charAt(i));
            //  Nothing new, let's move on to the next character.
            if (out[currentState] == 0) {
                i = transitions[i];
                continue;
            }
            for (int j = 0; j < keywords.length; ++j) {
                if ((out[currentState] & (1 << j)) > 0) {
                    //Matched keywords[j]
                    System.out.println("Keyword " + keywords[j] + " appears from " + i + " minus 4 chars");
                    int nextTrans = transitions[i];
                    for (int k = 0; k < keywords[j].length(); k++) {
                        i = Math.max(0, transitinosBack[i]);
                    }
                    transitions[i] = nextTrans;
                    transitinosBack[nextTrans] = i;
                    int back = maxSizeWord;
                    while (back > 0 && transitinosBack[i] != -1) {
                        i = transitinosBack[i];
                    }
                    for (int k = 0; k < len; k = transitions[k]) {
                        System.out.print(text.charAt(k));
                    }
                    System.out.println("");
                }
            }
//Keyword this appears from 4 minus 4 chars
//* is a wowordrwordd*
//Keyword word appears from 16 minus 4 chars
//* is a worwordd*
//Keyword word appears from 21 minus 4 chars
//* is a word*
//Keyword word appears from 22 minus 4 chars
//* is a *
        }
    }

    // Max number of states in the matching machine.
    static int maxSizeWord = 50;         // The size of the biggest word
    static int MAXS = 2 * 50 + 10;    // Should be equal to the sum of the length of all keywords. In this example will be 2 word with a max lenght of 50
    static int MAXC;                     // Number of characters in the alphabet.
// Output for each state, as a bitwise mask.
// Bit i in this mask is on if the keyword with index i
    static int out[] = new int[MAXS];                              // appears when the machine enters this state.
// Used internally in the algorithm.
    static int f[] = new int[MAXS]; // Failure function
    static int g[][]; // Goto function, or -1 if fail.
    static char Alphabet[];// the whole alphabet ,(by lmperez)
    static int KeyAlphabet[] = new int[300];    // The key of each element in the alphabet \\s = 0, 0 =1, A = 11, etc
    /*
     Buil your desire alphabet (by lmperez)
     {* 0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz}
     The first element is just for avoid overflow 
     */

    static void builAlphabet() {
        StringBuilder alp = new StringBuilder(" ");
        for (int i = 0; i < 255; i++) {
            String c = "" + ((char) (i));
            if (c.matches("[a-zA-Z0-9]|\\*")) {
                alp.append(c);
            }
        }
        String s = alp.toString();
        MAXC = s.length();
        Alphabet = new char[MAXC];
        for (int i = 0; i < MAXC; i++) {
            Alphabet[i] = s.charAt(i);              // store the char
            KeyAlphabet[Alphabet[i]] = i;       // store the value of the char, \\s = 0, 0 = 1, 1 = 2, A = 11, etc
        }
    }
    /*Builds the string matching machine.
     words - Vector of keywords. The index of each keyword is  important:
     "out[state] & (1 << i)" is > 0 if we just found word[i] in the text.
     lowestChar - The lowest char in the alphabet. Defaults to ' '.
     highestChar - The highest char in the alphabet. Defaults to 'z'.
     "highestChar - lowestChar" must be <= MAXC, otherwise we will access the g matrix outside  its bounds and things will go wrong.
     */
// Returns the number of states that the new machine has. 
// States are numbered 0 up to the return value - 1, inclusive.

    static int buildMatchingMachine(String[] words) {
        builAlphabet(); // by lmperez
        char lowestChar = Alphabet[0];
        Arrays.fill(f, -1);
        g = new int[MAXS][MAXC];        // Remember change MAXS as you wish
        for (int i = 0; i < g.length; i++) {
            Arrays.fill(g[i], -1);
        }
        int states = 1; // Initially, we just have the 0 state
        for (int i = 0; i < words.length; ++i) {
            String keyword = words[i];
            int currentState = 0;
            for (int j = 0; j < keyword.length(); ++j) {
                int c = KeyAlphabet[keyword.charAt(j)] - KeyAlphabet[lowestChar];
                if (g[currentState][c] == -1) {
                    // Allocate a new node
                    g[currentState][c] = states++;
                }
                currentState = g[currentState][c];
            }
            // There's a match of keywords[i] at node currentState.        
            out[currentState] |= (1 << i);
        }
        // State 0 should have an outgoing edge for all characters.
        for (int c = 0; c < MAXC; ++c) {
            if (g[0][c] == -1) {
                g[0][c] = 0;
            }
        }
        // Now, let's build the failure function
        LinkedList<Integer> q = new LinkedList<>();
        // Iterate over every possible input
        for (int c = 0; c < MAXC; ++c) {
            // All nodes s of depth 1 have f[s] = 0
            if (g[0][c] != -1 && g[0][c] != 0) {
                f[g[0][c]] = 0;
                q.push(g[0][c]);
            }
        }
        while (!q.isEmpty()) {
            int state = q.pop();
            for (int c = 0; c < MAXC; ++c) {
                if (g[state][c] != -1) {
                    int failure = f[state];
                    while (g[failure][c] == -1) {
                        failure = f[failure];
                    }
                    failure = g[failure][c];
                    f[g[state][c]] = failure;
                    // Merge out values
                    out[g[state][c]] |= out[failure];
                    q.push(g[state][c]);
                }
            }
        }
        return states;
    }

    /*
     Finds the next state the machine will transition to.
     currentState - The current state of the machine. Must be  between 0 and the number of states - 1, inclusive.
     nextInput - The next character that enters into the machine. Should be between lowestChar and highestChar, inclusive.
     Returns the next state the machine will transition to. This is an integer between 0 and the number of states - 1,  inclusive.
     */
    static int findNextState(int currentState, char nextInput) {
        int answer = currentState;
        int c = KeyAlphabet[nextInput] - KeyAlphabet[Alphabet[0]];
        while (g[answer][c] == -1) {
            answer = f[answer];
        }
        return g[answer][c];
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

    /**
     * Tower of Hanoi
     * <pre>
     * [1] page.390
     * The solution is 2^n - 1. Move all rings from A to C passing by B.
     * UVa 10017 - The Never Ending
     * </pre>
     *
     * @param n number of rings
     * @return the number of possible solutions
     */
    static void Hanoi(int n, int origen, int auxiliar, int destino) {
        if (n == 1) {
            System.out.printf("Move ring from stick %d to stick %d.\n", origen, destino);
        } else {
            Hanoi(n - 1, origen, destino, auxiliar);
            System.out.printf("Move ring from stick %d to stick %d.\n", origen, destino);
            Hanoi(n - 1, auxiliar, origen, destino);
        }
    }

    static void runHanoi() {
        int nn = 3;
        Hanoi(nn, 1, 2, 3);
        System.out.printf("You needs %d moves.", (1 << nn) - 1);
    }

    /**
     * Tower of Hanoi with requirements
     * <pre>
     * Move all rings from A to C indirectly.
     * </pre>
     *
     * @param n number of rings
     * @return the number of possible solutions
     */
    static int con;

    static void HanoiR(int n, int origen, int auxiliar, int destino) {
        if (n == 0) {
            return;
        }
        Hanoi(n - 1, auxiliar, destino, origen);
        con++;
        Hanoi(n - 1, auxiliar, origen, destino);
        con++;
        Hanoi(n - 1, auxiliar, destino, origen);
    }

    /**
     * The N^2 - 1 Puzzle
     * <pre>
     * For N = 3 will be
     *  1       2       3
     *  4       5       6
     *  7       8       _
     * </pre>
     *
     * @param n number of rings
     * @return the number of possible solutions
     */
    static int maxSteps;
    static int[] X = {-1, 0, 1, 0}, Y = {0, -1, 0, 1};
    static HashSet<String> statesPass;

    static void nPuzzle(State ss) {
        int dist = ss.dist;
        if (dist == 0) {
            if (ss.currentSteps < maxSteps) {
                maxSteps = ss.currentSteps;
            }
        }
        if (ss.currentSteps > maxSteps) {
            return; // bound
        }
        LinkedList<State> newStates = new LinkedList<>();
        for (int i = 0; i < 4; i++) {
            if (ss.x + X[i] < n && ss.x + X[i] >= 0 && ss.y + Y[i] >= 0 && ss.y + Y[i] < n) {
                int newState[][] = new int[n][n];
                for (int j = 0; j < n; j++) {
                    for (int k = 0; k < n; k++) {
                        newState[j][k] = ss.ss[j][k];
                    }
                }
                newState[ss.x][ss.y] = ss.ss[ss.x + X[i]][ss.y + Y[i]];     // move the blank space
                newState[ss.x + X[i]][ss.y + Y[i]] = 9;        // 9 is the blank space
                String state = getState(newState);
                if (!statesPass.contains(state)) {
                    // System.out.println(state);
                    State s = new State(distPuzzle(newState), ss.x + X[i], ss.y + Y[i], ss.currentSteps + 1, newState, state);
                    int pos = newStates.size() - 1;
                    while (pos >= 0 && s.dist < newStates.get(pos).dist) {    // sort the possible states
                        pos--;
                    }
                    newStates.add(pos + 1, s);
                    statesPass.add(state);
                }
            }
        }
        for (State state : newStates) {
            nPuzzle(state);
        }

    }

    //Used for Manhatan Distance
    static int distPuzzle(int[][] statesp) {
        int sol = 0, x, y;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                x = (statesp[i][j] - 1) / n;
                y = (statesp[i][j] - 1) % n;
                sol += Math.abs(i - x) + Math.abs(j - y);
            }
        }
        return sol;
    }

    //  Used for a simple question. Is the number x in its position?
//        static int distPuzzle(int [][] statesp) {
//        int sol = 0;
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < n; j++) {
//                if(statesp[i][j] != i*n + j + 1)
//                sol ++;
//            }
//        }
//        return sol;
//    }
    // Mark the current state as visited
    static String getState(int[][] statesp) {
        StringBuilder state = new StringBuilder();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                state.append("" + statesp[i][j]);
            }
        }
        return state.toString();

    }

    static class State {

        int dist, x, y, currentSteps;
        int ss[][];
        String state;

        public State(int dist, int x, int y, int currentSteps, int[][] ss, String state) {
            this.dist = dist;
            this.x = x;
            this.y = y;
            this.currentSteps = currentSteps;
            this.ss = ss;
            this.state = state;
        }
    }

    static void runPuzzle() {
        n = 3;
        int[][] statesp = new int[n][n];
        maxSteps = Integer.MAX_VALUE;
        statesPass = new HashSet<>();
        int x = 1, y = 2;
        int ss[] = {1, 5, 2, 4, 3, 9, 7, 8, 6};     // sol = 93 o 2437  for     int x = 1, y = 2;
        //  int ss[] = {9, 2, 3, 1, 4, 5, 7, 8, 6};     // sol = 4    for     int x = 0, y = 0;
        // int ss[] = {1, 2, 3, 4, 9, 5, 7, 8, 6};     // sol = 2    for     int x = 1, y = 1;
        // int ss[] = {1, 2, 3, 4, 5, 6, 7, 9, 8};     // sol = 1    for     int x = 2, y = 1;
        //  int ss[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};    // sol = 0    for     int x = 2, y = 2;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                statesp[i][j] = ss[i * n + j];
            }
        }
        State state = new State(distPuzzle(statesp), x, y, 0, statesp, getState(statesp));
        nPuzzle(state);
        System.out.println(maxSteps);
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
     * <pre>
     * [1], [3] page.113
     * </pre>
     *
     * @param A array sorted
     * @param x element to find
     * @return position of the element or where should be find out.
     */
    public static int BinarySearch(int A[], int x) {
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
     * Finding Articulation Point And Bridge
     * <pre>
     * [1], [3] page.228
     * Problems COJ
     * </pre>
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
     *  [1] page.146, [4] page.595
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
     *  [1] page.156, [3] page.165, [4] page.629
     * UVA Problems 104, 423, 436, 567
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
     *  [1] page.159, [3] page.167
     * UVA Poblem 334
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
     *  [1] page.159, [3] page.168
     * UVA Problem 534, 10048, 544, 10099
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
     * Bellman Ford (slower)
     * <pre>
     * [1], [3] page.164, [4] page.588
     * </pre>
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
         2 es : 988
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
     * UVA Problem 558
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
     * [1] page.342, [3[ page.170
     * </pre>
     *
     * @params grafo
     * @params nodes [global]
     * @return distance of the Eulerian tour
     *
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
     * Bidirectional BFS
     * <pre>
     * [1] page.371
     *  You can not copy and paste this code. It is just for study and customized to your problem description.
     *  But with this code you can inprove an (N-1)^(N-1) problem to a (2 x ((N + 1)/2) ^ ((N + 1)/2)) problem.
     * For N = 10 will be (2 x 5 ^ 5) = 6250  instead 9 ^ 9 = 387420489
     * </pre>
     *
     * @param initialState initial state
     * @return the number of steps
     */
    static HashMap<String, Pair<Integer, Integer>> states;
    static int minDistance;

    static int bidirectionalBFS(int[] initialState) {   // initial       5 1 2 4 3
        int len = initialState.length, aux;
        minDistance = len + 1;
        states = new HashMap<>();
        int[] targetState = new int[len];
        System.arraycopy(initialState, 0, targetState, 0, len);
        Arrays.sort(targetState);
        for (int i = 0; i < len / 2; i++) {
            aux = targetState[i];
            targetState[i] = targetState[len - 1 - i];
            targetState[len - 1 - i] = aux;
        }   // target state     5   4   3   2   1
        // save the initial state
        StringBuilder save = new StringBuilder(""), savet = new StringBuilder("");
        for (int j = 0; j < len; j++) {
            save.append(initialState[j]);
            savet.append(targetState[j]);
        }
        states.put(save.toString(), new Pair<>(0, 1));
        BBFS(initialState, (len + 1) / 2);
        states.put(savet.toString(), new Pair<>(0, 2));
        B2BFS(targetState, (len + 1) / 2);
        return minDistance;
    }

    // First pass BFS
    static void BBFS(int[] state, int pass) {
        if (pass > 0) {
            int aux, len = state.length;
            for (int k = 0; k < len - 1; k++) {
                for (int i = k + 1; i < len; i++) {
                    aux = state[i];
                    state[i] = state[k];
                    state[k] = aux;
                    // save the current state
                    StringBuilder save = new StringBuilder("");
                    for (int j = 0; j < len; j++) {
                        save.append(state[j]);
                    }
                    if (!states.containsKey(save.toString())) {
                        states.put(save.toString(), new Pair<>((len + 1) / 2 - pass + 1, 1));     // state and distance
                    }
                    BBFS(state, pass - 1);
                    aux = state[k];
                    state[k] = state[i];
                    state[i] = aux;
                }
            }
        }
    }

    // Second pass BFS
    static void B2BFS(int[] state, int pass) {
        int len = state.length;
        if (pass > 0) {
            int aux;
            for (int k = 0; k < len - 1; k++) {
                for (int i = 1; i < len; i++) {
                    aux = state[i];
                    state[i] = state[k];
                    state[k] = aux;
                    // save the current state
                    StringBuilder save = new StringBuilder("");
                    for (int j = 0; j < len; j++) {
                        save.append(state[j]);
                    }
                    if (!states.containsKey(save.toString())) {
                        states.put(save.toString(), new Pair<>((len + 1) / 2 - pass + 1, 2));     // state and distance
                    } else if (states.get(save.toString()).getValue() == 1) {
                        int dist1 = states.get(save.toString()).getKey();
                        int dist2 = (len + 1) / 2 - pass + 1;
                        if (dist1 + dist2 < minDistance) {
                            minDistance = dist1 + dist2;
                            System.out.println("dist " + save.toString() + " " + dist1 + " " + dist2);
                        }
                    }
                    B2BFS(state, pass - 1);
                    aux = state[k];
                    state[k] = state[i];
                    state[i] = aux;
                }
            }
        }
    }

    static void runBidBFS() {
        int A[] = {5, 1, 2, 4, 3};      //      sol = 3         the logic of the original example has beeb changed for a simple swap
        int sol = bidirectionalBFS(A);
        for (Map.Entry<String, Pair<Integer, Integer>> entry : states.entrySet()) {
            String string = entry.getKey();
            Pair<Integer, Integer> pair = entry.getValue();
            System.out.println(string + " " + pair.getKey());
        }
        System.out.println("sol= " + sol);
    }

    /**
     * Shortest Path Faster
     * <pre>
     * [1] page.383
     * Chinese algoithm O(k E)
     *  Eliminate redundant operations on Bellman Ford
     * </pre>
     *
     * @param initialState initial state
     * @return the number of steps
     */
    static int[] SPFP(int s, LinkedList<Edge>[] AdjList) {
// initially, only S has dist = 0 and in the queue
        int dist[] = new int[nodes], j;
        for (int i = 0; i < dist.length; i++) {
            dist[i] = Integer.MAX_VALUE;
        }
        dist[s] = 0;
        LinkedList<Integer> q = new LinkedList<>();
        q.push(s);
        boolean[] in_queue = new boolean[nodes];
        int[] count_in_queue = new int[nodes];
        in_queue[s] = true;
        while (!q.isEmpty()) {
            int uu = q.pop();
            in_queue[uu] = false;
            count_in_queue[uu]++;
            for (j = 0; j < AdjList[uu].size(); j++) { // all neighbors of u
                int vv = AdjList[uu].get(j).y, weight_u_v = AdjList[uu].get(j).weight;
                if (dist[uu] + weight_u_v < dist[vv]) { // if can relax
                    dist[vv] = dist[uu] + weight_u_v; // relax
                    if (!in_queue[vv] && count_in_queue[vv] + 1 < nodes) { // add to the queue
                        q.push(vv); // only if it is not already in the queue
                        in_queue[vv] = true;
                    }
                }
            }
        }
        for (int i = 0; i < nodes; i++) {
            System.out.print(count_in_queue[i] + " ");
        }
        return dist;
    }

    static void RunSPFP() {
        nodes = 3;
        LinkedList<Edge>[] AdjL = new LinkedList[nodes];
        for (int i = 0; i < nodes; i++) {
            AdjL[i] = new LinkedList<>();
        }
        AdjL[0].add(new Edge(0, 1, 1000));
        AdjL[1].add(new Edge(1, 2, 15));
        AdjL[2].add(new Edge(2, 1, -42));
        /*
         Solution
        
         El camino mas corto desde %d hasta : 0
         0 es : 0
         1 es : 946
         2 es : 988
         */
        int dist[] = SPFP(0, AdjL);

        for (int i = 0; i < dist.length; i++) {
            System.out.printf("El camino mas corto desde %d hasta : 0 es %d \n", i, dist[i]);
        }
    }

    /**
     * Hamiltonian Cycle Detection
     * <pre>
     * [1] page.236, [3] page.226
     * Pass for all verteces one time and end at the starting vertex. No necesary have to pass for all edges.
     * </pre>
     *
     * @param initialState initial state
     * @return the number of steps
     */
    static int a_hamilt[][], x_hamilt[];

    static boolean hamiltonianCycleDetection(int k) {
        int j;
        while (true) {
            next(k);
            if (x_hamilt[k] == 0) {
                return false;
            }
            if (k == n) {
                for (j = 1; j <= n; j++) {
                    System.out.printf("%2d", x_hamilt[j]);
                }
                return true;
            } else {
                return hamiltonianCycleDetection(k + 1);
            }
        }
    }

    static void next(int k) {
        int j;
        while (true) {
            x_hamilt[k] = (x_hamilt[k] + 1) % (n + 1);
            if (x_hamilt[k] == 0) {
                return;
            }
            if ((a_hamilt[x_hamilt[k - 1]][x_hamilt[k]]) != 0) {
                for (j = 1; j <= k - 1; j++) {
                    if (x_hamilt[k] == x_hamilt[j]) {
                        break;
                    }
                }
                if (j == k) {
                    if ((k < n) || (k == n && a_hamilt[x_hamilt[n]][x_hamilt[1]] != 0)) {
                        return;
                    }
                }
            }
        }
    }

    static void runHCD() {
        a_hamilt = new int[200][200];
        x_hamilt = new int[200];
        x_hamilt[1] = 1;
        n = 4;
        a_hamilt[1][2] = a_hamilt[2][1] = 1;
        a_hamilt[3][4] = a_hamilt[4][3] = 1;
        a_hamilt[2][4] = a_hamilt[4][2] = 1;
        a_hamilt[3][1] = a_hamilt[1][3] = 1;
        System.out.println(hamiltonianCycleDetection(2));   //  1 -> 2 -> 4 -> 3 -> 1
    }

    /**
     * Shortest Path with Number of Steps Given
     * <pre>
     * [7] page.13
     * Let G be a graph (directed or undirected, weighted or un-weighted).
     * Among all the paths from i to j that takes exactly k steps, which one is of the shortest length?
     * </pre>
     *
     * @param initialState initial state
     * @return the shortest path
     */
    static int[] shortestPathNumberStepsGiven(int AdjM[][][], int source, int target, int steps) {
        int BG = 1000000000;  // to avoid overflow in addition, do not use 2^31-1
        int i = 0, j = 0, t, k;
        int p[][][] = new int[100][100][100];
        for (t = 2; t <= n; t++) {
            for (i = 0; i < n; i++) {
                for (j = 0; j < n; j++) {
                    AdjM[t][i][j] = BG;
                    p[t][i][j] = -1;
                    for (k = 0; k < n; k++) {
                        if (AdjM[1][i][k] < BG && AdjM[t - 1][k][j] < BG) {
                            if (AdjM[1][i][k] + AdjM[t - 1][k][j] < AdjM[t][i][j]) {
                                AdjM[t][i][j] = AdjM[1][i][k] + AdjM[t - 1][k][j];
                                p[t][i][j] = k;
                            }
                        }
                    }
                }
            }
        }
        int shortest[] = new int[steps + 1], pos = 0;
        while (steps > 0) {
            shortest[pos++] = source;
            source = p[steps][source][target];
            if (source == -1) {
                System.out.println("The path does not exist.");
                return shortest;
            }
            steps--;
        }
        shortest[shortest.length - 1] = target;
        int dist = 0;
        for (int o = 1; o < shortest.length; o++) {
            dist += AdjM[1][shortest[o - 1]][shortest[o]];
        }
        System.out.println("The distance is " + dist);
        return shortest;
    }

    static void runSPNSG() {
        int BG = 1000000000;
        n = 5;
        int steps = 2;
        int AdjM[][][] = new int[n + 1][n][n];
        for (int o = 0; o <= steps; o++) {
            for (int q = 0; q < n; q++) {
                Arrays.fill(AdjM[o][q], BG);
            }
        }
        AdjM[1][0][1] = 8;
        AdjM[1][0][4] = 9;
        AdjM[1][1][2] = 3;
        AdjM[1][1][3] = 6;
        AdjM[1][4][3] = 4;
        int path[] = shortestPathNumberStepsGiven(AdjM, 0, 3, 2);
        for (int i = 0; i < path.length; i++) {
            System.out.print(path[i] + " >> ");
        }
    //          The distance is 13
        //          0 >> 4 >> 3 >>
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
     *  [1] page.164 O(VE^2), [4] page.660
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
     * Min Cost Max Flow
     * <pre>
     * [1] page.369
     * UVa 10594 - Data Flow (basic min cost max flow problem)
     * </pre>
     *
     * @return maxflow integer
     */
    static int cost, MAXA, MAXV;
    static int e, u[], v[], w[], cap[], last[], next[]; //MAXA
    static int pre[], d_mcmf[];  //MAXV
    static boolean inq[];           //MAXV
    static LinkedList<Integer> q_mcmf;

    static void mcmf(int s, int t, int cnt) {
        cost = flow = 0;
        int i, tmp;
        while (spac(s, t, cnt)) {   // first condition by lmperez
            System.out.println("-");
            tmp = INF;
            for (i = pre[t]; i != -1; i = pre[u[i]]) {
                tmp = Math.min(tmp, cap[i]);
            }
            for (i = pre[t]; i != -1; i = pre[u[i]]) {
                cap[i] -= tmp;
                cap[i ^ 1] += tmp;
                cost += w[i];
            }
            flow += tmp;
            if (flow >= cnt) {
                break;  // by lmperez
            }
        }
    }

    static void addEdge(int a, int b, int co, int ca) {
        u[e] = a;
        v[e] = b;
        w[e] = co;
        cap[e] = ca;
        next[e] = last[a];
        last[a] = e++;
        u[e] = b;
        v[e] = a;
        w[e] = -co;
        cap[e] = 0;
        next[e] = last[b];
        last[b] = e++;
    }

    static void init() {
        e = 0;
        Arrays.fill(last, -1);
    }

    static boolean spac(int s, int t, int cnt) {
        int xx, yy, i;
        Arrays.fill(pre, -1);
        for (i = 0; i <= cnt; ++i) {
            d_mcmf[i] = INF;
        }
        d_mcmf[s] = 0;
        inq[s] = true;
        q_mcmf.push(s);
        while (!q_mcmf.isEmpty()) {
            xx = q_mcmf.pop();
            inq[xx] = false;
            for (i = last[xx]; i != -1; i = next[i]) {
                yy = v[i];
                if (cap[i] != 0 && d_mcmf[yy] > d_mcmf[xx] + w[i]) {
                    d_mcmf[yy] = d_mcmf[xx] + w[i];
                    pre[yy] = i;
                    if (!inq[yy]) {
                        inq[yy] = true;
                        q_mcmf.push(yy);
                    }
                }
            }
        }
        return d_mcmf[t] != INF;
    }

    static void runMCMF() {
        // ini
        MAXA = MAXV = 1000;
        u = new int[MAXA];
        v = new int[MAXA];
        w = new int[MAXA];
        cap = new int[MAXA];
        last = new int[MAXA];
        next = new int[MAXA];
        pre = new int[MAXV];
        d_mcmf = new int[MAXV]; //MAXV
        inq = new boolean[MAXV];           //MAXV
        q_mcmf = new LinkedList<>();

        init();
        addEdge(0, 1, 3, 10);
        addEdge(1, 3, 4, 10);
        addEdge(0, 3, 1, 10);
        addEdge(0, 2, 3, 10);
        addEdge(2, 3, 5, 10);
        mcmf(0, 3, 20);
//       solution : cost = 8, flow =  20

//        addEdge(0, 1, 8, 20);
//        addEdge(1, 4, 1, 10);
//        addEdge(0, 2, 4, 40);
//        addEdge(2, 4, 2, 20);
//        addEdge(0, 3, 1, 30);
//        addEdge(3, 4, 2, 60);
//        mcmf(0, 4, 31);     //      solution : cost = 9, flow =  50
        System.out.println("cost = " + cost + ", flow =  " + flow);
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
     * Combination Large Numbers
     * <pre>
     * [3] page.94
     * UVA Problem 369 - Combinations
     * UVA Problem 530 - Binomial Showdown
     *
     * C(N,K) means how many ways that N things can be taken K at a time.
     * This can be a great challenge when N and/or K become very large.
     * Combination of (N,K) is defined as:
     * N!
     * ----------
     * (N-K)!*K!
     * </pre>
     *
     * @param n number of elements
     * @param k number of partitions
     * @return the number of combinations
     */
    static BigInteger combinations(int n, int k) {
        BigInteger numerator = BigInteger.ONE, denominator = BigInteger.ONE, toMul, toDiv, nn, kk;
        if (k > n / 2) {
            k = n - k; /* use smaller k */

        }
        nn = new BigInteger("" + n);
        kk = new BigInteger("" + k);
        for (int i = k; i > 0; i--) {
            toMul = nn.subtract(kk).add(new BigInteger("" + i));
            toDiv = new BigInteger("" + i);
            Divbygcd(toMul, toDiv);
            /* always divide before multiply */
            Divbygcd(numerator, toDiv);
            Divbygcd(toMul, denominator);
            numerator = numerator.multiply(toMul);
            denominator = denominator.multiply(toDiv);
        }
        return numerator.divide(denominator);
    }

    static void Divbygcd(BigInteger a, BigInteger b) {
        BigInteger g = a.gcd(b);
        a = a.divide(g);
        b = b.divide(g);
    }

    /**
     * Combination with repeated objects
     * <pre>
     * [3] page.203
     * </pre>
     *
     * @param s array of letters
     * @return the number of combinations
     */
    static int combinationReapeatedObjects(char[] s) {
        int de[] = new int[300];
        int ss[] = new int[300];
        int l = s.length;
        int i, j = 0, pos;
        int c = 1, d = 1;
        for (i = 0; i < l; i++) {
            pos = s[i];
            ss[pos]++;
            if (ss[pos] > 1) {
                de[j++] = ss[pos];
            }
        }
        c = 1;
        for (i = 2; i <= l; i++) {
            c *= i;
            if (j > 0) {
                d *= de[--j];
            }
            if ((d != 1) && (Math.floorMod(c, d) == 0)) {
                c /= d;
                d = 1;
            }
        }
        return (int) c;
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
     * [1] page.356, [3] page.200
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
     * Postfix Notation
     * <pre>
     * [3] page.99
     * UVA Problem 727
     * O(n)
     * String infix = "4 * ( 1 + 2 * ( 9 / 3 )    - 5 )".replaceAll(" ", "");       ->      4 1 2 9 3 / * + 5 - *
     * [1] page.376
     * </pre>
     *
     * @params infix the infix notation
     * @return the postfix notation and the result
     */
    static String postfixNotation(String infix) {
        short precedence[] = new short[255];
        precedence['*'] = precedence['/'] = precedence['%'] = 2;
        precedence['+'] = precedence['-'] = 1;
        StringBuilder postfix = new StringBuilder();
        Stack<String> stack = new Stack<>();
        for (int i = 0; i < infix.length(); i++) {
            if (infix.charAt(i) == '(') {
                stack.add("(");
            } else if (isOperator(infix.charAt(i))) {
                while (!stack.isEmpty() && isOperator(stack.peek().charAt(0)) && precedence[stack.peek().charAt(0)] >= precedence[infix.charAt(i)]) {
                    postfix.append(stack.pop() + " ");
                }
                stack.add("" + infix.charAt(i));
            } else if (infix.charAt(i) == ')') {
                while (stack.peek().charAt(0) != '(') {
                    postfix.append(stack.pop() + " ");
                }
                stack.pop();
            } else {
                int number = infix.charAt(i++) - '0';
                while (i < infix.length() && Character.isDigit(infix.charAt(i))) {
                    number *= 10;
                    number += infix.charAt(i++) - '0';
                }
                postfix.append(number + " ");
                i--;
            }
        }
        while (!stack.isEmpty()) {
            postfix.append(stack.pop() + " ");
        }
        return postfix.toString().trim();
    }

    static double postfixCalculator(String postfix) {
        postfix = postfixNotation(postfix);
        StringTokenizer st = new StringTokenizer(postfix);
        Stack<Double> stack = new Stack<>();
        String aux;
        while (st.hasMoreTokens()) {
            aux = st.nextToken();
            if (isOperator(aux.charAt(0))) {
                double par2 = stack.pop();
                double temp = calcutatePostfix(stack.pop(), par2, aux.charAt(0));
                stack.add(temp);
            } else {
                stack.add(Double.parseDouble(aux));
            }
        }
        return stack.pop();
    }

    static boolean isOperator(char op) {
        switch (op) {
            case '*':
                return true;
            case '/':
                return true;
            case '%':
                return true;
            case '+':
                return true;
            case '-':
                return true;
        }
        return false;
    }

    static double calcutatePostfix(double a, double b, char op) {
        switch (op) {
            case '*':
                return a * b;
            case '/':
                return a / b;
            case '%':
                return a % b;
            case '+':
                return a + b;
            case '-':
                return a - b;
        }
        return 0;
    }

    static void runPostfix() {
        String infix = "4 * ( 1 + 2 * ( 9 / 3 )    - 5 )".replaceAll(" ", "");
        System.out.println(postfixNotation(infix));  //  4 1 2 9 3 / * + 5 - *       
        System.out.println(postfixCalculator(infix));   //     8.0

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
     *  [1] page.289, [3] page.173
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
     * [1] page.352, [3] page.172
     * UVA Problems 535, 10075
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
     * <pre>
     * [1] page.343
     * Given a set S of n points on a 2D plane, find two points
     * with the closest. Euclidean distance.
     * </pre>
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
     * Best Triangulation
     * <pre>
     * [7] page.3
     * Given a convex polygon v0v1 · · · vn−1, a triangulation is a way of picking n − 3 non-crossing diagonals so that the polygon is divided into n − 2 triangles.
     * The number of all possible triangulations can also be computed by dynamic programming, but we know it is the classical Catalan number
     * C(2n−4, n−2)/(n − 1).
     * </pre>
     *
     * @param AdjM adjacency matrix
     * @return the shortest triangulation distance
     */
    static double bestTriangulation(double[][] AdjM) {
        n = AdjM.length;
        double m[][] = new double[n][n];
        for (int len = 3; len < n; len++) {
            for (int a = 0; a + len < n; a++) {
                int b = a + len;
                m[a][b] = 1e+10;
                for (int c = a + 1; c < b; c++) {
                    double t = m[a][c] + m[c][b];
                    if (c > a + 1) {
                        t += AdjM[a][c];
                    }
                    if (c < b - 1) {
                        t += AdjM[c][b];
                    }
                    m[a][b] = Math.min(m[a][b], t);
                }
            }
        }
        return m[0][n - 1];
    }

    static void runBT() {
        n = 4;
        double AdjM[][] = new double[n][n];
        AdjM[0][1] = 4;
        AdjM[1][0] = 4;
        AdjM[0][2] = 5;
        AdjM[2][0] = 5;
        AdjM[1][2] = 3;
        AdjM[2][1] = 3;
        AdjM[1][3] = 11;
        AdjM[3][1] = 11;
        AdjM[2][3] = 9;
        AdjM[3][2] = 9;
        AdjM[3][0] = 9;
        AdjM[0][3] = 9;
        System.out.println(bestTriangulation(AdjM));        // 5.0
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
     * [1] page.210, [3] page.105
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
     * [1] page.201, [3] page.99
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
     * [1] page.212, [3] page.99
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
     * Factorial Frequencies O(n)
     * <pre>
     * [1], [3] page.194
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
     * Factorial Frequencies O(1)
     * <pre>
     * [1], [3] page.194
     *  How many digits in N factorials
     * </pre>
     *
     * @param n factorial
     * @return sum number of digits
     */
    static int factorialFrequenciesFast(long n) {
        if (n == 1) {
            return 1;
        }
        double num = Math.log(2.0 * Math.PI * n) / 2.0 + n * (Math.log(n) - 1.0);
        double den = Math.log(10);
        return (int) (Math.floor(num / den + 1.0));
    }

    /**
     * Factorial Trailing Zeros
     * <pre>
     * [3] page.195
     *  How many trailing zeros there are.
     * </pre>
     *
     * @param n factorial
     * @return amount of trailing zeros
     */
    static long trailingZeros(long N) {
        long c1 = zero(N, 2);
        long c2 = zero(N, 5);
        if (c1 < c2) {
            return c1;
        }
        return c2;
    }

    static long zero(long number, long factor) {
        long total, deno;
        if (number == 5) {
            return 1;
        }
        total = 0;
        deno = factor;
        while (deno < number) {
            total += number / deno;
            deno *= factor;
        }
        return total;
    }

    /**
     * Prime Factors
     * <pre>
     * [1] page.212, [3] page.102
     * UVA Problem 583
     *
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
     * [1] page.399
     * first test with Miller-Rabin’s in order to avoid a large prime
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
        sieve(100000001);
        ran = new Random();
        factores = new long[70];
        fFindFactor(10000001);   //750
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
     * [1] page.364, [2] page.98
     * UVA Problems 495, 10183, 10229, 10334, 10450, 10579
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
     * [1] page.365, [3] page.96, [5] page.48
     * UVA Problem 113 - Power of Cryptography
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
     * Big Mod (b^p % m)
     * <pre>
     * [3] page.196
     * </pre>
     *
     * @param b the base
     * @param p the power
     * @param m the module
     * @return the result of b^p % m
     */
    long bigmod(long b, long p, long m) {
        if (p == 0) {
            return 1;
        } else if (p % 2 == 0) {
            return square(bigmod(b, p / 2, m)) % m; // square(x) = x * x
        } else {
            return ((b % m) * bigmod(b, p - 1, m)) % m;
        }
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
     * <pre>
     * [1] , [3] page.94
     *  UVA Problem 10007 - Count the Trees - * n! -> number of trees + its permutations
     * UVA Problem 10303 - How Many Trees?
     * </pre>
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
     * - [3] Art of Programming Contest (Ahmed Shamsul Arefin - UVA)
     * - [4] MIT Press Introduction to Algorithms (2nd Edition)
     * - [5] Springer The Algorithm Design Manual (2nd Edition 2010)
     * - [6] Competitive Programmer’s Handbook (Antti Laaksonen Draft July 8, 2017)
     * - [7] The Hitchhiker’s Guide to the Programming Contests (Nite Nimajneb)
     *
     * </pre>
     * *********************************************************************************************
     */
}
