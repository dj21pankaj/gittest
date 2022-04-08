package access_specifiers;

public class AS1 {
	
	public int a=10;//scope of public in whole project..call whole project..import package.class
	int b=20;//scope of default in package only..call only that package
	protected int c=30;// scope of protect in same and other package..call other package using extends that class
	private int d=40;////scope of private in class only..call only in class
	public static void main(String[] args) 
	{
		AS1 s1=new AS1();
		
		System.out.println("Public int a is "+s1.a);
		System.out.println("Default int b is "+s1.b);
		System.out.println("Protected int c is "+s1.c);
		System.out.println("Private int d is "+s1.d);
		s1.test();
		s1.test1();
		s1.test2();
		s1.test3();
		
	}
    
	public void test()//scope of public in whole project..call whole project..import package.class 
	{
		System.out.println("Public test in AS1 class");
	}
	void test1()//scope of default in package only..call only that package 
	{
		System.out.println("Default test1 in AS1 class");
	}
	protected void test2()// scope of protect in same and other package..call other package using extends that class
	{
		System.out.println("Protected test2 in AS1 class");
	}
	private void test3()//scope of private in class only..call only in class
	{
		System.out.println("Private test3 in AS3 class");
	}
	
	
	
}
