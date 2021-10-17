import java.util.Scanner;

class SearchingP3 {
	public static int search(int[] nums, int val) {
		for (int i = arr.length - 1; i >= 0; i -= 1) {
			if (nums[i] == val) {
				if (i < arr.length - 1) {
					int temp = nums[i + 1];
					nums[i + 1] = nums[i];
					nums[i] = temp;
				}
				return i;
			}
		}

		return -1;
	}

	public static void main(String[] args) {
		System.out.print("Enter the length of the list: ");
		Scanner sc = new Scanner(System.in);

		int len = sc.nextInt();
		int[] nums = new int[len];

		for (int i = 0; i < len; ++i) {
			System.out.print("Enter integer " + (i + 1) + ":");
			int num = sc.nextInt();
		}

		System.out.println("Initial list:");
		for (int i : nums) {
			System.out.print(i + " ");
		}

		while (true) {
			System.out.println("Enter a value (0 to quit): ");
			int num = sc.nextInt();
			if (num == 0) {
				sc.close();
				return;
			}

			int index = search(nums, val);
			if (index != -1) {
				System.out.println("Value found at position " + index + ".");
			} else {
				System.out.println("Value not found in array.");
			}

			System.out.println("Current list:");
			for (int i : nums) {
				System.out.print(i + " ");
			}
		}

		sc.close();
	}
}
