package interface_study;

public class Son implements Father,Mother
{

	public static void main(String[] args) {
		Son s=new Son();
		s.money();
		s.love();
		s.look();
		Father.nature();//calling static complete methods from father interface
		Mother.nature();//calling static complete method from mother interface
		
	}

	@Override
	public void love() {
		System.out.println("mother love method complete in son class");
		
	}

	

	@Override
	public void look() {
		System.out.println("father looks method complete in son class");
		
	}

	@Override
	public void money() {
		//to call specific default method from super interface follow syntax
		//interfacename.super.methodname
		Father.super.money();
		Mother.super.money();
		System.out.println("sons love");
		
	}

}
