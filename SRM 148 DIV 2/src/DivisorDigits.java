import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class DivisorDigits {
	
	public int howMany(int number) {
		String numberStr = String.valueOf(number);
		char[] digits =  numberStr.toCharArray();
		int counter = 0;
		for (int i = 0; i < digits.length; i++) {
			int num = Character.getNumericValue(digits[i]);
			if(num==0) continue;
			if(number%num==0) {
				counter++;
			}
		}
		return counter;
	}
}
