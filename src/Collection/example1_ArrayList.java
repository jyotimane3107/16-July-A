package Collection;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class example1_ArrayList 
{


private static char[] s1;

public static void main(String[] args) 
{
	ArrayList al=new
	ArrayList();      //initial capacity 10
	 
	 al.add("pooja");
	 al.add(101);
	 al.add('A');
	 al.add(65.5f);
	 al.add("pooja");
	 al.add(null);
	 al.add(null);
	 
	 System.out.println(al);
	 System.out.println(al.size());
	 
	 System.out.println(al.isEmpty());     //false
	 System.out.println(al.contains(101));   //true
	 System.out.println(al.get(3));       //65.5
	 System.out.println(al.get(2));         //A
	 
	 
	 //add info in between arraylist    -->right shift operation
	 
	 System.out.println(al);
	 al.add(4,"rutu");
	 System.out.println(al);
	 
	 //remove info in between arraylist -->left shift operation 
	 al.remove(4);
	 System.out.println(al);
	 
	 //update/modify info from arraylist
	 al.set(1, 102);
	 System.out.println(al);
	 
	 System.out.println("----print all info from arraylist using iterator cursor-------");
	 Iterator itr = (Iterator) al.iterator();
	 while(itr.hasNext())         //true false
	 {
		 System.out.println(itr.next());
	 }
	 
	 
	 System.out.println("---print all info from arraylist using ListIterator cursor---");
	 ListIterator litr=al.listIterator();
	 while(litr.hasNext())
	 {
		 System.out.println(litr.next());
	 }
	 
	 System.out.println("---print all data using for loop---");
	 for(int i=0; i<=al.size()-1; i++)
	 {
		 System.out.println(al.get(i));
	 }
	 System.out.println("---print all data using foreach loop--");
	 for(Object s1 :al)
	 {
		
		System.out.println(s1);
		 
	 }
}

	 
}

