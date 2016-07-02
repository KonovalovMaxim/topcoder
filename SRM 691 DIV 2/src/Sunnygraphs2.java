import java.util.*;

public class Sunnygraphs2 {

    private ArrayList<Integer> path;

    public long count(int[] a) {
        ArrayList<Integer> cycles = new ArrayList<>();
        boolean[] used = new boolean[a.length];
        for (int i = 0; i < a.length; i++) {
            if (!used[i]) {
                int y = a[i];
                boolean cycle = false;
                for (int j = 0; j < a.length; j++) {
                    if (y == i) {
                        cycle = true;
                    }
                    y = a[y];
                }
                if (cycle) {
                    used[i] = true;
                    int c = 1;
                    y = a[i];
                    while (y != i) {
                        c++;
                        used[y] = true;
                        y = a[y];
                    }
                    cycles.add(c);
                }
            }
        }
        int noncycles = a.length - cycles.stream().mapToInt(i -> i).sum();
        long result = (long) Math.pow(2, noncycles);

        for (Integer i : cycles) {
            result *= ((Math.pow(2, i)) - 1);
        }
        if (cycles.size() == 1) {
            result++;
        }
        return result;
    }
}
