package Java_Class;

public class Methods {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
        System.out.println("Learning main methods");
        test();
        test1();
        test();
       
        test1();// calling static method form same class
        Method1s.test3();// calling static method form another class
		// syntax: classname.methodname();
		Method1s.test3();// calling static method form another class
		Method1s.test3();
        System.out.println("Ending Main method");
	}
     
	public static void test() {
		System.out.println("Learning Rugular method in test");
		
	}
    	
	public static void test1() {
		System.out.println("Learning Rugular method in test1");
	}
	
	
}
