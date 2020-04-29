import java.util.*;
class Calc
{
	public static void main(String args[])
		{
		Scanner obj=new Scanner(System.in);
		System.out.println("enter the numbers");
		int a=obj.nextInt();
		int b=obj.nextInt();
		System.out.println("enter the OPERATION");
		int c=obj.nextInt();
	switch (c)
		{
		case 1 :
			  int m=a+b;
			  System.out.println(m);
			  break;
		case 2 :
			  int n=a-b;
			  System.out.println(n);
			  break;
		case 3 :
			  int o=a*b;
			  System.out.println(o);
			  break;
		case 4 :
			  float p=a/b;
			  System.out.println(p);
			  break;
		case 5 :
			  float q=a%b;
			  System.out.println(q);
			  break;
		}
		
		}
}
