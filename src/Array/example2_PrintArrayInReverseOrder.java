package Array;

public class example2_PrintArrayInReverseOrder
{
public static void main(String[] args) 
{
	int[]ar1=new int[4];
	
	ar1[0]=30;
	ar1[1]=20;
	ar1[2]=40;
	ar1[3]=10;
	
	System.out.println("---original data----");
	
	for(int i=0; i<=ar1.length-1; i++)
	{
		System.out.println(ar1[i]);
	}
	System.out.println("----print array in reverse order---");
	
	//3     -1>=0
	for(int i=ar1.length-1; i>=0; i--)
	{    //0
		System.out.println(ar1[i]);    //10,40,20,30
	}
}
}
