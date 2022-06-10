package Unit_04;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class P17_JComboBox {

	public static void main(String[] args) {
		
		JComboBoxClass obj = new JComboBoxClass();
		
	}

}

class JComboBoxClass extends JFrame{
	
	JComboBox jbox;
	
	JButton b;
	
	JLabel label1;
	
	JComboBoxClass(){
		
		//String array to store weekdays
        String week[]= { "Monday","Tuesday","Wednesday",
                         "Thursday","Friday","Saturday","Sunday"};
		
		
        jbox = new JComboBox<>(week);
        
        b = new JButton("Submit");
		
		label1 = new JLabel("Choose a day from the list");
		
		
		add(jbox);
		add(b);
		add(label1);
		
		
		ActionListener al = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				String data = "";  
                if (jbox.getSelectedIndex() != -1) {                       
                   data = "Day Selected: " + jbox.getSelectedItem();   
                   label1.setText(data);  
                }
				
			}
		};
		
		b.addActionListener(al);
		
		setLayout(new FlowLayout());
		setVisible(true);
		setSize(400, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
