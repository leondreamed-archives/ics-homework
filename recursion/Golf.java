import java.util.Scanner;

class Golf {
	public static int golf1(int holeLength; int[] clubLengths) {
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
			int numShots = 1 + golf(holeLength - clubLength, clubLengths);
			if (numShots != -1 && numShots < minShots) {
				minShots = numShots;
			}
		}
		}
		if (minShots == Integer.MAX_VALUE) {
			return -1;
		}
	}

	public static int golf3(int holeLength, int[] clubLengths, int[] numClubShots) {
		if (holeLength == 0) return 0;
		int minShots = Integer.MAX_VALUE;
		int minShotClub = 0;
		for (int i = 0; i < clubLengths.length; i += 1) {
			if (clubLength <= holeLength) {
			int numShots = 1 + golf(holeLength - clubLength, clubLengths);
			if (numShots != -1 && numShots < minShots) {
				minShots = numShots;
				minShotClub = i;
			}
		}

		nonClubs
		}



		if inShots == Integer.MAX_VALUE) {
			return -1;
		}
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

	}

}
