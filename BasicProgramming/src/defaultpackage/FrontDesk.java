package defaultpackage;

import java.util.List;

class FrontDesk{
	public static void main(String[] args) {
	Company c = new Company();
	c.createEmployee(101,"David",125000,"Software Engineer");
	c.createEmployee(102, "Stephen", 135000, "IDM Developer");
	c.createEmployee(103, "Mark", 100000, "Automation Engineer");
	c.createEmployee(104, "Robin", 110000, "Admin");
	List<NewEmployee> list = c.getEmployeeList();
	for(NewEmployee emp: list)
		System.out.println(emp);
	}
	
}