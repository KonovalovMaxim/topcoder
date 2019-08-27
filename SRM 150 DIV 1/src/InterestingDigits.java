import java.util.*;
import java.math.*;

import static java.lang.Math.*;

public class InterestingDigits {

    public int[] digits(int base) {
        String multiple = "";
        ArrayList<Integer> result = new ArrayList<Integer>();
        for (int i = 2; i < base; i++) {
            if (isInteresting(i, base)) {
                result.add(i);
            }
        }
        return result.stream().mapToInt(i -> i).toArray();
    }

    private boolean isInteresting(int number, int base) {
        int i = 2;
        String multiplication = "";
        do {
            multiplication = Integer.toString(i * number, base);
            char[] numberChar = multiplication.toCharArray();
            int sum = 0;
            for (int j = 0; j < numberChar.length; j++) {
                sum += Integer.parseInt(String.valueOf(numberChar[j]), base);
            }
            if (sum % number != 0) {
                return false;
            }
            i++;
        } while (multiplication.length() < 4);
        return true;
    }
}
