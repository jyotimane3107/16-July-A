package String_Class;

public class Sample2 
{
	public static void main(String[] args) 
	{
		//only declaration 
		String s1;
		
		//String declaration & initialization
		String s2="abc";
		
		
		
		System.out.println("------------");
		
		String s3="ab";
		System.out.println(s3);
		
		s3=s3+"cd";       //ab+cd=abcd
		System.out.println(s3);
		
		s3=s3+"xyz";       //abcd+xyz=abcdxyz
		System.out.println(s3);
	}

}
