package collection;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashset_Set {

	public static void main(String[] args) {
		
		LinkedHashSet lh=new LinkedHashSet();
		lh.add("Pankaj");
		lh.add('A');
		lh.add(null);
		lh.add(100);
		lh.add(null);
		lh.add('B');
		lh.add(100);
		lh.add("velocity");
		
		System.out.println(lh);
		System.out.println(lh.size());
		System.out.println(lh.isEmpty());
		System.out.println(lh.contains(100));
		System.out.println(lh.remove(null));
		
		System.out.println("===========");
		for(Object o:lh) 
		{
			System.out.println(o);
		}
        
		System.out.println("============");
        Iterator it = lh.iterator();
        while(it.hasNext())
        {
        	System.out.println(it.next());
        }
		
		
		
		
		
		
		
		
	}

}
