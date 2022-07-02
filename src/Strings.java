package telran.text.tests;

public class Strings {
	
	


	public static int[] deepNoRepetedCompare(String str1, String str2) {
/*
		int countIs = 0;
		int countNo = 0;
		
		String str3 = str2;
		
		for(int i = 0; i < str1.length(); i++) {
			if(str1.charAt(i) == str2.charAt(i)) {
				countIs++;
				
			if (str1.charAt(i) != str2.charAt(i)) {
				for(int j = 0; j < str3.length(); j++) {
					if(str1.charAt(i) == str3.charAt(j)) {
					countNo++;
					}
				}
			}
			
			}
		 int[] countArray  = {countIs, countNo};
			
		}
		
		return countArray; //{countIs countNo};
	}
*/
		//TODO
				//Two implementation hints
				//   first: additional helper array such that array['a'] 
				//          is an index of the symbol 'a' in str1 or -1
				//          example, str1 - "ctab" then array['a'] = 2;
				// ************************************************
				//   second: implementation based on the method indexOf
		
		int countIs = 0;
		int countNo = 0;
		
		String str3 = str2;
		
		for(int i = 0; i < str1.length(); ) {
			if(str1.charAt(i) == str2.charAt(i)) {
				countIs++;
			}
			if (str1.charAt(i) != str2.charAt(i)) 				{
				for(int j = 0; j < str3.length(); j++)	 	{
					if(str1.charAt(i) == str3.charAt(j)){
						countNo = str3.indexOf(j) + 1;
						break;
						}
					}
					 
				}
			 int[] countArray  = {countIs, countNo};
		return countArray;
		}
	}

	public static boolean isAnagram(String str1, String str2) {
	
		String HadashStr1;
		String HadashStr2;
		if (str1.length() != str2.length()) {
			return false;
		}
		
		else {
			HadashStr1 = str1.toLowerCase();
			HadashStr2 = str2.toLowerCase();
			
			return sort(HadashStr1).equals(sort(HadashStr2));
			
			
		}
		
	}

	private static String sort(String HadashStr1) {
		
		char[] result = HadashStr1.toCharArray();
	    java.util.Arrays.sort(result);
		return new String(result);
	}
	
}

