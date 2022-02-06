package array.workings;

import java.util.Scanner;

public class Array_descending_binary {
	public static void main(String[] args)
	{
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println(" Enter the number to search ");
		int key=sc.nextInt();
		int[] numbers= {90,80,70,60,50,40,30};
		int min=0;
		int max=numbers.length-1;
		Array_descending_binary ad=new Array_descending_binary();
		ad.descending(numbers,key,min,max);
	}

	private void descending(int[] numbers,int key,int min,int max)
	
	{
		while(min<=max)
		{
		int mid=min+(max-min)/2;
		if (numbers[mid] == key) 
		{
			System.out.println(" found at "+mid);
			break;
		}  
        // If key greater, ignore right half 
        if (numbers[mid] < key) 
        {
            max = mid - 1; 
        }
        // If key is smaller, ignore left half 
        else
            min = mid + 1; 
     
  
		}

	if(min>max)
		System.out.println("item  not found");
	}
}
