package variable_type;

public class Global_variable1 {
	
	int a=20;
	static int b=50;
	String name="Pankaj";

	public static void main(String[] args) {
		Global_variable1 v5=new Global_variable1();
		System.out.println("Calling global variable a "+v5.a);//call non static global variable
		System.out.println("Calling global static variable b "+b);//call static global variable
		System.out.println("Calling string "+v5.name);
		v5.test();
		test1();
	}
    public void test() {
    	int c=10;
    	int sum=c+a;
    	System.out.println("sum of c and a is "+sum);
    }
    public static void test1() {
    	int d=20;
    	int sum=d+b;
    	//int sum=d+a;  //we not call non static variable in static method
    	System.out.println("sum of d and b is "+sum);
    	
    }
}
