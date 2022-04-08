package constructor;

public class Variable_call {

	String name="Pankaj";//non static string
	 int a=10;//non static global variable

	static float b=33.3f;

	public static void main(String[] args) {
		Variable_call d=new Variable_call();
		Cs2 r=new Cs2();// constructor call into the another class.also use access specifier to constructor
		r.demo();
		System.out.println("Value of b is "+b);
		
		System.out.println("Calling the string "+d.name);
		System.out.println("Calling the value "+d.a);
		
	}
  
	
}
