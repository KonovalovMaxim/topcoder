import java.util.*;
import java.math.*;

import static java.lang.Math.*;

public class CmpdWords {

    public int ambiguous(String[] dictionary) {
        HashMap<String, String> compoundMap = new HashMap<>();
        ArrayList<String> compound = new ArrayList<>();
        int counter = 0;
        for (int i = 0; i < dictionary.length; i++) {
            for (int j = 0; j < dictionary.length; j++) {
                if (i == j) {
                    continue;
                }
                String aword = dictionary[i] + dictionary[j];
                String akey = dictionary[i] + "+" + dictionary[j];
                for (Map.Entry entry : compoundMap.entrySet()) {
                    if (entry.getValue().equals(aword) && !entry.getKey().equals(akey) && !compound.contains(aword)) {
                        compound.add(aword);
                    }
                }
                for (int k = 0; k < dictionary.length; k++) {
                    if (aword.equals(dictionary[k]) && k != i && k != j && !compound.contains(aword)) {
                        compound.add(aword);
                    }
                }
                compoundMap.put(akey, aword);
            }
        }
        return compound.size();
    }
}
