package Assignment01;
import java.util.Scanner;
public class Question03 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number you want to check");
		int x = s.nextInt();
		testClass obj = new testClass();
		
		obj.display(x);
		
		s.close();
	}

}


interface i1{
	void display(int x);
}

class testClass implements i1{

	
	public void display(int x) {
		int flag = 0;
		
		
		for(int i = 2; i < x/2; i++) {
			if(x==0||x == 1) {
				System.out.println("Number is not Prime");
			}
			if(x%i == 0)
			{
				System.out.println("Number is not Prime");
				flag = 1;
				break;
			}
			if(flag == 0){
				System.out.println("Number is Prime");
				break;
			}
		}
		
		
	}
	
}
