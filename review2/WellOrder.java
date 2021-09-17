public class WellOrder {
	public static void main(String[] args) {
		int count = 0;

		System.out.println("The three digit well ordered numbers are: ");
		for (int i = 100; i <= 999; ++i) {
			int h = i / 100;
			int t = i / 10 % 10;
			int o = i % 10;

			if (h < t && t < o) {
				System.out.print(i + " ");
				count += 1;
			}
		}

		System.out.println("The total number is " + count);
	}
}
