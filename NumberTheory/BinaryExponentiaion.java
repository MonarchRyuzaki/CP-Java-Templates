// package NumberTheory;

public class BinaryExponentiaion {
    // Binary Exponentiation -> a^b
    public static long power(long a, long b) {
        if (b == 0)
            return 1;
        long res = power(a, b / 2);
        if (b % 2 == 1)
            return res * res * a;
        else
            return res * res;
    }
}
