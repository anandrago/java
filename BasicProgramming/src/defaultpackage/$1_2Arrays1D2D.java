package defaultpackage;

public class $1_2Arrays1D2D {
  public static void main(String[] args) {
	  
	 // One dimentional array 
	  System.out.println("One dimentional array");
	/*  int a[]=new int[4];
	  a[0]= 5;
	  a[1]= 22;
	  a[2]= 45;
	  a[3]= 78;
	  System.out.println(a[2]); */
	  
	  int a[] = {25,45,36,75};
	  //System.out.println(a[2]);
	  for(int i=0;i<4;i++) {
		  System.out.print(a[i]+" ");
	  }
	  System.out.println();
	  System.out.println("Enhanced for loop");
	  for(int k:a) {
		  System.out.print(k+" ");
	  }
	  
	  System.out.println();
	  System.out.println();
	  System.out.println("Two dimenstional array");
	  //Two dimenstional array
	  int d[][]= {
			  {24,45,85,67},
			  {12,15,47,36},
			  {22,24,29,92}
	  };
	 // System.out.println(d[1][2]);
	  for(int i=0;i<3;i++) {
		  for(int j=0;j<4;j++) {
			  System.out.print(d[i][j]+" ");
		  }
		  System.out.println();
	  }
	  
	  System.out.println();
	  System.out.println("Jagged array");
	  //Jagged array
	  
	  int b[][]= {
			  {24,15,48,65,25,48,78,65},
			  {15,78,45,23,65,9},
			  {78,59,32,46}
	  };
	  for(int i=0; i<b.length;i++) {
		  for(int j=0; j<b[i].length;j++) {
			  System.out.print(b[i][j]+" ");
		  }
		  System.out.println();
	  }
	  System.out.println();
	  System.out.println("Enhanced for loop");
	  for(int m[]:b) {
		  for(int n:m) {
			  System.out.print(n+" ");
		  }
		  System.out.println();
	  }
  }
}
