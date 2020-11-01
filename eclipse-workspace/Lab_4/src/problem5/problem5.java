package problem5;

import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class problem5 extends JPanel 
{
	private static final long serialVersionUID = 1L;
	int task;
    
    problem5(){}
    public problem5(int task) {
        this.task = task;
    }    

    public void paintComponent(Graphics g)
    {
        if (task == 0) 
        {
            int w = getWidth() / 2;
            int h = getHeight() / 2;
            
            for (int i = 0; i < 4; ++i) 
            {
                g.drawLine(w + (40 * i), h - (40 * i), w + (40 * i), h + 40 + (40 * i));
                g.drawLine(w + (40 * i), h + 40 + (40 * i), w - 40 - (40 * i), h + 40 + (40 * i));
                g.drawLine(w - 40 - (40 * i), h + 40 + (40 * i), w - 40 - (40 * i), h - 40 - (40 * i));
                g.drawLine(w - 40 - (40 * i), h - 40 - (40 * i), w + 40 + (40 * i), h - 40 - (40 * i));
            }
        } 
        else 
        if (task == 1) {
            int x = getSize().width / 2 - 10;
            int y = getSize().height / 2 - 10;
            
            int w = 20;
            int h = 20;
            int angle = 0;
            int arc = 180;
            int d = 20;
            
            for (int i = 0; i < 10; i++)
                if (i % 2 == 0) 
                {
                    y -= d;
                    w += + 2 * d;
                    h += 2 * d;
                    g.drawArc(x, y, w, h, angle, -arc);
                } 
                else 
                {
                    x -= 2 * d;
                    y -= d;
                    w += 2 * d;
                    h += 2 * d;
                    g.drawArc(x, y, w, h, angle, arc);
                }
        }
    }

    public static void main() 
    {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.add(new problem5(0));
        frame.setSize(200, 200);
        frame.setVisible(true);
        
        JFrame frame1 = new JFrame();
        frame1.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame1.add(new problem5(1));
        frame1.setSize(200, 200);
        frame1.setVisible(true);
    }
}

