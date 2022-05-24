package Unit03;

import java.io.IOException;
import java.util.InputMismatchException;

public class Sample {
	
	public static void main(String[] args) {
		sample2 obj = new sample2();
		obj.Abc();
		
		try {
		int a = 2 ;
		if(a<10) {
			throw new Exception();
		}
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		
	}

}
}

class sample2 {
	void Abc() {
		
			int a = 100/0 ;
		
			if(a<10) {}
				//throw new IOException();			}
	}
}