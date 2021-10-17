import java.util.Scanner;

class SearchingP1 {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };

		System.out.print("Enter a number: ");
		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();

		for (int i = 0; i < arr.length; ++i) {
			if (arr[i] == num) {
				System.out.println(num + " found at position " + i);
				sc.close();
				return;
			}
		}

		System.out.println(num + " was not found in the array.");

		sc.close();
	}
}
