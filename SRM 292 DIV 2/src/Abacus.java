import java.util.*;
import java.math.*;

import static java.lang.Math.*;

public class Abacus {

    public String[] add(String[] original, int val) {
        int result = 0;
        for (int i = 0; i < original.length; i++) {
            String[] data = original[i].split("---");
            int digit = 0;
            if (data.length == 2) {
                digit = data[1].length();
            }
            result += digit * (100000 / Math.pow(10, i));
        }
//        System.out.println(result);
        result += val;
        String[] abacus = new String[original.length];
        for (int i = 0; i < original.length; i++) {
            int digit = (int) (result / (100000 / Math.pow(10, i)));
            result = (int) (result % (100000 / Math.pow(10, i)));
            String abacusLine = "";
            for (int j = 0; j < 12 - 3 - digit; j++) {
                abacusLine += 'o';
            }
            for (int j = 0; j < 3; j++) {
                abacusLine += '-';
            }

            for (int j = 0; j < digit; j++) {
                abacusLine += 'o';
            }
            abacus[i] = abacusLine;
        }
        return abacus;
    }
}
