class Amp
{
public static void main (String args[])
	{
	int j=0;
	for(int i=0;i<=6;i++)
		{
		for( j=0;j<4;j++)
			{
			System.out.print(" ");
		
			}
			for(int t=0;t<=i;t++)
			{
			for(char k='A';k<='Z';k++)
				{
				System.out.print(k +" ");
				}
			}
			
			j=j+1;
			System.out.println("");
		}
		
	}
}