import java.util.*;
import java.math.*;

import static java.lang.Math.*;

public class SubstitutionCipher {
    public String decode(String a, String b, String y) {
        boolean[] used = new boolean[y.length()];
        char[] result = new char[y.length()];
        Arrays.fill(result, '*');
        String alphabet3 = "ABCDEFGHIJKLMNOPQRSTUWXYZ";
        for (int i = 0; i < y.length(); i++) {
            boolean exists = false;
            for (int j = 0; j < b.length(); j++) {
                if (y.charAt(i) == b.charAt(j)) {
                    exists = true;
                    result[i] = a.charAt(j);
                    break;
                }
            }
            used[i] = exists;
        }

        for (int i = 0; i < a.length(); i++) {
            alphabet3 = alphabet3.replace(a.charAt(i) + "", "");
        }
        for (int i = 0; i < result.length; i++) {
            if (result[i] == '*' && alphabet3.length() > 1) {
                return "";
            }
        }

        char prev = '*';
        for (int i = 0; i < used.length; i++) {
            if (prev == '*' && !used[i]) {
                prev = y.charAt(i);
                continue;
            }
            if (!used[i] && prev != y.charAt(i)) {
                break;
            }
        }

        if (prev == '*') {
            return String.valueOf(result);
        }

        if (alphabet3.length() == 1) {
            for (int i = 0; i < result.length; i++) {
                if (result[i] == '*') {
                    result[i] = alphabet3.charAt(0);
                }
            }
        }
        return String.valueOf(result);
    }
}
