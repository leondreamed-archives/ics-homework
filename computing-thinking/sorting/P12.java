
class SortingP12 {
	public static void main(String[] args) {
		int[] arr = new int[1000];
		int[] originalArr = new int[1000];

		// Populating array with random numbers
		for (int i = 0; i < arr.length; i += 1) {
			int a = (int) Math.floor(Math.random() * 500) + 1;
			arr[i] = a;
			originalArr[i] = a;
		}
	}
}