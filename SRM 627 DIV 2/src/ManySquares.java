import java.util.*;
import java.math.*;
import java.util.stream.IntStream;

import static java.lang.Math.*;

public class ManySquares {

    public int howManySquares(int[] sticks) {
        int[] sticksCount = new int[IntStream.of(sticks).max().getAsInt() + 1];
        int squires = 0;
        for (int i = 0; i < sticks.length; i++) {
            sticksCount[sticks[i]]++;
            if (sticksCount[sticks[i]] >= 4) {
                squires++;
                sticksCount[sticks[i]] -= 4;
            }
        }
        return squires;
    }
}
