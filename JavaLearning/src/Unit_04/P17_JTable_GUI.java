package Unit_04;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JTable;

public class P17_JTable_GUI {

	public static void main(String[] args) {
		Jtable_GUI obj = new Jtable_GUI();
	}

}

class Jtable_GUI extends JFrame {

	JTable jt;

	Jtable_GUI() {

		String data[][] = { { "101", "Amit", "670000" }, { "102", "Jai", "780000" }, { "101", "Sachin", "700000" } };
		String column[] = { "ID", "NAME", "SALARY" };

		jt = new JTable(data, column);
		
		add(jt);

		setLayout(new FlowLayout());
		setVisible(true);
		setSize(400, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
