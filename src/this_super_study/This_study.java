package this_super_study;

public class This_study extends Super_study
   {
	
	int a=10;// global non static variable
	static int b=20;
	static int c=40;

	public static void main(String[] args) {
		This_study s=new This_study();
		s.test();
		test1();
		System.out.println("global non static variable "+s.a);

	}

	public void test() //this done bcoz same name int a in local,global,extends in other class
	{
	//	static int k=20;// not give any static variable in any method
		int a=20;
		int sum=50+a;// not mention value a then local method always call local variable
		System.out.println("value of sum is "+sum);
		int sum1=50+this.a;// call for global variable in same class by using this
		System.out.println("value of sum1 is "+sum1);
		int sum2=50+super.a;// extends in other super class use global bcoz int a is same 
		System.out.println("value of sum2 is "+sum2);
		int b=30;
		int sub=100-b;
		System.out.println("value of sub is "+sub);
	//	int sub1=100-this.b;
		//System.out.println("value of sub1 is "+sub1);
		int sub2=100-super.b;
		System.out.println("value of sub2 is "+sub2);
		
	}
	
	public static void test1() 
	{
		//static int d=10;..not give any static variable in any methode
		int c=60;
		int sum4=100+c;
		System.out.println("value of sum4 is "+sum4);
		//int sum5=100+this.c;..>not call static variable in static method
		//int sum6=100+this.a;..> not call non static variable in static method
	}
	
}
