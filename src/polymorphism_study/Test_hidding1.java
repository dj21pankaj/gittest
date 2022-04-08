package polymorphism_study;

public class Test_hidding1 extends Test_hidding {

	public static void main(String[] args) {
		test();
		//While inheriting static method having same name and same parameters, When we call that static 
		//method in subclass it always call subclass method. 

		//Super class method will get hide behind sub class method.

	}

	public static void test() {
		System.out.println("test hidding1");
	}
}
   