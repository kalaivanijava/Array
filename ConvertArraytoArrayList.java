package collections.finish;

import java.util.ArrayList;
import java.util.Arrays;

public class ConvertArraytoArrayList {
	public static void main(String[] args)
	{
	String[] str= {"hai","hello","welcome"};
	for(String s:str)
	{
		System.out.println(s);
	}
	ArrayList al=new ArrayList(Arrays.asList(str));
	System.out.println(al);
	al.add(3);
	al.add(6);
	System.out.println(al);
	
	
	}

}
