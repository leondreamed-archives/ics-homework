import java.util.Scanner;

class Letter {
	public static void main(String[] args) {
		System.out.print("Enter a mass: ");

		Scanner sc = new Scanner(System.in);
		double mass = sc.nextDouble();

		int cost;
		if (mass <= 30) {
			cost = 40;
		} else if (mass > 30 && mass <= 50) {
			cost = 55;
		} else if (mass > 50 && mass <= 100) {
			cost = 70;
		} else {
			cost = 70 + (int)(((mass - 100) / 50) + 1) * 25;
		}

		System.out.println("The cost of printing a letter with mass " + mass + " is " + cost + " sinas.");

		sc.close();
	}
}