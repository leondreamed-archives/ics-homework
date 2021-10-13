import java.util.Scanner;

class Review1P3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a string: ");
		String str = sc.nextLine();
		System.out.print("Enter a character: ");
		char ch = sc.next().charAt(0);
		System.out.print("Enter a integer: ");
		int i = sc.nextInt();
		System.out.print("Enter a float: ");
		double f = sc.nextDouble();

		System.out.println("You entered the string: " + str);
		System.out.println("You entered the character: " + ch);
		System.out.println("You entered the integer: " + i);
		System.out.println("You entered the float: " + f);

		sc.close();
	}
}