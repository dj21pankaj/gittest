package control_statement;

public class Else_if_study {

	public static void main(String[] args) {
		int mark=50;
		if (mark>40 & mark<=60) {
			System.out.println("2nd class");
		}
		else if (mark>60 & mark<=70) {
		System.out.println("1st class");	
		}
		else if (mark>70 & mark<=80) {
			System.out.println("DIST");
		}
		else {
			
			System.out.println("FAIL");
		}
	}

}
