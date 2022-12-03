package Array;

public class example1_StringArray
{
public static void main(String[] args) 
{
	//step: array declaration
	String[] ar=new String[5];
	
	
	//step2: array initialization
	ar[0]="jyoti";
	ar[1]="sneha";
	ar[2]="sonali";
	ar[3]="priyanka";
	ar[4]="reshma";
	//ar[5]="abc";
	
	
	
	//step3:array usage
	System.out.println(ar[1]);         //sonali
	
	System.out.println(ar.length);       //5
	
	System.out.println("-print all info in array");
	
	for(int i=0; i<=ar.length-1; i++)
	{         //4
		System.out.println(ar[i]);     //jyoti,sneha,sonali,priyanka,reshma
	}
	
	
	
	
        //5<=4
	  //  for(int i=0; i<=4; i++)
		//	{      //4
	//	System.out.println(ar[i]); //jyoti,sneha,sonali,priyanka,reshma
			//}
		
	}
}		


