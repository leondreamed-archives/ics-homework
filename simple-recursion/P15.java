class SimpleRecursionP15 {
	public static String lcs(String str1, String str2) {
		// The LCS where one string is empty is 0
		if (str1.length() == 0 || str2.length() == 0) return "";

		// If the first characters of the strings match, then find the LCS of
		// the substring without the first character
		if (str1.charAt(0) == str2.charAt(0)) {
			return str1.charAt(0) + lcs(str1.substring(1), str2.substring(1));
		}
		else {
			String lcs1 = lcs(str1.substring(1), str2);
			String lcs2 = lcs(str1, str2.substring(1));
			if (lcs1.length() > lcs2.length()) {
				return lcs1;
			} else {
				return lcs2;
			}
		}
	}
	public static void main(String[] args) {
		System.out.println(lcs("GGCACCACG", "ACGGCGGATACG"));
	}
}
