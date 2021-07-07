package FunctionalInterfacExample;

interface Interf1
{
	public void sum(int a,int b);
	//public void m1();
}

public class Sum 
{
	public static void main(String[] args) 
	{
		Interf1 i= (a,b)->System.out.println("the sum is:"+(a+b));
		i.sum(2,6);
		i.sum(28, 29);
		i.sum(12,16);
	}
}
