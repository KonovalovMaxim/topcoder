import java.util.*;
import java.math.*;

import static java.lang.Math.*;

public class Cdgame {

    public int rescount(int[] a, int[] b) {
        long sumA = 0;
        for (int i = 0; i < a.length; i++) {
            sumA += a[i];
        }

        long sumB = 0;
        for (int i = 0; i < b.length; i++) {
            sumB += b[i];
        }
        ArrayList<Long> results = new ArrayList<>();
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                long mult = (sumA - a[i] + b[j]) * (sumB - b[j] + a[i]);
                if (!results.contains(mult)) {
                    results.add(mult);
                }
            }
        }
        return results.size();
    }
}
