package variable_type;

public class Global_variable {
	
	int a=10;   //global non static variable
	static int b=20;//global static variable
	public static void main(String[] args) {
		Global_variable v4=new Global_variable();
		System.out.println("Global variable call "+v4.a);
		System.out.println("Global variable call "+b);
        v4.test();
        test1();
	}
   public void test() {
	int c=40;//local variable...local variable only call that method not another method
	int sum=c+a;//sum of global variable and local variable...global variable call any method in class
	System.out.println("Sum of a and c is "+sum);
	 }
     
   public static void test1() {
	   int d=100;// local variable
	   int sub=d-b;
	  // int sum=d+c; not possible bcoz local variable not call another method
	   System.out.println("Sub of d and b is "+sub);
	   
   }
  
   
   
}
