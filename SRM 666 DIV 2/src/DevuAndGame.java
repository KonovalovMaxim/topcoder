import java.util.*;
import java.math.*;

import static java.lang.Math.*;

public class DevuAndGame {

    public String canWin(int[] nextLevel) {
        boolean[] visited = new boolean[nextLevel.length];
        int location = 0;
        while (location != -1) {
            if (visited[location]) {
                return "Lose";
            }
            visited[location] = true;
            location = nextLevel[location];
        }
        return "Win";
    }
}
