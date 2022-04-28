/*
WAP to count the total number of calls for a member function from more than one objects. 
[Let’s say, from 3 such Objects]
*/		
package Assignment01;

public class Question02 {

	public static void main(String[] args) {
		check o1 = new check();
		check o2 = new check();
		check o3 = new check();
		
		o1.method();
		o2.method();
		o3.method();
		//get result
		o3.print_count();

	}

}

class check
{
	static int count = 0;
	
	void method()
	{
		count++;
	}
	void print_count()
	{
		System.out.println("Total number of count is-> "+count);
	}
}