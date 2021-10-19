class SortingP10 {
	public static void shakeSort(double[] arr) {
		int i = 0;
		while (true) {
			boolean swapped = false;
			// If even, carry small values to bottom
			if (i % 2 == 0) {
				for (int j = arr.length - 1; j > 0; --j) {
					if (arr[j] < arr[j - 1]) {
						swapped = true;
						double temp = arr[j];
						arr[j] = arr[j - 1];
						arr[j - 1] = temp;
					}
				}
			}
			// If odd, carry large values to top
			else {
				for (int j = 0; j < arr.length - 1; ++j) {
					if (arr[j] > arr[j + 1]) {
						swapped = true;
						double temp = arr[j];
						arr[j] = arr[j + 1];
						arr[j + 1] = temp;
					}
				}
			}
			if (!swapped) {
				break;
			} else {
				i++;
			}
		}
	}

	public static void main(String[] args) {
		double[] arr = {5, 3, 1, 2, 4, 9, 1};
		shakeSort(arr);
		for (double i : arr) {
			System.out.print(i + " ");
		}
	}
}
