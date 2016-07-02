import java.util.Collections;
import java.util.Stack;

public class Plusonegame {

    public String getorder(String s) {
        int plusesCount = 0;
        Stack<Integer> numbers = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '+') {
                plusesCount++;
            } else {
                numbers.push(Integer.parseInt(String.valueOf(s.charAt(i))));
            }
        }
        Collections.sort(numbers);
        Collections.reverse(numbers);
        String result = "";
        int counter = 0;
        while (!numbers.empty()) {
            int number = numbers.lastElement();
            while (counter < number && plusesCount > 0) {
                result += "+";
                plusesCount--;
                counter++;
            }
            result += numbers.pop();
        }
        while (plusesCount > 0) {
            result += "+";
            plusesCount--;
        }

        return result;
    }
}
