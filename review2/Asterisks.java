import java.util.Scanner;

class Asterisks {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String numbersStr = sc.nextLine();

		for (String numberStr : numbersStr.split(" ")) {
			int i = Integer.parseInt(numberStr);
			System.out.println(i + "*".repeat(i));
		}

		sc.close();
	}
}