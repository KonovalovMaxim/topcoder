import org.omg.PortableInterceptor.INACTIVE;

import java.util.*;
import java.math.*;

import static java.lang.Math.*;

public class EmoticonsDiv2 {

    private int result;

    public int printSmiles(int smiles) {
        int result = 0;
        while (smiles > 1) {
            for (int i = 2; i <= smiles; i++) {
                if (smiles % i == 0) {
                    smiles /= i;
                    result += i;
                    break;
                }
            }
        }
        return result;
    }

}
