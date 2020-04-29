class Stringcompare
{
 public static void main(String args[])
 { 
 char ch[]={'s','t','r','i','n','g','s'}; 
 String s2=new String(ch);
 for( int i=0;i<ch.length;i++)
 {
	 for(int j=i+1;j<ch.length;j++)
	 {
		 if(ch[i]==ch[j])
		 {
		 }
		 else
		 {
			 ch[j]=ch[i];
		 }
	}
}
for(int j=0;j<ch.length;j++)
{
System.out.print(ch[j]); 
}
 }
 }
 
 