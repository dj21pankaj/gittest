package practies;

public class PS4 {

	public static void main(String[] args) {
		char Grade='Z';
		switch (Grade) {
		case 'A':System.out.println("Mark is above >=75");
		break;
		case 'B':System.out.println("Mark >60 & <75");
		break;
		case 'C':System.out.println("Mark >50 & <60");
		break;
		case 'D':System.out.println("MAEK >40 & <35");
		break;

		default:System.out.println("Please Enter Valid Gradde in between Grade A TO D");
			break;
		}

	}

}
