class Capacity
{
	public static void main(String args[])
		{
		StringBuffer b=new StringBuffer();
		System.out.println(b.capacity());
		b.append("hello");
		System.out.println(b.capacity());
		b.append("java is my favourite");
		System.out.println(b.capacity());
		}
}