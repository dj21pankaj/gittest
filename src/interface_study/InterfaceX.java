package interface_study;

public class InterfaceX implements Interface2 {
	//same catagire we use extends keywords ..I extends I and ...Class extend Class..same
	//diffrent categare we us implement...I implement Class..diff

	public static void main(String[] args) 
	{
		InterfaceX x=new InterfaceX();
		x.m1();
		x.m2();
		x.m3();
		x.m4();

	}

	@Override
	public void m1() {
		System.out.println("interface 1 method compelete in implementation class");
		
	}

	@Override
	public void m2() {
		// TODO Auto-generated method stub
		System.out.println("interface 1 method compelete in implementation class");
		
	}

	@Override
	public void m3() {
		// TODO Auto-generated method stub
		System.out.println("interface 2 method compelete in implementation class");
		
	}

	@Override
	public void m4() {
		// TODO Auto-generated method stub
		System.out.println("interface 2 method compelete in implementation class");
		
	}

	

}
