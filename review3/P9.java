import java.util.Scanner;

class Review3P9 {
	public static double norm(double x, double y, double z) {
		return Math.sqrt(x * x + y * y + z * z);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a: ");
		double a = sc.nextDouble();
		System.out.print("Enter b: ");
		double b = sc.nextDouble();
		System.out.print("Enter c: ");
		double c = sc.nextDouble();

		double p = 1 / norm(a, b, c);
		double q = norm(a * a, b * b, c * c);
		double r = norm(2 * a, 3 * b, 5 * c);
		double s = norm(a, a, a) * norm(2 * b, 2 * b, 2 * b) * norm(3 * c, 3 * c, 3 * c);

		System.out.println("p is " + p);
		System.out.println("q is " + q);
		System.out.println("r is " + r);
		System.out.println("s is " + s);

		sc.close();
	}
}
