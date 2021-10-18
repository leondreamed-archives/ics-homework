import java.util.Arrays;

class P4 {
	public static void selectionSort(int arr[], int k) {
		for (int i = arr.length - 1; i > arr.length - 1 - k; i -= 1) {
			int maxIndex = i;
			for (int j = 0; j < i; j += 1) {
				if (arr[j] > arr[maxIndex]) {
					maxIndex = j;
				}
			}
			int temp = arr[i];
			arr[i] = arr[maxIndex];
			arr[maxIndex] = temp;
		}
	}

	public static void main(String[] args) {
		int arr[] = { 3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 5 };
		selectionSort(arr, 4);
		System.out.println(Arrays.toString(arr));
	}
}
