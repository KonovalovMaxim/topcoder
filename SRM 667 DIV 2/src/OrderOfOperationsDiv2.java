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
}
