import java.util.*;
import java.math.*;

import static java.lang.Math.*;

public class HuffmanDecoding {

    public String decode(String archive, String[] dictionary) {
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String result = "";
        while (archive.length() > 0) {
            for (int i = 0; i < dictionary.length; i++) {
                ArrayList<Integer> match = new ArrayList<>();
                if (archive.startsWith(dictionary[i])) {
                    match.add(i);
                    result += alphabet.charAt(i);
                    StringBuilder sb = new StringBuilder(archive);
                    for (int j = 0; j < dictionary[i].length(); j++) {
                        sb.deleteCharAt(0);
                    }
                    archive = sb.toString();
                }
            }
        }
        return result;
    }
}
