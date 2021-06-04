package learning;
/*
 * Split a number program
 * 1.Sample Input :00
 * output       :0 0
 * 
 * 2.Input:01
 *   output:0 1
 * 
 * 3.Input:123
 *   Output:1 2 3
 * 
 * */
import java.util.*;
public class Number_Separation {

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
			int power=1;
			for(int k=1;k<length;k++)
			{
				power=power*10;
			}
			while(j>0)
			{
				reminder=no%power;
				no=no/power;
				result[i]=no;
				no=reminder;
				power=power/10;
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
