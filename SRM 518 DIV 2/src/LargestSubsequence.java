
public class LargestSubsequence {

    public String getLargest(String s) {
        String maxString = "";
        String current = s;
        while (current.length() > 0) {
            char max = (char) 'a' - 1;
            int maxindex = -1;
            for (int i = 0; i < current.length(); i++) {
                if (current.charAt(i) > max) {
                    max = current.charAt(i);
                    maxindex = i;
                }
            }
            maxString += max;
            current = current.substring(maxindex + 1);
        }
        return maxString;
    }
}
