import java.util.*;
import java.math.*;

import static java.lang.Math.*;

public class ClientsList {

    public String[] dataCleanup(String[] names) {
        String[] result = new String[names.length];
        for (int i = 0; i < names.length; i++) {
            if (names[i].contains(",")) {
                String[] data = names[i].split(",");
                result[i] = data[1].trim() + " " + data[0].trim();
            } else {
                result[i] = names[i];
            }
        }
        Arrays.sort(result, (o1, o2) -> {
            String[] data1 = o1.split(" ");
            String[] data2 = o2.split(" ");
            if (data1[1].compareTo(data2[1]) == 0) {
                return data1[0].compareTo(data2[0]);
            }
            return data1[1].compareTo(data2[1]);
        });
        return result;
    }
}
