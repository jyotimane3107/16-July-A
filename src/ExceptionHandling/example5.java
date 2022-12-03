package ExceptionHandling;

public class example5
{
public static void main(String[] args) 
{
	int[] ar=new int[4];   //o to 3
	
	try
	{
		ar[7]=10;   //risky code
	}
	catch (Exception a)
	{
		a.printStackTrace();
		System.out.println("generic exception handled");
	}
	
	
	
	System.out.println("Hi");
	System.out.println("Hello");
		
		}
	
}

