import java.util.*;

import Employee.*;
import Project.*;

public class Main 
{
	public static void main(String[] argv) 
	{
		ArrayList<Employee> EmployeeList = new ArrayList<Employee>(5);
		EmployeeList.add(new Employee("4321", "A", 40, 1, 2));
		EmployeeList.add(new Employee("1234", "U", 30, 0, 0));
		EmployeeList.add(new Employee("3213", "W", 40, 0, 2));
		EmployeeList.add(new Employee("1111", "V", 40, 1, 3));
		
		Date aDay = new Date();
		
		Calendar cal = Calendar.getInstance();
		cal.setTime(aDay);
		cal.add(Calendar.DAY_OF_YEAR, 14);
		Date aDay_end = cal.getTime();
		
		Project proj = new Project("ProjectTest1", aDay, aDay_end, EmployeeList);
		
		ProjectPrinter test = new ProjectPrinter(proj);
		while (true) {
			test.run();
		}
	}
}
