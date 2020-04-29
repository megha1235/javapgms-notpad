class Amstrong
{
	public static void main(String ags[])
		{
		int n=133;
		int t=n;
		int c=0;
		while(n>0)
		{
		 int a=n%10;
		 c=c+(a*a*a);
		 n=n/10;
		}
	if(c==t)
		{
		System.out.println("Amstrong");
		
		}
	else
	{
	
	System.out.print(“*”+” ”);
	}
		
		
		}
}