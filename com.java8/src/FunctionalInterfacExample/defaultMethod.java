package FunctionalInterfacExample;
 interface Interf2
 {
	 default void m1()
	 {
		 System.out.println("interface default  method");
	 }
 }
public class defaultMethod implements Interf2
{
	/*public void m1()
	{
		System.out.println("overriding of default method");
	}*/
	public static void main(String[] args) 
	{
		 defaultMethod d = new defaultMethod();
		 d.m1();//we can access default method only by using class object
		
	}

}
