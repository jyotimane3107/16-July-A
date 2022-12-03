package String_Class;

public class Sample6 
{
public static void main(String[] args) 
{
	
	String s1="my name is ramu";
	
	{
		String[]ar=s1.split("");     //{my    name   is    ramu}
		
		System.out.println(ar.length);
		
		
		for(int i=0; i<=ar.length-1; i++)
		{
			System.out.println(ar[i]);
		
	}
}
}
}
