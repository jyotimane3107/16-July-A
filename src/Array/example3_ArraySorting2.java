package Array;
import java.util.Arrays;

public class example3_ArraySorting2 
{
public static void main(String[] args) 
{
	String[] ar=new String[5];
	
	ar[0]="pooja";
	ar[1]="tina";
	ar[2]="sona";
	ar[3]="mona";
	ar[4]="shina";
	
	System.out.println("---original data--");
	
	for(int i=0; i<=ar.length-1; i++)
	{
		System.out.println(ar[i]);
	}
	
	Arrays.sort(ar);
	System.out.println("---after sorting----");
	
	for(int i=0; i<=ar.length-1; i++)
	{
		System.out.println(ar[i]);
	}
}
}
