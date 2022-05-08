/* 5Q.  WAP in Java which would contain 8 objects of a Class Employee.
		Employee contains name, age, department, salary. Your program would
		be able to calculate the total salary to be paid in each department. Use
		constructors to create these 8 objects and Scanner to take inputs.
		Restrictions:
		1- Minimum 8 objects [can be created manually with parameterized
		constructors with Scanner input]
		2- Departments are, A, B, C, D: minimum 4 departments [String Type]
		3- If the Salary exceeds more than 30,000, then the default salary
		would be 25000 of any of the employee
		4- Use array of objects, instead of using multiple 8 objects separately
		Use:
		Employee arr[] = new Employee[8];
		And
		arr[i].department.equals("A");
*/

package Assignment01;

import java.util.Scanner;

class Employee
{
	String Name;
	int age;
	String Department;
	int Salary;
	static int SalA,SalB,SalC,SalD;
	Employee()
	{
		System.out.println("Enter Student Details:");
		Scanner s=new Scanner(System.in);
		System.out.print("Name: ");
		this.Name=s.nextLine();
		System.out.print("Age: ");
		this.age=s.nextInt();
		System.out.print("Department: ");
		this.Department=s.next();
		System.out.print("Salary ");
		this.Salary=s.nextInt();
		if(this.Salary>=30000) this.Salary=25000;
	}
	
	
}
public class Question05 {

	public static void main(String[] args) {
		Employee array[];
		array=new Employee[8];
		for(int i=0;i<8;i++)
		{
			array[i]=new Employee();
		}
		for(int i=0;i<8;i++)
		{
			int sumA=0,sumB=0,sumC=0,sumD=0;
			if(array[i].Department=="A")
			{
				sumA+=array[i].Salary;
			}
			else if(array[i].Department=="B")
			{
				sumB+=array[i].Salary;
			}
			else if(array[i].Department=="C")
			{
				sumC+=array[i].Salary;
			}
			else {
				sumD+=array[i].Salary;
			}
				
		}
		System.out.println("For A: "+Employee.SalA);
		System.out.println("For B: "+Employee.SalB);
		System.out.println("For C: "+Employee.SalC);
		System.out.println("For D: "+Employee.SalD);
	}

}



