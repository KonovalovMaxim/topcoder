import java.util.*;
import java.math.*;

import static java.lang.Math.*;

public class VerySecureEncryption {

    public String encrypt(String message, int[] key, int K) {
        for (int i = 0; i < K; i++) {
            char[] result = new char[key.length];
            for (int j = 0; j < key.length; j++) {
                result[key[j]] = message.charAt(j);
            }
            message = new String(result);
        }
        return message;
    }
}
