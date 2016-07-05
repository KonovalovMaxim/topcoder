import java.util.*;
import java.math.*;

import static java.lang.Math.*;

public class RelationClassifier {

    public String isBijection(int[] domain, int[] range) {
        Arrays.sort(domain);
        Arrays.sort(range);
        for (int i = 1; i < domain.length; i++) {
            if (domain[i] == domain[i - 1]) {
                return "Not";
            }
            if (range[i] == range[i - 1]) {
                return "Not";
            }
        }
        return "Bijection";
    }
}
