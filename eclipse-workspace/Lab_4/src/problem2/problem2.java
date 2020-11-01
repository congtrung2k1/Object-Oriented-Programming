package problem2;

import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class problem2 extends JPanel 
{
	private static final long serialVersionUID = 1L;

	public void paintComponent(Graphics g) 
	{
        int w = getWidth();
        int h = getHeight();
        
        g.drawLine(0, 0, w, h);
        g.drawLine(0, h, w, 0);
        g.drawLine(0, h/2, w, h/2);
        g.drawLine(w/2, 0, w/2, h);
    }

    public static void main() 
    {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(200, 100);
        frame.getContentPane().add(new problem2());
        frame.setVisible(true);
    }
}