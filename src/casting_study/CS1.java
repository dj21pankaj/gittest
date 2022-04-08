package casting_study;

public class CS1 {

	public static void main(String[] args) 
	{
		int a=10;
		System.out.println("value of a is "+a);
		
		double b=a;
		System.out.println("value of b is "+b);
		//Converting lower data type info into higher data type info is called implicit casting. implicit casting is also called widening casting
	
	    double c=10.1234;
	    System.out.println("value of c is "+c);
	    
	    int d=(int) c;
	    System.out.println("value of d is "+d);
	    //Converting higher data type info into lower data type info is called explicit casting. Explicit casting is also called narrowing casting
	
	
	
	}

}
