package FunctionInterface;

import java.util.function.Function;

public class functionChaining 
{
	public static void main(String[] args) {
		
		Function<Integer,Integer> f=i->i*i;
		Function<Integer, Integer>f1=i1->2*i1;
		
		System.out.println(f.andThen(f1).apply(2));
		System.out.println(f.compose(f1).apply(2));
		
	}

}

