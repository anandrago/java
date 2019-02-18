package defaultpackage;
class Calci {
	public int add(int i,int j) {
		return i+j;
	}
}
class CalcAdv extends Calci {
	public int sub(int i,int j) {
		return i-j;
	}
}
class CalcVeryAdv extends CalcAdv {
	public int mul(int i,int j) {
		return i*j;
	}
}
public class $1_4Inheritance {
 public static void main(String[] args) {
	  CalcVeryAdv c = new CalcVeryAdv();
	  int result1 = c.add(10,8);
	  int result2 = c.sub(9, 4);
	  int result3 = c.mul(8, 6);
	  
	  System.out.println(result1);
	  System.out.println(result2);
	  System.out.println(result3);
 }
}
