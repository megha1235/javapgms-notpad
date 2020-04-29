 class SubstringExample
{
 public static void main(String args[])
 { 
 String s1="evisionlabs";
 String s2="ev";
 for(int i=0;i<10;i++)
 {
	for(int j=i+1;j<=10;j++)
	{
 if((s1.substring(i,j+1))==s2)
	{
 System.out.println("string is substring");
	}
	else
	{
		System.out.println("not");
	}		
	}
 }
 }
}