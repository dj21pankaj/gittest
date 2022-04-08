package practies;

public class Practies1 {
	int a;
	int b;
	int c;

	public static void main(String[] args) {
		//Practies.test();
	//	Practies r=new Practies();
	 //   r.test1();
	    Practies1 a1=new Practies1(10);
	    a1.test();
	    Practies1 a2=new Practies1(10,10);
	    a2.test();
	    Practies1 a3=new Practies1(10,10,10);
	    a3.test();

	}
   public Practies1(int num) {
	   a=num;
	   
   }
   public Practies1(int num,int num1) {
	    a=num;
	    b=num1;
   }
   
   public Practies1(int num,int num1,int num2) {
	    a=num;
	    b=num1;
	    c=num2;
   }
   public void test() {
	   int sum=a+b+c;
      System.out.println("Value of sum is "+sum);
   }
}

