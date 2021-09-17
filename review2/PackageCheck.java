import java.util.Scanner;

class PackageCheck {
	public static void main(String[] args)  {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the package weight (in kg): ");
		double packageWeight = sc.nextDouble();

		System.out.print("Enter the package length (in cm): ");
		double length = sc.nextDouble();

		System.out.print("Enter the package width (in cm): ");
		double width = sc.nextDouble();

		System.out.print("Enter the package height (in cm): ");
		double height = sc.nextDouble();

		boolean isTooLarge = length * width * height > 100000;
		boolean isTooHeavy = packageWeight > 27;

		if (isTooLarge && isTooHeavy) {
			System.out.println("Too heavy and too large.");
		} else if (isTooLarge) {
			System.out.println("Too large.");
		} else if (isTooHeavy) {
			System.out.println("Too heavy.");
		}

		sc.close();
	}
}
