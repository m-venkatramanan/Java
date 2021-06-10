/*Author : M.Venkatramanan
 *Date : 10/06/21
 *Program : Convert a Given Number to Word
 * 
 * Input : 9999
 * Output: nine thousand nine hundred ninety nine
 * 
 * */
package learning;

import java.util.Scanner;

public class NumbertoWord {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String onedigit[]= {"zero","one","two","three","four","five","six","seven","eight","nine"};
		String twodigit[]= {"ten","eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eightteen","nineteen"};
		String tens[]= {"","","twenty","thrity","forty","fifty","sixty","seventy","eighty","ninety"};
		String ten_power[]= {"hundred","thousand"};
		try
		{
			String no=s.nextLine();
			String zero=no.trim();
			int length=no.length();
			char[] number=no.toCharArray();
			if(zero.isEmpty())
			{
				System.out.println("Value is Empty");
				return;
			}
			if(length>4) {
				System.out.println("Enter a value below 9999");
				return;
			}
			if(length==1)
			{
				System.out.println(onedigit[number[0]-'0']);
				return;
			}
			int x=0;
			while(x<=length)
			{
				if(length>=3)
				{
					if(number[x]-'0' != 0 )
					{
						System.out.print(" "+onedigit[number[x]-'0']+" "+ten_power[length-3]);
					}
					x++;
					length--;
				}
				else
				{
					if(number[x]-'0'==1)
					{
						System.out.println(twodigit[number[x+1]-'0']);
					}
					else
					{
						if(number[x+1]-'0'==0)
						{
						System.out.println(" "+tens[number[x]-'0']);
						}
						else
						{
							System.out.println(" "+tens[number[x]-'0']+" "+onedigit[number[x+1]-'0']);
						}			
					}
					length--;
					x++;
				}
				
			}
			 
			
		}
		catch(NumberFormatException e)
		{
			System.out.println("Enter Number only");
		}

	}

}
