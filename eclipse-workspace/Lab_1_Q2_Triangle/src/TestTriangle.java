import java.util.Scanner;

public class TestTriangle {
	public static void main(String[] argc) {
		Scanner s = new Scanner(System.in);
		System.out.println("Length of a side: ");
		double a = s.nextInt();
		System.out.println("Length of b side: ");
		double b = s.nextInt();
		System.out.println("Length of c side: ");
		double c = s.nextInt();
		
		Triangle tria_1 = new Triangle(a,b,c);
		System.out.println(tria_1.verify());
		
		s.close();
	}
}