import java.util.*;
import java.math.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static java.lang.Math.*;

public class BaseMystery {

    public int[] getBase(String equation) {
        String[] nums = parse(equation);
        ArrayList<Integer> correct = new ArrayList<>();
        for (int i = 2; i <= 20; i++) {
            int first = 0;
            int second = 0;
            try {
                first = Integer.parseInt(nums[0], i);
                second = Integer.parseInt(nums[1], i);
            } catch (NumberFormatException e) {
                continue;
            }

            String currentSum = Integer.toString(first + second, i);
            if (currentSum.toLowerCase().equals(nums[2].toLowerCase())) {
                correct.add(i);
            }
        }
        return correct.stream().mapToInt(i -> i).toArray();
    }

    public String[] parse(String equation) {
        String[] result = new String[3];
        String[] parts = equation.split("\\+");
        result[0] = parts[0];
        String[] parts2 = parts[1].split("=");
        result[1] = parts2[0];
        result[2] = parts2[1];
        return result;
    }
}
