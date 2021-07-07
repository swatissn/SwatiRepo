package FunctionInterface;

import java.util.function.Function;
import java.util.function.Predicate;

class Student
{
	String sname;
	int marks;

Student(String sname,int marks)
{
	this.sname=sname;
	this.marks=marks;
}
}
public class StudentTest 
{
	public static void main(String[] args)
	{
		Function<Student, String> f=s-> {
			int marks=s.marks;
			String grade="";
			if(s.marks>=80) grade="A[Distinction]";
			else if(s.marks>=60) grade="B[first class]";
			else if(s.marks>50) grade="C[second class]";
			else if(s.marks>=35) grade="D[third class]";
			else
				grade="Fail";
			return grade;
			
		};
		//Function<Student,Integer> f1=s2->s2.marks>65;
		Predicate<Student> p=s->s.marks>60;
		
		Student[] s={new Student("swati",100),
				     new Student("kiran",65),
				     new Student("priya",55),
				     new Student("riya",45),
				     new Student("komal",25)};
		
	
	
	for(Student s1:s)
	{
		if(p.test(s1))
		{
		
		System.out.println("student name:"+s1.sname);
		System.out.println("student marks:"+s1.marks);
		System.out.println("student grade:"+f.apply(s1));
		System.out.println();
		
		}
	}
}
}
