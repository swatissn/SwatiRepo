package FunctionInterface;

import java.util.function.Function;

public class Test 
{
	public static void main(String[] args) 
	{
		/*Function<Integer, Integer> f= i->i*i;
		System.out.println(f.apply(4));
		System.out.println("square of no is:"+f.apply(5));
		*/
		
		
		/*Function<String, Integer> f = s->s.length();
		System.out.println("the lenght of string is:"+f.apply("swati"));
		System.out.println("the lenght of string is:"+f.apply("swatisopannagode"));
		*/
		
		Function<String,String> f=s->s.toUpperCase();
		System.out.println("the String is:"+f.apply("swatinagode"));
		System.out.println("the String is:"+f.apply("swati nagode"));
		
	}

}
