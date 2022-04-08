package variable_type;

public class Emp_HR_Portal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Employe PankajD=new Employe();
       PankajD.EMP_Name="PankajD";
       PankajD.EMP_code=7007;
       PankajD.EMP_grade='A';
       PankajD.EMP_salary=7777.77F;
       PankajD.emp_info();
       Employe RohanM=new Employe();
       RohanM.EMP_Name="RohanM";
       RohanM.EMP_code=8008;
       RohanM.EMP_grade='B';
       RohanM.EMP_salary=8888.88f;
       RohanM.emp_info();
       }

}
