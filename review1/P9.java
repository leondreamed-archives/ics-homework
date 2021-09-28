import java.util.Scanner;

class Review1P9 {
	public static void main(String[] args) {
		System.out.print("Please enter 5 grades: ");

		Scanner sc = new Scanner(System.in);

		int g1 = sc.nextInt();
		int g2 = sc.nextInt();
		int g3 = sc.nextInt();
		int g4 = sc.nextInt();
		int g5 = sc.nextInt();

		System.out.println((g1 + g2 + g3 + g4 + g5) / 5.0);

		sc.close();
	}
}