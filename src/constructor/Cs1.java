package constructor;

public class Cs1 {

	public static void main(String[] args) {
		Cs1 c=new Cs1();// default constructor method..
		c.test();// creating object and call non static method
        Cs2 v1=new Cs2(10);// protected constructor
	}

	public void test()
	{
		System.out.println("Learning non static method");
	}
	
	
}
