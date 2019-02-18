package defaultpackage;

class outer {
	int i;
	int j;
	public void show() {
		System.out.println("This is show in outer class");
	}
	class inner {
		public void display() {
			System.out.println("This is display in inner class");
		}
	}
	static class inner2 {
		public void display() {
			System.out.println("This is display in inner2 class");
		}
	}
	
}
public class $1_1InnerClass {
	public static void main(String[] args) {
		outer obj = new outer();
		obj.show();
		outer.inner obj1 = obj.new inner();  //Member class
		obj1.display();
		outer.inner2 obj2 = new outer.inner2();  //static inner class
		obj2.display();
	}
}
