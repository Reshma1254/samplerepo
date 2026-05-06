package collection;

import java.util.ArrayList;
import java.util.List;

public class NongenericListMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List a=new ArrayList();
		a.add("ant");
		a.add(1);
		a.add("mat");
		a.add(2.3);
		a.add("ant");
		System.out.println(a);
		
		System.out.println(a.get(3));
		a.set(2, "cat");
		System.out.println(a);
		
		System.out.println(a.indexOf("ant"));
		System.out.println(a.indexOf(2.3));
		
		System.out.println(a.lastIndexOf("ant"));
		System.out.println(a.lastIndexOf(1));
		
		
		a.remove(2.3);
		System.out.println(a);//element mattre remove cheyyan pattu because it is nongeneric,index vach pattilla
		
		System.out.println(a.contains("cat"));
		
		System.out.println(a.isEmpty());
		System.out.println(a.size());
	}

}
