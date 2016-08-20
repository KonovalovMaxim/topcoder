import java.lang.reflect.Array;
import java.util.*;
import java.math.*;
import java.util.stream.IntStream;

import static java.lang.Math.*;

public class TheNewHouseDivTwo {

    public int count(int[] x, int[] y) {
        int minx = Integer.MAX_VALUE;
        int maxx = Integer.MIN_VALUE;
        for (int i = 0; i < x.length; i++) {
            minx = Math.min(x[i], minx);
            maxx = Math.max(x[i], maxx);
        }
        int miny = Integer.MAX_VALUE;
        int maxy = Integer.MIN_VALUE;
        for (int i = 0; i < y.length; i++) {
            miny = Math.min(y[i], miny);
            maxy = Math.max(y[i], maxy);
        }

        int counter = 0;
        for (int i = minx; i <= maxx; i++) {
            for (int j = miny; j <= maxy; j++) {
                boolean up = false, down = false, left = false, right = false;
                for (int n = 0; n < x.length; n++) {
                    if (y[n] > j && x[n] == i) {
                        up = true;
                    }
                    if (y[n] < j && x[n] == i) {
                        down = true;
                    }
                    if (x[n] > i && y[n] == j) {
                        left = true;
                    }
                    if (x[n] < i && y[n] == j) {
                        right = true;
                    }
                }
                if (up && down && right && left) {
                    counter++;
                }
            }
        }
        return counter;
    }
}

