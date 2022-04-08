package array_study;

import java.util.Arrays;

public class Test 
{

	public static void main(String[] args) {
	//	String name1="Velocity";
	//	String name2="Corporate";
	//	String name3="Traning";
	//	String name4="Center";
		
	//	int Salary=50000;
		//1.declaration
		
	//	String institude[]=new String[5];
		
		
		
	
		//initialization
	//	institude[0]="Velocity";
		//institude[1]="Corporate";
		//institude[2]="Traning";
		//institude[3]="Center";
		
		//3.usage
	//	System.out.println(institude[0]);
	//	System.out.println(institude[1]);
	//	System.out.println(institude[2]);
	//	System.out.println(institude[3]);
		
	//	System.out.println("============");
	//	for(int i=0;i<=3;i++) {
	//		System.out.println(institude[i]);
	//		
			
			char grade[]=new char[4];//index=length-1
			
			grade[0]='A';
		    grade[1]='B';
		    grade[2]='C';
		    grade[3]='D';
		    
	//	    System.out.println(grade[0]);
	//	    System.out.println(grade[1]);
	//	    System.out.println(grade[2]);
	//	    System.out.println(grade[3]);
		    
	//	    for(int i=0;i<=3;i++)
	//	    {
	//	    	System.out.println(grade[i]);
	//	    }
			
		    for(int i=0;i<=grade.length-1;i++)
		    {
		    	System.out.println(grade[i]);
		    }
		   
		    Arrays.sort(grade);
		    System.out.println("=====after sorting=====");
		    for(int i=0;i<=grade.length-1;i++)
		    {
		    	System.out.println(grade[i]);
		    }
		    
		    System.out.println("====after decending order====");
		    
		    for(int i=grade.length-1;i>=0;i--)
		    {
		    	System.out.println(grade[i]);
		    }
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		}
		
		
		
	}


