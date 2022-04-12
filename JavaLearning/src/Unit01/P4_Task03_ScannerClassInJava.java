package Unit01;

import java.util.Scanner;

/* When user takes input from the console!
 * 
  nextLine()  Reads user input [to read strings]
  next()      Reads next token from the input entered by the user
  
  nextBoolean() Reads a boolean value from user
  nextByte()   	Reads a byte value from user
  nextDouble()	Reads a double value from user
  nextFloat()	Reads a float value from user
  nextInt()		Reads a int value from user
  nextLine()	Reads a String value from user
  nextLong()	Reads a Long value from user
  nextShort()	Reads a short value from user
  
 */

public class P4_Task03_ScannerClassInJava {

	public static void main(String[] args) {

		Scanner myObj1 = new Scanner(System.in); // create a scanner object
		Scanner myObj2 = new Scanner(System.in);

		// Read the First-Token: (_Space bar)

		String firstName = myObj1.next();
		System.out.println("Name is -> " + firstName + "\n");

		String name = myObj2.nextLine(); // (\n)
		String name2 = myObj2.nextLine(); // (\n)

		System.out.println("Name is -> " + name + "\n");
		System.out.println("Name is -> " + name2 + "\n");

		boolean b = myObj2.nextBoolean();
		System.out.println(b + "\n");

		myObj1.close();
		myObj2.close();

	}

}
