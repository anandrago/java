package defaultpackage;

final class Sup {
	final int i;
	Sup(){
		i=10;
		//i=15; // cannot modify final variable
	}
	public final void show() {
		System.out.println("This is SuperA");
	}
}
//class sub extends Sup{ //cannot extend final class
	//public void show() {} //cannot modify final method
//}
public class $1_14FinalKeyword {

}
