package Unit03;
import java.util.Scanner;

public class P16_MultiThreading {

	public static void main(String[] args) {

//		ABC3 obj = new ABC3();
//		C1 obj1 = new C1();
//		obj1.show1();
//		C2 obj2 = new C2();
//		obj2.show2();
		
		Thread t1 = new Thread(new T1(), "T1");
		Thread t2 = new Thread(new T2(), "T2");
		Thread t3 = new Thread(new T3(), "T3");
		t1.start();
		t2.start();
		t3.start();
		//Thread.currentThread().getName();
//		obj.threadConcept();
//		obj.threadSynchronization();
//		obj.interThreadCommunication();
//		obj.ProducerConsumerProblems();
//		obj.Wait_And_Notify();

	}

}

class C1{
	void show1() {
		Scanner obj = new Scanner(System.in);
		int a = obj.nextInt();
		System.out.println(a);
		System.out.println("\n Done");
		obj.close();
		
	}
}

class C2{
	void show2() {
		for(int i = 0 ; i < 10 ; i++) {
			System.out.println( i + "HEYY!");
		}
	}
}


class T1 extends Thread{
	
	public void run() {
		Scanner obj = new Scanner(System.in);
		int a = obj.nextInt();
		System.out.println(a);
		System.out.println("\n Done with T1 ");
		obj.close();
	}
}

class T2 extends Thread{
	public void run() {
		for(int i = 0 ; i < 10 ; i++) {
			System.out.println( i + " HEYY!");
		}
	}
}

class T3 extends Thread{
	public void run() {
		for(int i = 0 ; i < 10 ; i++) {
			System.out.println( i + " HEYY2!");
		}
	}
}
class ABC3 {
	void threadConcept() {

	}

	void threadSynchronization() {
	}

	void interThreadCommunication() {

	}

	void ProducerConsumerProblems() {

	}

	void Wait_And_Notify() {

	}

}