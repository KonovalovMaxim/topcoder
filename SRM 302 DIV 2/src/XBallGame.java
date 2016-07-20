import java.util.*;
import java.math.*;

import static java.lang.Math.*;

public class XBallGame {

    public String[] newStatistics(String[] placeboard) {
        String[] result = new String[placeboard.length];
        for (int i = 0; i < placeboard.length; i++) {
            ArrayList<String> roles = new ArrayList<>();
            String[] nameData = placeboard[i].split("-");
            for (int j = 0; j < placeboard.length; j++) {
                if (j == i) continue;
                String[] nameData2 = placeboard[j].split("-");
                if (Objects.equals(nameData[0], nameData2[0])) {
                    roles.add(nameData2[1]);
                }
            }
            result[i] = nameData[0] + '-' + nameData[1];
            if (roles.size() > 0) {
                Collections.sort(roles);
                result[i] += "," + String.join(",", roles);
            }
        }
        return result;
    }
}
