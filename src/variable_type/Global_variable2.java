package variable_type;

public class Global_variable2 {
	int a=20;
	static int b=30;
	float c=20.20f;

	public static void main(String[] args) {
		Global_variable2 v6=new Global_variable2();
		int sum=10+v6.a;
		System.out.println("Value of sum is "+sum);
		int sub=80-b;
		System.out.println("Value of sub is "+sub);
		float sum1=v6.a+v6.c;// global variable a and c are both non static
		System.out.println("Value of sum1 is "+sum1);
		float sub1=b-v6.c;
		System.out.println("Value of sub1 is "+sub1);
		
	}

}
