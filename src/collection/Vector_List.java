package collection;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class Vector_List {

	public static void main(String[] args) {
		
		Vector v=new Vector();
		v.add("Skill");
		v.add(7);
		v.add(7);
		v.add('X');
		v.add(77.77f);
		v.add('X');
		v.add(null);
		
		System.out.println(v);
		System.out.println(v.size());
		
		System.out.println(v.contains(77.77));
		System.out.println(v.isEmpty());
		System.out.println(v.get(2));
		
		
	//	System.out.println(v.capacity());
		System.out.println(v.indexOf('X'));
	//	System.out.println(v.remove(1));
	//	System.out.println(v);
		
		System.out.println("====using for each loop===");
		for(Object o:v) // using for each loop 
		{
			System.out.println(o);
		}
		
		System.out.println("====using iterator===");
		Iterator vv = v.iterator();
		while(vv.hasNext()) {
			System.out.println(vv.next());
		}
		
		System.out.println("====using for loop======");
		for(int i=0;i<=v.size()-1;i++) 
		{
			System.out.println(v.get(i));
		}
		
		System.out.println("====using List Iterator======");
		
	    ListIterator x = v.listIterator();
	    while(x.hasNext()) 
	    {
	    	System.out.println(x.next());
	    }
		
	    System.out.println("====Enumeration======");
		Enumeration en = v.elements();
		while(en.hasMoreElements()) {
			System.out.println(en.nextElement());
		}
		
		
		
		
		
		
	}

}
