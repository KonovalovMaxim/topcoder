import java.util.*;
import java.math.*;

import static java.lang.Math.*;

public class Inventory {

    public int monthlyOrder(int[] sales, int[] daysAvailable) {
        double sum = 0;
        int activeDays = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] == 0 || daysAvailable[i] == 0) continue;
            double days = daysAvailable[i] / 30f * 100f;
            double avg = sales[i] / days * 100;
            sum += avg;
            activeDays++;
        }
        return (int) ceil(sum / (float) activeDays);
    }
}
