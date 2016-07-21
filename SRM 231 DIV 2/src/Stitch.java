import java.util.*;
import java.math.*;

import static java.lang.Math.*;

public class Stitch {

    public String[] stitch(String[] A, String[] B, int overlap) {
        String[] result = new String[A.length];
        for (int i = 0; i < A.length; i++) {
            String current = "";
            int indexA = A[i].length() - overlap;
            int indexB = 0;
            for (int j = 0; j < A[i].length() - overlap; j++) {
                current += A[i].charAt(j);
            }
            for (int j = 1; j <= overlap; j++) {
                char a = A[i].charAt(indexA);
                char b = B[i].charAt(indexB);
                indexA++;
                indexB++;
                current += (char) Math.round((double) ((overlap + 1 - j) * a + (j * b)) / (double) (overlap + 1));
            }
            for (int j = overlap; j < B[i].length(); j++) {
                current += B[i].charAt(j);
            }
            result[i] = current;

        }
        return result;
    }
}
