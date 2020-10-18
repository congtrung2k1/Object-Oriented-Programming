
public class MyTriangle {
	private MyPoint v1;
	private MyPoint v2;
	private MyPoint v3;
	
	MyTriangle(){}
	
	public MyTriangle(int x1, int y1, int x2, int y2, int x3, int y3) {
		this.v1 = new MyPoint(x1, y1);
		this.v2 = new MyPoint(x2, y2);
		this.v3 = new MyPoint(x3, y3);
	}
	
	public MyTriangle(MyPoint v1, MyPoint v2, MyPoint v3) {
		this.v1 = new MyPoint(v1);
		this.v2 = new MyPoint(v2);
		this.v3 = new MyPoint(v3);
	}
	
	public String toString() {
		return "My Triangle[v1=" + this.v1.get() + ",v2=" + this.v2.get() + ",v3=" + this.v3.get() + "]";
	}
	
	public double getPerimeter() {
		return MyPoint.distance(v1, v2) + MyPoint.distance(v2, v3) + MyPoint.distance(v3,v1);
	}
	
	public String getType() {
		double a = MyPoint.distance(v1, v2);
		double b = MyPoint.distance(v2, v3);;
		double c = MyPoint.distance(v3, v1);;
		
		if (a == b && b == c)
			return "Equilateral";
		if (a == b || b == c || a == c)
			return "Isosceles";
		if (a + b > c && a + c > b && b + c > a)
			return "Scalene";
		return "Not Triangle";
	}
}
