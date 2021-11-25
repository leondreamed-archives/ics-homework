import java.util.Scanner;

class Power {
	// Computes x^n
	public static int power(int x, int n) {
		if (n == 0) {
			return 1;
		}
		return x * power(x, n - 1);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a value for X: ");
		int x = sc.nextInt();
		System.out.print("Enter a value for N: ");
		int n = sc.nextInt();
		System.out.println("X^N is equal to " + power(x, n));
		sc.close();
	}
}
