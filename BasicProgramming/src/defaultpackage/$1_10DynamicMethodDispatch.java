package defaultpackage;

class Fruit {
	public void show() {
		System.out.println("This is Fruit class");
	}
}
class Mango extends Fruit{
	public void show() {
		System.out.println("This is Mango class");
	}
}
class Orange extends Fruit{
	public void show() {
		System.out.println("This is Orange class");
	}
}
public class $1_10DynamicMethodDispatch {
 public static void main(String[] args) {
	 	Fruit f = new Mango();//Runtime Polymorphism
	 	f.show();
	 	f= new Orange();//Dynamic method dispatch
	 	f.show(); 
 }
 }
