package Unit01;

public class P6_Task02_StringsInJava {

	public static void main(String[] args) {

		StringInJava obj = new StringInJava();
		obj.StringDefinition();
		obj.charAndString();

	}

}

class StringInJava {
	void StringDefinition() {

		String s = "Hello There!";
		String s1 = new String("I Love You :)");
		System.out.println(s);

		// get length of the string
		System.out.println(s.length());

		// loop through a string!
		for (int i = 0; i < s.length(); i++) {
			System.out.println(s.charAt(i));
		}

		String first = "Rishav";
		String second = "Verma";

		// Add two Strings
		String third = first + second;
		System.out.println(third);

		// compare two strings

		boolean result1 = first.equals(second);
		System.out.println(result1);

		/*
		 * In java Strings are immutable In java, the JVM maintains a string pool to
		 * store all of its string inside the memory. The String pool helps is reusing
		 * the strings. -If the string is already exists, the new string is not created.
		 * -Instead, the new reference, example points to the already existed
		 * String(java). -If the string doesn't exists, the new string(java is created)
		 */

		String fourth = "Rishav";
		String fifth = new String("Verma");
	}

	/*
	 * Character arrays are mutable but Strings are not
	 */

	void charAndString() {

		char[] ch = { 'I', 'L', 'O', 'V', 'E', 'Y', 'O', 'U' };
		char[] ch2 = { ':', ')' };

		System.out.println(ch);

		for (int i = 0; i < ch.length; i++) {
			System.out.println(ch[i]);
		}

		String s1 = new String(ch);
		System.out.println(s1);

		// Character arrays are mutable but strings are not!
		ch[0] = 'i';
		// s1.charAt(0) = 'i';

		/*
		 * Join two java strings - +' can be used to append two strings together to form
		 * a new string - but not possible in char array
		 */

		// String to char array

		String s2 = "Haaye";
		char[] sh4 = s2.toCharArray();

		// char array to string
		char[] a2 = { 'A', 'Y', 'E' };
		String s3 = new String(a2);
	}
}