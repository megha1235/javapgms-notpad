import java.util.*;  
 class Vector1
 {   
 public static void main(String args[])
 { 
 Vector<String> vector=new Vector<String>();  
 vector.add("Ayush"); 
 vector.add("Amit");
 vector.add("Ashish");  
 vector.add("Garima");  
 Iterator<String> itr=vector.iterator(); 
 while(itr.hasNext())
 {   
 System.out.println(itr.next());  
 } 
 } 
 } 