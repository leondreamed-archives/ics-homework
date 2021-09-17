import java.util.Scanner;
class Review3P6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String str = sc.nextLine();
		if (str.length() > 10) {
			str = str.substring(0, 10);
		}

		for (int i = 0; i < str.length() - 1; ++i) {
			System.out.print(" ".repeat(str.length() - i - 1));
			for (int j = 0; j <= i; ++j) {
				System.out.print(str.charAt(j));
			}
			for (int j = i - 1; j >= 0; --j) {
				System.out.print(str.charAt(j));
			}
			System.out.println();
		}

		for (int i = str.length() - 1; i >= 0; --i) {
			System.out.print(" ".repeat(str.length() - i - 1));
			for (int j = 0; j <= i; ++j) {
				System.out.print(str.charAt(j));
			}
			for (int j = i - 1; j >= 0; --j) {
				System.out.print(str.charAt(j));
			}
			System.out.println();
		}

		sc.close();
	}
}
