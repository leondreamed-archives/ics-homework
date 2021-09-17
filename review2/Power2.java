import java.util.Scanner;
public class Power2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a positive integer: ");
		int num = sc.nextInt();
		int bit = Integer.highestOneBit(num);
		if (num == bit) {
			System.out.println(num);
		} else {
			System.out.println(bit << 1);
		}

		sc.close();
	}	
}
