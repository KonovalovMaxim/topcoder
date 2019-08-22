import java.util.*;
import java.math.*;

import static java.lang.Math.*;

public class Bonuses {

    public int[] getDivision(int[] points) {
        float total = 0;
        for (int i = 0; i < points.length; i++) {
            total += points[i];
        }
        Employee[] employees = new Employee[points.length];
        float totalRest = 0;
        for (int i = 0; i < points.length; i++) {
            float share = (float) points[i] / total * 100;
            int intshare = (int) share;
            float rest = share - intshare;
            employees[i] = new Employee(i, points[i], intshare);
            totalRest += rest;
        }

        Arrays.sort(employees);
        for (int i = 0; i < (int) totalRest; i++) {
            employees[i].addBonus();
        }

        int[] result = new int[points.length];
        for (int i = 0; i < points.length; i++) {
            result[employees[i].position] = employees[i].bonus;
        }
        return result;
    }

}

class Employee implements Comparable {
    public int position = 0;
    public int points = 0;
    public int bonus = 0;

    public Employee(int position, int points, int bonus) {
        this.position = position;
        this.points = points;
        this.bonus = bonus;
    }

    public void addBonus() {
        this.bonus += 1;
    }

    @Override
    public int compareTo(Object o) {
        if (this.bonus < ((Employee) o).bonus) {
            return 1;
        } else if (this.bonus > ((Employee) o).bonus) {
            return -1;
        } else {
            if (this.points < ((Employee) o).points) {
                return 1;
            } else if (this.points > ((Employee) o).points) {
                return -1;
            } else {
                if (this.position < ((Employee) o).position) {
                    return -1;
                } else {
                    return 1;
                }
            }
        }
    }
}