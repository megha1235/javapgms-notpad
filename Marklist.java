class Marklist
{
	public static void main(String args[])
		{
		int a=20,b=60,e=10,c;
		c=a+b+e;
		System.out.println("Mark1="+a);
		System.out.println("Mark2="+b);
		System.out.println("Mark3="+e);
		System.out.println("Total="+c);
		if(c<50)
			{
			System.out.println("failed");
			}
		else if(50<c && c<=60)
			{
			System.out.println("D");
			}
		else if(60<c && c<=70)
			{
			System.out.println("c");
			}
		else if(70<c && c<=80)
			{
			System.out.println("b");
			}
		else if(80<c && c<=90)
			{
			System.out.println("a");
			}
		else if(90<c && c<=100)
			{
			System.out.println("a+");
			}
		}
}
		
			