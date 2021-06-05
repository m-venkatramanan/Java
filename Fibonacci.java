/*
 * The Given Number is Fibonacci or Not Java Program
 * Input :7
 * output : The Number 7 is not fibonacci NUmber
 * 
 * Input :8
 * output : The Number 8 is a fibonacci NUmber
 * 
 * 
 * */

package learning;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Fibonacci {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		try
		{
			int number=s.nextInt();
			if(number<=3)
			{
				System.out.println("The Number "+number+" is a fibonacci NUmber");
			}
			if(number>=4)
			{
				int total=0,a=1,b=2,count=0;
				while(true)
				{
					total=a+b;
					if(number<total)
					{
						count++;
						break;
					}
					a=b;
					b=total;
				}
				if(count==0)
				{
				System.out.println("The Number "+number+" is a fibonacci number");
				}	
				else
				{
				System.out.println("The Number "+number+" is not fibonacci number");
				}
								
			}
			
		}
		catch(InputMismatchException e)
		{
			System.out.print("Enter Valid Number");
		}


	}

}
