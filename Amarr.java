import java.util.*;
class Amarr
{
	public static void main (String args[])
		{
		int c=0,sum=0,t;
		Scanner am=new Scanner(System.in);
		int a[]=new int [3];
		System.out.println("enter the numbers");
		for(int i=0;i<=2;i++)
		{
		a[i]=am.nextInt();
		sum=sum+a[i];
		
		}
		t=sum;
		
		System.out.println(t);
		while(t>0)
		{
		int b=t%10;
		c=c+(b*b*b);
		t=t/10;
		}
		if(c==sum)
		{
		System.out.println("amstrong");
		}
		else
		{
		System.out.println("not amstrong");
		}
		
		
		}
}