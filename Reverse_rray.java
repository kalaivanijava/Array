package array.workings;

import java.util.Scanner;

public class Reverse_rray {
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println(" How many numbers do you want");
		int num=sc.nextInt();
		int[] arr=new int[num];
		int[] res=new int[num];
		
		for(int i=0;i<num;i++)
		{
			System.out.println(" enter number  "+(i+1));
			arr[i]=sc.nextInt();
		}

		System.out.println(" Reverse of given array ");
		int j=0;
		for(int i=num;i>0;i--)
		{
			res[j]=arr[i-1];	
			System.out.println(res[j]);
		}
		j++;
		
	}

}
