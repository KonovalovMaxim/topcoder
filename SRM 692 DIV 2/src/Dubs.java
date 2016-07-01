public class Dubs {

	public long count(long L, long R) {
		long sub = R - L;
		long result = 0;
		String RString = String.valueOf(R);
		while (RString.charAt(RString.length() - 1) != '0') {
			if (checkNumber(R)) {
				result++;
			}
			R--;
			RString = String.valueOf(R);
		}
		String LString = String.valueOf(L);

		while (LString.charAt(LString.length() - 1) != '0') {
			if (checkNumber(L)) {
				result++;
			}
			L++;
			LString = String.valueOf(L);
		}
		result += (R - L) / 10;
		if(checkNumber(R)) {
			result++;
		}
		return result;
	}

	private boolean checkNumber(long number) {
		String NString = String.valueOf(number);
		return NString.length() >= 2 && NString.charAt(NString.length() - 1) == NString.charAt(NString.length() - 2);
	}

}