class BadNews 
/* a really terrible mess */ // (1) Missing */
{
	public static void main(String[] args) { // (2) String must be capitalized
		int i = 34, j = 2; // (3) Cannot assign a float type to an int
		System.out.println("Values are " + i); // (4) Must use double quotes for strings, (5) println only takes one argument
	}
}