import java.util.*;
import java.math.*;

import static java.lang.Math.*;

public class LeaguePicks {

    public int[] returnPicks(int position, int friends, int picks) {
        ArrayList<Integer> result = new ArrayList<>();
        if (position <= picks) {
            result.add(position);
        }
        int prevPick = position;
        boolean direction = true;
        do {
            int currentPick = 0;
            if (direction) {
                currentPick = (friends - position) * 2 + 1;
            } else {
                currentPick = (position) * 2 -1;
            }
            prevPick += currentPick;
            if (prevPick > picks) break;
            result.add(prevPick);
            direction = !direction;
        } while (prevPick <= picks);
        return result.stream().mapToInt(i -> i).toArray();
    }
}
