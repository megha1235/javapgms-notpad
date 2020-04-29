import java.util.*;
class Far
{
	public static void main(String args[])
		{
	Scanner obj=new Scanner(System.in);
	System.out.println("enter the Faranheit temperature");
	int n=obj.nextInt();
		int c=(32*n-32)*5/9;
		System.out.println("degree celsius is "+c);
	
		}
}