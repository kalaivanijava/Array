package collections.finish;

import java.util.LinkedHashSet;
public class Random {
	public static void main(String[] args)
	{
		LinkedHashSet hs=new LinkedHashSet();
		boolean count =true;
		while(count)
		{
			Random rand=new Random();
			int rn=(int)(Math.random()*(9));
			hs.add(rn);
			if(hs.size()==9)
			{
				count=false;
			}
			}
		for(Object i:hs)
			System.out.println(i);
		}
	}


