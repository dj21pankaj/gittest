package Java_Class;

public class Method4_P_NP {

	public static void main(String[] args) {
		Method4_P_NP p7=new Method4_P_NP();//creat the new object
		p7.ns();		// without parameter/ zero parameter method
		
        p7.pp("Mangesh", 50.5f, 'o', 7);
		add(10,10,10);
		Method3NS e5=new Method3NS();// call non static method in other class
		e5.demo();
		p7.sub(20.20f, 10.10f);//call non static method in same class..call parameter method
		p7.sub(30.20f, 10.10f);
		p7.mul(2,3);
		p7.div(10,5);
		
	}

	public void ns() {
		 
	String Name="Pankaj";
	float weight=65.5f;
	char Blood_Group='B';
	int height=5;
	System.out.println("=========================");
	System.out.println("Name is "+Name);
	System.out.println("weight is "+weight);
	System.out.println("Blood Group "+Blood_Group);
	System.out.println("height is "+height);
	System.out.println("=========================");
	
	}
	
	public void pp(String Name,float weight,char Blood_Group,int height) {
		System.out.println("=========================");
		System.out.println("Name is "+Name);
		System.out.println("weight is "+weight);
		System.out.println("Blood Group "+Blood_Group);
		System.out.println("height is "+height);
		System.out.println("=========================");
		
		
	}
	
	public static void add(int a,int b,int c) {
		int sum=a+b+c;	
		System.out.println("Addition is "+sum+"\n");
		
		
	}
	
	public void sub(float a,float b) {
		
		float sub=a-b;
		System.out.println("subtraction is "+sub+"\n");
	}
	
	public void mul(int a,int b) {
		int mul=a*b;
		System.out.println("Multipecation is "+mul+"\n");
	}
	public void div(int a,int b) {
		int div=a/b;
		System.out.println("Multipecation is "+div+"\n");
	}
}
