package variable;

public class sample3 
{
public static void main(String[] args) {
	//step1:variable declaration (Allocating /Reserving memory)
	String studentname;      //datatype variablename
	String studentdept;
	int studentrollnum;
	char studentgrade;
	float studentper;
	
	//step2:Variable initialization (Assigning or inserting value)
	studentname="jyoti";     //variablename="variable value";
	studentdept="maths";
	studentrollnum=101;
	studentgrade='A';
	studentper=65.5f;
	
	//step3:variable usage
	System.out.println("studentname:"+studentname);
	System.out.println("studentdept:"+studentdept);
	System.out.println("studentrollnum:"+studentrollnum);
	System.out.println("studentgrade:"+studentgrade);
	System.out.println("studentper:"+studentper+"%");
}
}
