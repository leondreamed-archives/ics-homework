import java.util.Stack;
import java.util.ArrayList;
import java.util.Scanner;

class Brackets {
	public static boolean isLeftBracket(char c) {
		return c == '(' || c == '[' || c == '{' || c == '<';
	}

	public static boolean isRightBracket(char c) {
		return c == ')' || c == ']' || c == '}' || c == '>';
	}

	public static boolean isMatchingBracket(char l, char r) {
		return (l == '(' && r == ')') || (l == '[' && r == ']') || (l == '{' && r == '}') || (l == '<' && r == '>');
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a sequence of brackets: ");
		String bracketSequence = sc.nextLine();

		Stack<Character> stack = new Stack<>();

		for (int i = 0; i < bracketSequence.length(); i += 1) {
			char currentCharacter = bracketSequence.charAt(i);
			if (isLeftBracket(currentCharacter)) {
				stack.push(currentCharacter);
			} else if (isRightBracket(currentCharacter)) {
				if (stack.isEmpty()) {
					System.out.println("This string does not have a legal bracket structure.");
					sc.close();
					return;
				}

				char leftBracket = stack.pop();
				if (!isMatchingBracket(leftBracket, currentCharacter)) {
					System.out.println("This string does not have a legal bracket structure.");
					sc.close();
					return;
				}
			}
		}

		if (!stack.isEmpty()) {
			System.out.println("This string does not have a legal bracket structure.");
			sc.close();
			return;
		}

		System.out.println("This string has a legal bracket structure.");
		sc.close();
	}
}