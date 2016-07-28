import java.util.*;
import java.math.*;

import static java.lang.Math.*;

public class bloggoHyphenate {

    public String[] correct(String[] dictionary, String[] candidates) {

        String[] result = new String[candidates.length];
        for (int i = 0; i < candidates.length; i++) {
            for (int j = 0; j < dictionary.length; j++) {
                if (candidates[i].replace("-", "").equals(dictionary[j].replace(" ", ""))) {
                    if (isCorrect(candidates[i], dictionary[j])) {
                        result[i] = "correct";
                    } else {
                        result[i] = fix(candidates[i], dictionary[j]);
                    }
                    break;
                }
            }
        }
        return result;
    }

    public String fix(String word, String dict) {
        ArrayList<Integer> correctPositions = new ArrayList<>();
        for (int i = 0; i < dict.length(); i++) {
            if (dict.charAt(i) == ' ') {
                correctPositions.add(i - correctPositions.size());
            }
        }
        String result = word.replace("-", "");
        int n = result.length();
        int replacements = 0;
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == '-') {
                int nearPosition = getPosition(i, correctPositions, n);
                if (nearPosition != -1) {
                    int index = nearPosition + replacements;
                    result = result.substring(0, index) + "-" + result.substring(index);
                    replacements++;
                }
            }
        }
        return result;
    }

    private int getPosition(int position, ArrayList<Integer> correct, int n) {
        int left = position;
        int right = position;
        for (int i = 0; i < n; i++) {
            if (left > 0) {
                left--;
            }
            if (correct.contains(left)) {
                return left;
            }
            if (right < n) {
                right++;
            }
            if (correct.contains(right)) {
                return right;
            }
        }
        return -1;
    }

    public boolean isCorrect(String first, String second) {
        if (first.replace("-", "").length() != second.replace(" ", "").length()) {
            return false;
        }
        if (first.charAt(0) == '-') {
            return false;
        }
        if (first.charAt(first.length() - 1) == '-') {
            return false;
        }
        ArrayList<Integer> wordPositions = new ArrayList<>();
        for (int i = 0; i < first.length(); i++) {
            if (first.charAt(i) == '-') {
                wordPositions.add(i - wordPositions.size());
            }
        }
        ArrayList<Integer> dictPositions = new ArrayList<>();
        for (int i = 0; i < second.length(); i++) {
            if (second.charAt(i) == ' ') {
                dictPositions.add(i - dictPositions.size());
            }
        }
        for (int i = 0; i < wordPositions.size(); i++) {
            if (!dictPositions.contains(wordPositions.get(i))) {
                return false;
            }
        }
        return true;
    }
}
