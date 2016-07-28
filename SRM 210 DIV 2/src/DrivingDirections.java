import java.util.*;
import java.math.*;

import static java.lang.Math.*;

public class DrivingDirections {

    public String[] reverse(String[] directions) {
        String[] result = new String[directions.length];
        for (int i = directions.length - 1; i >= 0; i--) {
            int onPosition = directions[i].indexOf(" on ") + 4;
            String street = directions[i].substring(onPosition);
            int index = directions.length - 1 - i;
            if (i == directions.length - 1) {
                result[index] = "Start on " + street;
            } else if (getDirection(directions[i + 1]) == 1) {
                result[index] = "Turn LEFT on " + street;
            } else if (getDirection(directions[i + 1]) == 0) {
                result[index] = "Turn RIGHT on " + street;
            } else if (getDirection(directions[i + 1]) == 2 && directions.length > 1) {
                if (getDirection(directions[i + 1]) == 0) {
                    result[index] = "Turn RIGHT on " + street;
                } else {
                    result[index] = "Turn LEFT on " + street;
                }
            }
        }
        return result;
    }

    /**
     * 0-left
     * 1-right
     * 2-start
     */
    private int getDirection(String command) {
        String[] data = command.split(" ");
        if (data[0].equals("Start")) {
            return 2;
        }
        if (data[1].equals("LEFT")) {
            return 0;
        }
        return 1;
    }
}
