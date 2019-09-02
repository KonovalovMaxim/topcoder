import java.util.*;
import java.math.*;

import static java.lang.Math.*;

public class PaternityTest {

    public int[] possibleFathers(String child, String mother, String[] men) {
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i < men.length; i++) {
            if (isFather(child, mother, men[i])) {
                result.add(i);
            }
        }
        return result.stream().mapToInt(i -> i).toArray();
    }

    protected boolean isFather(String child, String mother, String father) {
        int match = 0;
        for (int i = 0; i < child.length(); i++) {
            if (child.charAt(i) == father.charAt(i)) {
                match++;
            } else if (child.charAt(i) != mother.charAt(i)) return false;
        }
        return match >= child.length() / 2;
    }

}
