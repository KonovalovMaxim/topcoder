import java.util.*;
import java.math.*;

import static java.lang.Math.*;

public class WidgetRepairs {

    public int days(int[] arrivals, int numPerDay) {
        int result = 0;
        int remaining = 0;
        for (int i = 0; i < arrivals.length; i++) {
            if (arrivals[i] == 0 && remaining == 0) {
                continue;
            }
            remaining = max((arrivals[i] + remaining) - numPerDay, 0);
            result++;
        }
        result += Math.ceil((float) remaining / (float) numPerDay);
        return result;
    }
}
