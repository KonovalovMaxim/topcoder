import java.util.Objects;

public class LiveConcert {

    public int maxHappiness(int[] h, String[] s) {
        boolean[] used = new boolean[s.length];
        int result = 0;
        for (int i = 0; i < s.length; i++) {
            int index = getMaxIndex(h, used);
            if (index == -1) {
                return result;
            }
            result += h[index];
            String singer = s[index];
            for (int j = 0; j < h.length; j++) {
                if (Objects.equals(s[j], singer)) {
                    used[j] = true;
                }
            }
        }
        return result;
    }

    private int getMaxIndex(int[] songs, boolean[] used) {
        int max = 0;
        int maxindex = -1;
        for (int i = 0; i < songs.length; i++) {
            if (!used[i] && songs[i] > max) {
                max = songs[i];
                maxindex = i;
            }
        }
        return maxindex;
    }
}
