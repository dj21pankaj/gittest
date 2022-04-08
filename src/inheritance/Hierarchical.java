package inheritance;

public class Hierarchical {

	public static void main(String[] args) {
		Son1_He s1=new Son1_He();// creating object of son1 boz Hierarchicalis another class (son1 is sub class)
		s1.mobile();//son1 own property
		s1.money();//super class father property
		Son2_He s2=new Son2_He();//creating object of son2 boz Hierarchicalis another class (son2 is sub class)
		s2.laptop();//son2 own property
		s2.money();//super class father property
	}

}
