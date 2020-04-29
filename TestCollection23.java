import java.util.*;
 class TestCollection23
 { 
 public static void main(String args[])
 {
	 System.out.println("enter the limit");
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
 ArrayList<Integer> al=new ArrayList<Integer>();
 for(int i=1;i<=n;i++)
 {
 al.add(i);
 }
 for(Integer obj:al) 
 System.out.println(obj); 
 } 
 }
