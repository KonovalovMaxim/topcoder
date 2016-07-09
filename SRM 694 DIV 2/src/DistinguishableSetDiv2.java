import java.util.*;

public class DistinguishableSetDiv2 {

	public int count(String[] answer) {
		int n = answer.length;
		int m = answer[0].length();
		ArrayList<ArrayList<Integer>> perms = getAllSubsets(m);
		int result = 0;
		for (int permsI = 0; permsI < perms.size(); permsI++) {
			ArrayList<String> distinctValues = new ArrayList<>();
			for (int i = 0; i < answer.length; i++) {
				String currentPermAnswerString = "";
				for (int j = 0; j < perms.get(permsI).size(); j++) {
					currentPermAnswerString += answer[i].charAt(perms.get(permsI).get(j));
				}
				if (!distinctValues.contains(currentPermAnswerString)) {
					distinctValues.add(currentPermAnswerString);
				}
			}
			if (distinctValues.size() == n) {
				result++;
			}
		}
		return result;
	}

	private ArrayList<ArrayList<Integer>> getAllSubsets(int m) {
		ArrayList<ArrayList<Integer>> perms = new ArrayList<>();
		for (int i = 0; i < Math.pow(2, m); i++) {
			String binaryString = Integer.toBinaryString(i);
			int len = binaryString.length();
			for (int j = 0; j < m - len; j++) {
				binaryString = "0" + binaryString;
			}
			ArrayList<Integer> current = new ArrayList<>();
			for (int j = 0; j < binaryString.length(); j++) {
				if (binaryString.charAt(j) == '1') {
					current.add(j);
				}
			}
			perms.add(current);
		}
		return perms;
	}
}
