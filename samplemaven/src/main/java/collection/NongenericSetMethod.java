package collection;

import java.util.HashSet; //import util of set and hashset
import java.util.Set;

public class NongenericSetMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set s=new HashSet(); //in non generic,irrespective of data type we can add elements and in set it is unordered
		s.add("ram");
		s.add('b');
		s.add(6.7f);
		s.add("reshma");
		s.add(3);
		
		Set c=new HashSet();
		c.add("red");
		c.add("brown");
		
		s.addAll(c); //add elements of c in s and s is updated so separate out statement
		System.out.println(s);
		
		System.out.println(s.contains("reshma"));
		
		System.out.println(s.containsAll(c));//returns true if all elements of c in s
		System.out.println(c.containsAll(s));//returns false because all elements of s are not in c
		
		System.out.println(s.isEmpty());
		
		s.remove(6.7f);
		System.out.println(s);
		
		s.removeAll(c);//remove all elements of c from s
		System.out.println(s);
		
		System.out.println(s.size()); 
		s.clear(); //clear elements of s
		System.out.println(s);
		

	}

}
