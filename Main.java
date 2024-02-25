import static java.lang.Math.max; // Allows max(a,b) without Math. part
import static java.lang.Math.min;
import static java.lang.Math.abs;
import java.io.*;
import java.util.*;

public class Main {
    static final int INF = Integer.MAX_VALUE / 2;
    static final int MOD = 1_000_000_007;
    static FastScanner infile = new FastScanner();

    public static void solve() {

    }

    public static void main(String[] args) {
        // --------------Personal Notes-------------
        // 1. LONG LEKE KAROOOOO
        // 2. Upper bound of val => first element greater than val
        // 3. Lower bound of val => first element greater than or equal to val
        // 4. (% 2**x) is same as & (2**x - 1) as this gives last x bits of the number 0
        // to x-1
        // 5. N = p^a q^b r^c then number of divisors of N = (a+1)(b+1)(c+1)
        // Inputs :
        // nextInt() -> Integer, 
        // nextInts() -> Integer array
        // nextIntArr() -> Integer 2D array
        int T = infile.nextInt();
        while (T-- > 0) {
            solve();
        }
    }

    static class Pair<K, V> {
        K first;
        V second;

        public Pair(K first_value, V second_value) {
            first = first_value;
            second = second_value;
        }
    }
}

class FastScanner {
    // I don't understand how this works lmao
    private int BS = 1 << 16;
    private char NC = (char) 0;
    private byte[] buf = new byte[BS];
    private int bId = 0, size = 0;
    private char c = NC;
    private double cnt = 1;
    private BufferedInputStream in;

    public FastScanner() {
        in = new BufferedInputStream(System.in, BS);
    }

    public FastScanner(String s) {
        try {
            in = new BufferedInputStream(new FileInputStream(new File(s)), BS);
        } catch (Exception e) {
            in = new BufferedInputStream(System.in, BS);
        }
    }

    private char getChar() {
        while (bId == size) {
            try {
                size = in.read(buf);
            } catch (Exception e) {
                return NC;
            }
            if (size == -1)
                return NC;
            bId = 0;
        }
        return (char) buf[bId++];
    }

    public int nextInt() {
        return (int) nextLong();
    }

    public int[] nextInts(int N) {
        int[] res = new int[N];
        for (int i = 0; i < N; i++) {
            res[i] = (int) nextLong();
        }
        return res;
    }

    public long[] nextLongs(int N) {
        long[] res = new long[N];
        for (int i = 0; i < N; i++) {
            res[i] = nextLong();
        }
        return res;
    }

    public long nextLong() {
        cnt = 1;
        boolean neg = false;
        if (c == NC)
            c = getChar();
        for (; (c < '0' || c > '9'); c = getChar()) {
            if (c == '-')
                neg = true;
        }
        long res = 0;
        for (; c >= '0' && c <= '9'; c = getChar()) {
            res = (res << 3) + (res << 1) + c - '0';
            cnt *= 10;
        }
        return neg ? -res : res;
    }

    public double nextDouble() {
        double cur = nextLong();
        return c != '.' ? cur : cur + nextLong() / cnt;
    }

    public double[] nextDoubles(int N) {
        double[] res = new double[N];
        for (int i = 0; i < N; i++) {
            res[i] = nextDouble();
        }
        return res;
    }

    public String next() {
        StringBuilder res = new StringBuilder();
        while (c <= 32)
            c = getChar();
        while (c > 32) {
            res.append(c);
            c = getChar();
        }
        return res.toString();
    }

    public String nextLine() {
        StringBuilder res = new StringBuilder();
        while (c <= 32)
            c = getChar();
        while (c != '\n') {
            res.append(c);
            c = getChar();
        }
        return res.toString();
    }

    public boolean hasNext() {
        if (c > 32)
            return true;
        while (true) {
            c = getChar();
            if (c == NC)
                return false;
            else if (c > 32)
                return true;
        }
    }

    public int[][] nextIntArr(int row, int col) {
        int inp[][] = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                inp[i][j] = nextInt();
            }
        }
        return inp;
    }

    public long[][] nextLongArr(int row, int col) {
        long inp[][] = new long[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                inp[i][j] = nextLong();
            }
        }
        return inp;
    }

    public char[] nextChars(int N) {
        char[] res = new char[N];
        for (int i = 0; i < N; i++) {
            res[i] = getChar();
        }
        return res;
    }

    public char[][] nextCharArr(int row, int col) {
        char[][] inp = new char[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                inp[i][j] = getChar();
            }
        }
        return inp;
    }
}
