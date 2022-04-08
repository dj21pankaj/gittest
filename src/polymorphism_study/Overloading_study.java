package polymorphism_study;

public class Overloading_study {// same methods name but diff argument or parameter that depends calling

	public static void main(String[] args) 
	{
		Overloading_study o=new Overloading_study();
		o.add();
		o.add(10, 20);
		o.add(10.10f,20.20f);
	//As binding takes during compilation time only
	}
 
	public void add() {
		int a=10;
		int b=20;
		int sum=a+b;
		System.out.println("Sum is "+sum);
	}
	
	public void add(int a,int b) {
		int sum=a+b;
		System.out.println("Sum is "+sum);
	}
	
	public void add(float a,float b) {
		float sum=a+b;
		System.out.println("Sum is "+sum);
	}
	
}
