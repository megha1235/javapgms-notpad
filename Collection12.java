import java.util.*;  
 class Collection13
 {   
 public static void main(String args[]) 
 {  
 ArrayList<String> list=new ArrayList<String>();
 list.add("Ravi"); 
 list.add("Vijay");  
 list.add("Ravi");  
 list.add("Ajay");  
 Iterator itr=list.iterator(); 
 for(int i=0;i<list.size();i++) 
 {   
 System.out.println(list.get(i)); 
 }  
 }  
 } 