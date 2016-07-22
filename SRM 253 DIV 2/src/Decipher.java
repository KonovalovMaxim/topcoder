import java.util.*;
import java.math.*;

import static java.lang.Math.*;

public class Decipher {

    public String[] decipher(String[] encoded, String frequencyOrder) {
        int[] count = new int[26];
        for (String word : encoded) {
            for (int i = 0; i < word.length(); i++) {
                if (word.charAt(i) == ' ') {
                    continue;
                }
                count[word.charAt(i) - 65]++;
            }
        }
        String[] result = encoded;
        String[] replaced = new String[encoded.length];
        for (int i = 0; i < encoded.length; i++) {
            char[] str = new char[encoded[i].length()];
            Arrays.fill(str, '0');
            replaced[i] = new String(str);
        }

        for (int i = 0; i < frequencyOrder.length(); i++) {
            int max = Integer.MIN_VALUE;
            int maxIndex = -1;
            for (int j = 0; j < count.length; j++) {
                if (max < count[j]) {
                    max = count[j];
                    maxIndex = j;
                }
            }
            char charToReplace = (char) ((char) maxIndex + 65);
            count[maxIndex] = 0;
            for (int j = 0; j < result.length; j++) {
                for (int k = 0; k < result[j].length(); k++) {
                    if (result[j].charAt(k) == charToReplace && replaced[j].charAt(k) == '0') {
                        StringBuilder sb = new StringBuilder(result[j]);
                        sb.setCharAt(k, frequencyOrder.charAt(i));
                        result[j] = sb.toString();
                        sb = new StringBuilder(replaced[j]);
                        sb.setCharAt(k, '1');
                        replaced[j] = sb.toString();
                    }
                }
            }
        }
        return result;
    }
}
