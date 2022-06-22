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

		String data[][] = { { "ID", "NAME", "SALARY","Home" },
				{ "101", "Amit", "670000","UP" }, 
				{ "102", "Jai", "780000","Bihar"}, 
				{ "101", "Sachin", "700000","Uttrakhand"},
				{"104", "Rishav" ,"5000","Bihar"} };
		String column[] = {"", "", "", ""};

		jt = new JTable(data,column);
		
		add(jt);

		setLayout(new FlowLayout());
		setVisible(true);
		setSize(600, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
