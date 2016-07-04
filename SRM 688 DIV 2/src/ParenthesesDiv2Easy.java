import java.util.*;
import java.math.*;

import static java.lang.Math.*;

public class ParenthesesDiv2Easy {

    public int getDepth(String s) {
        int a = 0;
        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                a++;
            } else {
                a--;
            }
            result = Math.max(a, result);
        }
        return result;
    }
}
