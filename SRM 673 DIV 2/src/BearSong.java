import java.util.*;
import java.math.*;

import static java.lang.Math.*;

public class BearSong {

    public int countRareNotes(int[] notes) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < notes.length; i++) {
            Integer element = map.get(notes[i]);
            if (element == null) {
                map.put(notes[i], 1);
            } else {
                map.put(notes[i], element + 1);
            }
        }
        int counter = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                counter++;
            }
        }
        return counter;
    }
}
