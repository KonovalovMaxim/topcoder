import java.util.*;
import java.math.*;

import static java.lang.Math.*;

public class TriangleEasy {

    public int find(int n, int[] x, int[] y) {
        if (x.length == 0) {
            return 3;
        }
        ArrayList<ArrayList<Integer>> adjacency = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            adjacency.add(new ArrayList<Integer>());
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < x.length; j++) {
                if (i == x[j]) {
                    adjacency.get(i).add(y[j]);
                }
                if (i == y[j]) {
                    adjacency.get(i).add(x[j]);
                }
            }
        }
        boolean hasTwo = false;
        for (int i = 0; i < adjacency.size(); i++) {
            if (adjacency.get(i).size() >= 2) {
                hasTwo = true;
                if (check(adjacency, i)) {
                    return 0;
                }
            }
        }
        if (hasTwo) {
            return 1;
        }
        return 2;
    }

    private boolean check(ArrayList<ArrayList<Integer>> adjacency, int element) {
        ArrayList<Integer> elements = adjacency.get(element);
        for (int i = 0; i < elements.size(); i++) {
            for (int j = 0; j < elements.size(); j++) {
                if (i != j) {
                    ArrayList<Integer> IElements = adjacency.get(elements.get(i));
                    for (int k = 0; k < IElements.size(); k++) {
                        if (Objects.equals(IElements.get(k), elements.get(j))) {
                            return true;
                        }
                    }

                    ArrayList<Integer> JElements = adjacency.get(elements.get(j));
                    for (int k = 0; k < JElements.size(); k++) {
                        if (Objects.equals(JElements.get(k), elements.get(i))) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }
}
