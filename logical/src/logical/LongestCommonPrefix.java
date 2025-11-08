package logical;

public class LongestCommonPrefix {
	
	public static void run() {
		String[] in = { "aaa","aa","aaa" };
		String commonPrefix = longestCommonPrefix(in);
		System.out.println("CommonPrefix -> " + commonPrefix);
	}

	public static String longestCommonPrefix(String[] strs) {
		if (strs.length == 1) {
			return strs[0];
		}
		if (strs.length > 0) {
			String returnValue = "";
			char[] commonPrefix = strs[0].toCharArray();
			for (int i = 0; i < strs.length; i++) {
				StringBuilder tempString = new StringBuilder();
				char[] anotherArray = strs[i].toCharArray();
				for (int j = 0; j < anotherArray.length && j < commonPrefix.length; j++) {
					if (anotherArray[j] != commonPrefix[j]) {
						break;
					} else {
						tempString.append(commonPrefix[j]);
					}
				}
				commonPrefix = tempString.toString().toCharArray();
				returnValue = tempString.toString();
			}
			return returnValue;
		}
		return "";
	}
}
