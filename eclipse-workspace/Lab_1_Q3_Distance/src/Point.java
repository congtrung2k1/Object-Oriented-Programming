public class Point {
	private double x, y;
	
	public Point(double x, double y){
		this.x = x;
		this.y = y;
	}
	
	public double distance(Point A) {
		double x_1 = this.x - A.x;
		double y_1 = this.y - A.y;
		return Math.sqrt(x_1 * x_1 + y_1 * y_1);
	}
}