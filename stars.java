import java.util.Scanner;

public class stars {
	
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number of lines to be printed : ");
		int n = in.nextInt();
		
		for(int i=1 ; i<=n ;i++)
		{
			for(int j=n-i ; j>0 ; j--)
			{
			    System.out.print(" ");
              			
			}
			
			for(int k=1 ; k<=i ; k++)
			{
				System.out.print("* ");
			}
			System.out.println("");
		}
	}
	
}