package Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeApp {
	
	static List<Employee> list = new ArrayList<Employee>();
	static void pushElement(Employee obj) {
		list.add(obj);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of Employee to be recorded:");
		int empCount = sc.nextInt();
		
		for(int i=0; i<empCount; i++) {
			System.out.println("Enter the Employee Id :");
			int eId = sc.nextInt();
			
			System.out.println("Enter the Employee Name :");
			String eName = sc.next();
			
			System.out.println("Enter the Department Id :");
			int dId = sc.nextInt();
			
			System.out.println("Enter the Department Name :");
			String dName = sc.next();
			
			System.out.println("Enter the Department designation :");
			String designation = sc.next();
			
			Department d = new Department(dId, dName, designation);
			Employee eobj = new Employee(eId, eName, d);
			pushElement(eobj);
			
		}
		System.out.println("--------Employee Information------------");
		for (Employee obj:list) {
			System.out.println("Employee ID :"+ obj.eId);
			System.out.println("Employee Name :"+ obj.eName);
			Department department = obj.department;
			System.out.println("Department ID :"+ department.dId);
			System.out.println("Department Name :"+ department.dName);
			System.out.println("Department designation :"+ department.designation);
		}
	}

}
