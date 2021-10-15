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
		for (int i = 1; i < 10; i += 1) {
			// Finding the first index of the string that is less
			int index = i - 1;
			String curString = strings[i];

			while (index >= 0 && curString.compareTo(strings[index]) < 0) {
				strings[index + 1] = strings[index];
				index -= 1;
			}
			strings[index + 1] = curString;
		}

		System.out.println("The sorted list:");
		for (int i = 0; i < 10; i += 1) {
			System.out.println(strings[i]);
		}

		sc.close();
	}
}
