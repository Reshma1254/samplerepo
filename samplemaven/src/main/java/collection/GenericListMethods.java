package collection;

import java.util.ArrayList;
import java.util.List;

public class GenericListMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List <String> L=new ArrayList <String> ();
		L.add("Red");
		L.add("Blue");
		L.add("Black");
		L.add("Green");
		L.add("Blue");
		System.out.println(L);
		
		System.out.println(L.get(3));//get element at specified index
		
		L.set(2,"White");//UPDATION HAPPENS,SO NO DIRECT PRINT STATEMENT,) 
		System.out.println(L);
		
		System.out.println(L.indexOf("White"));//first occurrence in case of repetition and also applicable in non repetitive case
		System.out.println(L.lastIndexOf("Blue"));//last occurrence in case of repetition
		
		L.remove(3);//updation happens so no direct print
		System.out.println(L);
		
		L.remove("Red");
		System.out.println(L);
		
		System.out.println(L.contains("Blue"));
		
		System.out.println(L.isEmpty());
		System.out.println(L.size());
		
		
	}

}
