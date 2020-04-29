import java.util.*;
class Greatert
{
public static void main (String args[])
		{
	Scanner obj=new Scanner(System.in);
	System.out.println("enter the values");
	int a=obj.nextInt();
	int b=obj.nextInt();
	int c=obj.nextInt();
	int m=0;
	if(a>b && a>c)
		{
	   m=a;
		}
	else if(b>a && b>c)
		{
		m=b;
		}
	else if(c>a && c>b)
		{
		m=c;
		}
	if(m==a)
	{
		if(b>c)
			{
			System.out.println("Second Greatest="+b);
			}
		else
			{
			System.out.println("Second Greatest="+c);
			}
	}
	if(m==b)
	{
		if(a>c)
			{
			System.out.println("Second Greatest="+a);
			}
		else
			{
			System.out.println("Second Greatest="+c);
			}
	}
	if(m==c)
	{
		if(a>b)
			{
			System.out.println("Second Greatest="+a);
			}
		else
			{
			System.out.println("Second Greatest="+b);
			}
	}
		}
}