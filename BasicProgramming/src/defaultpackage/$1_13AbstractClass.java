package defaultpackage;

abstract class Human {
	public abstract void walk();
	public abstract void run();
}
class Man extends Human{
	public void walk() {
		System.out.println("Man walking");
	}
	public void run() {
		System.out.println("Man running");
	}
}
class Woman extends Human{
	public void walk() {
		System.out.println("Woman walking");
	}
	public void run() {
		System.out.println("Woman running");
	}
}
class Printer {
	/*public void show(Integer i) {
		System.out.println(i);
	}
	public void show(Double d) {
		System.out.println(d);
	}*/
	public void show(Number n) { //Number is the AbstractClass of Integer, Double, Float...
		System.out.println(n);
	}
}
public class $1_13AbstractClass {

	public static void main(String[] args) {
		Man m = new Man();
		m.run();
		m.walk();
		Woman w = new Woman();
		w.walk();
		w.run();
		
		Printer p = new Printer();
		p.show(5.5f);

	}

}
