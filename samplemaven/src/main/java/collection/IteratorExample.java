package collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class IteratorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set <String> d=new HashSet<String>();
		d.add("reshma");
		d.add("ram");
		d.add("geetha");
		d.add("res");
		System.out.println(d);
		Iterator i=d.iterator(); //collection elements get one by one
		while(i.hasNext()) //hasnext is method used to check if next element present
		{
			System.out.println(i.next());
		}
		i.remove(); //last element remove
		System.out.println(d);
		
	}

}
