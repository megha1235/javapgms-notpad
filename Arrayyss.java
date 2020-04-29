class Arrayyss
{
public static void main(String args[])
	{
int a[]= new int [3];
	a[0]=3;
	a[1]=12;
	a[2]=1;
for(int i=0;i<3;i++)
	{
	for(int j=i+1;j<2;j++)
	{
	if(a[i]<a[j])
		{
		System.out.println(a[i]);

		}
		else
		{
			System.out.println(a[j]);
		}
		i++;
	
	
	}
	}
	}
}