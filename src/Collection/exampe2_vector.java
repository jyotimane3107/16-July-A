package Collection;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class exampe2_vector 
{


private static int i;
private static char[] s1;

public static void main(String[] args) 
{
	Vector V=new Vector();
	V.add("sonali");
	V.add(101);
	V.add('A');
	V.add(65.5f);
	V.add("sonali");
	V.add(null);
	V.add(null);
	
	System.out.println(V.capacity());
	System.out.println(V);
	System.out.println(V.size());
	
	System.out.println(V.isEmpty());      // false
	System.out.println(V.contains(101));   //true
	System.out.println(V.get(3));  //65.5
	
	
	//add info in between Vector  -->right shift operation
	System.out.println(V);
	V.add(4,"monali");
	System.out.println(V);
	
	//remove info in between vector -->left shift operation
	V.remove(4);
	System.out.println(V);
	
	//update/modify info from Vector
	V.set(1, 102);
	System.out.println(V);
	
	System.out.println("---print VI info from Vector using iterator cursor---");
	Iterator itr = V.iterator();
	while(itr.hasNext())       //true false
	{
		System.out.println(itr.next());
	}
	
	System.out.println("---print VI info from Vector using ListIterator cursor ---");
	ListIterator litr = V.listIterator();
	while(litr.hasNext())
	{
		System.out.println(litr.next());
	}
	
	System.out.println("---print VI data using for loop---");
	for(int i=0; i<=V.size()-1;i++)
	{
		
		System.out.println(V.get(i));
	}
	System.out.println("--print VI data using foreach loop--");
	for(Object s1:V)
	{
		System.out.println(s1);
	}
	
	System.out.println("---print all data using enumeration cursor--");
	Enumeration enu =V.elements();
	while(enu.hasMoreElements())
	{
		System.out.println(enu.nextElement());
	
		
	}
	
	
	
}
}
