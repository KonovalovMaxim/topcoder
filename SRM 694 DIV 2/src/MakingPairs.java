import java.util.*;
import java.math.*;

import static java.lang.Math.*;

public class MakingPairs {

    public int get(int[] card) {
        int result = 0;
        for (int i = 0; i < card.length; i++) {
            result += card[i] / 2;
        }
        return result;
    }
}
