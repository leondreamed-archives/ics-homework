class Review1P5 {
	public static void main(String[] args) {

	
	int myNum = 5; // The integer 5 is stored somewhere in memory and this memory is associated with the variable myNum
	double yourNum = 4.5; // The double 4.5 is stored somewhere in memory and this memory is associated with yourNum
	yourNum = myNum + 2.5; // The value of myNum is retrieved (5), 2.5 is added to that value equalling 7.5, and then 7.5 is stored into the memory associated with yourNum
	yourNum = yourNum - 2; // The value of yourNum is retrieved and copied, then 2 is subtracted from that value, equalling 5.5, and then the new value is stored into the memory associated with yourNum
	System.out.println(myNum); // prints out "5" followed by a new line
	System.out.println(yourNum * 2); // prints out "11.0"
	myNum = 3 * 2; // The value of 3 * 2 is stored into the memory associated with myNum
	yourNum = myNum - yourNum; // The value of myNum is retrieved (6), 
	System.out.println(myNum);
	System.out.println(yourNum);
	} 
}
