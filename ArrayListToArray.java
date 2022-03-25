package collections.finish;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListToArray {

	public static void main(String[] args)
	{
    ArrayList al=new ArrayList();
    al.add(4);
    al.add(5);
    al.add(7);
    al.add(9);
   // al.add("welcome");
   // al.add('s');
    al.add(7);
    al.add(34);
   Collections.sort(al);
   System.out.println(al);
   Collections.reverse(al);
   System.out.println(al);
   Collections.shuffle(al);  
   System.out.println(al);
    System.out.println("ArrayList");
    System.out.println(al);
    System.out.println("Array");
    Object[] obj=al.toArray();
    for(Object in:obj)
    {
    	System.out.println(in);
    }

	}

}
