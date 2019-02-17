package defaultpackage;

public class $3NestedLoop {
	public static void main(String[] args) {
		for (int i = 1; i < 5; i++) {
			for (int j = 1; j < 5; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println();
		for (int k = 1; k < 7; k++) {
			for (int l = 1; l < 7; l++) {
				if ((k == 1) && (l < 2))
					System.out.print(l + " ");
				else if ((k == 2) && (l < 3))
					System.out.print(l + " ");
				else if ((k == 3) && (l < 4))
					System.out.print(l + " ");
				else if ((k == 4) & (l < 5))
					System.out.print(l + " ");
				else if ((k == 5) & (l < 6))
					System.out.print(l + " ");
				else if ((k == 6) & (l < 7))
					System.out.print(l + " ");
			}
			System.out.println("");
		}
		System.out.println();
		for (int m = 1; m < 7; m++) {
			for (int n = 1; n < 7; n++) {
				if ((m == 1))
					System.out.print("$ ");
				else if ((m == 2) && (n < 2))
					System.out.print("$ ");
				else if ((m == 3) && (n < 2))
					System.out.print("$ ");
				else if ((m == 4) & (n < 2))
					System.out.print("$ ");
				else if ((m == 5) & (n < 2))
					System.out.print("$ ");
				else if (m == 6)
					System.out.print("$ ");
				else if (n==6)
					System.out.print("$ ");
				else
					System.out.print("  ");
			}
			System.out.println("");
		}
		System.out.println();
		for(int o=1;o<4;o++) {
			for(int p=1;p<4;p++) {
				if((o==1)&&(p<2))
				System.out.print("* ");
				else if((o==2)&&(p<3)) 
				System.out.print("* ");
				else if((o==3)&&(p<4)) 
				System.out.print("* ");
			}
			System.out.println();
		}
		
		char a='A';
		System.out.println(a);
		
	}
}
