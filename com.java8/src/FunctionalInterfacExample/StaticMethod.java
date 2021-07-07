package FunctionalInterfacExample;

interface Interf3
{
	public static void m1()
	{
		System.out.println("interface static method");
	}
	default void m2()
	{
		System.out.println("interface default method");
	}
}
public class StaticMethod// implements Interf3
{
	public static void main(String[] args) 
	{
		//StaticMethod s = new StaticMethod();

		//s.m2();
		Interf3.m1();//we can access static methos only interface name 
	}

}
