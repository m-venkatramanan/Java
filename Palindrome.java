package learning;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int number=s.nextInt();
		int a[];
		int i=0;
		int reminder=0;
		while(number>0)
		{
			reminder=number%10;
			i=(i*10)+reminder;
			number=number/10;
			
		}
		if(i==number)
		{
			System.out.println("The Given Number is a Palindrome");
		}
		else
		{
			System.out.println("The Given number is not Palindrome");
		}

	}

}
