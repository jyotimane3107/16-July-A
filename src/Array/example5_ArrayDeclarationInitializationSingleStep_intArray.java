package Array;

public class example5_ArrayDeclarationInitializationSingleStep_intArray 
{
public static void main(String[] args) {
	
	int[]ar= {40,10,30,20};
	
	
	System.out.println(ar[0]);         //40
	System.out.println(ar[2]);          //30
	
	System.out.println("--print all info--");
	
	for(int i=0; i<=ar.length-1; i++)
	{
		System.out.println(ar[i]);
	}
	
}
}
