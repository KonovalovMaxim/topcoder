import java.util.*;
import java.math.*;

import static java.lang.Math.*;

public class Aaagmnrs {

    public String[] anagrams(String[] phrases) {
        ArrayList<Integer> exclude = new ArrayList<>();
        for (int i = 0; i < phrases.length; i++) {
            for (int j = i + 1; j < phrases.length; j++) {
                if (isAnagram(phrases[i], phrases[j]) && !exclude.contains(j)) {
                    exclude.add(j);
                }
            }
        }
        String[] result = new String[phrases.length - exclude.size()];
        int counter = 0;
        for (int i = 0; i < phrases.length; i++) {
            if (!exclude.contains(i)) {
                result[counter] = phrases[i];
                counter++;
            }
        }
        return result;
    }

    private boolean isAnagram(String first, String second) {
        first = first.toLowerCase().replace(" ", "");
        second = second.toLowerCase().replace(" ", "");
        if (first.length() != second.length()) {
            return false;
        }
        for (int i = 0; i < first.length(); i++) {
            int pos = second.indexOf(first.charAt(i));
            if (pos < 0) {
                return false;
            } else {
                StringBuilder sb = new StringBuilder(second);
                sb.setCharAt(pos, '*');
                second = sb.toString();
            }
        }
        return true;
    }
}
