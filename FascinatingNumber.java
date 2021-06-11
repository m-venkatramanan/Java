package learning;
import java.util.Scanner;
public class FascinatingNumber {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int number=s.nextInt();
		int result=fascination(number);
		if(result==1)
		{
			System.out.println(number+" is Not Facinating Number");
		}
		else
		{
			System.out.println(number+" is Facinating Number");
		}
	}
	
	static int fascination(int number)
	{
		int two=number*2;
		int three=number*3;
		String result=""+number+two+three;
		System.out.println(result+" : Concatenate Number");
		int length=result.length();
		if(length==9)
		{
			char[] c=result.toCharArray();
			for(int i=0;i<length;i++)
			{
				int count=1;
				if(c[i]-'0'==0)
				{
					return 1;
				}
				for(int j=i+1;j<length;j++)
				{
					if(c[i]-'0' == c[j]-'0')
					{
						count++;
					}
				}
				if(count>1)
				{
					return 1;
					
				}	
			}
			return 0;		
		}
		else
		{
			return 1;
		}
	
	}
}
