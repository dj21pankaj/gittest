package interface_study;

public class IC implements Myinterface//in impelement class all methods are incomplete..(and if any method is complete then this class is abstract class) 
{   //and any imcomplete method is not call then we creat another concrete class

	public static void main(String[] args) {
		IC v=new IC();
		v.test();
		v.test1();
		v.test2();
		v.test3();
	} 
	
	public void demo() //own method in implement class
	{
		System.out.println("own method of impelement class");
	}

	
	public void test() {
		System.out.println("test method is completes in implementation class");
		
	}

	
	public void test1() {
		System.out.println("test1 method is completes in implemenation class");
	}

	
	public void test2() {
		
		System.out.println("test2 method is completes in implemenation class");
	}

	
	public void test3() {
		
		System.out.println("test3 method is completes in implemenation class");
	}

}
