import java.util.*;
import java.math.*;

import static java.lang.Math.*;

public class BearPasswordAny {
	public String findPassword(int[] x) {
		String result = "";
		int n = x.length;
		if (x[0] != n) return "";
		char current = 'a';
		int[] count = new int[n];
		for (int i = x.length - 1; i >= 0; i--) {
			if (count[i] > x[i]) {
				return "";
			}
			for (int j = 1; j <= x[i] - count[i]; j++) {
				for (int k = 1; k <= i + 1; k++) {
					result += current;
				}
				for (int k = 1; k <= i; k++) {
					count[k - 1] += (i + 1) - k + 1;
				}
				current = current == 'a' ? 'b' : 'a';
			}
		}
		return result;
	}
}
