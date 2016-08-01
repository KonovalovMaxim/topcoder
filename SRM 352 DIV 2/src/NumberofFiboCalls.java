import java.util.*;
import java.math.*;

import static java.lang.Math.*;

public class NumberofFiboCalls {
    private int[] count = new int[2];

    public int[] fiboCallsMade(int n) {
        if (n == 0) {
            return new int[]{1, 0};
        }
        int a = 0;
        int b = 1;
        for (int i = 0; i < n - 1; i++) {
            int tmp = a + b;
            a = b;
            b = tmp;
        }
        int[] result = new int[2];
        result[0] = a;
        result[1] = b;
        return result;
    }

}
