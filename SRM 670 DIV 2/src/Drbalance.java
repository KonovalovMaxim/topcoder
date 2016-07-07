import java.util.*;
import java.math.*;

import static java.lang.Math.*;

public class Drbalance {

    public int lesscng(String s, int k) {
        int steps = 0;
        while (getNegativity(s) > k) {
            int minus = getFirstMinus(s);
            if (minus >= 0) {
                StringBuilder sb = new StringBuilder(s);
                sb.setCharAt(getFirstMinus(s), '+');
                s = sb.toString();
            }
            steps++;
        }
        return steps;
    }

    private int getFirstMinus(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '-') {
                return i;
            }
        }
        return -1;
    }

    public int getNegativity(String s) {
        int result = 0;
        for (int i = 0; i <= s.length(); i++) {
            String part = s.substring(0, i);
            int balance = 0;
            for (int j = 0; j < part.length(); j++) {
                if (part.charAt(j) == '-') {
                    balance--;
                } else {
                    balance++;
                }
            }
            if (balance < 0) {
                result++;
            }
        }
        return result;
    }
}
