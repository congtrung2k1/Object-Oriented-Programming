import java.util.Scanner;

public class test_Q4 {
	public static void main(String[] argc) {
		Scanner cin = new Scanner(System.in);
		
		Point2D point = new Point2D();
		
		System.out.println("Input x, y of point");
		float x = cin.nextFloat();
		float y = cin.nextFloat();
		
		point.setXY(x,y);
		System.out.println("Your 2D point: " + point.toString());
		
		
		System.out.println("One more dimension z");
		float z = cin.nextFloat();
		
		Point3D p3 = new Point3D(point);
		p3.setZ(z);
		
		System.out.println("Your 3D point: " + p3.toString());
		
		cin.close();
	}
}
