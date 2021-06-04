package learning;
/*
 * Reverse a number program
 * 1.Sample Input :00
 * output       :00
 * 
 * 2.Input:01
 *   output:10
 * 
 * 3.Input:123
 *   Output:321
 * 
 * */

import java.util.Scanner;

public class Reverse_Number {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String number=s.nextLine();		
		int length=number.length();
		int reminder=0,i = 0,j=length;
		int result[]=new int[length];
		try
		{
		int no=Integer.parseInt(number);
		if(length>1)
		{
			while(j>0)
			{
				reminder=no%10;
				no=no/10;
				result[i]=reminder;
				j--;
				i++;
				
			}
			for(int x=0;x<length;x++)
			{
				System.out.print(result[x]+" ");
			}
		}
		}
		catch(NumberFormatException e)
		{
			System.out.println("Enter valid Number");
		}

		

	}

}
