import java.util.Scanner;
class Review4P5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), m = sc.nextInt();
		sc.nextLine();

		boolean[][] hasMine = new boolean[n][m];
		int[][] adjacentMines = new int[n][m];
		for (int y = 0; y < n; ++y) {
			String row = sc.nextLine();
			for (int x = 0; x < m; ++x) {
				char ch = row.charAt(x);
				if (ch == '.') {
					hasMine[y][x] = false;
				} else {
					hasMine[y][x] = true;
				}
			}
		}

		for (int y = 0; y < n; ++y) {
			for (int x = 0; x < m; ++x) {
				if (hasMine[y][x]) continue;

				int mines = 0;
				if (y > 0) {
					if (hasMine[y - 1][x]) mines += 1;
					if (x > 0 && hasMine[y - 1][x - 1]) mines += 1;
					if (x < m - 1 && hasMine[y - 1][x + 1]) mines += 1;
				}

				if (y < n - 1) {
					if (hasMine[y + 1][x]) mines += 1;
					if (x > 0 && hasMine[y + 1][x - 1]) mines += 1;
					if (x < m - 1 && hasMine[y + 1][x + 1]) mines += 1;
				}

				if (x > 0 && hasMine[y][x - 1]) mines += 1;
				if (x < m - 1 && hasMine[y][x + 1]) mines += 1;

				adjacentMines[y][x] = mines;
			}
		}

		for (int y = 0; y < n; ++y) {
			for (int x = 0; x < m; ++x) {
				if (hasMine[y][x]) System.out.print("*");
				else System.out.print(adjacentMines[y][x]);
			}
			System.out.println();
		}

		sc.close();
	}
}
