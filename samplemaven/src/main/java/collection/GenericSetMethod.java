package collection;

import java.util.HashSet;
import java.util.Set;

public class GenericSetMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set <String>a=new HashSet<String>(); 
		a.add("apple");
		a.add("orange");
		a.add("banana");
		System.out.println(a);
		
		Set<String>b=new HashSet<String>();
		b.add("watermelon");
		b.add("grapes");
		
		a.addAll(b);
		System.out.println(a);
		
		System.out.println(a.contains("apple"));
		System.out.println(a.containsAll(b));
		System.out.println(b.containsAll(a));
		
		System.out.println(a.isEmpty());
		
		a.remove("orange");
		System.out.println(a);
		
		a.removeAll(b);
		System.out.println(a);
		
		System.out.println(a.size());
		a.clear();
		System.out.println(a);
	}

}
