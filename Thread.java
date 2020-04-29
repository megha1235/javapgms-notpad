class  Thread
{
public void run ()
{
System. Out. Printf (" Test");
}
public static void main (String[] args)
{
Test test = new Test();
Test.run();
Test.start();
}
}