import java.util.*;
import java.math.*;

import static java.lang.Math.*;

public class CheatCode {

    public int[] matches(String keyPresses, String[] codes) {
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i < codes.length; i++) {
            if (isCorrect(keyPresses, codes[i])) {
                result.add(i);
            }

        }
        return result.stream().mapToInt(i -> i).toArray();
    }

    protected boolean isCorrect(String keys, String code) {
        ArrayList<Char> keysChar = getChars(keys);
        ArrayList<Char> codeChar = getChars(code);
        String keysWithoutDups = getWithoutDoubles(keysChar);
        String codeWithoutDups = getWithoutDoubles(codeChar);

        if (!keysWithoutDups.contains(codeWithoutDups)) {
            return false;
        }
        if (keysWithoutDups.length() < codeWithoutDups.length()) {
            return false;
        }
        int keyIndex = keysWithoutDups.indexOf(codeWithoutDups);
        int keysOK = 0;
        for (int i = 0; i < codeChar.size(); i++) {
            Char currentCodeChar = codeChar.get(i);
            Char currentKeyChar = keysChar.get(keyIndex);
            if (currentCodeChar.letter == currentKeyChar.letter && currentCodeChar.num > currentKeyChar.num) {
                return false;
            }
            if (currentCodeChar.letter != currentKeyChar.letter) {
                return false;
            }
            keysOK++;
            if (keysOK == codeWithoutDups.length()) {
                return true;
            }
            keyIndex++;
        }
        return true;
    }

    protected String getWithoutDoubles(ArrayList<Char> chars) {
        String result = "";
        for (int i = 0; i < chars.size(); i++) {
            result += chars.get(i).letter;
        }
        return result;
    }

    protected ArrayList<Char> getChars(String letters) {
        char[] string = letters.toCharArray();
        ArrayList<Char> result = new ArrayList<>();
        if (string.length == 1) {
            result.add(new Char(string[0], 1));
            return result;
        }

        for (int i = 0; i < string.length; i++) {
            if (i == 0) {
                result.add(new Char(string[i], 1));
                continue;
            }
            if (string[i] == string[i - 1]) {
                result.get(result.size() - 1).num++;
            } else {
                result.add(new Char(string[i], 1));
            }
        }
        return result;
    }
}

class Char {
    public char letter;
    public int num;

    public Char(char letter, int num) {
        this.letter = letter;
        this.num = num;
    }
}
