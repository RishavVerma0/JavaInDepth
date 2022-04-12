package Unit01;

/*
#Operators in java are defined as a symbol used to perform operations.

Sum = a + b;
for example +,-,/,* ... etc

-> a1+= 1; // a = a + 1

#Types of operators in java

-Unary operator:   (Prefix and post-fix) {a++, a--, ++a, --a, !a}
-Arithmetic operator:{* + - /}
-Shift operator: { << >> }
-Relational Operator: { < > >= <= == != }


-Bitwise Operator: {& ^ |} {bitwise AND, exclusive OR, inclusive OR}
-Logical Operator: {&& ||}

-Ternary Operator: {? :}
-Assignment Operator: { = += -= /= 5= &= ^= != <<= >>= >>>=2}
	 */
public class P3_Task02_OperatorsInJava {

	public static void main(String[] args) {

		OperatorsInJava obj = new OperatorsInJava();
		obj.UnaryOperator();
		obj.ArithmeticOperator();
		obj.ShiftOperator();
		obj.RelationalOperator();
		obj.BitwiseAndLogicalOperator();
		obj.TernaryOperator();
		obj.AssignmentOperator();

	}

}

class OperatorsInJava {

	void UnaryOperator() {
		int a = 10;
		boolean b = false;
		System.out.println("Inside UnaryOperator");
		System.out.println(a++); // 10
		System.out.println(a--);
		System.out.println(++a);
		System.out.println(--a);

		/*
		 * Bitwise compliment(~) This unary operator returns one's compliment
		 * representation of the input value With all bits inverted which means it takes
		 * every ones to zero and zero to one
		 */

		System.out.println(~a);

		// Not operator (!): It is used to reverse the value of operand

		System.out.println(!b);
		System.out.println("\n");
	}

	void ArithmeticOperator() {
		System.out.println("Inside Arithmetic Operator");

		int a = 10;
		int b = 5;
		System.out.println(a + b);// 15
		System.out.println(a - b);// 5
		System.out.println(a * b);// 50
		System.out.println(a / b);// 2
		System.out.println(a % b);// 0

		// what is the output of this expression
		System.out.println(((10 * 10) / 5) + 3 - ((1 * 4) / 2));

		System.out.println("\n");
	}

	void ShiftOperator() {
		System.out.println("Inside ShiftOperator");

		System.out.println(10 << 2);
		System.out.println(10 << 3);
		System.out.println(20 << 2);
		System.out.println(15 << 4);

		System.out.println(10 >> 2);
		System.out.println(20 >> 2);
		System.out.println(20 >> 3);

		System.out.println("\n");
	}

	// result is either true or false
	void RelationalOperator() {

		System.out.println("Inside RelationalOperator");

		int a = 10;
		int b = 20;

		System.out.println(a == b);
		System.out.println(a != b);
		System.out.println(a > b);
		System.out.println(a < b);
		System.out.println(a >= b);
		System.out.println(a <= b);

		System.out.println("\n");

	}

	void BitwiseAndLogicalOperator() {
		System.out.println("Inside BitwiseOperators");

		int a = 10;
		int b = 5;
		int c = 20;

		// logical && and bitwise &
		System.out.println("a<b && a++<c");// false && true = false
		System.out.println("a"); // 10 because condition is not checked

		System.out.println("a<b & a++<c");// false && true = false
		System.out.println("a"); // 11 because second condition is checked

		// logical || and bitwise |

		System.out.println("a>b || a<c");
		System.out.println("a>b || a<c");

		System.out.println("a>b || a++<c");// true || true = true
		System.out.println("a");

		System.out.println("a>b | a++<c");// true | true = true
		System.out.println("a");

		/*
		 * Exclusive and Inclusive or{| and ^} in case of or: 0|1 = 1, 1|0 = 1|1 = 1,
		 * 0|0 = 0 in case of xor: 0|1 = 1, 1|0 = 1, 1|1 = 0, 0|0 = 0
		 */

		System.out.println("Bitwise inclusive OR:" + (12 | 12)); // 1100 | 1100 = 1100
		System.out.println("Bitwise exclusive OR:" + (12 ^ 12)); // 1100 | 1100 = 0000

		System.out.println("\n");

	}

	void TernaryOperator() {

		System.out.println("Inside TernaryOperator");

		int a = 2;
		int b = 5;
		int min = (a < b) ? a : b;

		System.out.println(min);

		System.out.println("\n");
	}

	void AssignmentOperator() {

		System.out.println("Inside AssignmentOperator");

		int a = 10;
		int b = 20;

		a += 4;// a = a+4 (a=10+4)
		b -= 4;// b = b-4 (b=20-4)
		System.out.println(a);
		System.out.println(b);

		// Exercise??

		b >>>= 2;
		System.out.println(b);

		a = 10;
		a += 3;
		System.out.println(a);
		a -= 4;
		System.out.println(a);
		a *= 2;
		System.out.println(a);
		a /= 2;
		System.out.println(a);

		System.out.println("\n");
	}

}
