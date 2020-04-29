import java.util.Scanner;
class Samp
{
public static void main(String args[])
{
int a[]=new int[3];
Scanner s=new Scanner(System.in);
for(int i=0;i<3;i++)
{
a[i]=s.nextInt();
}
for(int i=0;i<3;i++)
{
for(int j=i+1;j<3;j++)
{
if(a[i]>a[j])
{
int temp=a[i];
a[i]=a[j];
a[j]=temp;
}
}
}
for(int k=0;k<3;k++)
{
System.out.println(a[k]);
}

}
}