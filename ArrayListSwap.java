import java.util.ArrayList; 
import java.util.Collections;  
public class ArrayListSwap 
{    
  public static void main(String a[])
  {        
  ArrayList<String> list = new ArrayList<String>();
  list.add("0");       
  list.add("3");     
  list.add("4");     
  list.add("0");    
  list.add("1");    
  list.add("2");
  list.add("5");  
  list.add("0");   
  Collections.swap(list, 0, 5); 
  Collections.swap(list, 3, 6); 
  System.out.println("Results after swap operation:");   
  for(String str: list)
  {           
  System.out.println(str);      
  }   
  } 
} 