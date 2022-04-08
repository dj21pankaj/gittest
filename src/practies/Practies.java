package practies;

public class Practies {

	public static void main(String[] args) {
	
		Practies PankajD=new Practies();
		PankajD.info("PankajD", 1992, 65.5f,'B');
		Practies RahulD=new Practies();
		RahulD.info("RahulD", 1993, 64.5f,'A');
	}
	

	String Name;
	int Year;
	float weight;
	char Blood_Group;
	
	public void info(String Name,int Year,float weight,char Blood_Group) {
		System.out.println("=============================");
		System.out.println("Name of person "+Name);
		System.out.println("Year is "+Year);
		System.out.println("weight is "+weight);
		System.out.println("Blood Group is "+Blood_Group);
		System.out.println("==============================");
		
		
		
		
	}
	

}
