package string_study;

public class String_use {

	public static void main(String[] args) {
		String a="velocity";//object created not using new keyword
		String b="Velocity";
		//contain same so assign same memory location
		//store in constant pool area
		//string are immutable in nature
		
		String c=new String("velocity");//object created using new keyword
		String d=new String("Velocity");
		String e=new String("Velocity Pune");
		//each time using new keyword memory location is diff..if contain is same
		//store in non constant pool area
		
	//	System.out.println(a==b);//compare memory location
	//	System.out.println(a==c);
		
	//	System.out.println(a.equals(c));//compare contain by char sequence and case sensitive
	//	System.out.println(c.equals(d));
		
	//	String a="velocity";
	//	String b="Velocity";
	
		//	System.out.println("Length of a is "+a.length());
	
		//	System.out.println("Length of b is "+b.length());
	
		//	System.out.println(a.toUpperCase());//Converts all of the characters in this String to uppercase 
		
	//	String UP=a.toUpperCase();
	//	System.out.println("Upper case value of a is "+UP);
	
		//	System.out.println(b.toLowerCase());//Converts all of the characters in this String to lowercase 
	//	System.out.println(a.equals(b));//check the contains in that string
	//	System.out.println(a.equalsIgnoreCase(b));
		
	//	System.out.println(a.contains("ve"));//Returns true if and only if this string contains the specified sequence of char values
	//	System.out.println(a.contains("V"));
		
		
	//	String ab="";
	//	String cd=" ";
	//	System.out.println(a.isEmpty());
	//	System.out.println(ab.isEmpty());//true..Returns true if, and only if, length() is 0.
	//	System.out.println(cd.isEmpty());//false bcoz whitespace present.so length is not 0.
		
	//	System.out.println(ab.isBlank());//Returns true if the string is empty or contains only white space otherwise false
	//	System.out.println(cd.isBlank()); 
		
	//	String pq="Velocity";
	//	char otp = pq.charAt(5);//Returns the char value at the specified index
	//	System.out.println("charAT 5 is "+otp);
		
//		System.out.println(pq.charAt(9));//Run time error is also called as Exception
		//Name of exception is..> String index out of bounds exception bocz index is out of rang
		
	//	String ef=null;//null means nothing
	//	System.out.println(ef.length());//finding lenght so Exception occur
		//Exception is occur that is ..> Null Pointer Exception
		
	//	String mn="Velocity";
	//	System.out.println(mn.startsWith("Ve"));//true
	//	System.out.println(mn.startsWith("ve"));//bcoz v is lowercase..case sensitive
	//	
	//	System.out.println(mn.endsWith("ty"));
		
	//	String substring =mn.substring(4);
	//	System.out.println("substring is "+substring);
		
	//	String substring1=mn.substring(4, 7);
	//	System.out.println("substring1 is "+substring1);//output is cit becoz end insex is show -1(7-1=6)
		
		String p="Velocity ";
		String q="Corporate ";
		String r="Traning ";
		String s="Institute";
		
	//	System.out.println(p.concat(q).concat(r).concat(s));
				
	//	String vv=p.concat(q).concat(r).concat(s);// vv is refarance variable to store
	//	System.out.println("concate output is..> "+vv);
	//	System.out.println(vv.indexOf('o'));// first 'o' index
	//	System.out.println(vv.lastIndexOf('o'));//last 'o' index
		
	//	System.out.println(vv.replace('o','i'));
		
	//	String z="PANKAJ";
				
	//	System.out.println(z.replace("PA","DE"));
		
		String PL="I LOVE MY INDIA";
		
				
				
				
				
		
		
		
		
		
		
		
	}

}
