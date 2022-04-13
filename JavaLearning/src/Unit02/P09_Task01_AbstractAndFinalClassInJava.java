package Unit02;

/*
 -Abstract class:
 -An abstract class must be declared with an abstract keyword
 
 -Abstract is a process of hiding the implementation details
 and showing only functionality{function declarations} to the user.
 -Can not make object of abstract class directly, but through derived class{cannot be instantiated}
 
 -Examples of abstract method?
 	-Abstract class may contain abstract and non abstract methods
 	-(0-100%) abstract methods can be there!
 	
 	-In case of Interference: 100% abstract methods should be there!
 	
 	-Final class-
 	-The main purpose of using a class being declared as final class is to prevent the class from being inherited
 	-If a class is marked as final class then no class can inherit any feature from final class.
 	-One cannot extend final class if one try to do then it will show compile time error.
 */

abstract class Bike {
	int a;

	Bike() {
		System.out.println("Inside Bike constructor: " + a + "\n");
	}

	// abstract void run();//abstract method!(0-100%)

	void display() {
		System.out.println("This is display method");
	}

}

class Honda4 extends Bike {

}

public class P09_Task01_AbstractAndFinalClassInJava {

	public static void main(String[] args) {
		Bike obj = new Honda4();
		// obj.run();
		obj.display();
		// can not be instantiated
		// Bike obj2 - new Bike();
	}

}

final class Super {
	public int data = 30;

	void display() {
		System.out.println(data);
	}
}
/*
 * public class extends Super {
 * 
 * void display2(){ 
 * 		display(); 
 * 	} 
 * }
 */
