class Review4P2 {
	public int[][] list = {{1, 2}, {3, 4}, {5, 6}};

	public int numberOfElements() {
		return list.length * list[0].length;
	}

	public int sumOfElements() {
		int sum = 0;
		for (int[] intList : list) {
			for (int i : intList) {
				sum += i;
			}
		}
		return sum;
	}

public int numMultiplesOfThree() {
	int count = 0;
	for (int[] intList : list) {
		for (int i : intList) {
			if (i % 3 == 0) {
				count += 1;
			}
		}
	}
	return count;
}

public int positiveDiffBetweenLargestAndSmallest() {
	int minimum = list[0][0];
	int maximum = list[0][0];

	for (int[] intList : list) {
		for (int i : intList) {
			if (i > maximum) {
				maximum = i;
			}
			if (i < minimum) {
				minimum = i;
			}
		}
	}

	return maximum - minimum;
}
}

