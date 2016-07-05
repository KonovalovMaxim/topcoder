import java.util.*;
import java.math.*;

import static java.lang.Math.*;

public class PlaneGame {

    public int bestShot(int[] x, int[] y) {
        if (x.length <= 2) {
            return x.length;
        }
        int n = x.length;
        int res = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i != j) {
                    long firstLineX = x[j] - x[i];
                    long firstLineY = y[j] - y[i];

                    for (int k = 0; k < n; k++) {
                        int counter = 0;
                        if (i != k && j != k) {
                            for (int r = 0; r < n; r++) {
                                long secondLineX = x[r] - x[i];
                                long secondLineY = y[r] - y[i];
                                if (firstLineY * secondLineX == secondLineY * firstLineX) {
                                    counter++;
                                } else {
                                    secondLineX = x[r] - x[k];
                                    secondLineY = y[r] - y[k];
                                    if (firstLineY * secondLineY == -secondLineX * firstLineX) {
                                        counter++;
                                    }
                                }
                            }
                        }
                        res = Math.max(res, counter);
                    }
                }
            }
        }
        return res;
    }
}
