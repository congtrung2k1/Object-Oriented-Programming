import java.util.Scanner;

public class Test_Q2 {
		public static void main(String[] argc) {
		Scanner cin = new Scanner(System.in);
		System.out.println("Input your Coordinates of point 1, 2, 3");
		
		int x1, y1, x2, y2, x3, y3;
		System.out.println("Point 1: ");
		x1 = cin.nextInt();
		y1 = cin.nextInt();
		System.out.println("Point 2: ");
		x2 = cin.nextInt();
		y2 = cin.nextInt();
		System.out.println("Point 3: ");
		x3 = cin.nextInt();
		y3 = cin.nextInt();
		MyTriangle test = new MyTriangle(x1,y1,x2,y2,x3,y3);
		
		System.out.println(test.toString());
		System.out.println("Perimeter: " + test.getPerimeter());
		System.out.println("This is " + test.getType());
		
		cin.close();
	}
	
}
