import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class grocery{
	
	public static void main(String args[]) throws IOException 
	{
		int choice=0;
		int count=0;
		int budget=0;
		int l=0;
		String a=null;
		String b=null;
		Float d = null;
		Integer c=null;
				
		String[] product = new String[100];
		Float[] quantity = new Float[100];
		Integer[] price = new Integer[100];
		int i=0;
		System.out.println("User GO with following question ");
		System.out.println("");
		Scanner in = new Scanner(System.in);
		BufferedReader inp = new BufferedReader (new InputStreamReader(System.in));
		
		try{
		System.out.print("Enter Your budget : ");
		
		budget = in.nextInt();
		System.out.println("");
		System.out.println("");
		}catch(InputMismatchException e){
			in.nextLine();
			System.out.println("Please enter correct budget ");
			System.out.print("Enter Your budget : ");
		    
		    budget = in.nextInt();
		    System.out.println("");
		    System.out.println("");
		}
		
		while(budget>=0)
		{
			System.out.println("1. Add an item to basket ");
			System.out.println("");
			
			System.out.println("2. Exit");
			System.out.println("");
			
			try{
			System.out.print("Enter your choice :");
			choice = in.nextInt();
			System.out.println("");
			System.out.println("");
			System.out.println("");
			}catch(InputMismatchException e){
				in.nextLine();
				System.out.println("Please enter correct choice ");
				System.out.print("Enter your choice :");
			    choice = in.nextInt();
			    System.out.println("");
			    System.out.println("");
			    System.out.println("");
			}
			
			if((choice!=1) && (choice!=2))
			{
				System.out.println("Please enter correct choice ");
				System.out.print("Enter your choice :");
			    choice = in.nextInt();
			    System.out.println("");
			    System.out.println("");
			    System.out.println("");
			}
			
			if(choice == 1)
			{
				
				
				System.out.print("Enter product : ");
			    a = inp.readLine();
				System.out.println("");
			    
				try{
				System.out.print("Enter quantity in Kg : ");
			    b = inp.readLine();
				l=b.length();
				l=l-3;
				
				b = b.substring(0 , l);
				d=Float.parseFloat(b);
				
			    System.out.println("");
			    }catch(InputMismatchException e){
					in.nextLine();
					System.out.println("Please enter correct quantity");
					System.out.println("");
					System.out.print("Enter quantity in Kg : ");
			       b = inp.readLine();
				l=b.length();
				l=l-3;
				
				b = b.substring(0 , l);
				d=Float.parseFloat(b);
			        System.out.println("");
					
				}
				
				try{
				System.out.print("Enter price : ");
			    c = in.nextInt();
				}catch(InputMismatchException e){
					System.out.println("Please enter only numbers");
					System.out.println("");
					System.out.print("Enter price : ");
			        c = in.nextInt();
			        System.out.println("");
					
				}
				
				
				for(int x=0 ; x<i ; x++)
				{
					if(a.equals(product[x]))
					{   count=1;
					    budget = budget + price[x];
						quantity[x]=d;
						price[x]=c;
	
						continue;
					}
				}
				
			    
			    System.out.println("");
				System.out.println("");
			    System.out.println("");
				
				budget = budget - c;
				
				if(count==0)
				{
					product[i]=a;
					quantity[i]=d;
					price[i]=c;
				}
				
				if(budget < 0)
				{   
					budget = budget + price[i];
					product[i]=null;
					quantity[i]=null;
					price[i]=null;
					
					System.out.println("Can't buy this product ### (because budget left is "+ budget + ")");
					System.out.println("");
			        System.out.println("");
					
					continue;
				}
				
				
				System.out.println("Amount left : "+budget);
				if(count!=1)
				{i++;}
				count=0;
				
			    System.out.println("");
			    System.out.println("");
				System.out.println("");
				
				
			}
			
			if(choice == 2)
			{
				System.out.print("Amount left can buy you ");
				for(int y=0 ; y<i ; y++)
				{
					if(budget>=price[y])
					System.out.print(product[y]+" / ");
				}
				
				System.out.println("");
				System.out.println("");
				
				
				System.out.println("GROCERY LIST is : ");
				
				int temp=0;
				
				System.out.print("PRODUCT             ");
				System.out.print("QUANTITY            ");
				System.out.println("PRICE");
				
				
				
				
				for(int m=0;m<i;m++)
				{
					System.out.print(product[m]);
					
					temp=20-product[m].length();
					
					for(int j=1 ; j<=temp ;j++)
					{
						System.out.print(" ");
					}
					
					System.out.print(quantity[m]+" Kg");
					
					temp=20-String.valueOf(quantity[m]).length();
					
					for(int j=1; j<=temp-3;j++)
					{
						System.out.print(" ");
					}
					
					
					System.out.println(price[m]);
					
					
					
				}
				
				return;
				
				
			}
			
			
			
		}
		
		
		
		
	}
}
