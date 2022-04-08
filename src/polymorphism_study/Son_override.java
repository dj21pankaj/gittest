package polymorphism_study;

public class Son_override extends Father_override//accuring propertes from father
{

	public static void main(String[] args) 
	{
		Father_override f=new Father_override();
		Son_override s=new Son_override();
		s.money();// depends on object method change as father or son
		
		f.money();//override is focus on object creation
		

	}

	public void money() {
		System.out.println("Son money 1L");
	}
	
}
