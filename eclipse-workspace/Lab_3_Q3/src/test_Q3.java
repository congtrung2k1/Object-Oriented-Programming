import java.util.Scanner;

public class test_Q3 {
	public static void main(String[] argc) {
		Scanner cin = new Scanner(System.in);
		
		System.out.println("Input some information of Student:");
		System.out.print("Name: ");
		String name = cin.nextLine();
		System.out.print("Address: ");
		String address = cin.nextLine();
		System.out.print("Program: ");
		String program = cin.nextLine();
		System.out.print("Year: ");
		int year = cin.nextInt();
		System.out.print("Fee: ");
		double fee = cin.nextDouble();
		cin.nextLine();
		Student sv = new Student(name, address, program, year, fee);
		
		System.out.println("Input some information of Staff: name, address, school, pay");
		System.out.print("Name: ");
		name = cin.nextLine();
		System.out.print("Address: ");
		address = cin.nextLine();
		System.out.print("School: ");
		String school = cin.nextLine();
		System.out.print("Pay: ");
		double pay = cin.nextDouble();
		Staff prof = new Staff(name, address, school, pay);
		
		System.out.println("Here is your information:");
		System.out.println(sv.toString());
		System.out.println(prof.toString());
		
		cin.close();
	}
}
