import java.util.*;

public class ParenthesesDiv2Medium {

    public int[] correct(String s) {
        ArrayList<Integer> replacement = new ArrayList<>();
        int a = 0;
        int b = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                a++;
            } else {
                b++;
            }
            if (b > a) {
                b--;
                a++;
                replacement.add(i);
            }
            if (a - b >= s.length() - i - 1) {
                for (int j = i + 1; j < s.length(); j++) {
                    if (s.charAt(j) != ')') {
                        replacement.add(j);
                    }
                }
                break;
            }
        }
        return replacement.stream().mapToInt(i -> i).toArray();
    }
}
