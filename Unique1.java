import java.util.*;
class Unique1
{
	public static void main (String args[])
		{
			int a=0;
		String s= new String("abc");
		for(int i=0;i<3;i++)
			{
				for(int j=i+1;j<3;j++)
					{
					 if (s.charAt(i) == s.charAt(j)) 
						{
						a=a+1;
						}
					
					}
			}
		if(a!=0)
		{
			System.out.println("not all uniqui");
		}
		else
		{
			System.out.println(" all uniqui");
		}
		
		}
}