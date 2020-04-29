import java.util.*;
class Vowels
{
	public static void main(String args[])
	{
		char a[]={'a','e','i','o','u'};
		String b[]=new char[3];
		Scanner obj=new Scanner(System.in);
		System.out.println("enter the Array values");
		for(int j=0;j<3;j++)
		{
			String b[j]=obj.nextLine();
		}
		for(int i=0;i<4;i++)
		{
			
			for(int j=0;j<3;j++)
				{
				
				if(a[i]==b[j])
					{
					System.out.println(a[i]);
					}
				else
					{
					System.out.println("not");
					}
				
				}
		}
	}
}