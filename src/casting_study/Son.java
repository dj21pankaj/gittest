package casting_study;

public class Son extends Father {

	public static void main(String[] args) {
	//	Father f=new Father(); //creating object of father
	//	f.money();
		
	//	Son s=new Son();// creating object of son
	//	s.money();
	//	s.bike();//calling own method
		
		Father f1=new Son();
		f1.money();
	//	f1.bike();..not calling this method beocz this method is not comman and son own method+. in this..only comman method call

	}

	
	public void money() {// over ridded
		System.out.println("Sons money 1L");
		
	}
	public void bike() {  // sons own method
		System.out.println("sons bike");
	}
	
	
}

