import java.util.*;
import java.math.*;

import static java.lang.Math.*;

public class TandemRepeats {

    public int maxLength(String dna, int k) {
        int window = dna.length() / 2;
        while (window > 0) {
            for (int position = 0; position <= dna.length() - window - window; position++) {
                String first = dna.substring(position, position + window);
                String second = dna.substring(position + window, position + window + window);
                if(diff(first,second)<=k) {
                    return window;
                }
            }
            window--;
        }
        return 0;
    }

    public int diff(String first, String second) {
        int result = 0;
        for (int i = 0; i < first.length(); i++) {
            if (first.charAt(i) != second.charAt(i)) {
                result++;
            }
        }
        return result;
    }
}
