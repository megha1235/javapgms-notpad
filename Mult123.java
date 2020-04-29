class Mult123
{

int a;

Mult123(int n)
{
a=n;
}
void display()
{
System.out.println("mult table");
 for(int i=1;i<=12;i++)
	{
	int c=i*a;
	System.out.println(+i +"*" +a+"="+c);

	}
}
public static void main(String args[])
{
Mult123 myObj = new Mult123(2);
myObj.display();
}
}