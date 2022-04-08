package constructor;

public class Cs2 {

	public static void main(String[] args) {
		Cs2 v=new Cs2();// creating the object
		v.demo();
		Cs2 v1=new Cs2(10);
		
		
		
	}
    public Cs2() // creating the constructor.name same as the class name
    {
    	System.out.println("Creating the Contructor");
    }
	
	public void demo()
	{
		System.out.println("Learning non static method");
	
	}
	
	protected Cs2(int a) {
		System.out.println("single parameter constructor "+a);
		
	}
	
	
}
