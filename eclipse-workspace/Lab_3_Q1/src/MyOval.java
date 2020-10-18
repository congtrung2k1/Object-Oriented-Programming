import java.lang.Math;
import java.awt.*;
import javax.swing.*;

public class MyOval extends MyBoundedShape {
	private int w;
	private int h;
	
	MyOval(){}
	MyOval(int a, int b) {
		this.w = a;
		this.h = b;
	}
	
	@Override
	public void set(int a, int b) {
		this.w = a;
		this.h = b;
	}

	@Override
	public double GetArea() {
		return Math.PI * this.w * this.h;
	}

	@Override
	public void Draw() {
		System.out.println("Drawing an Oval.");
		
		new Oval(this.w, this.h);
	}
	
	@Override
	public void set(int val) {}	
}



class Oval extends JFrame {
	private static final long serialVersionUID = 1L;
	int a;
	int b;
	
	public Oval(int a, int b) {
		this.a = a;
		this.b = b;
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(400, 400);
		setLocationRelativeTo(null);
		setVisible(true);
	}

	public void paint(Graphics g)  {
		super.paint(g);
		g.drawOval(180, 180, this.a, this.b);
	}
}
