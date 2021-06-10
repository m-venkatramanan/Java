/*Program : Automorphic Number in Array

 * what is Automorphic number?
 * 
 *     An automorphic number is a number whose square "ends" in the same digits as the number itself. 
 *     For example, 52 = 25, 62 = 36, 762 = 5776, and 8906252 = 793212890625,
 *      so 5, 6, 76 and 890625 are all automorphic numbers
 * 
 * 
 * */
package learning;

import java.util.Scanner;

public class Automorphic_Array {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("How many values are inserted :");
		int number=s.nextInt();
		int count=0;
		int value[]=new int[number];
		int result[]=new int[number];
		System.out.println("Enter a value One by One");
		for(int i=0;i<number;i++)
		{
			value[i]=s.nextInt();
		}
		for(int i=0;i<number;i++)
		{
			int no=value[i];
			int square=no*no;
			while(no>0)
			{
				if(no%10 != square%10) {
					count++;
					break;
				}
				no/=10;
				square/=10;
			}
			if(count==0) {
			result[i]=value[i];
			System.out.println(result[i]+" is Automorphic Number");
			}
		}
	}

}
