package abstrat_study;

public abstract class Abstarct_sample //abstarct class conatin complete as well as incompete methos
  {

	public static void main(String[] args) {
		//Abstract_sample AB=new Abstarct_sample();
		//we cant creat object of abstract class
		
	}

	public void test() {
		System.out.println("test");
	}
	
	public void test1() {
		//method have body.even if body is empty.this complete method.
		
	}
	public abstract void test2();
	//this is incompelete method called as abstract method
	
	public static void test3() {
	System.out.println("this is static methos with body");
	}
}
