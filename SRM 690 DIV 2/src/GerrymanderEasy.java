import java.util.*;
import java.math.*;

import static java.lang.Math.*;

public class GerrymanderEasy {

    public double getmax(int[] A, int[] B, int K) {
        double max = 0;
        if (A.length == 1) {
            return (double) B[0] / (double) A[0];
        }
        for (int window = K - 1; window <= A.length; window++) {
            for (int position = 0; position < A.length - window; position++) {
                double a = 0.0;
                double b = 0.0;
                for (int i = position; i <= window + position; i++) {
                    a += A[i];
                    b += B[i];
                }
                max = Math.max(max, b / a);
            }
        }
        return max;
    }
}
