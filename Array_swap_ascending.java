package array.workings;

public class Array_swap_ascending {
	public static void main(String[] args)
	{
		int[] a= {50,3,5,40,30,20,4,4,78};
		for(int j=1;j<a.length;j++)
		{
			for(int i=0;i<a.length-j;i++)
			{
				if(a[i]>a[i+1])
				{
					int t=a[i];
					a[i]=a[i+1];
					a[i+1]=t;
				}
			}
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
				}
			}
		
	

}
