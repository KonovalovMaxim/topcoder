import java.util.ArrayList;
import java.util.Arrays;

public class RGBStreet {

    int[][] houses;
    int[][] cache;

    public int estimateCost(String[] houses) {
        this.houses = new int[houses.length][3];
        this.cache = new int[houses.length][3];
        for (int i = 0; i < cache.length; i++) {
            Arrays.fill(cache[i], Integer.MAX_VALUE);
        }
        for (int i = 0; i < houses.length; i++) {
            String[] data = houses[i].split(" ");
            this.houses[i][0] = Integer.parseInt(data[0]);
            this.houses[i][1] = Integer.parseInt(data[1]);
            this.houses[i][2] = Integer.parseInt(data[2]);
        }

        int min = Integer.MAX_VALUE;
        for (int i = 0; i < 3; i++) {
            int current = f(i, 1) + this.houses[0][i];
            min = Math.min(current, min);
        }
        return min;
    }

    public int f(int cost, int num) {
        if (num >= houses.length) {
            return 0;
        }
        if (cache[num][cost] != Integer.MAX_VALUE) {
            return cache[num][cost];
        }
        for (int i = 0; i < 3; i++) {
            if (i != cost) {
                cache[num][cost] = Math.min(cache[num][cost], houses[num][i] + f(i, num + 1));
            }
        }
        return cache[num][cost];
    }
}
