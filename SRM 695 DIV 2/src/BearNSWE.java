import java.util.*;
import java.math.*;
import java.util.regex.Matcher;

import static java.lang.Math.*;

public class BearNSWE {

	public double totalDistance(int[] a, String dir) {
		int x = 0;
		int y = 0;
		int total = 0;
		for (int i = 0; i < a.length; i++) {
			switch (dir.charAt(i)) {
				case 'N':
					y += a[i];
					break;
				case 'S':
					y -= a[i];
					break;
				case 'W':
					x -= a[i];
					break;
				case 'E':
					x += a[i];
			}
			total += a[i];
		}
		return total + Math.sqrt(x * x + y * y);
	}
}
