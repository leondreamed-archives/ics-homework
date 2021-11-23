class Prime {
	public static boolean prime(int n) {
		return prime(n, n-1);
	}
	public static boolean prime(int n, int d) {
		if (d == 1) return true;
		if (n % d == 0) return false;
		return prime(n, d - 1);
	}
	public static void main(String[] args) {
		System.out.println(prime(4));
		System.out.println(prime(7));
	}
}
