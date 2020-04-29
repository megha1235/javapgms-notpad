import java.util.*;  
 class Collection14
 {   
 public static void main(String args[]) 
 {  
 ArrayList<String> list=new ArrayList<String>();
 list.add("Ravi"); 
 list.add("Vijay");  
 list.add("Ravi");  
 list.add("Ajay");  
 Iterator itr=list.iterator();
 int i=0; 
 while(i<list.size()) 
 {   
 System.out.println(list.get(i));
 i++; 
 }  
 }  
 } 