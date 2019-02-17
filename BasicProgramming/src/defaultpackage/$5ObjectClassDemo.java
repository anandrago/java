package defaultpackage;

class Calculator {
	int num1;
	int num2;
	int result;
	public void perform() {
		result=num1+num2;
	}
}
public class $5ObjectClassDemo {
 public static void main(String[] args) {
	 Calculator obj = new Calculator();
	 obj.num1=6;
	 obj.num2=4;
	 obj.perform();
	 System.out.println(obj.result);
 }
}
