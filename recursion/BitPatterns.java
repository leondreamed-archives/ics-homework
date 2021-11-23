import java.util.Scanner;

class BitPatterns {
	public static void bitpatterns(int n, int k, String pattern) {
		if (n == 0) {
			if (k == 0) {
				System.out.println(pattern);
			}
			return;
		}

		if (k > 0) {
			bitpatterns(n - 1, k - 1, pattern + "1");
		}

		bitpatterns(n - 1, k, pattern + "0");
	}

	public static void bitpatterns(int n, int k) {
		bitpatterns(n, k, "");
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		for (int i = 0; i < N; i += 1) {
			int n = sc.nextInt();
			int k = sc.nextInt();
			System.out.println("The bit patterns are: ");
			bitpatterns(n, k);
			System.out.println();
		}

		sc.close();
	}
}
