package problem2;

import java.awt.*;
import javax.swing.*;

class Drawing extends JFrame {
	private static final long serialVersionUID = 1L;
	
	private JPanel panel;
	private JPanel frame;
	
	private int x = 0;
	private int y = 0;
	private int w = 300;
	private int h = 100;
	
	public Drawing() {
		super();
		Init();
		this.setVisible(true);
	}
	
	private void Init() {
		frame = (JPanel)this.getContentPane();
		frame.setLayout(null);
		
		panel = new JPanel();
		addComponent(frame, panel, x, y, w, h);
		
		panel.setLayout(null);
		panel.setBackground(new Color(50,50,50));
		panel.add(new DrawLine());
		
		this.setTitle("Graph");
		this.setLocation(new Point(0, 0));
		this.setSize(new Dimension(w, h));
		this.setResizable(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
	private void addComponent(Container container, Component c, int x, int y, int w, int h) {
		c.setBounds(x,y,w,h);
		container.add(c);
	}
	

}

class DrawLine extends JPanel {
	private static final long serialVersionUID = 1L;

	protected void paintComponent(Graphics g) 
	{
		g.setColor(Color.black);
		g.drawLine(0,0,100,100);
	}
}

public class problem2 {
	public static void main() 
	{
		new Drawing();
	}
}
