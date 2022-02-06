package array.workings;

public class Array_multiplication {
	public static void main(String[] args)
	{
		int[][] first= {{2,4},{4,2}};
		int[][] second= {{3,2},{2,3}};
		int[][] result=new int[2][2];
		
		for(int i=0;i<result.length;i++)
		{
			for(int j=0;j<result.length;j++)
			{
				result[i][j]=0;
				for(int z=0;z<result.length;z++)
				{
				result[i][j]+=first[i][z]*second[z][j];
			}
		}
		}
		for(int i=0;i<result.length;i++)
		{
			for(int j=0;j<result.length;j++)
			{
				
				System.out.print(result[i][j]+" ");
			}
			System.out.println();
	}

}
}

