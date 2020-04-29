import java.util.*;
class Primee
{
	public static void main(String args[])
	{
		int i;
		
		for( i=2;i<=100;i++)
			{
				int s=0;
			
				for(int n=2;n<=i-1;n++)
				{
			if(i%n==0)
				{
			 s=s+1;	 
				}
			
			
				}
				if(s==0)
				{
					System.out.println(i);
				}
			
			}
				
		
	}
}