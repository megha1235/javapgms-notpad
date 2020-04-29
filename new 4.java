public class Edureka 
{ 
    public static void rightTriangle(int n) 
    { 
        int i, j;  
        for(i=0; i<n; i++) 
        {
        for(j=2*(n-i); j>=0; j--)
            {           
                System.out.print(" ");
            } 
            for(j=0; j<=i; j++) 
            {       
                System.out.print("* "); 
            }           
            System.out.println();    
        } 
    } 
    
import java.util.Scanner;
public class Edureka
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
 
        System.out.println("Enter number of rows: "); // takes input from user
 
        int rows = sc.nextInt();
         
        for (int i= 0; i<= rows; i++)
        {
            for (int j=1; j<=rows-i; j++)
            {
                System.out.print(" ");
            }
            for (int k=0;k<=i;k++)
            {
                System.out.print("*");
            } 
                System.out.println("");
        }
        sc.close();
 
    }
}