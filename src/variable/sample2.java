package variable;

public class sample2 
{
	public static void main(String[] args) 
	{
		//Step1: Variable declaration (Allocating /reserving memory)
		String studentname;       //datatype variablename;
		String studentdept;
		int studentRollNum;
		char studentgrade;
		float studentper;
		
		
		//Step2. variable initialization (Assingning or inserting value)
		studentname="jyoti";        //variablename="variable value";
		studentdept="maths";
		studentRollNum=101;
		studentgrade='A';
		studentper=65.5f;
		
		//Step3:variable usage
		
		System.out.println(studentname);
	    System.out.println(studentdept);
	    System.out.println(studentRollNum);
	    System.out.println(studentgrade);
	    System.out.println(studentper);
	    
	    System.out.println(studentper);          //info re-use
		
		
	}

}
