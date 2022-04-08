package practies;

public class PS2 {

	public static void main(String[] args) {
		PS2 W=new PS2();
		W.week();
	}
	public void week() {
		char day='a';
		if(day=='a') {
			System.out.println("Monday");
		}
		else if (day=='b') {
			System.out.println("Tuseday");
		}
		else if (day=='c') {
			System.out.println("Wensday");
		}
		else if (day=='d') {
			System.out.println("Tursday");
		}
		else if (day=='e') {
			System.out.println("Friday");
		}
		else if (day=='f') {
			System.out.println("Saturday");
		}
		else if (day=='g') {
			System.out.println("Sunday");
		}
		else{
			System.out.println("Invalid");
		}
	}

}
