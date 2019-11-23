package collections;
import java.util.*;
public class LinkedHashSetDemo 
{
	public static void main(String[] args) 
	{
		LinkedHashSet h=new LinkedHashSet();
		h.add("B");
		h.add("C");
		h.add("D");
		h.add("Z");
		h.add("Null");
		h.add(10);
		System.out.println(h.add("Z"));
		System.out.println(h);
	}
}

