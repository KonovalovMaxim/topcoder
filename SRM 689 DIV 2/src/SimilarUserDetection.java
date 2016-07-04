import java.util.*;

public class SimilarUserDetection {

    public String haveSimilar(String[] handles) {
        for (int i = 0; i < handles.length; i++) {
            handles[i] = handles[i].replace('0', 'O');
            handles[i] = handles[i].replace('1', 'l');
            handles[i] = handles[i].replace('I', 'l');
        }

        for (int i = 0; i < handles.length; i++) {
            for (int j = 0; j < handles.length; j++) {
                if (i != j) {
                    if (Objects.equals(handles[i], handles[j])) {
                        return "Similar handles found";
                    }
                }
            }
        }
        return "Similar handles not found";
    }
}
