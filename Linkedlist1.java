import java.util.*;  
 class Linkedlist1 
 {  
 public static void main(String args[]) 
 {   
 ArrayList<String> list=new ArrayList<String>();
 list.add("abc");
 list.add("anu");   
 list.add("arun");  
 list.add("kiran"); 
 Iterator itr=list.iterator();  
 while(itr.hasNext()) 
 {  
 System.out.println(itr.next()); 
 } 
 }  
 } 
 
 