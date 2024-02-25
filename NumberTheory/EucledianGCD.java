// package NumberTheory;

public class EucledianGCD {
    // Eucledian GCD
    // LCM * GCD = A*B
    public static long findGcd(long a, long b) {
        if (b == 0)
            return a;
        return findGcd(b, a % b);
    }
}
