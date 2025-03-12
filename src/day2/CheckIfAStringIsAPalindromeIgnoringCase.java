package day2;

public class CheckIfAStringIsAPalindromeIgnoringCase {

	public boolean isPalindrome(String datastring1) {

		String reversevalue = reverseString(datastring1);
//		boolean result = isString1SameAsString2(reversevalue, datastring1);
//		if (result == true) {
//
//			return true;
//		} else {
//
//			return false;
//		}
		return isString1SameAsString2(reversevalue, datastring1);

	}

	public String reverseString(String param1) {
		String temp = "";
		for (int i = param1.length() - 1; i >= 0; i--) {
			temp = temp + param1.charAt(i);
		}
		return temp;
	}

	public boolean isString1SameAsString2(String Param1, String param2) {

//		if (Param1.equalsIgnoreCase(param2)) {
//			return true;
//		} else {
//			return false;
//		}

		return Param1.equalsIgnoreCase(param2);
	}

}
