import java.util.Scanner;

class SearchingP7 {
	public static int bsearch(int[] arr, int num) {
		int l = 0, r = arr.length - 1;
		while (l <= r) {
			int m = (l + r) / 2;
			if (arr[m] == num) {
				System.out.print("The position of your number is: " + m);
			} else if (arr[m] < num) {
				l = m + 1;
			} else if (arr[m] > num) {
				r = m - 1;
			}
		}

		return l;
	}

	public static void sort(int[] arr) {
		for (int i = 0; i < arr.length; ++i) {
			for (int j = 0; j < arr.length - 1; ++j) {
				if (arr[j] < arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
	}

	public static void main(String[] args) {
		int[] arr = new int[20];
		for (int i = 0; i < 20; ++i) {
			arr[i] = (int) Math.floor(Math.random() * 100);
		}

		sort(arr);

		System.out.print("Enter a number: ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		int index = bsearch(arr, num);

		System.out.println("The index closest to your number is: " + index);
	}
}