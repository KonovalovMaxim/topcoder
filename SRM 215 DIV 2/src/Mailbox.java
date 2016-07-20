import java.util.*;
import java.math.*;

import static java.lang.Math.*;

public class Mailbox {

    public int impossible(String collection, String[] address) {
        int counter = 0;
        for (int i = 0; i < address.length; i++) {
            String copy = collection;
            String addr = address[i].replace(" ", "");
            for (int j = 0; j < addr.length(); j++) {
                int index = -1;
                for (int k = 0; k < copy.length(); k++) {
                    if (copy.charAt(k) == addr.charAt(j)) {
                        index = k;
                        break;
                    }
                }
                if (index != -1) {
                    copy = new StringBuilder(copy).deleteCharAt(index).toString();
                } else {
                    counter++;
                    break;
                }
            }
        }
        return counter;
    }
}
