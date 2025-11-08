package logical;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ValidParentheses {
	private static final String START_BRACES = "({[";
	private static final String END_BRACES = ")}]";

	public static void run() {
		String in = "()";
		boolean isValid = isValid(in);
		System.out.println("Is valid -> " + isValid);
	}

	public static boolean isValid(String inputString) {
		Map<String, String> allBracesPairs = new HashMap<>();
		allBracesPairs.put("(", ")");
		allBracesPairs.put("[", "]");
		allBracesPairs.put("{", "}");

		boolean isStringValid = false;
		if (inputString.length() % 2 == 0) {
			char[] arrayString = inputString.toCharArray();
			if (START_BRACES.contains(String.valueOf(arrayString[0]))
					&& END_BRACES.contains(String.valueOf(arrayString[arrayString.length - 1]))) {
				Stack<String> bracesStack = new Stack<>();
				for (int i = 0; i < arrayString.length; i++) {
					String currentChar = String.valueOf(arrayString[i]);
					if (START_BRACES.contains(currentChar)) {
						bracesStack.push(currentChar);
					} else if (END_BRACES.contains(currentChar)) {
						if (bracesStack.size() == 0 || !allBracesPairs.get(bracesStack.pop()).equals(currentChar)) {
							return false;
						}
					}
				}
				return bracesStack.size() == 0;
			}
		}
		return isStringValid;
	}

}
