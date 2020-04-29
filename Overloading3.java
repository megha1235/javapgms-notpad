class Overloading3
{
void sum(int a,long b)
{
System.out.println("a method invoked&quot");
}
void sum(long a,int b)
{
System.out.println("method invoked&quot");
}
public static void main(String args[])
{
Overloading3 obj=new Overloading3();

obj.sum(20,20);

}
}