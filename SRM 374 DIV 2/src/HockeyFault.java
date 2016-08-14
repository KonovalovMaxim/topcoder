import java.util.*;
import java.math.*;

import static java.lang.Math.*;

public class HockeyFault {

    public int numPlayers(int width, int height, int x, int y, int[] px, int[] py) {
        int counter = 0;
        double radius = height / 2.0;
        for (int i = 0; i < px.length; i++) {
            double x1 = px[i];
            double y1 = py[i];
            if (x1 >= x && x1 <= width + x && y1 >= y && y1 <= y + height) {
                counter++;
            } else if (x1 < x && y1 <= y + height && y1 >= y) {
                double x2 = x;
                double y2 = y + radius;
                if (getDistance(x1, y1, x2, y2) <= radius * radius) {
                    counter++;
                }
            } else if (x1 > x + width && y1 <= y + height && y1 >= y) {
                double x2 = x + width;
                double y2 = y + radius;
                if (getDistance(x1, y1, x2, y2) <= radius * radius) {
                    counter++;
                }
            }
        }
        return counter;
    }

    private double getDistance(double x1, double y1, double x2, double y2) {
        double dx = x2 - x1;
        double dy = y2 - y1;
        return dx * dx + dy * dy;
    }
}
