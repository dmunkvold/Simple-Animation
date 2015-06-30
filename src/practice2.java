
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

@SuppressWarnings("serial")
public class practice2 extends JPanel{
	
	/*
	 * in this class I experiment with painting and animating. I create a black circle
	 * that moves diagonally across the frame. first I initialize and x and y value
	 * that will represent the location of the circle on the grid
	 */
	
	
	int x = 5;
	int y = 5;
	
	/*
	 * this method increments the values on x and y, which will move the circle
	 * across the frame. 
	 */
	
	
	private void moveBall(){
		x=x+1;
		y=y+1;
	}
	
	/*
	 * this method paints the circle using the graphics package. First I create a new 
	 * graphics2d object, set the rendering characteristics, and then set the shape of 
	 * the graphic. I'm still learning a lot about animation on java so there are some
	 * things I have yet to fully grasp at this point.
	 */
	
	
	public void paint (Graphics g) {
		super.paint(g);
		Graphics2D g2d = (Graphics2D) g;
		g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		g2d.fillOval(x, y, 30, 30);
	}
	
	/*
	 * the main function creates a jframe, sets the frame's size, sets its closing
	 * operations, creates a new practice2 object called game, and then adds
	 * the "game" object to the frame. It then calls the moveBall function and sets
	 * the frame repaint speed to 10.
	 */
	
	
	public static void main (String[]args) throws InterruptedException {
		JFrame myFrame = new JFrame("ball game");
		practice2 game = new practice2();
		myFrame.add(game);
		myFrame.setSize(300, 400);
		myFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		myFrame.setVisible(true);
		
		while (true){
			game.moveBall();
			game.repaint();
			Thread.sleep(10);
		}
	}
}

/*
 * code written by 
 * David Munkvold
 * 6/28/15
 */

