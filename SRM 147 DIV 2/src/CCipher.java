import java.util.*;
import java.math.*;

import static java.lang.Math.*;

public class CCipher {

    public String decode(String cipherText, int shift) {
        char[] text = cipherText.toCharArray();
        char[] result = new char[text.length];
        for (int i = 0; i < text.length; i++) {
            int newLetterPosition = ((int) text[i]) - 64 - shift;
            if (newLetterPosition < 1) {
                newLetterPosition = 26 + newLetterPosition;
            }
            int newNumber = newLetterPosition + 64;
            result[i] = (char) newNumber;
        }
        return new String(result);
    }
}
