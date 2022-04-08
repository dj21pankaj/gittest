package constructor;

public class Cs3 {
	
	int a;
	int b;
	int c;
	
	public static void main(String[] args) {
		Cs3 r4=new Cs3();// for each method creating an new object
		r4.test();
		Cs3 r5=new Cs3(10);// one parameter
		r5.test();
		Cs3 r6=new Cs3(10,20);//two parameter
		r6.test();
		Cs3 r7=new Cs3(10,20,30);//three parameter...calling same method i.e. test();
	    r7.test();
	}

	public Cs3() {  //constructor with zero parameter
		
		a=10;
		b=20;
		c=30;
		System.out.println("Learning the constructor with zero parameter");
		int sum=a+b+c;
		System.out.println("Addition is "+sum);	
	}
	
	public void test()//non static method
	{ 
		int sum=a+b+c;
		System.out.println("Addition is "+sum);	
	}
	
	public Cs3(int num) {//taking value 'a' in Constructor Cs4
		a=num;
		int sum=a+b+c;
		System.out.println("Addition is "+sum);	
	}
	
	public Cs3(int num,int num1) {//taking value 'a''b' in Constructor Cs4
		a=num;
		b=num1;
	}
	
	 public Cs3(int num,int num1,int num2) {//taking value 'a''b''c'in Constructor Cs4
		  a=num;
		  b=num1;
		  c=num2;
    }
	
	}



