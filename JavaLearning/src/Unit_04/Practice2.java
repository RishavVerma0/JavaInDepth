package Unit_04;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.JTextField;
public class Practice2 {

	public static void main(String[] args) {
		
	}

}
@SuppressWarnings("serial")
class app extends JFrame{
	
	JLabel j1;
	JLabel j2;
	
	JTextField t1;
	JTextField t2;
	JTable Tl;
	JButton a;
	JButton b;
	JButton c;
	
	app(){
		
		j1 = new JLabel("ID:");
		j2 = new JLabel("Name:");
		
		Tl = new JTable();
		
		t1 = new JTextField(20);
		t2 = new JTextField(20);
		a = new JButton("Submit");
		b = new JButton("Show Table");
		c = new JButton("Exit");
		
		add(j1);
		add(t1);
		add(j2);
		add(t2);
		add(a);
		add(b);
		add(c);
		
		
		
		setLayout(new FlowLayout());
		setVisible(true);
		setSize(400, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}