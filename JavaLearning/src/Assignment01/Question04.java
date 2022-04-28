package Assignment01;

public class Question04 {

	public static void main(String[] args) {
		ClassThree obj = new ClassThree(1);
		ClassThree obj1 = new ClassThree();

	}

}

class ClassOne
{
	ClassOne(int x)
	{
		System.out.println("inside first class"+ x);
	}
}

class ClassTwo extends ClassOne
{
	ClassTwo()
	{
		super(4); // calls the constructor of ClassOne
		System.out.println("Inside second class");
	}
}

class ClassThree extends ClassTwo
{
	ClassThree(int y)
	{
		
		System.out.println("Inside third class(Parameterized Constructor)");
	}
	ClassThree()
	{
		
		System.out.println("Inside third class(default constructor)");
	}
	
}