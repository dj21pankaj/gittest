package inheritance;

public class Dughter_SLI extends Mother_SLI 
{

	public static void main(String[] args)
	{
		Dughter_SLI I=new Dughter_SLI();
		I.look();// Dughter get all propertes from mother that means all propertes of mother present in daughter by word extends
		I.nature();// so dont crest mother object..using dughter object call mother prpertes
		I.mobile();//prperty of dughter
		I.Exprience();//this method is call grandmother supermost class to mother super class to daughter sub class is called Multilevel int
		

	}
     public void mobile() {
    	 System.out.println("Daughter mobile");
     }
	
	
	
}
