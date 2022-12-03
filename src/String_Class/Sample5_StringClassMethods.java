package String_Class;

public class Sample5_StringClassMethods 
{
public static void main(String[] args) 
{
	String s1="velocity";
	String s2="ABCD";
	String s3="VELOCITY";
	String s4="my name is sonu";
	String s5="";
	String s6="abcabcabc";
	
	System.out.println(s1.length());       //8
	
	System.out.println(s1.toUpperCase());      //VELOCITY
	
	System.out.println(s2.toLowerCase());      //abcd
	
	System.out.println(s1.equals(s3));       //false
	
	System.out.println(s1.equalsIgnoreCase(s3));   //true not a sensitive   

	System.out.println(s4.contains("is"));
	
	
	
	System.out.println("----------------------");
	
	
	System.out.println(s1.isEmpty());       //false
	
	System.out.println(s5.isEmpty());        //true
	
	System.out.println(s1.charAt(3));        //0
	
	System.out.println(s1.indexOf('0'));   //3
	
	System.out.println(s6.lastIndexOf('a'));     //6
	
	System.out.println(s4.startsWith("my"));      //true
	
	System.out.println(s4.endsWith("sonu"));   //true
	
	
	
	System.out.println("------------------------");
	
	System.out.println(s1.substring(5));     //ity
	
	System.out.println(s1.substring(3,6));      //3-5  oci
	
	System.out.println(s1+s3);          //velocityVELOCITY
	
	System.out.println(s1.concat(s3));    //velocityVELOCITY
	
	System.out.println(s4.replace("sonu","monu"));      //my name is monu
	
	
}
	
}
	
	


