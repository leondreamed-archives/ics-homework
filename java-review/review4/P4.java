import java.util.Scanner;
class Review4P4 {
	public static void main(String[] args) {
		int[] occurrences = new int[51];
		System.out.print("Enter the integers between 1 and 50: ");

		Scanner sc = new Scanner(System.in);
		while (true) {
			int num = sc.nextInt();
			if (num == 0) break;
			occurrences[num] += 1;
		}

		for (int i = 1; i <= 50; ++i) {
			if (occurrences[i] != 0) {
				System.out.println(i + " occurs " + occurrences[i] + (occurrences[i] == 1 ? " time" : " times"));
			}
		}

		sc.close();
	}	
}
