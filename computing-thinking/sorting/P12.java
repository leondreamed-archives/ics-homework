
class SortingP12 {
	public static void selectionSort(int[] arr) {
		// Sorting the strings using selection sort
		for (int i = 0; i < arr.length; i += 1) {
			int minIndex = i;
			// Find the minimum
			for (int j = i; j < arr.length; j += 1) {
				if (arr[j] < arr[minIndex]) {
					minIndex = j;
				}
			}

			int temp = arr[i];
			arr[i] = arr[minIndex];
			arr[minIndex] = temp;
		}
	}

	public static void insertionSort(int arr[]) {
		for (int i = 1; i < arr.length; i += 1) {
			int index = i - 1;
			int x = arr[i];

			while (index >= 0 && x < arr[index]) {
				arr[index + 1] = arr[index];
				index -= 1;
			}
			arr[index + 1] = x;
		}
	}

	public static void bubbleSort(int arr[]) {
		for (int i = 0; i < arr.length; i += 1) {
			for (int j = 0; j < arr.length - 1; j += 1) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
	}

	public static void populateArr(int arr[]) {
		// Populating array with random numbers
		for (int i = 0; i < arr.length; i += 1) {
			int a = (int) Math.floor(Math.random() * 500) + 1;
			arr[i] = a;
		}
	}

	public static void main(String[] args) {
		int[] arr = new int[1000];
		populateArr(arr);

		System.out.println("First 100 elements:");
		for (int i = 0; i < 100; ++i) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();

		long start = 0, end = 0;
		start = System.currentTimeMillis();
		selectionSort(arr);
		end = System.currentTimeMillis();
		System.out.println("Sorted array:");
		for (int i = 0; i < 100; ++i) {
			System.out.print(arr[i] + " ");
		}
		System.out.println("Time in milliseconds it took to sort array with selection sort: " + (end - start));

		populateArr(arr);
		start = System.currentTimeMillis();
		bubbleSort(arr);
		end = System.currentTimeMillis();
		System.out.println("Sorted array:");
		for (int i = 0; i < 100; ++i) {
			System.out.print(arr[i] + " ");
		}
		System.out.println("Time in milliseconds it took to sort array with bubble sort: " + (end - start));

		populateArr(arr);
		start = System.currentTimeMillis();
		insertionSort(arr);
		System.out.println("Sorted array:");
		end = System.currentTimeMillis();
		for (int i = 0; i < 100; ++i) {
			System.out.print(arr[i] + " ");
		}
		System.out.println("Time in milliseconds it took to sort array with insertion sort: " + (end - start));
	}
}