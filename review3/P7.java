import java.util.Scanner;

class Review3P7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a sentence: ");
		String sentence = sc.nextLine();

		System.out.print("Enter a string: ");
		String str = sc.next();

		while (sentence.indexOf(str) != -1) {
			int index = sentence.indexOf(str);
			sentence = sentence.substring(0, index) + sentence.substring(index + str.length());
		}

		System.out.println(sentence);

		sc.close();
	}
}
