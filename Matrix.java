import java.util.*;
class Matrix
{
	public static void main(String args[])
	{
	int a[][]= new int[2][2];
	int b[][]=new int[2][2];
	int c[][]=new int[2][2];
	Scanner obj=new Scanner(System.in);
	System.out.println("array values");
	for(int i=0;i<2;i++)
		{
		for(int j=0;j<2;j++)
			{
				
			a[i][j]=obj.nextInt();
			b[i][j]=obj.nextInt();
			c[i][j]=a[i][j]*b[j][i];
					System.out.println(c[i][j]);		
			
			}
		}

	}
		
}