import java.awt.*;
import javax.swing.*;

public class Drawing extends JFrame {
	private JPanel frame;
	private JPanel panel;
	public Drawing() {
		super();
		initializeComponent();
		this.setVisible(true);
	}
	private void initializeComponent() {
		frame = (JPanel)this.getContentPane();
		frame.setLayout(null);
		
		panel = new JPanel();
		addComponent(frame, panel, 0,0,270,70);
		
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		panel.setBackground(new Color(50, 50, 50));
		panel.add( new DrawLine() );
		
		this.setTitle("Graph");
		this.setLocation(new Point(10, 10));
		this.setSize(new Dimension(270, 105));
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	private void addComponent(Container container,Component c,int x,int y,int width,int height) {
		c.setBounds(x,y,width,height);
		container.add(c);
	}
	
	public static void main(String[] args) {
		new Drawing();
	}
	
}

class DrawLine extends JPanel {	
	public Dimension getPreferredSize() {
		return new Dimension(270, 70);
	}
	
	protected void paintComponent(Graphics g) {
		g.setColor( Color.red );
		g.drawLine ( 0, 0, 290, 70 );
	}
}