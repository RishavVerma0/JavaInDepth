package Unit01;

/*
 * Control Statements And Conditional Statements In Java:
  -Java provides three types of control flow statements 
  -Decision making statements
  	-if Statements 
  	-Switch statements
  	
  -Loop statements
  	-do while loop
  	-while loop
  	-for loop
  	-for-each loop
  	
  -Jump Statements
  	-Break statements
  	-Continue statements
 */
public class P4_Task01_ControlAndConditionalStatementsInJava {

	public static void main(String[] args) {

		Statements obj = new Statements();

		obj.DecisionMakingStatements();
		obj.LoopStatements();
		obj.JumpStatements();

	}

}

class Statements {

	void DecisionMakingStatements() {
		int x = 10;
		int y = 12;
		if (x + y < 10) {
			System.out.println("X + Y is less than 10");
		} else {
			System.out.println("X + Y is less than 20");
		}

		int num = 2;

		// Can we use char instead of int as num??
		switch (num) {
		case 0: // case value
			System.out.println("Number is 0");
			break;

		case 1:
			System.out.println("Number is 1");
			break;

		default:
			System.out.println(num);
		}
	}

	void LoopStatements() {

		int sum = 0;
		for (int j = 1; j <= 10; j++) {
			sum = sum + j;
		}
		System.out.println("The sum of first ten natural numbers is " + sum);

		// for each
		String[] names = { "java", "c", "c++", "Python", "Javascript" };
		System.out.println("Printing the content of the array names:\n");
		for (String name : names) {
			System.out.println(name);
		}

		/*
		 * While(condition){ //Looping statements }
		 */
		int i = 0;
		System.out.println("Printing the list of first ten even numbers: \n");
		while (i <= 10) {
			System.out.println(i);
			i = i + 2;
		}

		/*
		 * Do-while do{//statements} while (condition)
		 */
		i = 0;
		System.out.println("Printing the list of first ten even numbers: \n");
		do {
			System.out.println(i);
			i = i + 2;
		} while (i <= 10);

	}

	void JumpStatements() {

		// Break

		System.out.println("Inside JumpStatements");
		for (int i = 0; i <= 10; i++) {
			System.out.println(i);
			if (i == 6) {
				break;
			}
			System.out.println(i);
		}

		// continue
		for (int i = 0; i <= 10; i++) {

			if (i == 6) {
				continue;
			}
			System.out.println(i);
		}
	}

}
