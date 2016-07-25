import java.util.*;
import java.math.*;

import static java.lang.Math.*;

public class DNASingleMatcher {

    public int longestMatch(String sequence1, String sequence2) {
        String minSeq = "";
        String maxSeq = "";
        if (sequence1.length() < sequence2.length()) {
            minSeq = sequence1;
            maxSeq = sequence2;
        } else {
            minSeq = sequence2;
            maxSeq = sequence1;
        }
        int max = 0;
        for (int window = 0; window <= minSeq.length(); window++) {
            for (int position = 0; position <= minSeq.length() - window; position++) {
                String subSeq = minSeq.substring(position, window + position);
                if (maxSeq.contains(subSeq)) {
                    max = Math.max(subSeq.length(), max);
                }
            }
        }
        return max;
    }
}
