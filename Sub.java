
public class Sub implements Super{
	public int display(int x)
	{
		System.out.println("Value:"+x);
		return x;
	}
	public static void main(String arg[])
	{
		Sub obj=new Sub();
		obj.display(5);
	}

}
