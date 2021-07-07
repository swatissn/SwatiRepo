package FunctionalInterfacExample;

interface interf
{
	public void m1();
	
}
public class Simple 
{
	public static void main(String[] args) 
	{
		interf i= ()->System.out.println("it is m1() method");
		i.m1();
		
	}

}
