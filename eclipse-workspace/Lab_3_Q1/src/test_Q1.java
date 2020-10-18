import java.util.Scanner;

public class test_Q1 {
	public static void main(String[] argc) {
		Scanner cin = new Scanner(System.in);
		
		for (int i = 5; i > 0; --i) {
			System.out.println("\n<" + i + "> Choose:\n1.Line\n2.Oval\n3.Rectangle\n");
			int c = cin.nextInt();
			
			MyLine v1 = new MyLine();
			MyBoundedShape v2 = new MyOval();
			MyBoundedShape v3 = new MyRectangle();
			
			if (c == 1) {
				System.out.println("Input length");
				int l = cin.nextInt();
				v1.set(l);
				v1.Draw();
			}
			else if (c == 2) {
				System.out.println("Input width and height");
				int a = cin.nextInt();
				int b = cin.nextInt();
				v2.set(a, b);
				v2.Draw();
				System.out.println("Area: " + v2.GetArea());
			}
			else if (c == 3) {
				System.out.println("Input width and length");
				int a = cin.nextInt();
				int b = cin.nextInt();
				v3.set(a, b);
				v3.Draw();
				System.out.println("Area: " + v3.GetArea());
			}
		}
		
		cin.close();
	}
}
