package Project;

import java.util.*;

import Employee.Employee;

public class ProjectPrinter implements Runnable {
	private Project proj;
	
	public ProjectPrinter() {}
	public ProjectPrinter(Project a) {
		this.proj = a;
	}
	
	public void run() {
		proj.printProj();
		
		ArrayList<Employee> tmp = proj.getEmpList();
		for (Employee e: tmp) {
			System.out.println(e.toString());
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
	      
		System.out.println("Thread done and exiting.");
	}

}
