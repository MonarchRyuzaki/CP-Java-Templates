import java.util.ArrayList;
import java.util.Collections;

public class Sort {
    // Sort
    public static void sort(long[] arr) {
        // because Arrays.sort() uses quicksort which is dumb
        // Collections.sort() uses merge sort
        ArrayList<Long> ls = new ArrayList<Long>();
        for (long x : arr)
            ls.add(x);
        Collections.sort(ls);
        for (int i = 0; i < arr.length; i++)
            arr[i] = ls.get(i);
    }
}
