import java.util.*;
import java.math.*;

import static java.lang.Math.*;

public class WordForm {

    public String getSequence(String word) {
        ArrayList<Character> vovels = new ArrayList<Character>() {{
            add('o');
            add('a');
            add('e');
            add('i');
            add('u');
        }};
        word = word.toLowerCase();
        String result = "";
        if (word.charAt(0) == 'y') {
            result += "C";
        } else if (vovels.contains(word.charAt(0))) {
            result += "V";
        } else {
            result += "C";
        }
        int counter = 1;
        for (int i = 1; i < word.length(); i++) {
            counter = result.length();
            if (vovels.contains(word.charAt(i)) && result.charAt(counter - 1) == 'C') {
                result += "V";
            } else if (word.charAt(i) == 'y') {
                if (result.charAt(counter - 1) == 'V') {
                    result += "C";
                } else {
                    result += "V";
                }
            } else if (!vovels.contains(word.charAt(i)) && result.charAt(counter - 1) == 'V') {
                result += "C";
            }

        }
        return result;
    }
}
