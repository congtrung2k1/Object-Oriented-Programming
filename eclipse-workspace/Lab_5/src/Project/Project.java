package Project;

import java.text.SimpleDateFormat;
import java.util.*;

import Employee.Employee;

public class Project {
	private String projectID;
	private Date startDate;
	private Date endDate;
	private ArrayList<Employee> listOfEmployee;
	
	public Project() {}
	public Project(String a, Date b, Date c, ArrayList<Employee> d) 
	{
		this.projectID = a;
		this.startDate = b;
		this.endDate = c;
		this.listOfEmployee = d;
	}
	
	public int estimateBudget() {
		int re = 0;
		for (Employee e: listOfEmployee) re += e.getSalary() * 8 * 5;
		return re;
	}
	
	public ArrayList<Employee> getEmpList(){
		return this.listOfEmployee;
	}
	
	public String toString() {
		String s = "";
		for (Employee e : listOfEmployee){
			s += e.toString() + '\n';
		}
		return s;
	}
	
	public void printProj() {
		SimpleDateFormat ft = new SimpleDateFormat("dd/MM/yyy");
		System.out.println("Project ID: " + this.projectID + " - Project Duration: " + ft.format(this.startDate) + " to " + ft.format(this.endDate));
	}
	
	
}
