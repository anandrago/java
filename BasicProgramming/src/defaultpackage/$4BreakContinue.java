package defaultpackage;

public class $4BreakContinue {
	public static void main(String[] args) {
		//Continue
		for(int i=1;i<=10;i++)
		{
			if(i==6)
			{
				continue;
			}
			System.out.println("The value is " + i);
		}
		System.out.println("Break");
		//Break
		for(int i=1;i<=10;i++) {
			if(i==5) {
				break;
			}
			System.out.println("The value is "+ i);
		}
	}
}
