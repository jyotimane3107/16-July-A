package AccessSpecifiers;

public class sample15 
{
//2.example of default access specifier
	
	public int num;    //default
	public sample15()    //default
	{
		num=10;
	}
	
	public void m1()    //default
	{
		System.out.println(num);
	}
	
	public static void main(String[] args) {
		sample15 s15=new sample15();
		s15.m1();
		System.out.println(s15.num);
	}
	}

