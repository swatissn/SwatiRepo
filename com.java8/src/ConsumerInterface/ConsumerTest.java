package ConsumerInterface;

import java.util.ArrayList;

import java.util.function.Consumer;
import java.util.function.Predicate;

class employee
{
	int eno;
	 String ename;
	public employee(int eno, String ename) {
		super();
		this.eno = eno;
		this.ename = ename;
	}
	
	
}
public class ConsumerTest 
{
	public static void main(String[] args) 
	{
		
		employee[] emp={new employee(21,"swati"),
				new employee(22,"priya"),
				new employee(23,"sachin"),
				new employee(24,"kawya")};
		
		Predicate<String> p= emp1->emp1.length()>3;
		Consumer<employee> c=c1->
		{


			
			System.out.println("student name:"+c1.ename);
			System.out.println("student no:"+c1.eno);
			
			
		};
		
		
		for(employee e:emp)
		{
		
			c.accept(e);
		}
	}

}

