package PredicateInterfaceExample;

import java.util.ArrayList;
import java.util.function.Predicate;

class Employee
{
	String ename;
	double salary;

Employee(String ename, double salary)
{
	this.ename=ename;
	this.salary= salary;
	
}
public String toString()
{
	return ename+ ":"+salary;
	
}
}
public class EmployeeTest 
{
	public static void main(String[] args) 
	{
		ArrayList<Employee> l = new ArrayList<Employee>();
		l.add(new Employee("swati",50000));
		l.add(new Employee("mithu",20000));
		l.add(new Employee("sayli",40000));
		l.add(new Employee("rani",10000));
		System.out.println(l);
		
		Predicate<Employee> p= e->e.salary>30000;
		System.out.println("employee salary is:");
		for(Employee e1:l)
		{
			if(p.test(e1))
			System.out.println(e1);
		}
		
	}

}
