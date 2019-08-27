import java.util.*;
import java.math.*;

import static java.lang.Math.*;

public class FormatAmt {

    public String amount(int dollars, int cents) {
        String aPart = "0";
        String bPart = "00";
        if (dollars > 0) {
            aPart = "";
            char[] dollarsChar = String.valueOf(dollars).toCharArray();
            int counter = 0;
            for (int i = dollarsChar.length - 1; i >= 0; i--) {
                if (counter % 3 == 0 && counter > 0) {
                    aPart = "," + aPart;
                }
                aPart = String.valueOf(dollarsChar[i]) + aPart;
                counter++;
            }
        }

        if (cents > 0) {
            if (cents < 10) {
                bPart = "0" + String.valueOf(cents);
            } else {
                bPart = String.valueOf(cents);
            }
        }

        return "$" + aPart + "." + bPart;
    }
}
