import java.util.*;
import java.math.*;

import static java.lang.Math.*;

public class PirateTreasure {

    public double getDistance(int[] steps, String[] directions) {
        double x = 0;
        double y = 0;
        for (int i = 0; i < directions.length; i++) {
            double a = Math.sqrt((double) (steps[i] * steps[i]) / 2);
            switch (directions[i]) {
                case "NORTH":
                    y += steps[i];
                    break;
                case "SOUTH":
                    y -= steps[i];
                    break;
                case "WEST":
                    x -= steps[i];
                    break;
                case "EAST":
                    x += steps[i];
                    break;
                case "NORTHWEST":
                    x -= a;
                    y += a;
                    break;
                case "NORTHEAST":
                    x += a;
                    y += a;
                    break;
                case "SOUTHWEST":
                    x -= a;
                    y -= a;
                    break;
                case "SOUTHEAST":
                    x += a;
                    y -= a;
                    break;
            }
        }
        return Math.sqrt(x * x + y * y);
    }
}
