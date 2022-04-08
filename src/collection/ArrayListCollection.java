package collection;

import java.util.ArrayList;
import java.util.Iterator;



public class ArrayListCollection {

	public static void main(String[] args) {
		ArrayList al=new ArrayList<>();//stores all type of data types also resize is possible.
		al.add("Velocity");
		al.add(77.77);
		al.add('A');
		al.add('A');
		al.add('B');
		al.add(null);
		System.out.println(al);
		System.out.println(al.size());
		
		
		al.add("Pankaj");// addding with object type
		al.add(0,"Master");// adding with the indexing 
		System.out.println(al);
		System.out.println(al.size());
		al.remove(0);
		
	//	al.remove('A');
		System.out.println(al);
		
		al.set(0, "Array");// updating that index location
		System.out.println(al);
		
		
	   System.out.println(al.contains('A'));//given value present or contains or not.gives boolean values.
	   System.out.println(al.contains('X'));
		
		System.out.println(al.isEmpty());//list is empty or not.get boolean values.
		
		System.out.println(al.get(2));// get vales index no 2
		
		System.out.println("=====using for loop======");
		for(int i=0;i<=al.size()-1;i++)
		{
			System.out.println(al.get(i));
		}
		
		System.out.println("=====using iterator======");
		Iterator it=al.iterator();//using iterator
		while(it.hasNext()) //hasnext methode use to avoid null pointer exception.it cheak next value present of not
		{
			System.out.println(it.next());
		}
		
		System.out.println("=====using for each loop======");
		for(Object o:al) // object data type write bcoz array data type is defult type
		{
			System.out.println(o);
		}
		
		ArrayList<Integer> in=new ArrayList<>();
		in.add(1);
		in.add(2);
		in.add(3);
		
		System.out.println(in);
		
		for(int i:in) // arraylist data type is int then creating variable i..
		{
		
			System.out.println(i);
		}
		
		Iterator<Integer>in1=in.iterator();
		while(in1.hasNext()) {
			System.out.println(in1.next());
		}
		
		
	}

}
