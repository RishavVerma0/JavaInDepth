package Unit01;
/*
 -Variables in java is a data container that saves the data values during java program execution
 
 Types of variables:
 In java, there are three types of variables:
 		
 			1.Local variables - Declared inside the body of a method
 			
 			 2.Instance variables - Instance variables are defined without the STATIC keyword.
 			 -They are defined outside a method declaration.
 			 -They are object specific and are known as instance variables
 			 
 			 3. Static variables 
 			 -Static variables are defined with static keyword 
 			 - static variables are initialized only once, at the start of the program execution
 			 - These static variables should be initialized first, before the initialization of any variable
 			 
 			 *Data types in java 
 			 *Reference One note
 */

public class P3_Task01_VariablesAndDataTypesInJava {

	static int q = 11;
	int p = 10;

	public static void main(String[] args) {

		// valid declarations
		int a, b, c;
		float pi;
		double d;
		char e;

		// valid initializations
		pi = 3.14f;
		d = 10.22d;
		e = 'v';

		a = 10;
		b = 10;
		c = 10;

		System.out.println(a);
		System.out.println(b);
		System.out.println(c);

		System.out.println(pi);
		System.out.println(d);
		System.out.println(e);

		int myNum = 5; // integer (whole number)
		float myFloatNum = 5.99f; // floating point number
		char myLetter = 'D'; // character
		boolean myBool = true; // boolean
		String myText = "HELLO"; // string

		System.out.println(myNum);
		System.out.println(myFloatNum);
		System.out.println(myLetter);
		System.out.println(myBool);
		System.out.println(myText);

		/*
		 * Java variable type conversion & Type Casting: Details are in oneNote
		 */

		double f;
		int i = 10;
		f = i;// type conversion

		double g = 10;
		int j;
		j = (int) g; // type casting

		System.out.println(f);
		System.out.println(i);
		System.out.println(g);
		System.out.println(j);

		byte k = 10; // 1 byte
		boolean l = true; // 1 bit = true or false only
		long m = 10L;
		float n = 1.2f;
		double o = 1.2d;

		System.out.println(k);
		System.out.println(l);
		System.out.println(m);
		System.out.println(n);
		System.out.println(o);

		System.out.println(DEF.j); // data + function/methods

		DEF obj1 = new DEF();
		System.out.println(obj1.i++);
		System.out.println(obj1.i);

		DEF obj2 = new DEF();
		System.out.println(obj2.i);

		// System.out.println(obj1.j++);
		// System.out.println(obj1.j);
		// System.out.println(obj2.j);

		System.out.println(DEF.j++);
		System.out.println(DEF.j);

		DEF.typeconversionAndtypeCasting();
	}

	int r = 10;

	void display() {
		int a = 5; // local variable
		System.out.println("This is display method");
		System.out.println(a);

	}
}

class DEF {
	static int j = 10; // class variable/static variable
	int i = 10; // instance variable

	static void display() {
		int a = 5;// local variable
		System.out.println("This is display method");
		System.out.println(a);

	}

	static void typeconversionAndtypeCasting() {

		double f; // 64 slots
		int i = 10; // 32 slots
		f = i; // type conversion
		System.out.println(f);

		double g = 10; // 64
		int j; // 32
		j = (int) g;// type casting

		// 32 bits = 64 bits
		System.out.println(i);
		System.out.println(j);

	}
}
