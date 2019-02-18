package defaultpackage;

class VarArg {
	/*public int add(int i,int j, int k) {
		return i+j+k;
	}*/
	public int add(int...k) { //variable argument array
		int sum=0;
		for(int i:k) {
		sum=sum+i;
		}
		return sum;
	}
}

public class $1_3VariableArg {
 public static void main(String[] args) {
	 VarArg va = new VarArg();
	 System.out.println(va.add(4,5,8,4,7,6));
 }
}
