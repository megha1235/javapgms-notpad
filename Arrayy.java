class Arrayy
{
	public static void main(String args[])
		{
			int a[][]= new int [2][2];
			a[0][0]=10;
			a[0][1]=11;
			a[1][0]=12;
			a[1][1]=15;
		for(int i=0;i<=1;i++)
		for(int j=0;j<=1;j++)
			{
			System.out.println(a[i][j]);
			}
		}
}