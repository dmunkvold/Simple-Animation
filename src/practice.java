import javax.swing.JFrame;
import javax.swing.WindowConstants;

/*
 * in this class I experiment with creating a frame using JFrame, producing a simple
 * blank frame
 */


public class practice {
	public static void main(String[]args){
		JFrame myFrame = new JFrame("Sample Frame");
		myFrame.setSize(300, 400);
		myFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		myFrame.setVisible(true);
		
	}
}

/*
 * code written by 
 * David Munkvold
 * 6/25/15
 * 
 */
