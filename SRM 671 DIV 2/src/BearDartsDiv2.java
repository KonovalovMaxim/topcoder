import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.*;

public class BearDartsDiv2 {

    public long count(int[] w) {
        int count = 0;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < w.length; i++) {
            max = Math.max(max, w[i]);
        }
        int[] counts = new int[max + 1];
        Arrays.fill(counts, 0);
        long result = 0;
        for (int c = 2; c < w.length; c++) {
            result += counts[w[c]];
            for (int a = 0; a < c - 1; a++) {
                for (int b = a + 1; b < c; b++) {
                    long p = (long) w[c] * w[b] * w[a];
                    if (p <= max) {
                        counts[(int) p]++;
                    }
                }
            }
        }
        return result;
    }
}
