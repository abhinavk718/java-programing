package collections;
import java.util.*;
public class HashSetDemo 
{
	public static void main(String[] args) 
	{
		HashSet h=new HashSet();
		h.add("B");
		h.add("C");
		h.add("D");
		h.add("Z");
		h.add("Null");
		h.add(10);
		h.add(20);
		System.out.println(h.add("Z"));
		System.out.println(h);
		
	}
}
