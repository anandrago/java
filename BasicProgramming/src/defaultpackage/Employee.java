package defaultpackage;

class NewEmployee{
	int empNo;
	String empName;
	double salary;
	String job;
	
	public NewEmployee(int empNo, String empName, double salary, String job) {
	this.empNo = empNo;
	this.empName = empName;
	this.salary = salary;
	this.job = job;
	}

	@Override
	public String toString() {
		return "NewEmployee [empNo=" + empNo + ", empName=" + empName + ", salary=" + salary + ", job=" + job + "]";
	}
	
	
	
}