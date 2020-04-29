class Prime
{
	public static void main(String args[])
		{
			int n=10;
			int i=2;
			int c=0;
				if(n==0||n==1)
						{
					System.out.println(" number is prime");
						}
				else
						{
							while(i<n)
							{
								c=n%i;
								i++;
							}
					if(c==0)
						{
					System.out.println("not prime");
						}
					else
						{
					System.out.println("prime");
						}
							}
						}
		}
