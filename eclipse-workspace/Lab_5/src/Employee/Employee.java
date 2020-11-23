package Employee;

public class Employee implements Comparable<Employee>{
	private String employeeID;
	private String employeeName;
	private int salaryPerHour;
	private int noOfLeavingDay;
	private int noOfTravelDay;

	public Employee() {};
	public Employee(String a, String b, int c, int d, int e) {
		this.employeeID = a;
		this.employeeName = b;
		this.salaryPerHour = c;
		this.noOfLeavingDay = d;
		this.noOfTravelDay = e;
	}
	
	public int compareTo(Employee that) {
		if (this.noOfTravelDay > that.noOfTravelDay || (this.noOfTravelDay == that.noOfLeavingDay && this.noOfLeavingDay < that.noOfLeavingDay)) 
			return 1;
		else 
		if (this.noOfTravelDay < that.noOfTravelDay || (this.noOfTravelDay == that.noOfLeavingDay && this.noOfLeavingDay > that.noOfLeavingDay))
			return -1;

		return 0;
	}
	
	public int getSalary() {
		return this.salaryPerHour;
	}
	
	public int calculateWeeklySalary() {
		return salaryPerHour * 8 * (5 - noOfLeavingDay + (int)(noOfTravelDay / 2));
	}
	
	public String toString()
	{
		return "Name: " + employeeName + " - Salary Per Hour: " + salaryPerHour + " - Weekly Salary: " + calculateWeeklySalary();
	}
}
