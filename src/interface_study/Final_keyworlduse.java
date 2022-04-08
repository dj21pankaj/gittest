package interface_study;

public class Final_keyworlduse {
	int a=10;
	final int b=40;

	public static void main(String[] args) 
	{  
		Final_keyworlduse f=new Final_keyworlduse();
		f.add();
		
	}
    public void add() {
    	a=a+20;
    	System.out.println("Updated value of a is "+a);
    	//b=b+20; in final variable we cant update value
    }
}
