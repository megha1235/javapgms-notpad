import java.util.*;
class Leap
{
public static void main(String args[])
	{
	Scanner obj=new Scanner(System.in);
	System.out.println("Enter the year");
	int a=obj.nextInt();
	if(a%4==0)
	{
	 System.out.println("Leap year");
	}
	else
	{
		System.out.println("not a leap year");
	}
	}
}
