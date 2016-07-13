package somethingRandom;
import javax.swing.*;
import java.awt.*;


public class Window {
	public Window(){
	JFrame frame = new JFrame();
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setSize(1240, 720);
	frame.setVisible(true);
	//graphics
	Rectangle rect = new Rectangle();
	Drawing dc = new Drawing();
	frame.add(dc);
	}
	
}
