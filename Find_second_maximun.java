package array.workings;

public class Find_second_maximun {
	public static void main(String[] args)
	{
	int[] nums = {1,3,5,6, -10,4,6,9 };

    int max = Integer.MIN_VALUE;
    int secmax = Integer.MIN_VALUE;

    for(int x=0; x<nums.length; x++) 
    {
        if(nums[x]>max )
        {
            secmax = max;
            max=nums[x];
        }
        else if(nums[x]>secmax)
        {
            secmax=nums[x];
        }
     }
    System.out.println("1st Highest value: " + max);
    System.out.println("2nd Highest Value: " + secmax);
}

}
