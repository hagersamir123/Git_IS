import java.awt.*;
import javax.swing.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
class MyPanel extends JPanel{

	public void paint(Graphics g){
		super.paint(g);
		g.drawString("Hello", 100, 100);
	}

}

public class Main{
	public static void main (String[] args){
		
		JFrame frame = new JFrame();
		frame.setContentPane(new MyPanel());
		frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setVisible(true);
	}

}

data
Main