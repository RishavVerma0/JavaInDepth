/*
 * Q6. As given there are two sample methods: First one returns the sum of two numbers a and b and second one returns 
 * the subtraction of a and b. if a-b is negative then return value would be 0. Use ternary operator to call these two methods. 
 * If a>b then ternary should call sum(a,b) but if a<b then ternary operator should call sub(a,b). Eventually print the result of 
 * the ternary operation on variable a and b.
Note: Ternary operator can call a method even for true and false values
 */

package Assignment01;
import java.util.Scanner;
public class Question06 {

	public static void main(String[] args) {
		
		arithmetic obj  = new arithmetic();
		Scanner s = new Scanner(System.in);
		int a = 10;
		int b = 20;
		
		a = (a > b)?obj.add(a, b):obj.sub(a, b);
	}

}


class arithmetic
{
	int add(int a, int b)
	{
		return a+b;
	}
	
	int sub(int a, int b)
	{
		int res = a - b;
		if(res < 0)
		{
			return 0;
		}
		return res;
	}
}