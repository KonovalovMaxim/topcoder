import java.util.*;
import java.math.*;

import static java.lang.Math.*;

public class YahtzeeScore {

    public int maxPoints(int[] toss) {
        int[] map = new int[6];
        for (int i = 0; i < toss.length; i++) {
            map[toss[i] - 1] += toss[i];
        }
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < map.length; i++) {
            if (max < map[i]) {
				max = map[i];
            }
        }
        return max;
    }
}
