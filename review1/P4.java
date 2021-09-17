import java.util.Scanner;

class Review1P4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a number smaller than 1000: ");
		int num = sc.nextInt();
		System.out.println("The hundreds place digit: " + num / 100);
		System.out.println("The tens place digit: " + num % 100 / 10);
		System.out.println("The ones place digit: " + num % 10);

		sc.close();
	}

}
