import java.util.*;
class Review4P3 {
	public static void main(String[] args) {
	  Scanner sc = new Scanner(System.in);

		boolean goodData = false;
		int num = 0;
		while (!goodData) {
			try {
				System.out.print("Please enter a positive integer greater than 1: ");
				num = sc.nextInt();
				if (num > 0) {
					goodData = true;
				} else {
					System.out.println("Invalid integer entered.");
				}
			} catch (InputMismatchException e) {
				System.out.println("Invalid integer entered.");
				sc.nextLine();
			}
		}

		int[][] triangle = new int[num][num];
		triangle[0][0] = 1;

		for (int r = 1; r < num; ++r) {
			triangle[r][0] = r + 1;
			triangle[r][r] = r + 1;
			for (int c = 1; c < r; ++c) {
				triangle[r][c] = triangle[r-1][c] + triangle[r-1][c-1];
			}
		}

		for (int i = 0; i < num; ++i) {
			for (int j = 0; j <= i; ++j) {
				System.out.print(triangle[i][j] + " ");
			}
			System.out.println();
		}

		sc.close();
	}
}
