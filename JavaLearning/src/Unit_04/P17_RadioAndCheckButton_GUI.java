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
import javax.swing.JTextField;

public class P17_RadioAndCheckButton_GUI {

	public static void main(String[] args) {

		RadioAndCheck Obj = new RadioAndCheck();

	}

}

class RadioAndCheck extends JFrame {

	JTextField t1;
	JLabel l;

	JButton b1;

	JRadioButton r1;
	JRadioButton r2;
	
	JCheckBox c1;
	JCheckBox c2;
	

	RadioAndCheck() {

		t1 = new JTextField(15);

		b1 = new JButton("Submit");

		r1 = new JRadioButton("Male");
		r2 = new JRadioButton("Female");

		l = new JLabel("Greetings");
		
		c1 = new JCheckBox("Dancer!");
		c2 = new JCheckBox("Singer!");
		
		add(t1);
		add(r1);
		add(r2);

		add(c1);
		add(c2);
		
		add(b1);
		add(l);
		

		ButtonGroup bg = new ButtonGroup();

		bg.add(r1);
		bg.add(r2);

		ActionListener al = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				String name = t1.getText();

				if (r1.isSelected()) {
					name = "Mr. " + name; 
				}

				if (r2.isSelected()) {
					name = "Ms. " + name;
				}
				
				if (c1.isSelected()) {
					name = name + " is a Dancer!";
				}
				
				if (c2.isSelected()) {
					name = name + " is a Singer!";
				}
				
				l.setText(name);
			}
		};

		b1.addActionListener(al);
		
		setLayout(new FlowLayout());
		setVisible(true);
		setSize(400, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
