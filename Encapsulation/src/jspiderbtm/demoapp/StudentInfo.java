package jspiderbtm.demoapp;
public class StudentInfo
{
	public static void main(String[] args) 
	{
		Student s=new Student();
		System.out.println("student name : "+s.name);
		s.setAge(+33);
		s.setGmail("kumarabhinav048@gmail.com");
		s.setBalance(10950);
	}

}