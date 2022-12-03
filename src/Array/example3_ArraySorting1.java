package Array;
import java.util.Arrays;

public class example3_ArraySorting1
{
public static void main(String[] args) 
{
	int[]ar1=new int[4];
	ar1[0]=30;       //10
	ar1[1]=20;       //20
	ar1[2]=40;       //30
	ar1[3]=10;       //40
	
	
	System.out.println("----original data------");
	for(int i=0; i<=ar1.length-1; i++)
	{
		System.out.println(ar1[i]);
	}
	
	System.out.println("---print info in ascending order----");
	Arrays.sort(ar1);     //[10,20,30,40]
	
	
	for(int i=0; i<=ar1.length-1;i++)
	{
		System.out.println(ar1[i]);
	}
}
}
