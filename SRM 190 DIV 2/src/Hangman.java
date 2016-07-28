import java.util.*;
import java.math.*;

import static java.lang.Math.*;

public class Hangman {

    public String guessWord(String feedback, String[] words) {
        String result = "";
        for (String word : words) {
            if (check(word, feedback)) {
                if (result.isEmpty()) {
                    result = word;
                } else {
                    return "";
                }
            }
        }
        return result;
    }

    public boolean check(String word, String pattern) {
        if (word.length() != pattern.length()) {
            return false;
        }
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) != pattern.charAt(i) && pattern.charAt(i) != '-') {
                return false;
            } else if (word.charAt(i) == pattern.charAt(i)) {
                char letter = word.charAt(i);
                for (int j = 0; j < word.length(); j++) {
                    if (word.charAt(j) == letter && pattern.charAt(j) == '-') {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
