package defaultpackage;

class Demo {
	int i;
	int j;
	int result;
	
	//Constructor Overloading
	Demo(){
		i=3;
		j=4;
		result=i+j;
	}
	Demo(int i){
		this.i=i;
		j=4;
		result=i+j;
	}
	Demo(int i,int j){
		this.i=i;
		this.j=j;
		result=i+j;
	}
	
	//Method overloading
	public void add() {
		i=4;
		j=3;
		result=i+j;
	}
	public void add(int i) {
		this.i=i;
		j=6;
		result=i+j;
	}
	public void add(int i,int j) {
		this.i=i;
		this.j=j;
		result=i+j;
	}
}

public class $8MethodConstructorOverloading {
	public static void main(String[] args) {
		//Demo obj =new Demo();
		//Demo obj =new Demo(9);
		Demo obj =new Demo(4,8);
		//Method overloading
		//obj.add();
		//obj.add(8);
		//obj.add(7,8);
		System.out.println(obj.result);
	}


}
