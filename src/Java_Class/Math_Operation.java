package Java_Class;

public class Math_Operation {

	public static void main(String[] args) {
	  
		  Math_Operation m3=new Math_Operation();
		  m3.addition();
		  subtraction();
	}

	public void addition()
	{
		int a=10;
		int b=20;
		//static int c=30;....>static veriable not call in method
		int sum=a+b;
		System.out.println("Addition is "+sum);
	}
	
	
	public static void subtraction()
	{  //static int e=30;
		int c=20;
		int d=10;
		int sub=c-d;
		System.out.println("Substraction is "+sub);
	}
	
}
