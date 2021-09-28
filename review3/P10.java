import java.util.Scanner;

class Review3P10 {
	public static int leastFactor(int n) {
		if (n > 1) {
			for (int i = 2; i <= (int) Math.ceil(Math.sqrt(n)); i += 1) {
				while (n % i == 0) {
					if (n == i)
						return n;
					n /= i;
				}
			}

			return n;
		} else {
			return 0;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.print("Enter a number: ");
			int n = sc.nextInt();
			if (n < 1)
				break;

			System.out.print("Prime factors: ");
			if (n == 1) {
				System.out.println("1");
			} else {
				while (n > 1) {
					int f;
					do {
						f = leastFactor(n);
						System.out.print(f + " ");
						n /= f;
					} while (n != 1);
				}

				System.out.println();
			}
		}
		sc.close();
	}
}
