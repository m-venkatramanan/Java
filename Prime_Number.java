/*
 * The Given Number is Prime or Not Java Program
 * Input :7
 * output : 7 is a Prime Number
 * 
 * Input1 : 1 
 * Input2 : 100
 * Output :print prime number in between 1 to 100
 * 
 * 
 * */
package learning;

import java.util.InputMismatchException;
import java.util.Scanner;
public class Prime_Number {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		Prime_Number pn=new Prime_Number();
		System.out.println("Choose The Operation \n 1.Check the Number Prime or Not"
				+ "\n 2.printing the Prime Number in between Number");
		try {
		int choose=s.nextInt();
		switch(choose)
		{
		case 1:
		{
			System.out.println("Enter the Number");
			int no=s.nextInt();
			pn.checkprime(no);
			break;
		}
		case 2:
		{
			System.out.println("Enter the Starting Number");
			int start_no=s.nextInt();
			System.out.println("Enter the Ending Number");
			int end_no=s.nextInt();
			pn.printprime(start_no,end_no);
		}
		default:
		{
			System.out.println("Enter 1 or 2");
			break;
		}
		}
			
		}
		catch(InputMismatchException e)
		{
			System.out.print("Enter Valid Number");
		}
	}
	private void printprime(int s,int e) {	
			if(s<=1 && e<=1)
			{
				System.out.print(s+"Starting"+e+"Ending is not valid");
			}
			if(s<e)
			{
				int total=0;
				for(int i=s;i<e;i++)
				{
					int count=0;
					if(i==0 || i==1)
					count++;
					int k=i/2;
					for(int j=2;j<=k;j++)
					{
						if(i%j == 0)
						{
							count++;
							break;
						}
					}
					if(count==0) {
						System.out.println(i+" is a Prime Number");	
						total++;
					}
				 }
				System.out.println("The Total Number of Prime Number is:"+total);
			}
				
			
			else
			{
				System.out.println("Starting point is not Less then End point");
			}
		}
	
	private void checkprime(int number) {
			int no=number/2,count=0;
			if(number==0 || number==1)
			{
				System.out.print(number+" is not Prime");
			}
			else
			{
				for(int i=2;i<=no;i++)
				{
					if(number%i == 0)
					{
						System.out.print(number+" is not Prime Number");
						count++;
						break;
					}
				}
				if(count==0) {
					System.out.print(number+" is a Prime Number");					
				}
			}	
	}

}

