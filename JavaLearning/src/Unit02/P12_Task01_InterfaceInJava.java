package Unit02;

/*
 -An interface is a completely(100%) "abstract class",
 -that is used to group related methods with empty bodies 
 
 -Need of interface?
 -Multiple interface can be implemented at the same time in one class?
 
 -Can an interface extends another interface?
 * 
 */


//interface (100%abstract class)
interface Animal{
	public void animalSound();//interface method (does not have a body)
	public void run();// interface method (does not have a body)
}

interface Human{
	public void  humanSound();// interface method (does not have a body)
	public void run1();// interface method (does not have a body)
	
}
public class P12_Task01_InterfaceInJava implements Animal {

	public static void main(String[] args) {
		
		C1 obj = new C1();
		obj.funcA();
		obj.funcB();
		

	}

	@Override
	public void animalSound() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
}

//Multiple interfaces can be implemented at the same time!
class Species implements Animal, Human {

	@Override
	public void humanSound() {
		System.out.println("We ar in human sound method");
		
	}

	@Override
	public void run1() {
		System.out.println("We are in run1 method");
		
	}

	@Override
	public void animalSound() {
		System.out.println("We are in animal sound method");
		
	}

	@Override
	public void run() {
		System.out.println("we are in run method");
		
	}
	
}

interface A1{
	void funcA();
}

interface B1 extends A1 {
	void funcB();
	
}

class C1 implements B1 {
	public void funcA() {
		System.out.println("This is funcA from A1");
	}

	public void funcB() {
		System.out.println("This is funcB from A2");
	}
}































