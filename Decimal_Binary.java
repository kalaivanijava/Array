package array.workings;

import java.util.Scanner;

public class Decimal_Binary {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the decimal ");
		int de=sc.nextInt();
		Decimal_Binary db=new Decimal_Binary();
		String binary=db.findbinary(de);
		System.out.println("Decimal to binary "+binary);
		
	}

	private String findbinary(int de) {
	
		String binary="";
		while(de>0)
		{
		int rem=de%2;
		binary=rem+binary;
		de=de/2;
		}
		return binary;
		
		
		
		
		
		
	}

}
