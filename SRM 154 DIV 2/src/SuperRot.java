import java.util.*;
import java.math.*;

import static java.lang.Math.*;

public class SuperRot {

    public String decoder(String message) {
        String result = "";
        for (int i = 0; i < message.length(); i++) {
            char ch = message.charAt(i);
            if (ch == ' ') {
                result += ' ';
                continue;
            }
            if (Character.isDigit(ch)) {
                if (ch <= '4') {
                    result += (char) (ch + 5);
                } else {
                    result += (char) (ch - 5);
                }
                continue;
            }
            if ((Character.isUpperCase(ch) && ch <= 'M') || (!Character.isUpperCase(ch) && ch <= 'm')) {
                result += (char) (ch + 13);
            } else {
                result += (char) (ch - 13);
            }
        }
        return result;
    }
}
