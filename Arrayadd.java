import java.util.*;
class Arrayadd
{
public static void main(String args[])
	{
	Scanner obj = new Scanner(System.in);
	int c[]=new int[5];
	int a[]=new int[5];
	int b[]=new int[5];
	System.out.println("enter the values");
	for(int i=0;i<=4;i++)
	{
	 a[i]=obj.nextInt();
	}
	System.out.println("enter the values");
	for(int j=0;j<=4;j++)
	{
	 b[j]=obj.nextInt();
	}
	System.out.println("sum of a and b");
	
	for(int k=0;k<=4;k++)
	{
	c[k]=a[k]+b[k];
	System.out.println(c[k]);
	}
	
	}
}