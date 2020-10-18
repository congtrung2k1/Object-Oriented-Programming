import java.lang.Math; 

public class MyPoint {
	private int x;
	private int y;
	
	MyPoint(){}
	
	MyPoint(int val) {
		this.x = val;
		this.y = val;
	}
	
	MyPoint(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	MyPoint(MyPoint A) {
		this.x = A.x;
		this.y = A.y;
	}
	
	public int getx() {
		return this.x;
	}
	public int gety() {
		return this.y;
	}
	
	public String get() {
		return "(" + this.x + "," + this.y + ")";
	}
	
	public static double distance(MyPoint v1, MyPoint v2) {
		int x = v1.getx();
		int y = v1.gety();
		int a = v2.getx();
		int b = v2.gety();
		return Math.sqrt( 1.0 * ((x - a) * (x - a) + (y - b) * (y - b)));
	}
}
