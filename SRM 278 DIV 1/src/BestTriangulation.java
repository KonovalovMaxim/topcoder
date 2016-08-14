import java.util.*;
import java.math.*;

import static java.lang.Math.*;

public class BestTriangulation {

    public double maxArea(String[] vertices) {
        ArrayList<Dot> dots = new ArrayList<>();
        for (int i = 0; i < vertices.length; i++) {
            String[] parsed = vertices[i].split(" ");
            dots.add(new Dot(Double.parseDouble(parsed[0]), Integer.parseInt(parsed[1]), i));
        }
        double max = 0.0;
        for (Dot first : dots) {
            for (Dot second : dots) {
                if (first.id == second.id) {
                    continue;
                }
                for (Dot third : dots) {
                    if (third.id == second.id || third.id == first.id) {
                        continue;
                    }
                    max = Math.max(area(first, second, third), max);
                }
            }
        }
        return max;
    }

    /**
     * Cross product of vectors
     * https://en.wikipedia.org/wiki/Cross_product
     * @param a
     * @param b
     * @param c
     * @return
     */
    private double area(Dot a, Dot b, Dot c) {
        return Math.abs((b.y - a.y) * (c.x - a.x) - (b.x - a.x) * (c.y - a.y)) / 2.0;
    }

}

class Dot {
    double x;
    double y;
    int id;

    public Dot(double x, double y, int id) {
        this.x = x;
        this.y = y;
        this.id = id;
    }
}
