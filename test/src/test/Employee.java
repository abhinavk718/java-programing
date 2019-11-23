package test;
public class Employee extends Person
{
	void work()
	{
		System.out.println("Employee get salary.");
	}
	public static void main(String[] args) 
	{
		Student s=new Student();
		Employee e=new Employee();
		s.work();
		e.work();
	}
}
