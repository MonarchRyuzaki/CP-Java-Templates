// package NumberTheory;
import java.util.ArrayList;

public class PrimeFactorization {
    // Prime Factorize O(sqrt(N))
    public static void primeFactorize(long n) {
        ArrayList<Long> factors = new ArrayList<>();
        for (long i = 2; i * i <= n; i++) {
            while (n % i == 0) {
                factors.add(i);
                n = n / i;
            }
        }
        if (n > 1) {
            factors.add(n);
        }
    }
}
