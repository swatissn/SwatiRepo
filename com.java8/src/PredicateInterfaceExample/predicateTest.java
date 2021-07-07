package PredicateInterfaceExample;

import java.util.function.Predicate;

class student
{
	int sno;
	int marks;
	public student(int sno, int marks) {
		super();
		this.sno = sno;
		this.marks = marks;
	}
}
public class predicateTest
{

public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		student[] s={new student(1,30),
				new student(2,90),
				new student(3,32),
				new student(4,78)};
		
		Predicate<student> p=s1->s1.marks>30;
		
		for(student s1:s)
		{
			if(p.test(s1))
				System.out.println( "student name:"+s1.sno+" and student marks "+s1.marks);
		}

	}
}