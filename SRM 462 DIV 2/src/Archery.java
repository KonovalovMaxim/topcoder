import java.util.*;
import java.math.*;

import static java.lang.Math.*;

public class Archery {

    public double expectedPoints(int N, int[] ringPoints) {
        double totalArea = Math.PI * ringPoints.length * ringPoints.length;
        double sum = 0.0;
        for (int i = 0; i < ringPoints.length; i++) {
            double prev = Math.PI * (i) * (i);
            double currentArea = (Math.PI * (i + 1) * (i + 1)) - prev;
            double points = currentArea / totalArea * ringPoints[i];
            sum += points;
        }
        return sum;
    }
}
