import java.security.PublicKey;
import java.util.*;
import java.math.*;
import java.util.regex.Matcher;

import static java.lang.Math.*;

public class IsItASquare {

    public String isSquare(int[] x, int[] y) {
        ArrayList<Dot> dots = new ArrayList<>();
        for (int i = 0; i < x.length; i++) {
            dots.add(new Dot(x[i], y[i]));
        }
        ArrayList<Line> lines = new ArrayList<>();
        for (int i = 0; i < dots.size(); i++) {
            for (int j = 0; j < dots.size(); j++) {
                if (i != j) {
                    lines.add(new Line(dots.get(i), dots.get(j)));
                }
            }
        }
        int countOfPerpendiculars = 0;
        for (int i = 0; i < lines.size(); i++) {
            for (int j = i + 1; j < lines.size(); j++) {
                if (lines.get(i).getVector().isPerpendicular(lines.get(j).getVector())) {
                    countOfPerpendiculars++;
                }
            }
        }
        if (countOfPerpendiculars == 20) {
            return "It's a square";
        } else {
            return "Not a square";
        }
    }
}

class Line {
    Dot first;
    Dot second;

    public Line(Dot first, Dot second) {
        this.first = first;
        this.second = second;
    }

    public Vector getVector() {
        return new Vector(this.first.x - this.second.x, this.first.y - this.second.y);
    }
}

class Vector {
    int x;
    int y;

    public Vector(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public boolean isPerpendicular(Vector vector) {
        return this.x * vector.x + this.y * vector.y == 0;
    }
}

class Dot {
    int x;
    int y;

    public Dot(int x, int y) {
        this.x = x;
        this.y = y;
    }
}