package arrays;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

public class CountNumberOfDuplicates {

	public static void main(String[] args) {
		int []a= {5,3,1,1,4,5,6,6};
		LinkedHashSet<Integer> set=new LinkedHashSet<>();
		//LinkedHashMap<Integer, Boolean> map=new LinkedHashMap<>();
		
		for(int i=0;i<a.length;i++)
		{
			set.add(a[i]);
			
		}
		int dupCount=0;
		for(int c:set)
		{int setCount=0;
			for(int i=0;i<a.length;i++)
			{
			if(c==a[i])
			{
				setCount++;
			}
			}
			if(setCount>1)
			{
				dupCount++;
			}
			System.out.println(c+" is occured "+ setCount+" times");
		}
		
		System.out.println("no of duplucate digits are "+dupCount);
		

	}

}
