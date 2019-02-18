package defaultpackage;

class A {
	A(){
		System.out.println("This is constructor A");
	}
	A(int i){
		System.out.println("This is constructor A int");
	}
}
class B extends A{
	B(){
		super(5);
		System.out.println("This is constructor B");
	}
	B(int i){
		super(i);
		System.out.println("This is constructor B int");
	}
}
public class $1_8SuperMethod {
 public static void main(String[] args){
	 B b = new B();
 }
}
