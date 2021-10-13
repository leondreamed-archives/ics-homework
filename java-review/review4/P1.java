class Review4P1 {
	public static int[] list = {1, 2, 3};
	
	public int numberOfZeros() {
		int count = 0;
		for (int i : list) {
			if (i == 0) {
				count += 1;
			}
		}
		return count;
	}

	public int productOfElements() {
		int product = 1;
		for (int i : list) {
			product *= i;
		}
		return product;
	}

	public int sumOfPositiveElements() {
		int sum = 0;
		for (int i  : list) {
			if (i > 0) {
				sum += i;
			}
		}
		return sum;
	}

	public int minimumValue() {
		int minimum = list[0];
		for (int i : list) {
			if (i < minimum) {
				minimum = i;
			}
		}
		return minimum;
	}
}
