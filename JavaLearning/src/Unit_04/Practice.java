package Unit_04;

import java.awt.Color;
import java.awt.Canvas;
import java.awt.Graphics;
import javax.swing.JFrame;

public class Practice extends Canvas{



	public static void main(String[] args) {
			
		Practice o = new Practice();

		JFrame f = new JFrame();
		f.add(o);

		f.setSize(500, 400);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	public void paint(Graphics grap) {

		grap.drawOval(25, 140, 40, 70);

		grap.drawLine(FRAMEBITS, ERROR, ALLBITS, ABORT);

		setForeground(Color.pink);
		grap.fillOval(140, 140, 40, 40);

		grap.drawArc(10, 20, 140, 150, 90, 60);

		grap.drawRect(150, 40, 140, 60);
		grap.fillRect(250, 50, 180, 70);
	
	}
}
