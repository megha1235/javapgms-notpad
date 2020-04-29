import java.util.*;
class Arrayrev
{
	public static void main(String args[])
		{
		Scanner obj=new Scanner(System.in);
		int a[]=new int[3];
		int b[]=new int[3];
		int n=2;
		System.out.println("enter the values");
		for(int i=0;i<=n;i++)
			{
			a[i]=obj.nextInt();
			b[i]=a[n];
			n--;
		}
		System.out.println("reverse");
		for(int i=0;i<3;i++)
			{
			System.out.println(b[i]);
			}
		
		 
		}
}