import java.util.*;
import java.math.*;

import static java.lang.Math.*;

public class TagalogDictionary {
    private String[] alphabet;

    public String[] sortWords(String[] words) {
        alphabet = new String[]{"a", "b", "k", "d", "e", "g", "h", "i", "l", "m", "n", "ng", "o", "p", "r", "s", "t", "u", "w", "y"};
        Arrays.sort(words, this::substract);
        return words;
    }

    private int substract(String first, String second) {
        String[] lettersFirst = toLetters(first);
        String[] lettersSecond = toLetters(second);
        for (int i = 0; i < Math.min(lettersFirst.length, lettersSecond.length); i++) {
            if (!lettersFirst[i].equals(lettersSecond[i])) {
                return getPosition(lettersFirst[i]) - getPosition(lettersSecond[i]);
            }
        }
        return lettersFirst.length - lettersSecond.length;
    }

    private int getPosition(String letter) {
        for (int i = 0; i < alphabet.length; i++) {
            if (alphabet[i].equals(letter)) {
                return i;
            }
        }
        return -1;
    }

    public String[] toLetters(String word) {
        ArrayList<String> result = new ArrayList<>();
        for (int i = 0; i < word.length() - 1; i++) {
            if (word.charAt(i) == 'g') {
                if (i == 0) {
                    result.add("g");
                    continue;
                }
                if (word.charAt(i - 1) == 'n') {
                    continue;
                } else {
                    result.add("g");
                }
            }
            if (word.charAt(i + 1) == 'g' && word.charAt(i) == 'n') {
                result.add("ng");
            } else {
                result.add(String.valueOf(word.charAt(i)));
            }
        }
        if (word.length() > 2 && word.charAt(word.length() - 1) == 'g') {
            if (word.charAt(word.length() - 2) != 'n') {
                result.add(String.valueOf(word.charAt(word.length() - 1)));
            }
        } else if (word.length() == 2) {
            if (!word.equals("ng")) {
                result.add(String.valueOf(word.charAt(1)));
            }
        } else if (word.length() == 1) {
            result.add(word);
        } else {
            result.add(String.valueOf(word.charAt(word.length() - 1)));
        }
        String[] res = new String[result.size()];
        for (int i = 0; i < result.size(); i++) {
            res[i] = result.get(i);
        }
        return res;
    }
}
