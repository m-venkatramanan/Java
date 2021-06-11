/*Program : Evil Number or Not
 * 
 * What is Evil Number?
 *    Even Number of 1s Present  in the binary expansion is called Evil Number 
 *    
 *    Input : 3
      Output : Binary expansion of 3 is 11,
               3 is Evil Number 
 * */
package learning;

import java.util.Scanner;

public class EvilNumber {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int number=s.nextInt();
		String value="";
		int count=0,no=number,remainder;
		while(no>0)
		{
			remainder=no%2;
			if(remainder==1)
				count++;
			value=remainder+value;
			no/=2;
			
		}
		System.out.println("Binary Expansion of "+number+" is "+value);
		if(count%2 !=0)
		{
			System.out.print(number+" is Odious Number (Not Evil Number)");
		}
		else
		{
			System.out.print(number+" is Evil Number");
		}
		

	}

}
