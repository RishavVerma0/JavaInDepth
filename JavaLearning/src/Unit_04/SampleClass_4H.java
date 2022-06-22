package Unit_04;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JScrollBar;
import javax.swing.JTextField;

public class SampleClass_4H {

	public static void main(String[] args) {

		@SuppressWarnings("unused")
		WorkingOnSwing obj = new WorkingOnSwing();

	}

}

@SuppressWarnings("serial")
class WorkingOnSwing extends JFrame {

	JTextField t1;
	JTextField t2;

	// JTextArea jr1;
	
	JRadioButton r1;
	JRadioButton r2;
	

	JButton b1;
	JButton b2;

	JLabel l1;
	
	JCheckBox c1;
	JCheckBox c2;
	
	JScrollBar jb;

	WorkingOnSwing() {

		// jr1 = new JTextArea(10,30);
		
		r1 = new JRadioButton("Male");
		r2 = new JRadioButton("Female");

		t1 = new JTextField(20);
		t2 = new JTextField(20);

		b1 = new JButton("sum");
		b2 = new JButton("Sub");

		l1 = new JLabel("Result");
		
		c1 = new JCheckBox("Dancer!");
		c2 = new JCheckBox("Singer!");
		
		jb = new JScrollBar();

		add(t1);
		add(t2);
		
		add(r1);
		add(r2);
		
		//Group radio buttons
		ButtonGroup bg = new ButtonGroup();
		bg.add(r1);
		bg.add(r2);
		
		add(c1);
		add(c2);
		
		
		add(b1);
		add(b2);

		add(l1);
		
		add(jb);

		ActionListener al = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				int a1 = Integer.parseInt(t1.getText());
				int a2 = Integer.parseInt(t2.getText());

				if (e.getSource() == b1) {
					Integer sum = a1 + a2;
					l1.setText(sum.toString());
				}

				if (e.getSource() == b2) {
					Integer sub = a1 - a2;
					l1.setText(sub.toString());
				}
				
				if(r1.isSelected()) {
					l1.setText("Male");
				}
				
				if(r2.isSelected()) {
					l1.setText("Female");
				}
				
				if(c1.isSelected()) {
					l1.setText("is a Dance");
				}
				
				if(c2.isSelected()) {
					l1.setText("is Singer");
				}

			}
		};

		// Logic on b1 and b2
		b1.addActionListener(al);
		b2.addActionListener(al);

		setLayout(new FlowLayout());
		setVisible(true);
		setSize(400, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}