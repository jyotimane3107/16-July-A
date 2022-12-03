package Collection;

import java.util.ArrayList;
import java.util.HashSet;

public class example4_Hashset2 
{
public static void main(String[] args)
{
	ArrayList al=new ArrayList();
	al.add("sahil");
	al.add(101);
	al.add('A');
	al.add(65.5f);
	al.add("sahil");
	al.add(null);
	al.add(null);
	
	System.out.println(al);
	
	
	HashSet hs=new HashSet(al);
	System.out.println(hs);
	
}
}
