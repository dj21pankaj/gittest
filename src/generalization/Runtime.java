package generalization;

public class Runtime {

	public static void main(String[] args) 
	{    
		Jio j=new Jio();
		j.call();// comman method recommended by trai
		j.data();//comman method recommended by trai
		j.msg();//comman method recommended by trai
		j.JioTv();// jio own method
		System.out.println("Jio sim rate "+Trai.sim);
		
		Airtel a=new Airtel();
		a.call();//comman method recommended by trai
		a.data();//comman method recommended by trai
		a.msg();//comman method recommended by trai
		a.airtelbank();//aitel own method
		System.out.println("Airtel sim rate "+Trai.sim);
		
		VI v=new VI();
		v.call();//comman method recommended by trai
		v.data();//comman method recommended by trai
		v.msg();//comman method recommended by trai
		v.VID2H();//vi own method
		System.out.println("VI sim rate "+Trai.sim);


	}

}
