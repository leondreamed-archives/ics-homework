import java.util.Scanner;

class SortingP2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 10 random strings (separated by new lines):");
		String[] strings = new String[10];
		for (int i = 0; i < 10; i += 1) {
			strings[i] = sc.nextLine();
		}

		// Sorting the strings using selection sort
		for (int i = 0; i < 10; i += 1) {
			int minIndex = i;
			// Find the maximum
			for (int j = i; j < 10; j += 1) {
				if (strings[j].compareTo(strings[minIndex]) > 0) {
					minIndex = j;
				}
			}

			String temp = strings[i];
			strings[i] = strings[minIndex];
			strings[minIndex] = temp;
		}

		System.out.println("The sorted list:");
		for (int i = 0; i < 10; i += 1) {
			System.out.println(strings[i]);
		}

		sc.close();
	}
}
