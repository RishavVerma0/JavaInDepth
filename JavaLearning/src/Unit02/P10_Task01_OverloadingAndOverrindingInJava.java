package Unit02;

public class P10_Task01_OverloadingAndOverrindingInJava {

	public static void main(String[] args) {
		
		OverloadingAndOverrindingInJava obj = new OverloadingAndOverrindingInJava ();
		
		System.out.println("add() with 2 parameters");
		System.out.println(obj.add(4,6));
		
		System.out.println("add() wih 3 parameters");
		System.out.println(obj.add(4,6,8));
		
		InheritFirstOne obj2 = new InheritFirstOne();
		System.out.println(obj2.add(1,2));
		
		//System.out.println(obj2.add(1,2,3));

	}

}

//Within same class : Method overloading

class OverloadingAndOverrindingInJava{
	int add(int a, int b) {
		System.out.println("Inside, OverloadingAndOverrindingInJava!:");
		return a+b;
	}
	int add(int a, int b, int c) {
		System.out.println("Inside, OverloadingAndOverrindingInJava!:");
		return a + b + c;
		
	}
}

//Overriding in java: Requires inheritance
class InheritFirstOne extends OverloadingAndOverrindingInJava{
	
	int add(int a, int b) {
		System.out.println("Inside, InheritFirstOne!:");
		return a + b + 1; 
	}
	int add(int a, int b, int c) {
		System.out.println("Inside, OverloadingAndOverrindingInJava!: ");
		return a + b+ c;
	}
	
}
