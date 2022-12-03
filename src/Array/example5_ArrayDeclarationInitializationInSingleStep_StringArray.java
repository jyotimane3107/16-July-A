package Array;

public class example5_ArrayDeclarationInitializationInSingleStep_StringArray
{
public static void main(String[] args)
{
	
	String[]ar=
		{"sona","mona","tina","rina"};
	
	System.out.println(ar[2]);
	System.out.println(ar[3]);
	
	System.out.println("----print all data---");
	
	for(int i=0; i<=ar.length-1; i++)
	{
		System.out.println(ar[i]);
	}
}
}
