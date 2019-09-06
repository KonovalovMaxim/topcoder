import java.util.*;
import java.math.*;

import static java.lang.Math.*;

public class Salary {

    public int howMuch(String[] arrival, String[] departure, int wage) {
        int workingTimeSec = 0;
        for (int i = toSeconds("06:00:00"); i <= toSeconds("17:59:59"); i++) {
            for (int j = 0; j < arrival.length; j++) {
                if (i >= toSeconds(arrival[j]) && i <= toSeconds(departure[j])) {
                    workingTimeSec++;
                    break;
                }
            }
        }
        int allWorkingTime = 0;
        for (int i = 0; i < arrival.length; i++) {
            allWorkingTime += toSeconds(departure[i]) - toSeconds(arrival[i]);
        }
        int overtime = allWorkingTime - workingTimeSec;
        double salary = (((double) workingTimeSec + ((double) overtime * 1.5d)) / 60d / 60d) * (double)wage;
        return (int) floor(salary);
    }

    public int toSeconds(String time) {
        int result = 0;
        String[] parts = time.split(":");
        result += Integer.parseInt(parts[0]) * 60 * 60;
        result += Integer.parseInt(parts[1]) * 60;
        result += Integer.parseInt(parts[2]);
        return result;
    }
}
