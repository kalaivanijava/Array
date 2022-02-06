package array.workings;

public class Tranpose_diffrentrow {
	public static void main(String[] args)
	{
		int[][] first= {{1,2,3},{4,5,6}};
		int[][] second=new int[3][2];
		//System.out.println(first.length);
		//System.out.println(second.length);
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<2;j++)
			{
				second[i][j]=first[j][i];
			}
		}
		System.out.println(" before transpose ");
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(first[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println(" after transpose ");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<2;j++)
			{
				System.out.print(second[i][j]+" ");
			}
			System.out.println();
		
	}

}
}
