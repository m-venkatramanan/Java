/*
 * To Convert Decimal to Binary value
 * Input :10
 * output : 1010
 * 
 * Easiest Way
 * 
 * The Integer.toBinaryString() method in Java converts int to binary string.
 * 
 * int val = 2;
 *System.out.println("Converting integer "+val+" to Binary String: "+Integer.toBinaryString(val1));
 * 
 * 
 * 
 * */
package learning;

import java.util.Scanner;

public class DecimalToBinary {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int decimal=s.nextInt();
		String binary="";
		int value=0;
		while(decimal>0)
		{
			value=decimal%2;
			decimal=decimal/2;
			binary=value+binary;
		}
		System.out.print(binary);
		

	}

}
