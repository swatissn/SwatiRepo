package FunctionalInterfacExample;
@FunctionalInterface
interface Interf11 {
	public void m1();

	default void m2() {
		System.out.println(" Interface default method");
	}

	public static void m3() {
		System.out.println(" Interface static method");
	}

	public static void m3(int i) 
	{
		System.out.println("integer type static method");
	}

}

class Demo implements Interf11 {
	// TODO Auto-generated method st @Override
	public void m1() 
	{
		System.out.println(" test m1 method");
	}
	public void m2()
	{
		System.out.println("overriding of default method");
	}

	public static void main(String[] args) {
		Demo t = new Demo();
		t.m2();//we can access default method only by using class object
		
	    t.m1();
	    
		Interf11.m3(10);//we can access static methos only interface name 

	}
}
