import java.awt.geom.Area;
import java.util.*;
import java.math.*;

import static java.lang.Math.*;

public class BearPaints {

    public long maxArea(int W, int H, long M) {
        long max = 0;
        for (long i = W; i > 0; i--) {
            long otherSide = (M / i);
            otherSide = Math.min(otherSide, H);
            max = Math.max(max, i * otherSide);
        }
        return max;
    }
}
