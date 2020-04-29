import java.util.*;
class Multt1
{
	public static void main(String args[])
	{
	int n,m;
	Scanner obj=new Scanner(System.in);
	System.out.println("enter the First Num");
	n=obj.nextInt();
	System.out.println("enter the second Num");
	m=obj.nextInt();
	int s=0;
	for(int i=1;i<=m;i++)
		{
		s=s+n;
		}
	System.out.println(s);
	}
}