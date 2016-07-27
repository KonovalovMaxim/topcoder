import java.util.*;
import java.math.*;

import static java.lang.Math.*;

public class Conglutination {

    public String split(String conglutination, int expectation) {
        for (int i = 1; i < conglutination.length(); i++) {
            String first = conglutination.substring(0, i);
            String second = conglutination.substring(i);
            if (new BigInteger(first).add(new BigInteger(second)).toString().equals(String.valueOf(expectation))) {
                return first + "+" + second;
            }
        }
        return "";
    }
}
