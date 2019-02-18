package defaultpackage;

class ParentA {
	int i=9;
	public void show() {
		System.out.println("This is class ParentA");
		System.out.println(i);
	}
}
class ChildB extends ParentA{
	int i=6;
	@Override
	public void show() {
		i=8;
		super.i=4;
		super.show();
		System.out.println("This is class ChildB");
	}
}
public class $1_9MethodOverriding {
 public static void main(String[]args) {
	 ChildB cb = new ChildB();
	 cb.show();
	 System.out.println(cb.i);
 }
}
