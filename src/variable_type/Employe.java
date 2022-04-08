package variable_type;

public class Employe {
	//suppose take on company and company employee
	//employee name-->string
	//employee code..>1234
	//employee grade..>a,b,c
	//employee salary..>1000.100
	
	String EMP_Name;
	int EMP_code;
	char EMP_grade;
	float EMP_salary;
	
	public void emp_info() {
		
		System.out.println("===========================");
		System.out.println("Employee Name is "+EMP_Name);
		System.out.println("Employee code is "+EMP_code);
		System.out.println("Employee grade is "+EMP_grade);
		System.out.println("Employee salary is "+EMP_salary);
		System.out.println("===============================");
		
	}

}
