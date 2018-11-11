
public class Usecalc implements Calculator{
	public int add(int n1,int n2)
	{
		return n1+n2;
	}
	public int subst(int n1,int n2)
	{
		return n1-n2;
	}
	public int multiply(int n1,int n2)
	{
		return n1*n2;
	}
	public void display()
	{
		System.out.println("Addition:"+this.add(3,5));
		System.out.println("Subtraction:"+this.subst(3,5));
		System.out.println("Multiplication:"+this.multiply(3,5));
	}	
	public static void main(String arg[])
	{
		Usecalc obj=new Usecalc();
		obj.display();
	}
}









