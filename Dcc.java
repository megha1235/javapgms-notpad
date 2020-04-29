import java.util.*;
class Dcc
{
public static void main(String args[])
	{
	
	Scanner obj=new Scanner(System.in);
	System.out.println("enter the Array Length");
	int n=obj.nextInt();
	int a[]= new int[n];
	System.out.println("enter the values");
	for(int i=0;i<n;i++)
		{
		 a[i]=obj.nextInt();
		}
	for(int i=0;i<n;i++)
	    {
		for(int j=i+1;j<n;j++)
			{
			if(a[i]<a[j])
				{
				int b=a[i];
				a[i]=a[j];
				a[j]=b;
				}
			}
		}
		System.out.println("decending");
	for( int i=0;i<n;i++)
			{
			System.out.println(a[i]);
			}
		
	}
}