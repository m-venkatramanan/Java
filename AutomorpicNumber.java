package learning;

import java.util.Scanner;

public class AutomorpicNumber {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int number=s.nextInt();
		int square,count=0,no=number;
		square=number*number;
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
		System.out.println(number+" Atomorpic Number");
	}
		else
		{
			System.out.println(number+" Non Automorphic Number");
		}

}
}