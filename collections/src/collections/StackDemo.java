package collections;
import java.util.*;
public class StackDemo 
{
	public static void main(String[] args) 
	{
		Stack s=new Stack();
		s.push("xyz");
		s.push("zxc");
		s.push("ram");
		System.out.println(s);
		System.out.println(s.search("xyz"));
		System.out.println(s);
		s.pop();
		System.out.println(s);
		s.pop();
		System.out.println(s);
		System.out.println(s.search("xyz"));
		s.pop();
		System.out.println(s.search("zxc"));
		System.out.println(s.empty());
	}

}
