class Fib
{
	public static void main(String args[])
		{
		int n=9;
		int a=0;
		int b=1;
		int c=a+b;
		System.out.println(c);
		
		for(int i=2;i<=n;i++)
			{
			c=c+i;
			int m=c;
			System.out.println(m);
			}
			
		}
}
