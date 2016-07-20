import java.util.*;
import java.math.*;

import static java.lang.Math.*;

public class PalindromeDecoding {

    public String decode(String code, int[] position, int[] length) {
        for (int i = 0; i < position.length; i++) {
            String substr = new StringBuilder(code.substring(position[i], length[i] + position[i])).reverse().toString();
            code = new StringBuilder(code).insert(position[i] + length[i], substr).toString();
        }
        return code;
    }
}
