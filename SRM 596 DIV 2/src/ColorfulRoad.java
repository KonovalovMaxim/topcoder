import java.util.*;
import java.math.*;

import static java.lang.Math.*;

public class ColorfulRoad {
    private String road;

    public int getMin(String road) {
        this.road = road;
        return dp();
    }

    public int recursive(char currentColor, int currentPosition) {
        if (currentPosition == road.length() - 1) {
            return 0;
        }
        int min = this.road.length() * this.road.length();
        char next = getNextColor(currentColor);
        for (int i = currentPosition + 1; i < road.length(); i++) {
            if (next == road.charAt(i)) {
                int currentCost = ((i - currentPosition) * (i - currentPosition));
                int nextValue = recursive(next, i);
                min = Math.min(currentCost + nextValue, min);
            }
        }
        return min;
    }

    private int dp() {
        int[] dp = new int[road.length()];
        int max = road.length() * road.length();
        Arrays.fill(dp, max);
        dp[0] = 0;
        for (int i = 0; i < road.length(); i++) {
            char next = getNextColor(road.charAt(i));
            for (int j = i + 1; j < road.length(); j++) {
                if (road.charAt(j) == next) {
                    int currentCost = (j-i) * (j-i);
                    dp[j] = Math.min(currentCost + dp[i], dp[j]);
                }
            }
        }
        if (dp[dp.length - 1] == max) {
            return -1;
        } else {
            return dp[dp.length - 1];
        }
    }

    private char getNextColor(char current) {
        switch (current) {
            case 'R':
                return 'G';
            case 'G':
                return 'B';
            case 'B':
                return 'R';
        }
        return 'R';
    }
}
