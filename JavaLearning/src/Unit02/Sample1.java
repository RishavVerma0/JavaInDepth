package Unit02;
import unit02.c1;
public class Sample1 {

	public static void main(String[] args) {
		c2 c = new c2();
		c2.sum(20,30);
		c2.swap("aeiou","iloveu");

	}

}

class c2 extends c1{
	public void sum(int a, int b) {
		int sum = a + b;
		System.out.println(sum);
	}

	public void swap(String s1, String s2) {
		s1 = s1 + s2;

		s2 = s1.substring(0, (s1.length() - s2.length()));
		s1 = s1.substring(s2.length());

		System.out.println("Strings after swapping: " + s1 + " " + s2);
	}
}
