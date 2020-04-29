class Pattern
{
public static void main(String args[]) 
    { 
        int i, j; 
  
        for(i=0; i<7; i++) 
        { 
  
  
            for(j=1; j<=i+1; j++) 
            { 
                
                System.out.print(" "+j ); 
            } 
  
            
            System.out.println(" "); 
        } 
		int n=7;
		for(i=0;i<6;i++)
		{
			for(j=1;j<n;j++)
			{
				System.out.print(" "+j ); 
			}
			System.out.println(" "); 
			n=n-1;
		}
   } 
  
   
} 
