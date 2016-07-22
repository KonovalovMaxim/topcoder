import java.util.*;
import java.math.*;

import static java.lang.Math.*;

public class UnderscoreJustification {

    public String justifyLine(String[] words, int width) {
        int totalLettersCount = 0;
        for (int i = 0; i < words.length; i++) {
            totalLettersCount += words[i].length();
        }
        int spacesCount = width - totalLettersCount;
        int avg = (int) Math.floor((double) spacesCount / (double) (words.length - 1));
        int excess = spacesCount - (words.length - 1) * avg;
        String result = "";

        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            if (result.isEmpty()) {
                result = word;
            } else {
                for (int j = 0; j < avg; j++) {
                    result += "_";
                }
                if ((excess > 0 && (result + word.charAt(0)).compareTo(result + "_") > 0) || words.length - i <= excess) {
                    result += "_";
                    excess--;
                }
                result += word;
            }
        }
        return result;
    }
}
