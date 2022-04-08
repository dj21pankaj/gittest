package control_statement;

public class Nested_if_else_study {

	public static void main(String[] args) {
		String ID="Pankaj";
		String PASS="Pank@7675";
		String Captcha="ABC123";
		int OTP=123;
		if(ID=="Pankaj") {
			System.out.println("ID is correct,Enter Password and Captcha");
			if(PASS=="Pank@7675") {
				System.out.println("Password is correct,Enter Captcha");
				if(Captcha=="ABC123"){
					System.out.println("Captcha is correct,Enter OTP");
					if(OTP==123) {
						System.out.println("OTP correct,Login Sucsses");
					}
					else {
						System.out.println("Incorrect OTP,Login Fail");
					}
					
				}
				else {
					System.out.println("Incorrect Captcah,Login Fail");
					
				}
				
			}
			else {
				System.out.println("Incorrect Password,Login fail");
			}
			
		}
		else {
			System.out.println("Incorrect Username,Login Fail");
		}

	}

}
