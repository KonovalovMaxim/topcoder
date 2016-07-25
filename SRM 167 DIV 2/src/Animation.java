import java.util.*;
import java.math.*;

import static java.lang.Math.*;

public class Animation {

    public String[] animate(int speed, String init) {
        ArrayList<ArrayList<Character>> data = new ArrayList<>();
        ArrayList<ArrayList<Character>> empty = new ArrayList<>();
        for (int i = 0; i < init.length(); i++) {
            data.add(new ArrayList<>());
            empty.add(new ArrayList<>());
            if (init.charAt(i) != '.') {
                data.get(i).add(init.charAt(i));
            }
        }
        ArrayList<String> result = new ArrayList<>();
        result.add(init.replace('L', 'X').replace('R', 'X'));
        while (!isAllDots(data)) {
            ArrayList<ArrayList<Character>> next = copy(empty);
            for (int i = 0; i < data.size(); i++) {
                for (int j = 0; j < data.get(i).size(); j++) {
                    char currentChar = data.get(i).get(j);
                    if (currentChar == 'L' && i - speed >= 0) {
                        next.get(i - speed).add(currentChar);
                    }
                    if (currentChar == 'R' && i + speed < init.length()) {
                        next.get(i + speed).add(currentChar);
                    }
                }
            }
            String current = "";
            for (int j = 0; j < next.size(); j++) {
                if (next.get(j).size() > 0) {
                    current += "X";
                } else {
                    current += ".";
                }
            }
            result.add(current);
            data = copy(next);
        }
        String[] ret = new String[result.size()];
        for (int i = 0; i < result.size(); i++) {
            ret[i] = result.get(i);
        }
        return ret;
    }

    private ArrayList<ArrayList<Character>> copy(ArrayList<ArrayList<Character>> data) {
        ArrayList<ArrayList<Character>> result = new ArrayList<>();
        for (int i = 0; i < data.size(); i++) {
            result.add((ArrayList<Character>) data.get(i).clone());
        }
        return result;
    }

    public boolean isAllDots(ArrayList<ArrayList<Character>> data) {
        for (int i = 0; i < data.size(); i++) {
            if (data.get(i).size() != 0) {
                return false;
            }
        }
        return true;
    }
}
