package Unit03;

class Demo {
	public static void main(String args[]) {
		Display d1 = new Display();
		Display d2 = new Display();
		MyThread t1 = new MyThread(d1, "Ayush");
		t1.start();
		MyThread t2 = new MyThread(d2, "Maheshwari");
		t2.start();
	}
}

class Display {
	public static synchronized void wish(String s) {
		for (int i = 1; i <= 5; i++) {
			System.out.println(s);
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				System.out.println(e);
			}
		}
	}
}

class MyThread extends Thread {
	Display d;
	String name;

	MyThread(Display d, String name) {
		this.d = d;
		this.name = name;
	}

	public void run() {
		d.wish(name);
	}
}