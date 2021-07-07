package PredicateInterfaceExample;

import java.util.function.Predicate;

public class JoinPredicate 
{
	public static void main(String[] args) 
	{
		int[] x={0,5,10,15,20,25,30,35};
		
		Predicate<Integer> p= i->i%2==0;
		Predicate<Integer> p1= i->i>10;
		System.out.println("the no is even and > 10:");
		
		for(int x1:x)
		{
			if(p.and(p1).test(x1))
			//if(p.or(p1).test(x1))
				System.out.println(x1);
		}
		
	}

}
