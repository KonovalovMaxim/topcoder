import java.util.*;
import java.math.*;

import static java.lang.Math.*;

public class Library {

    public int documentAccess(String[] records, String[] userGroups, String[] roomRights) {
        ArrayList<String> documents = new ArrayList<>();
        for (int i = 0; i < records.length; i++) {
            String[] data = records[i].split(" ");
            boolean group = false;
            for (int j = 0; j < userGroups.length; j++) {
                if (userGroups[j].equals(data[2])) {
                    group = true;
                    break;
                }
            }
            boolean room = false;
            for (int j = 0; j < roomRights.length; j++) {
                if (roomRights[j].equals(data[1])) {
                    room = true;
                    break;
                }
            }
            if (room && group && !documents.contains(data[0])) {
                documents.add(data[0]);
            }
        }
        return documents.size();
    }
}
