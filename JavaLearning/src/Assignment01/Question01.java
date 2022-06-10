/*
WAP which would contain 6 objects, of a class
Student. Student [Name, Age, section, percentage]. They all belong to Section-A. 
Your program would be able to find the average percentage of students in this section. 
Use constructors to create these 6 objects and input from Scanner class.
*/

package Assignment01;

public class Question01  {

	public static void main(String[] args) {
		Student obj = new Student("Rahul", 14, 'H', 88);
		Student obj1 = new Student("Kartik", 14, 'H', 78);
		Student obj2 = new Student("YAsh", 12, 'H', 98);
		Student obj3 = new Student("Shreya", 15, 'H', 38);
		Student obj4 = new Student("Niharika", 69, 'H', 58);
		Student obj5 = new Student("Anayat", 18, 'H', 98);
		//Getting the result 
		Student result = new Student();
		result.get_avg();
		

	}

}

class Student
{
	String name;
	int age;
	char Section;
	int percentage; //assuming percentage to be discrete value
	static int avg_per = 0;
	
	Student()
	{
		age = 0;
		percentage = 0;
	}
	Student(String s, int a, char sec, int per) // Constructor name should be equal to class name
	{
		name = s;
		age = a;
		Section = sec;
		percentage = per;
		avg_per += per;
	}
	
	void get_avg()
	{
		int average = avg_per/6;
		System.out.println("Average is "+average+"%"); 
	}
}
