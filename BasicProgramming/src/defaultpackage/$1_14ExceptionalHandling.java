package defaultpackage;

import java.util.Scanner;

public class $1_14ExceptionalHandling {
	public static void main(String[]args) {
		int n=0;
		do
		try {
			@SuppressWarnings("resource")
			Scanner s = new Scanner(System.in);
			System.out.println("Enter first nummer:");
		int i= s.nextInt();
		System.out.println("Enter Second nummer:");
		int j= s.nextInt();
		int k=i/j;
		System.out.println(k);
		int a[]=new int[4];
		a[2]=24;
		a[3]=15;
		n=1;
		}
		catch(ArithmeticException e) {
		System.out.println(e);
		}
		catch(ArrayIndexOutOfBoundsException e) {
		System.out.println(e);
		}
		catch(Exception e) {
			System.out.println(e);
		}
		finally {
			System.out.println("Close connection");
		} while(n==0);
	}
}
