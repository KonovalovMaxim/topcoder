import java.util.*;
import java.math.*;

import static java.lang.Math.*;

public class BusSeating {

    public double getArrangement(String leftRow, String rightRow) {
        ArrayList<Dot> dots = new ArrayList<>();
        int id = 0;
        for (int i = 0; i < leftRow.length(); i++) {
            if (leftRow.charAt(i) == '-') {
                dots.add(new Dot(i, 0, ++id));
            }
            if (rightRow.charAt(i) == '-') {
                dots.add(new Dot(i, 2, ++id));
            }
        }
        double min = Double.MAX_VALUE;
        for (Dot first : dots) {
            for (Dot second : dots) {
                if (first.id == second.id) {
                    continue;
                }
                for (Dot third : dots) {
                    if (third.id == first.id || third.id == second.id) {
                        continue;
                    }
                    min = Math.min(min, getEuclideanDistance(first, second) + getEuclideanDistance(first, third) + getEuclideanDistance(third, second));
                }
            }
        }

        return min;
    }

    private double getEuclideanDistance(Dot a, Dot b) {
        double dx = a.x - b.x;
        double dy = a.y - b.y;
        return Math.sqrt(dx * dx + dy * dy);
    }
}


class Dot {
    int x;
    int y;
    int id;

    Dot(int x, int y, int id) {
        this.x = x;
        this.y = y;
        this.id = id;
    }
}

