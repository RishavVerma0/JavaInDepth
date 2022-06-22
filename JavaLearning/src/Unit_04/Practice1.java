package Unit_04;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Practice1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		application a = new application();

	}

}


@SuppressWarnings("serial")
class application extends JFrame{
	
	
	
	JButton a;
	JButton b;
	JButton c;
	JButton d;
	JButton e;
	
	JTextField t1;
	JTextField t2;
	JTextField t3;
	
	JLabel label1;
	JLabel label2;
	JLabel label3;
	
	application(){
		t1 = new JTextField(20);
		t2 = new JTextField(20);
		t3 = new JTextField(20);
		
		label1 = new JLabel("First Number");
		label2 = new JLabel("Second Number");
		label3 = new JLabel("Result");
		
		a = new JButton("Sum");
		b = new JButton("Sub");
		c = new JButton("Mul");
		d = new JButton("Div");
		e = new JButton("Exit");
		
		add(label1);
		add(t1);
		add(label2);
		add(t2);
		add(a);
		add(b);
		add(c);
		add(d);
		add(e);
		add(label3);
		add(t3);
		
		ActionListener al = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				int a1 = Integer.parseInt(t1.getText());
				int a2 = Integer.parseInt(t2.getText());


				if (e.getSource() == a) {
					Integer sum = a1 + a2;
					t3.setText(sum.toString());
				}

				if (e.getSource() == b) {
					Integer sub = a1 - a2;
					t3.setText(sub.toString());
				}
				if (e.getSource() == c) {
					Integer mul = a1 * a2;
					t3.setText(mul.toString());
				}
				if(e.getSource() == d) {
					Float div = (float) (a1 / a2);
					t3.setText(div.toString());
				}
				if(e.getSource() == e) {
					return;
				}

			}
		};
		a.addActionListener(al);
		b.addActionListener(al);
		c.addActionListener(al);
		d.addActionListener(al);
		e.addActionListener(al);
		
		
		
		
		setLayout(new FlowLayout());
		setVisible(true);
		setSize(400, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	
	
	
}
