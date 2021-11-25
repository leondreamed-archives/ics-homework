class Sequence {
	// Recursive definition of kth term: k_n = k_(n-1) * k_(n-2)
	// Exit condition: k == 1 or k == 2
	// k == 1 returns 4
	// k == 2 returns 5
	public static int sequence(int k) {
		if (k == 1) return 4;
		if (k == 2) return 5;
		return sequence(k + 1) + sequence(k - 2);
	}

	public static void main(String[] args) {
		System.out.println(sequence(5));
	}
}
