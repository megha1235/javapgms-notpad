import java.util.Scanner;
public class Test1
{
public static void main(String args[])
{
int num1, num2;
Scanner scanner = new Scanner(System.in);
System.out.print("Enter first number:");
num1 = scanner.nextInt();
System.out.print("Enter second number:");
num2 = scanner.nextInt();
num1 = num1 ^ num2;
num2 = num1 ^ num2;
//num1 = num1 ^ num2;stem.out.println(num1 ^ num2);


System.out.println(num1);
System.out.println(num2);
}
}