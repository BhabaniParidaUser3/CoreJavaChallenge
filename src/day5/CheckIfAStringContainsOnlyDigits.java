package day5;

public class CheckIfAStringContainsOnlyDigits {

	public static boolean CheckStringContainsonlyDigit(String str) {
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch < '0' || ch > '9') {
				return false;
			}

		}
		return true;
	}

	public static void main(String[] args) {
		System.out.println(CheckStringContainsonlyDigit("bhabani123"));
		System.out.println(CheckStringContainsonlyDigit("123bhabani"));
		System.out.println(CheckStringContainsonlyDigit("123bhabani123"));
		System.out.println(CheckStringContainsonlyDigit("123"));
		System.out.println(CheckStringContainsonlyDigit("Bhabani"));





	}

}
