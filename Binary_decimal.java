package array.workings;

import java.util.Scanner;

public class Binary_decimal {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println(" Enter the binary number ");
		int bi=sc.nextInt();
		Binary_decimal bin=new Binary_decimal();
		int decimal= bin.decimal(bi);
		System.out.println(" decimal "+decimal);
		
	}

	private int decimal(int bi) {
		int i=0;
		int decimal=0;
		while(bi>0)
		{
			int rem=bi%10;
			decimal=decimal+rem*(power(i));
			bi=bi/10;
			i++;
			
		}
		return decimal;
		
	}

	private int power(int i)
	{
		int r=1;
		if(i==0)
			return 1;
		else
				
			while(i>0)
			{
				r=2*r;
				i--;
				
			}
		return r;
	
	}
}


