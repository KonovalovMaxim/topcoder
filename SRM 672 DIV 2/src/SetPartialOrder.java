import java.util.Arrays;
import java.util.stream.IntStream;

public class SetPartialOrder {

    public String compareSets(int[] a, int[] b) {
        Arrays.sort(a);
        Arrays.sort(b);
        if (a.length == b.length) {
            boolean equal = true;
            for (int i = 0; i < a.length; i++) {
                if (a[i] != b[i]) {
                    equal = false;
                    break;
                }
            }
            if (equal) {
                return "EQUAL";
            }
        }
        if (isLess(a, b)) {
            return "LESS";
        } else if (isLess(b, a)) {
            return "GREATER";
        }
        return "INCOMPARABLE";
    }

    private boolean isLess(int[] a, int[] b) {
        if (a.length < b.length) {
            boolean contains = true;
            for (int i = 0; i < a.length; i++) {
                final int index = i;
                if (!IntStream.of(b).anyMatch(x -> x == a[index])) {
                    contains = false;
                }
            }
            if (contains) {
                return true;
            }
            return false;
        } else {
            return false;
        }
    }
}
