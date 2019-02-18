package defaultpackage;

class Employee {
	int empId;
	int salary;
	static String company;
	
	static {
		company="Amazon";
		System.out.println("This is static");
	}
	
	Employee(){
		empId = 101;
		salary = 5000;
		System.out.println("This is constructor");
	}
	static {
		System.out.println("This is static2");
	}
	public void show() {
		System.out.println(empId+" : "+ salary + ":" + company);
	}
}

public class $9StaticKeyword {
	static int i=0;
  public static void main(String[] args) {
	  Employee david = new Employee();
	  Employee john = new Employee();
	  i=10;
	  
	  john.empId=102;
	 // Employee.company="Microsoft";
	  david.show();
	  john.show();
  }
}
