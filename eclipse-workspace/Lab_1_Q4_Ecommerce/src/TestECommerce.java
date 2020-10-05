import java.util.Scanner;

public class TestECommerce {
	public static void main(String[] argc) {
		Scanner s = new Scanner(System.in);
		
		Order A = new Order();
		
		while (true) {
			System.out.print("New item ? 1 or 0 ");
			int a = s.nextInt();
			if (a == 0) break;
			
			System.out.print("Input ID of Item: ");
			int ID = s.nextInt();
			
			s.nextLine();
			System.out.print("Input Name of Item: ");
			String name = s.nextLine();
			
			System.out.print("Input Price of Item: ");
			double price = s.nextDouble();
			
			Item temp = new Item(ID, name, price);
			A.addItem(temp); 
		}
		
		System.out.println("Average of cost of order: ");
		System.out.println(A.calculateAverageCost());
		s.close();
	}
}
