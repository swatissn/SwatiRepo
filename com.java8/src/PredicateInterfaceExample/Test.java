package PredicateInterfaceExample;

import java.util.function.Function;
import java.util.function.Predicate;

public class Test 
{	
	public static void main(String[] args) 
	{
	   /*Predicate<Integer> p=  i->i%2==0;
	   System.out.println(" number is:"+p.negate().test(10));
	   System.out.println(" number is:"+p.test(10));*/
	   
	   
	   String[] s={"swati","rani","nagode","kardile","zagare"};
	   
	     Predicate<String> p= s1->s1.length()>5;
	     System.out.println("lagrest lenght is:");
	     for(String s1:s)
	     {
	    	 //if(s1.length()>5)
	    	 if(p.test(s1))
	    	 {
	    	 System.out.println(s1+ "" );
	    	 }
	     }
		
	}
	

}
