public class alphabets{
	
	public static void main(String args[])
	{
		char alphabet = 'A';
		
		for(int i=1 ; i<=5 ; i++)
		{
			for(int j=5-i ; j>=1 ; j--)
			{
				System.out.print("  ");
			}
			
			for(int k=1 ; k<=i ; k++)
			{
				System.out.print(alphabet+" ");
				alphabet++;
			}
			
			System.out.println("");
			System.out.println("");
		}
		
		
	}
}