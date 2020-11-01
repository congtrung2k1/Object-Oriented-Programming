package problem4;

import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class problem4 extends JPanel 
{
	private static final long serialVersionUID = 1L;
	int task;
    
    problem4() {}
    public problem4(int task) 
    {
        this.task = task;
    }    

    public void paintComponent(Graphics g) 
    {
        int w = getWidth();
        int h= getHeight();
        
        int i = 0;
        int j = 0;
        while (i < w || j < h) 
        {
            g.drawLine(0, j, i, h);
            i += w / 15;
            j += h / 15;
        }
        
        if (task == 0)
            return;
        else 
        	if (task == 1)
	            while (i > 0 || j > 0) 
	            {
	                g.drawLine(w, j, i, 0);
	                g.drawLine(0, h - j, i, 0);
	                g.drawLine(w, h - j, i, h);
	                i -= w / 15;
	                j -= h / 15;
	            }
    }

    public static void main() 
    {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(200, 200);
        frame.getContentPane().add(new problem4(0));
        frame.setVisible(true);
        
        JFrame frame1 = new JFrame();
        frame1.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame1.setSize(200, 200);
        frame1.getContentPane().add(new problem4(1));
        frame1.setVisible(true);
    }
}

