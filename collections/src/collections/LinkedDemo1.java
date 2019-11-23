package collections;
import java.util.*;
public class LinkedDemo1 
{
	public static void main(String[] args)
	{
		LinkedList l=new LinkedList();
		l.add("abhinav");
		l.add(30);
		l.add(null);
		l.add("Abhinav");
		System.out.println(l);
		l.set(0,"software");
		System.out.println(l);
		l.set(0,"Ravi");
		System.out.println(l);
		l.removeLast();
		System.out.println(l);
		l.addFirst("Raja kumar");
		System.out.println(l);
		l.addLast("Choudhary");
		System.out.println(l);
		 System.out.println(l.getLast());
		
	}

}
