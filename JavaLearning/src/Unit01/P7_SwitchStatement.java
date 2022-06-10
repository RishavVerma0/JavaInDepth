package Unit01;

import java.util.Scanner;

/* Problem Statement: P7_SwitchStatements: 
   Create a switch statement [Manual], In Which:
	 a. When you pass 1 your program would print current year
	 b. When you pass 2 your program would print current month
	 c. When you pass 3 your program would print current day
	 d. When you pass 4 your program would print Not applicable 
 * */

public class P7_SwitchStatement {

	public static void main(String[] args) {

		SwitchStatements obj = new SwitchStatements();
		obj.switchStatements();

	}

}

class SwitchStatements {
	void switchStatements() {

		Scanner obj1 = new Scanner(System.in);
		System.out.println("Enter your choice");

		int Choice = obj1.nextInt();

		switch (Choice) {
		case 1: {
			if (Choice == 1) {
				System.out.println("2022");
			}
			break;
		}

		case 2: {
			if (Choice == 2) {
				System.out.println("April");
			}
			break;
		}
		case 3: {
			if (Choice == 3) {
				System.out.println("Saturday");
			}
			break;
		}
		default: {
			System.out.println("Invalid Choice");
		}
			break;

		}

	}
}