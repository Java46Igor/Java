package telran.text;
import static telran.text.RegularExpressions.*;
public class Strings {
private static final int MAX_NUMBER = 999;

	/**
	 * 
	 * @param name1 -  first name 
	 * @param name2 - second name
	 * @return either "match" or "no match" in accordance to the comments (see TODO)
	 */
	static public String matches(String name1, String name2) {
		//TODO
//      String matches(String name1, String name2)
//      Names match under the following conditions, after breaking each one into "name parts" on whitespace :
//      - Two name parts match if they are the same (case insensitive) or one is a single letter initial and the other is longer but starts with the same letter.
//      - A name part in  the name1 may be missing from the name2
//      - Name parts in one name must not contradict name parts in the other
//      - Name parts that match must be in the same order in both names
		
		String partsName1[] = name1.split(" ");
		String partsName2[] = name2.split(" ");
		int indPartsName2 = 0;
		String match = "match";
		String noMatch = "no match";
		boolean flMatch = false;
		for (int i = 0; i < partsName1.length; i++) {
			flMatch = partMatch(partsName1[i], partsName2[indPartsName2]);
			if (flMatch) {
				indPartsName2++;
				if (indPartsName2 == partsName2.length) {
					
					return match;
				}
			}
		}
		return noMatch;
	}
	private static boolean partMatch(String part1, String part2) {
		part1 = part1.toLowerCase();
		part2 = part2.toLowerCase();
		boolean res = false;
		if (part1.compareTo(part2) == 0) {
			res = true;
		} else if(isSameInitial(part1, part2)) {
			res = true;
		} 
		return res;
	}
	private static boolean isSameInitial(String part1, String part2) {
		String partI = part1.length() == 1 ? part1 : part2;
		String partF = part1 == partI ? part2 : part1;
		return partI.length() == 1 && partF.startsWith(partI);
	}
	/**
	 * sorts array of strings
	 * @param strNumbers array of strings containing the positive integer numbers
	 * length of each string can not be more than three symbols
	 * String containing "123" should be greater than string containing "23" as the number 123 greater than
	 * number 23
	 */
	static public void sortStringsAsNumbers(String[] strNumbers) {
		
		//Algorithm complexity should be O[N]
		//Implementation hint: additional helper array such that ar[10] - count of occurrences
		//of number 10 in the given array
		//find out how to get number from a string and how to convert number to string
		int helper[] = new int[MAX_NUMBER + 1];
		fillHelper(strNumbers, helper);
		sorting(strNumbers, helper);
	}
	private static void sorting(String[] strNumbers, int[] helper) {
		int indAr = 0;
		
		for (int i = 0; i < helper.length; i++) {
			for(int j = 0; j < helper[i]; j++) {
				strNumbers[indAr++] = Integer.toString(i);
			}
		}
		
	}
	private static void fillHelper(String[] strNumbers, int[] helper) {
		for (int i = 0; i < strNumbers.length; i++) {
			int index = Integer.valueOf(strNumbers[i]);
			helper[index]++;
		}
	}
	public static boolean isIPv4(String ipV4str) {
		
		return ipV4str.matches(ipV4Regex());
	}
	public static boolean isJavaVariable(String javaVariable) {
		
		return javaVariable.matches(javaVariableRegex());
	}
	public static boolean isArithmeticExpression(String expression) {
		if(!checkParentheses(expression)) {
			return false;
		}
		expression = removeSpacesAndParentheses(expression);
		
		return expression.matches(arithmeticExpression());
	}
	/**
	 * 
	 * @param expression
	 * returns string with no parentheses and no spaces
	 */
	private static String removeSpacesAndParentheses(String expression) {
//		
		// TODO Auto-generated method stub
	
	
		
		return "";
		
	}
	/**
	 * 
	 * @param expression
	 * @return true if for each '(' there is ')'
	 * examples: (ab)(dg(g)) - true
	 * (ab))((cd) - false
	 */
	private static boolean checkParentheses(String expression) {
		// TODO Auto-generated method stub
		//Hint: count with ++ for '(' and -- ')'. 
		int LengthExp = expression.length();
		int parentheses = 0;
		for(int i = 0; i < LengthExp; i++) {
			if (expression.charAt(i) == '(') {
				parentheses++;
			}
			else if (expression.charAt(i) == ')') {
				parentheses--;
			}
			
		}
		if(parentheses == 0) {
			return true;
		}
		if (parentheses > 0 || parentheses < 0 ) {
			return false;
		
		
		
		}
		return true;
		

		
		
		
	}
}
