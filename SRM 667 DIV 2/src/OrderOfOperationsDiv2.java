import java.util.Arrays;

public class OrderOfOperationsDiv2 {

    public int minTime(String[] s) {
        int fmask = 0;
        int n = s.length;
        int m = s[0].length();
        int[] masks = new int[n];
        for (int i = 0; i < s.length; i++) {
            for (int j = 0; j < s[i].length(); j++) {
                if (s[i].charAt(j) == '1') {
                    masks[i] |= (1 << j);
                }
                fmask |= masks[i];
            }
        }

        int[] dp = new int[1 << m];
        Arrays.fill(dp, 1 << 29);
        dp[0] = 0;
        for (int mask = 0; mask < 1 << m; mask++) {
            for (int i = 0; i < n; i++) {
                int nmask = mask | masks[i];
                int emask = nmask - mask;
                int k = Integer.bitCount(emask);
                dp[nmask] = Math.min(dp[nmask], dp[mask] + k * k);
            }
        }
        return dp[fmask];
    }

    private String getMinimalUnUsed(boolean[] usedCells, boolean[] usedCommands, String[] s) {
        int min = Integer.MAX_VALUE;
        int minIndex = -1;
        for (int i = 0; i < s.length; i++) {
            if (!usedCommands[i]) {
                int[] ones = indexOnes(s[i]);
                int power = 0;
                for (int j = 0; j < ones.length; j++) {
                    if (ones[j] == j && !usedCells[j]) {
                        power++;
                    }
                }
                if (power < min) {
                    min = power;
                    minIndex = i;
                }
            }
        }
        if (minIndex == -1) {
            return null;
        }
        usedCommands[minIndex] = true;
        return s[minIndex];
    }

    private int getNewCells(boolean[] usedCells, String s) {
        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            if (!usedCells[i] && s.charAt(i) == '1') {
                result++;
            }
        }
        return result;
    }

    public int[] indexOnes(String s) {
        int[] result = new int[s.length()];
        Arrays.fill(result, -1);
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1') {
                result[i] = i;
            }
        }
        return result;
    }
}
