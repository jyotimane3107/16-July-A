package StarPattern;

public class Pattern5 
{
public static void main(String[] args)
{
	//*
	//**
	//***
	
	int star=1;
	
	//4<=3
	for(int i=1; i<=3; i++)      //outer for loop --->rows
	{
		//4<=3
		for(int j=1; j<=star; j++)    //inner for loop --->cols
		{
			System.out.println("*");
		}
		System.out.println();
		star++;    //4
	}
	
	//*
	//**
	//***
	//
		
	
}
}
