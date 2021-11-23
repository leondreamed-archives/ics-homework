class SimpleRecursionP14 {
	public static String removeOddDigits(String str) {
		// Base case
		if (str.length() == 0) return "";
		// If number is even
		if (Integer.parseInt(str.substring(0, 1)) % 2 == 0) {
			return removeOddDigits(str.substring(1)) + str.substring(0, 1);
		}
		// Number is odd
		else {
			return removeOddDigits(str.substring(1)) + "_";
		}
	}

	public static void main(String[] args) {
		System.out.println(removeOddDigits("123456677"));
	}
}