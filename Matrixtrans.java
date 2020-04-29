import java.util.*;
class Matrixtrans
{
	public static void main(String args[])
	{
	
	int a[][]= new int[2][2];
	Scanner obj1=new Scanner(System.in);
	System.out.println("array values");
	for(int i=0;i<2;i++)
			{
				for(int j=0;j<2;j++)
				{	
				a[i][j]=obj1.nextInt();
				}
			}
	for(int k=0;k<2;k++)
		{
			for(int l=0;l<2;l++)
			{
		System.out.println(a[l][k]);
			}
		}

	}
		
}