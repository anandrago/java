package defaultpackage;

import java.util.ArrayList;
import java.util.List;

class Company {
	private NewEmployee newEmployee;
	private List<NewEmployee> list;
	
	public Company() {
		list = new ArrayList<NewEmployee>();
	}
	
	public void createEmployee(int empNo, String name, double salary, String job) {
		newEmployee = new NewEmployee(empNo, name, salary, job);
		list.add(newEmployee);
	}
	
	public List<NewEmployee> getEmployeeList(){
		return list;
	}
}