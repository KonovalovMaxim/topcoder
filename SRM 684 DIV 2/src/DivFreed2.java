import java.util.*;
import java.math.*;

import static java.lang.Math.*;

public class DivFreed2 {

    public int count(int n, int k) {
        if(n==1) {
            return k;
        }
        if(k==1){
            return 1;
        }
        if (n == 1) {
            return n % 1000000007;
        }
        int[][] matrix = new int[n + 1][k + 1];
        for (int i = 0; i <= k; i++) {
            matrix[0][i] = 1;
        }
        for (int t = 1; t <= n; t++) {
            for (int i = 1; i < k + 1; i++) {
                matrix[t][i] = 0;
                for (int j = 1; j < k + 1; j++) {
                    if (j<=i || j % i != 0) {
                        matrix[t][i] = matrix[t][i] + matrix[t-1][j];
                    }
                }
            }
        }
        return matrix[n][k] % 1000000007;
    }
}
