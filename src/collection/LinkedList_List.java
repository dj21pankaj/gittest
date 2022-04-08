package collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedList_List {

	public static void main(String[] args) 
	{
	LinkedList ll=new LinkedList();
	
	ll.add("Link");
	ll.add("List");
	ll.add(88.88f);
	ll.add(8);
	ll.add(null);
	ll.add('A');
	ll.add('A');
	
	System.out.println(ll);
	System.out.println(ll.size());
	System.out.println(ll.contains(8));
	System.out.println(ll.isEmpty());
	System.out.println(ll.get(2));
	System.out.println(ll.remove(5));
	System.out.println(ll);
	ll.add(5,'A');
	System.out.println(ll);
	System.out.println(ll.indexOf('A'));
	System.out.println(ll.lastIndexOf('A'));
	
	System.out.println("======for each loop==========");
	for(Object o:ll) {
		System.out.println(o);
	}
	
	System.out.println("======for iterator==========");
	Iterator it = ll.iterator();
	
	while(it.hasNext()) {
		System.out.println(it.next());
	}
	System.out.println("======for loop==========");
	
	for(int i=0;i<=ll.size()-1;i++) 
	{
		System.out.println(ll.get(i));
	}
	
	System.out.println("======ListIterator==========");
	ListIterator nn = ll.listIterator();
	while(nn.hasNext()) 
	{
		System.out.println(nn.next());
	}
	
	
	
	

	}

}
