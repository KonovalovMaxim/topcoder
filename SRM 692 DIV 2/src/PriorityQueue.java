import java.util.*;
import java.math.*;

import static java.lang.Math.*;

public class PriorityQueue {

    public int findAnnoyance(String S, int[] a) {
        int sum = 0;
        int displasureIndex = 0;
        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) == 'b') {
                sum += displasureIndex;
                displasureIndex += a[i];
            } else {
                displasureIndex += a[i];
            }
        }
        return sum;
    }
}
