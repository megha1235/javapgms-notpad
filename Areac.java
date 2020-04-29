import java.util.*;
class Areac
{
public static void main(String args[])
	{
	Scanner obj=new Scanner(System.in);
	double i=3.14;
	System.out.println("enter the radius");
	int r=obj.nextInt();
	System.out.println("1.CALCULATING THE DIAMETER 2.CALCULATE THE AREA 3.CALCULATE THE PERIMETER 4.AREA OF HALF CIRCLE 5.PERIMETER OF HALF CIRCLE");
	System.out.println("Enter your choice");
	int n=obj.nextInt();
	
	
	switch(n)
	{
		case 1:int d=2*r ;
			   System.out.println(d);
			   break;
		
		case 2:double area=i*r*r;
			   System.out.println(area);
			   break;
		case 3:double p=2*i*r; 
			   System.out.println(p);
			   break;
		case 4:double areah=(i*r*r)/2;
			   System.out.println(areah);
			   break;
		case 5:double  ph=(2*i*r)/2;
			   System.out.println(ph);
			   break;
		default:System.out.println("no matches");
				
	}
	
	}
}