package defaultpackage;

public class $1_12WrapperClassAutoBoxing {

	public static void main(String[] args) {
		 int i =12; // Primitive datatype
		Integer ii = Integer.valueOf(i); //wrapper class  // Boxing or Wrapping
		int j =ii.intValue();  //Unboxing or Unwrapping
		
		Integer value = i; // Autoboxing or Autowrapping
		int k =value; //AutoUnboxing or AutoUnwrapping
		System.out.println(k);
		
		//converting string into integer
		String s = "123";
		int n = Integer.parseInt(s);
		System.out.println(n);
	}

}
