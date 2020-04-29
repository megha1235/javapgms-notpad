class Vowels11
{
	public static void main(String args[])
		{
		char[]  a={'a','e','i','o','u'};
		String b=new String(a);
		char[]  d={'e','v','i','s','i'};
		String c=new String(d);
	
		for(int i=0;i<=4;i++)
				{
			for(int j=0;j<=4;j++)
				{
				if(a[i]==d[j])
					{
						
					System.out.println(a[i]);
					}
				}
			
				}
		
		String rs=c.replace('e','a');
		System.out.println(rs);
				
				
				
			}
			
		
		}
