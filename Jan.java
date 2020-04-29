import java.util.*;
class Jan
{
public static void main (String args[])
	{
		Scanner obj=new Scanner(System.in);
		System.out.println("enter the values");
		int a=obj.nextInt();
		int b=obj.nextInt();
		int c=obj.nextInt();
	
	if(a>b && a<c)
		{
		System.out.println("second greatest="+a);
		}
	else if(a>c && a<b)
		{
		System.out.println("second greatest="+a);
		}
	else if(b>a && b<c)
		{
		System.out.println("second greatest="+b);
		}
	else if(b>c && b<a)
		{
		System.out.println("second greatest="+b);
		}
	else if(c>b && c<a)
		{
		System.out.println("second greatest="+c);
		}
	else if(c>a && c<b)
		{
		System.out.println("second greatest="+
		c);
		}
		
	}
}