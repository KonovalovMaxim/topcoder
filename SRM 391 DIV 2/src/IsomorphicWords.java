import java.util.*;
import java.math.*;

import static java.lang.Math.*;

public class IsomorphicWords {

    public int countPairs(String[] words) {
        int counter = 0;
        for (int i = 0; i < words.length; i++) {
            for (int j = i + 1; j < words.length; j++) {
                if (isIsomorphic(words[i], words[j]) && isIsomorphic(words[j], words[i])) {
                    counter++;
                }
            }
        }
        return counter;
    }

    boolean isIsomorphic(String one, String two) {
        if (one.length() != two.length()) return false;
        for (int i = 0; i < one.length(); i++) {
            char first = one.charAt(i);
            char second = two.charAt(i);
            for (int j = i + 1; j < one.length(); j++) {
                if (one.charAt(j) == first && two.charAt(j) != second) {
                    return false;
                }
            }
        }
        return true;
    }
}
