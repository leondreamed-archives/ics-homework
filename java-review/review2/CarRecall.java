import java.util.Scanner;

class CarRecall {
	public static void main(String[] args) {
		System.out.print("Enter the model of your car: ");
		Scanner sc = new Scanner(System.in);

		int model = sc.nextInt();

		if (model == 119 || model == 179 || model >= 189 && model <= 195 || model == 221 || model == 780) {
			System.out.println("Your car is defective. It must be repaired.");
		} else {
			System.out.println("Your car is not defective.");
		}

		sc.close();
	}	

}
