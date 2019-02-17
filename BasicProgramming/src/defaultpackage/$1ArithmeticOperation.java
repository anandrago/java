package defaultpackage;
public class $1ArithmeticOperation {
  public static void main(String[] args) {
	  //if statement
	  int num=13;
	  if(num==0)
		  System.out.println("Num is nothing");
	  else if(num%2==0)
		  System.out.println("Num is Even");
	  else
		  System.out.println("Num is Odd");
	  
	  //Ternary operator
	  int i=8;
	  int j=2;
	 /* if(i<10)
		  j=5;
	  else
		  j=7;*/
	  j=i<10?5:7;
	  System.out.println(j);
	  
	  //switch statement with int
	  
	  int n=5;
	  switch(n)
	  {
	  case 1 :
		  System.out.println("One");
		  break;
	  case 2 :
		  System.out.println("Two");
		  break;
	  case 3 :
		  System.out.println("Three");
		  break;
	  case 4:
		  System.out.println("Four");
		  break;
	  case 5:
		  System.out.println("Five");
		  break;
	  default :
		  System.out.println("No Match");
		  
	  }
	  
//switch statement with Char
	  
	  char c='E';
	  switch(c)
	  {
	  case 'A' :
		  System.out.println("A");
		  break;
	  case 'B' :
		  System.out.println("B");
		  break;
	  case 'C' :
		  System.out.println("C");
		  break;
	  case 'D':
		  System.out.println("D");
		  break;
	  case 'E':
		  System.out.println("E");
		  break;
	  default :
		  System.out.println("No Match");
		  
	  }
	  
//switch statement with String
	  
	  String s="jkl";
	  switch(s)
	  {
	  case "abc" :
		  System.out.println("abc");
		  break;
	  case "def" :
		  System.out.println("def");
		  break;
	  case "ghi" :
		  System.out.println("ghi");
		  break;
	  case "jkl":
		  System.out.println("jkl");
		  break;
	  case "mno":
		  System.out.println("mno");
		  break;
	  default :
		  System.out.println("No Match");
		  
	  }
//switch statement will not work with double
	  
	/*  double d=8;
	  switch(d)
	  {
	  case 1 :
		  System.out.println("One");
		  break;
	  case 2 :
		  System.out.println("Two");
		  break;
	  case 3 :
		  System.out.println("Three");
		  break;
	  case 4:
		  System.out.println("Four");
		  break;
	  case 5:
		  System.out.println("Five");
		  break;
	  default :
		  System.out.println("No Match");
		  
	  }*/
  }
}
 
