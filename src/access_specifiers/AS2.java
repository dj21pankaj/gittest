package access_specifiers;

public class AS2 {

	public static void main(String[] args) 
	{ 
		AS1 s2=new AS1();
		s2.test();
		s2.test1();
		s2.test2();
		System.out.println("Public int a "+s2.a);
		System.out.println("Default int b "+s2.b);
		System.out.println("Protected int c "+s2.c);


	}

}
