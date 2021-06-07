package learning;

import java.util.Scanner;

public class OddorEven {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		OddorEven oe=new OddorEven();
		System.out.println("Choose The operation \n 1.Find a Number Odd or Even \n "
				+ "2.Print a Odd and Even number in Particular Range \n ");
		int choose=s.nextInt();
		switch (choose) {
		case 1:
			System.out.println("Enter a Number");
			int number=s.nextInt();
			oe.find(number);
			break;
		case 2:
			System.out.println("Which one Print Odd or Even\n 1.odd \n 2.Even");
			int no=s.nextInt();
			System.out.println("Enter Starting Number");
			int startno=s.nextInt();
			System.out.println("Enter Ending Number");
			int endnumber=s.nextInt();
			oe.displayoddEven(startno,endnumber,no);
			break;
		default:
			System.out.println("Choose Valid one");
			break;
		}
		
	}

	private void displayoddEven(int startno, int endnumber, int no) {
		if(no==1)
		{
			no=1;
		}
		else {
			no=0;
		}
		for(int i=startno;i<=endnumber;i++)
		{
			if(i%2 == no)
			{
				System.out.println(i);
			}
		}
		
		
	}

	private void find(int number) {
		if(number%2 != 0)
		{
			System.out.println("The Given Number "+number+" is Odd");
		}
		else
		{
			System.out.println("the Given number "+number+" is Even");
		}
		
	}

}
