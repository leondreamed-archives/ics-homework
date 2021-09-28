import java.util.Scanner;
class Review3P1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the value for X: ");
		int x = sc.nextInt();
		System.out.print("Enter the value for Y: ");
		int y = sc.nextInt();
		double powResult1 = Math.pow(Math.E, y * Math.log(x));
		double powResult2 = Math.pow(x, y);

		System.out.println("The value of X^Y using the formula e^(Y*ln(X)) is " + powResult1);
		System.out.println("The value of X^Y using Math.pow is: " + powResult2);

		sc.close();
	}
}
