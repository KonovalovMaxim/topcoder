import java.util.*;
import java.math.*;

import static java.lang.Math.*;

public class RecursiveFigures {

    public double getArea(int sideLength, int K) {
        double current = 0;
        double currentSideLength = (double) sideLength;
        for (int i = 0; i < K; i++) {
            double squareArea = currentSideLength * currentSideLength;
            double radius = currentSideLength / 2;
            double circleArea = Math.PI * radius * radius;
            if (i == 0) {
                current += circleArea;
            } else {
                current -= squareArea;
                current += circleArea;
            }
            currentSideLength = (2 * radius) / Math.sqrt(2);
        }
        return current;
    }
}
