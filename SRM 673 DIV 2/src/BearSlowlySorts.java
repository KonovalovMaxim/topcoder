import java.util.*;
import java.math.*;

import static java.lang.Math.*;

public class BearSlowlySorts {

    public int minMoves(int[] w) {
        if (isSorted(w)) {
            return 0;
        }
        int first = w[0];
        int last = w[w.length - 1];
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < w.length; i++) {
            max = Math.max(max, w[i]);
            min = Math.min(min, w[i]);
        }
        if (first == max && last == min) {
            return 3;
        }
        if (first == min || last == max) {
            return 1;
        }
        return 2;
    }

    private boolean isSorted(int[] data) {
        for (int i = 1; i < data.length; i++) {
            if (data[i - 1] > data[i]) {
                return false;
            }
        }
        return true;
    }
}
