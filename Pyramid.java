class Pyramid
{
public static void main(String args[]) 
    { 
        int i, j; 
  
        for(i=1; i<=6; i++) 
        { 
  
  
            for(j=6; j>=i; j--) 
            { 
                
                System.out.print(" "); 
            }
		for(int k=i;k<=6;k++)
		{
            
            System.out.print("*");
		}
		System.out.println();
        } 
   } 
  
   
} 
