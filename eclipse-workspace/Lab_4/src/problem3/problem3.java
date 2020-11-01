package problem3;

import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class problem3 extends JPanel 
{
	private static final long serialVersionUID = 1L;
	int task;
    
    problem3(){}
    public problem3(int task) 
    {
        this.task = task;
    }

    public void paintComponent(Graphics g) 
    {
        int w = getWidth();
        int h= getHeight();
        
        if (task == 0)
            for (int i = 0, j = 0; i < w || j < h; i += w/12, j += h/12)
                g.drawLine(0, 0, i, h - j);
        else 
        	if (task == 1)
	            for (int i = 0, j = 0; i < w || j < h; i += w/12, j += h/12) 
	            {
	                g.drawLine(0, 0, i, h - j);
	                g.drawLine(0, h, i, j);
	                g.drawLine(w, h, i, h - j);
	                g.drawLine(w, 0, i, j);
	            }
    }

    public static void main() 
    {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(200, 200);
        frame.getContentPane().add(new problem3(0));
        frame.setVisible(true);
        
        JFrame frame1 = new JFrame();
        frame1.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame1.setSize(200, 200);
        frame1.getContentPane().add(new problem3(1));
        frame1.setVisible(true);
    }
}
