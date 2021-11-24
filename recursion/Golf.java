import java.util.Scanner;

class GolfResult {
	public int numShots;
	public int[] numShotsPerClub;
}

class Golf {
	public static int golf1(int holeLength, int[] clubLengths) {
		int numShots = 0;
		for (int i = 0; i < clubLengths.length; i += 1) {
			int numShotsWithClub = holeLength / clubLengths[i];
			numShots += numShotsWithClub;
			holeLength -= numShotsWithClub * clubLengths[i];
		}
		return numShots;
	}

	// Returns the least number of shots. Returns -1 when it is impossible
	// to get to the hole
	public static int golf2(int holeLength, int[] clubLengths) {
		if (holeLength == 0) return 0;
		int minShots = Integer.MAX_VALUE;
		for (int clubLength : clubLengths) {
			if (clubLength <= holeLength) {
			int numShots = 1 + golf2(holeLength - clubLength, clubLengths);
			if (numShots != -1 && numShots < minShots) {
				minShots = numShots;
			}
		}
		}

		if (minShots == Integer.MAX_VALUE) {
			return -1;
		}

		return minShots;
	}

	public static int getNumShots(int[] numShotsPerClub) {
		int numShots = 0;
		for (int clubNumShots : numShotsPerClub) {
			numShots += clubNumShots;
		}
		return numShots;
	}


	// Returns an array where each index represents the club and the value
	// represents the number of times the club was used. If there was no solution,
	// it returns an empty array.
	public static int[] golf3(int holeLength, int[] clubLengths) {
		int[] numShotsPerClub = new int[clubLengths.length];
		int minClub = Integer.MAX_VALUE;

		if (holeLength == 0) return numShotsPerClub;

		int minShots = Integer.MAX_VALUE;
		for (int i = 0; i < clubLengths.length; i += 1) {
			int clubLength = clubLengths[i];
			if (clubLength <= holeLength) {
				int[] curNumShotsPerClub = golf3(holeLength - clubLength, clubLengths);
				if (curNumShotsPerClub.length == 0) continue;

				int numShots = getNumShots(curNumShotsPerClub);
				if (numShots != -1 && numShots < minShots) {
					minShots = numShots;
					minClub = i;
					numShotsPerClub = curNumShotsPerClub;
				}
			}
		}

		if (minShots == Integer.MAX_VALUE) {
			return new int[0];
		}

		numShotsPerClub[minClub] += 1;

		return numShotsPerClub;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter hole length: ");
		int holeLength = sc.nextInt();
		System.out.print("Enter number of clubs: ");
		int numClubs = sc.nextInt();
		System.out.println("Enter the club lengths one per line:");
		int[] clubLengths = new int[numClubs];
		for (int i = 0; i < numClubs; ++i) {
			clubLengths[i] = sc.nextInt();
		}
		int[] numShotsPerClub = golf3(holeLength, clubLengths);
		if (numShotsPerClub.length == 0) {
			System.out.println("The hole cannot be reached.");
			return;
		}

		System.out.println("Number of times each club was used:");
		for (int i = 0; i < numClubs; ++i) {
			System.out.println("Club " + (i + 1) + ": " + numShotsPerClub[i]);
		}
	}
}
