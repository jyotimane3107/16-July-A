package ExceptionHandling;

public class example6 
{
public static void main(String[] args)
{
	int[]  ar=new int[4];   //0 to 3
	
	try
	{
		ar[7]=10;    //risky code
	}
	catch (ArithmeticException e)
	{
		System.out.println("arithmetic exception handled");
	}
	catch(StringIndexOutOfBoundsException a)
	{
		
		System.out.println("StringIndexOutOfBounds exception handled");
	}
	catch(ArrayIndexOutOfBoundsException b)
	{
		
		System.out.println("ArrayIndexOutOfBounds Exception");
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
