// package NumberTheory;
public class Sieve {
    // Sieve Code
    static int sieveSize = 100;
    static int spf[] = new int[sieveSize + 1];
    public static void sieve(){
        for (int i = 0; i <= sieveSize; i++) spf[i] = i;
        for (int i=2; i*i <= sieveSize; i++) {
            if (spf[i] == i){
                for (int j = i*i; j<=sieveSize; j+=i){
                    if (spf[j] == j){
                        spf[j] = i;
                    }
                }
            }
        }
        //For Some if spf[idx] = idx it is prime 
        //Finding Prime Factors
        int x = 24;
        while (x != 1){
            System.out.print(spf[x] + "");
            x = x/spf[x];
        }
    }
}
