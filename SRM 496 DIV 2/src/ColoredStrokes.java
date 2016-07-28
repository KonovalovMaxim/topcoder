import java.util.*;
import java.math.*;

import static java.lang.Math.*;

public class ColoredStrokes {

    public int getLeast(String[] picture) {
        int linesCount = 0;
        //count horizontal lines
        for (int i = 0; i < picture.length; i++) {
            if (picture[i].charAt(0) == 'R' || picture[i].charAt(0) == 'G') {
                linesCount++;
            }
            for (int j = 1; j < picture[i].length(); j++) {
                boolean condition =
                        (picture[i].charAt(j - 1) == '.' || picture[i].charAt(j - 1) == 'B') &&
                                (picture[i].charAt(j) == 'R' || picture[i].charAt(j) == 'G');
                if (condition) {
                    linesCount++;
                }
            }
        }
        //count vertical lines
        for (int i = 0; i < picture[0].length(); i++) {
            if (picture[0].charAt(i) == 'B' || picture[0].charAt(i) == 'G') {
                linesCount++;
            }
            for (int j = 1; j < picture.length; j++) {
                boolean condition =
                        (picture[j - 1].charAt(i) == '.' || picture[j - 1].charAt(i) == 'R') &&
                                (picture[j].charAt(i) == 'B' || picture[j].charAt(i) == 'G');
                if (condition) {
                    linesCount++;
                }
            }
        }
        return linesCount;
    }
}
