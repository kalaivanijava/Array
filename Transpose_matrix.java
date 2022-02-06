package array.workings;

public class Transpose_matrix {
	public static void main(String[] args)
	{
		int first[][]= { {1,2,3},{4,5,6},{7,8,9}};
		int second[][]=new int[3][3];
		
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				second[j][i]=first[i][j];
			}
		}
		// original matrix 
		System.out.println(" before transpose");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
			System.out.print(first[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println(" after transpose");
		// for output
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
			System.out.print(second[i][j]+" ");
		
		}
			System.out.println();
	}

}
}
