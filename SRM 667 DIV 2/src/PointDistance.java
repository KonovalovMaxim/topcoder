import java.util.*;
import java.math.*;

import static java.lang.Math.*;

public class PointDistance {

    public int[] findPoint(int x1, int y1, int x2, int y2) {
        int[] result = new int[2];
        for (int i = -100; i <= 100; i++) {
            int first = Math.abs(x1 - i);
            int second = Math.abs(x2 - i);
            if (first > second && i != x1 && i != x2) {
                result[0] = i;
                break;
            }
        }
        for (int i = -100; i <= 100; i++) {
            int first = Math.abs(y1 - i);
            int second = Math.abs(y2 - i);
            if (first > second && i != y1 && i != y2) {
                result[1] = i;
                break;
            }
        }
        return result;
    }
}
