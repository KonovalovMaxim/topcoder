import java.util.*;
import java.math.*;

import static java.lang.Math.*;

public class CombiningSlimes {

    public int maxMascots(int[] a) {
        Arrays.sort(a);
        int mascots = 0;
        while (a.length > 1) {
            mascots += a[0] * a[a.length - 1];
            a = this.merge(0, a.length - 1, a);
        }
        return mascots;
    }

    private int[] merge(int first, int second, int[] a) {
        int[] result = new int[a.length - 1];
        int counter = 0;
        for (int i = 0; i < a.length; i++) {
            if (i != first && i != second) {
                result[counter] = a[i];
                counter++;
            }
        }
        result[a.length - 2] = a[first] + a[second];
        Arrays.sort(result);
        return result;
    }

}
