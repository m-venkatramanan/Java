package learning;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		ReverseNumber r=new ReverseNumber();
		int no=s.nextInt();
		//r.revers(no);
		//System.out.println(45);
		r.splitnumber(no);	
		//System.out.println(" Succes ");
			}

	private void splitnumber(int no) {
		String s=String.valueOf(no);
		int length=s.length();
		//System.out.println(" "+ length);
		int rem=0;
		if(length>1)
		{
			int power=1;
			for(int i=0;i<length-1;i++)
			{
				power=power*10;
			}
			while(no>0)
			{
				rem=no%power;
				no=no/power;
				
				System.out.print(no+" ");
				no=rem;
				power = power/10;
			}
			
		}
		else
		{
			System.out.println(no);
		}
		
		
		
		
	}

//	private void revers(int no) {
//		int reminder;
//		while(no>0)
//		{
//			reminder = no % 10;
//			no /=10;
//			System.out.print(reminder + " ");
//		}
//		
//		
//	}

}
