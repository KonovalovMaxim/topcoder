import java.util.*;
import java.math.*;

import static java.lang.Math.*;

public class GoodString {

    public String isGood(String s) {
        int balance = 0;
        for (char letter : s.toCharArray()) {
            if (letter == 'b') {
                balance--;
            } else {
                balance++;
            }
            if (balance < 0) {
                return "Bad";
            }
        }
        if (balance != 0) {
            return "Bad";
        }
        return "Good";
    }
}
