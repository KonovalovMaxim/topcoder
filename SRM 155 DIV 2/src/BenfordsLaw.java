import java.util.*;
import java.math.*;

import static java.lang.Math.*;

public class BenfordsLaw {

    public int questionableDigit(int[] transactions, int threshold) {
        int[] numbers = new int[10];
        for (int i = 0; i < transactions.length; i++) {
            int first = Integer.parseInt(String.valueOf(String.valueOf(transactions[i]).charAt(0)));
            numbers[first]++;
        }
        for (int i = 1; i < 10; i++) {
            double currentIndex = getIndex(i, transactions.length);
            double currentProb = numbers[i] / (float) transactions.length * 100;
            if (currentIndex / threshold > numbers[i] || currentIndex * threshold < numbers[i]) {
                return i;
            }
        }
        return -1;
    }

    protected double getIndex(int firstNumber, int base) {
        return Math.log10(1f + 1f / (float) firstNumber) * base;
    }
}
