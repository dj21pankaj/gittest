package Java_Class;

public class Method2NS {

	public static void main(String[] args) {
		// calling non-Static method--> Need to create object
				// creating object
				Method2NS e4= new Method2NS();// syntax to create object-->className objectName= new ClassName();
                // new is memory assign function..it assign memory
				//to call non static method-->Syntax--> Objectname.methodName();
				
				e4.test1();// calling non static method using object in same class
				e4.test1();
				e4.test1();
				e4.test2();
               Method3NS e7=new Method3NS();// non static method in another class..same syntax another and same class non static method
               e7.demo(); //object name not same campulsury.user decide.
	}
	  
	public void test1()
	{
		System.out.println("Non Static test1" );
	}
	public void test2()
	{
		System.out.println("Non Static test2");
	}
	}
	
	
	
	
	
	
	
	

