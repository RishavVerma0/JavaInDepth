package Unit01;

/* Problem Statement:

P8_String: 

(Create separate logic in separate function)

F1 - Check the entered string is palindrome or not? 
  		String s = "75457"
  		Output: Yes it is a palindrome or No it is not a palindrome.

F2 - Make a reverse of a string using?
F3 - String Compare: Check if the strings are equal or not?

 * */

public class P8_String {

	public static void main(String[] args) {

		QuestionsOnString obj = new QuestionsOnString();

		String s1 = new String("75457");
		String s2 = new String("7545a");

		obj.palindromeOrNot(s1);
		obj.reverseOfAString(s1);
		obj.stringEqualOrNot(s1, s2);

	}

}

class QuestionsOnString {

	void palindromeOrNot(String s) {

		// Method 1
		StringBuilder sb = new StringBuilder(s);
		sb.reverse();

		String rev = sb.toString();
		if (s.equals(rev)) {
			System.out.println("String is palindrome");
			;
		} else {
			System.out.println("String is not palindrome");
			;
		}
		// Method 2

	}

	void reverseOfAString(String s) {
		StringBuilder sb = new StringBuilder(s);
		sb = new StringBuilder(s);
		sb.reverse();

		String rev = sb.toString();

		System.out.println("Reversed String is ->");
		System.out.println(sb.toString());

	}

	void stringEqualOrNot(String s1, String s2) {
		if (s1.length() == s2.length()) {
			System.out.println("Both the strings are equal");
		} else
			System.out.println("Strings are not equal");

	}
}