package Unit01;

/*
 * The Wrapper Class in java provides the mechanism to convert primitive into object and
 * WHY?
 * Because we want to use predefined methods of those objects
 * - boolean data types => Boolean obj; -> object.toString();
 * 
 */

public class P4_Task02_WrapperClassesInJava {

	public static void main(String[] args) {

		// converting int into integer
		int a = 20;

		String s = " " + a + " ";

		Integer i = Integer.valueOf(a); // converting int into integer explicitly
		Integer j = a; // autoboxing, now the compiler will write Integer.valueOf(a) Internally

		System.out.println(a + " " + i + " " + j);

		System.out.println(i.toString());

		// a.toString() can not be done because a is int not an object
		// Autoboxing : Converting primitives into objects

		byte b = 10;
		Byte byteobj = b;
		System.out.println(byteobj);

		// Unboxing : Converting objects into primitives
		byte bytevalue = byteobj;
		System.out.println(bytevalue);

	}

}
