package defaultpackage;
class Calc1 {
	double num1;
	int num2;
	double result;
	public void add() {
		result=num1+num2;
	}
	public Calc1() {
		num1=4;
		num2=5;
	}
	public Calc1(int m,int n) {
		num1=m;
		num2=n;
	}
	public Calc1(double num1, int num2) {
		this.num1=num1;
		this.num2=num2;
	}
}
public class $7Keyword_This {
    public static void main(String[] args) {
      Calc1 obj = new Calc1(4.5,8);
      obj.add();
      System.out.println(obj.result);
    }
}

