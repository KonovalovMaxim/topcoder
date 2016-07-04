import java.util.*;
import java.math.*;

import static java.lang.Math.*;

public class NonDeterministicSubstring {

    public long ways(String A, String B) {
        ArrayList<String> used = new ArrayList<>();

        for (int i = 0; i <= A.length() - B.length(); i++) {
            String part = compare(A, B, i);
            if (part != null && !used.contains(part)) {
                used.add(part);
            }
        }
        return used.size();
    }

    private String compare(String A, String B, int position) {
        String result = "";
        for (int i = 0; i < B.length(); i++) {
            if (B.charAt(i) == '?' || B.charAt(i) == A.charAt(i + position)) {
                result += A.charAt(i + position);
            } else {
                return null;
            }
        }
        return result;
    }
}
