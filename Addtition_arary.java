package array.workings;

public class Addtition_arary
{
	public static void main(String[] args)
	{
	int[][] a= {{3,4},{4,3}};
    int[][] b= {{3,8},{8,3}};
    int[][] c=new int[2][2];
    
    for(int i=0;i<c.length;i++)
    {
    	for(int j=0;j<c.length;j++ )
    	{
    		c[i][j]=a[i][j]+b[i][j];
    	
       	}
    }
    for(int i=0;i<c.length;i++)
    {
    	for(int j=0;j<c.length;j++ )
    	{
    		System.out.print(c[i][j]+" ");
    	}
    	System.out.println();   
    
}
}
}
