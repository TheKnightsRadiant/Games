package somethingRandom;

import java.awt.Graphics;
import java.awt.*;
import java.awt.Graphics2D;
import java.awt.Rectangle;

import javax.swing.ImageIcon;
import javax.swing.JComponent;

public class Drawing extends JComponent {
	public void paintComponent(Graphics g){
		Image image;
		Image bg;
		Graphics2D g2 = (Graphics2D) g;
		
		ImageIcon b = new ImageIcon("C:/Users/Aaron Vickers/Downloads/background.jpg");
		bg = b.getImage();
		g.drawImage(bg, 0, 0, 1240, 720, null);
		Rectangle bullet1 = new Rectangle(100, 100, 25, 25);
		g2.setColor(Color.BLACK);
		g2.draw(bullet1);
		g2.drawString("Die Scrubs Die", 200, 100);
		ImageIcon i = new ImageIcon("C:/Users/Aaron Vickers/Downloads/jet.jpg");
		image = i.getImage();
		g.drawImage(image, 540, 260, 100, 100, null);
		
		
	}
}
