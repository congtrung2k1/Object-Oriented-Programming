import java.util.Scanner;

public class TestDistance {
	public static void main(String[] argc) {
		Scanner s = new Scanner(System.in);
		double x, y;
		
		System.out.print("Position of point A: \nX: ");
		x = s.nextInt();
		System.out.print("Y: ");
		y = s.nextInt();
		Point A = new Point(x, y);
		
		System.out.print("Position of point b: \nX: ");
		x = s.nextInt();
		System.out.print("Y: ");
		y = s.nextInt();
		Point B = new Point(x,y);
		
		System.out.println(A.distance(B));
	
		s.close();
	}
}
