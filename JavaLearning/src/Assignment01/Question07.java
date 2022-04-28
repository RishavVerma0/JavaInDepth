package Assignment01;

public class Question07 {

	public static void main(String[] args) {
		// count of object created 
		// count of display() method called
		Employee1 obj1 = new Employee1();
		Employee1 obj2 = new Employee1();
		Employee1 obj3 = new Employee1();
		obj2.display();
		obj3.display();

	}
}

class Employee1
{
	static int object_count = 0;
	static int method_count = 0;
	Employee1()
	{
		object_count ++;
	}
	
	void display()
	{
		method_count++;
	}
	
	void print()
	{
		System.out.println("Object count "+ object_count + "method count "+method_count);
	}
}