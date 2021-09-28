class Review1P10 {
	public static void main(String[] args) {
		int curPopulation = 312_032_486;
		int secondsInAYear = 60 * 60 * 24 * 365;
		int yearlyIncreaseInBirths = secondsInAYear / 7;
		int yearlyIncreaseInDeaths = secondsInAYear / 13;
		int yearlyIncreaseInImmigrants = secondsInAYear / 45;

		for (int i = 1; i <= 5; ++i) {
			int increaseInBirths = yearlyIncreaseInBirths * i;
			int increaseInDeaths = yearlyIncreaseInDeaths * i;
			int increaseInImmigrants = yearlyIncreaseInImmigrants * i;

			int increaseInPopulation = increaseInBirths + increaseInImmigrants - increaseInDeaths;
			int projectedPopulation = curPopulation + increaseInPopulation;

			System.out.println("The population in " + (i + i == 1 ? "year" : "years") + " will be " + projectedPopulation);
		}
	}
}
