import java.util.*;
import java.math.*;

import static java.lang.Math.*;

public class TrafficCongestionDivTwo {

    public long theMinCars(int treeHeight) {
        long[] dp = new long[treeHeight + 3];
        dp[0] = 1;
        dp[1] = 1;
        for (int i = 2; i <= treeHeight; i++) {
            dp[i] = 1;
            for (int j = 0; j <= i - 2; j++) {
                dp[i] += 2 * dp[j];
            }
        }
        return dp[treeHeight];
    }
}
