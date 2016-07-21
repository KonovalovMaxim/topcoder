import java.util.*;
import java.math.*;

import static java.lang.Math.*;

public class BusinessTasks {

    public String getTask(String[] list, int n) {
        ArrayList<String> tasks = new ArrayList<>();
        for (int i = 0; i < list.length; i++) {
            tasks.add(list[i]);
        }
        int x = 0;
        while (tasks.size() > 1) {
            x = (tasks.size() + n + (x-1)) % tasks.size();
            tasks.remove(x);
        }
        return tasks.get(0);
    }
}
