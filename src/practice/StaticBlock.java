package practice;

public class StaticBlock
{

	public void method1()
	{
		System.out.println("m1 method");
	}
	
	public void method2()
	{
		System.out.println("m2 method");
	}
	public static void main(String[] args) 
	{
		
		StaticBlock s=new StaticBlock();
		s.method1();
		s.method2();
	}
	
	static {
		System.out.println("this program will demonstrate the static block working");
	}
	
	{
		System.out.println("this program will demonstrate the non-static block working");

	}

}
