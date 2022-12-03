package Array;

public class example1_charArray 
{
public static void main(String[] args)
{
	char[] ar1=new char[4];
			
			
			ar1[0]='A';
	        ar1[1]='B';
	        ar1[2]='C';
	        ar1[3]='D';
	        
	        System.out.println(ar1[2]);      //C
	        
	        System.out.println(ar1.length);    //4
	        
	        
	        System.out.println("------------");
	        for(int i=0; i<=ar1.length-1; i++)
	        {
	        	System.out.println(ar1[i]);
	        }
	        
	        	
}
}
