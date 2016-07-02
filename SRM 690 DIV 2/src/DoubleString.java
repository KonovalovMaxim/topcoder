import java.util.*;
import java.math.*;

import static java.lang.Math.*;

public class DoubleString {

    public String check(String S) {
        if (S.length() % 2 == 1) {
            return "not square";
        }
        for (int i = 0; i < S.length() / 2; i++) {
            if (S.charAt(i) != S.charAt(i + S.length() / 2)) {
                return "not square";
            }
        }
        return "square";
    }
}
