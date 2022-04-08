package collection;

import java.util.HashSet;
import java.util.Iterator;

public class Hashset_Set {

	public static void main(String[] args) {
		
	   HashSet hs=new HashSet();
	   hs.add("Pankaj");
	   hs.add("Desai");
	   hs.add(7675);
	   hs.add(7675);
	   hs.add('S');
	   hs.add(76.75f);
	   hs.add('S');
	   hs.add(null);
	   
	   System.out.println(hs);//result showing in asending order
	   System.out.println(hs.size());//dont allow dublicate values
		System.out.println(hs.isEmpty());
		
		System.out.println("===============");
		for(Object o:hs) 
		{
			System.out.println(o);
		}
		
		System.out.println("=============");
		Iterator h = hs.iterator();
		while(h.hasNext())
		{
			System.out.println(h.next());
		}
		
		System.out.println("================");// not appalicable 
//		for(int i=0;i<=hs.size()-1;i++) 
//		{
//			System.out.println(hs.get(i));
//		}
		
		hs.clear();
		System.out.println(hs);
		System.out.println(hs.isEmpty());
		
		
		
		
		
		
	}

}
