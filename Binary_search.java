package array.workings;

import java.util.Scanner;

public class Binary_search {
	public static void main(String[] args)
	{
		int[] number= {1,2,3,4,5,6,8};
		Binary_search bs=new Binary_search();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number to search ");
		int key=sc.nextInt();
		int min=0;
		int max=number.length-1;
		bs.findNumber(number,min,max,key);
	}

	private void findNumber(int number[],int min,int max,int key) {
		
		while(min<=max)
		{
			int mid=(max+min)/2;
			if(number[mid]<key)
			{
				min=mid+1;
			}
			else if(number[mid]==key)
			{
				System.out.println(" number is found at index "+mid);
				break;
			}
			else
			{
				max=mid-1;
			}
			
				
		}
		if(min>max)
		{
			System.out.println(" Sorry , Number is not found");
		}
		
	}

}
