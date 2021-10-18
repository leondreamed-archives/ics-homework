class SortingP6 {
	public static void main(String[] args) {
		String[] planets = { "Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune", "Pluto" };

		for (String planet : planets) {
			System.out.print(planet + " ");
		}
		System.out.println();

		for (int i = 1; i < planets.length; i += 1) {
			int index = i - 1;
			String curString = planets[i];

			while (index >= 0 && curString.compareTo(planets[index]) < 0) {
				planets[index + 1] = planets[index];
				index -= 1;
			}
			planets[index + 1] = curString;
		}

		for (String planet : planets) {
			System.out.print(planet + " ");
		}
		System.out.println();
	}
}
