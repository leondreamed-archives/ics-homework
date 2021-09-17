import java.util.Scanner;

class FastFood {

	public static void main(String[] args) {
		System.out.println("Welcome to Chip's Fast Food Emporium");

		int[] burgerCalories = {461, 431, 420, 0};
		int[] drinkCalories = {130, 160, 118, 0};
		int[] sideOrderCalories = {100, 57, 70, 0};
		int[] dessertCalories = {167, 266, 75, 0};

		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter a burger choice: ");
		int burger = sc.nextInt() - 1;

		System.out.print("Please enter a side order choice: ");
		int sideOrder = sc.nextInt() - 1;

		System.out.print("Please enter a drink choice: ");
		int drink = sc.nextInt() - 1;

		System.out.print("Please enter a dessert choice: ");
		int dessert = sc.nextInt() - 1;

		int totalCalories = burgerCalories[burger] + sideOrderCalories[sideOrder] + drinkCalories[drink] + dessertCalories[dessert];

		System.out.println("Your total Calorie count is " + totalCalories + ".");

		sc.close();
	}	
}
