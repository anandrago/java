package defaultpackage;
class Calc {
	double num1;
	int num2;
	double result;
	public void add() {
		result=num1+num2;
	}
	public Calc() {
		num1=4;
		num2=5;
	}
	public Calc(int m,int n) {
		num1=m;
		num2=n;
	}
	public Calc(double d, int i) {
		num1=d;
		num2=i;
	}
}
public class $6Constructor {
    public static void main(String[] args) {
      Calc obj = new Calc(4.5,8);
      obj.add();
      System.out.println(obj.result);
    }
}
