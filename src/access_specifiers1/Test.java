package access_specifiers1;

import access_specifiers.AS1;

// campulsary imports data from package.class

public class Test extends AS1// get all propertes from AS1 class
     {

	public static void main(String[] args) {
		AS1 s3=new AS1();//non static method creat object
		s3.test();//this is public non stataic methos
		System.out.println("Public variable value of a is "+s3.a);
		Test T=new Test();
		T.test2();// bcoz of extends keyword we acces protetcted method test2
		System.out.println("Protected variable value of c is "+T.c); 
	}
	

}
