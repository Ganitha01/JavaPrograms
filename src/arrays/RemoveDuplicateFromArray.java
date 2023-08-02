package arrays;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map.Entry;

public class RemoveDuplicateFromArray {

	public static void main(String[] args) {
		int[] a= {5,3,1,1,4,5,6};
		//position with duplicate
		for (int i=0;i<a.length;i++)
		{
			System.out.println(a[i]+" inxed position is "+(i+1));
		}
		LinkedHashMap<Integer, Integer> map=new LinkedHashMap<Integer, Integer>();
				LinkedHashSet<Integer> set=new LinkedHashSet<Integer>();
		//using HashSet
				for (int i=0;i<a.length;i++)
		{
			set.add(a[i]);
		}
		
		System.out.println(set);
		
		
		//usingHashMAp
		for (int i=0;i<a.length;i++)
		{
			map.put(a[i], i);
		}
		//position without duplicates
		for(Entry<Integer, Integer> m:map.entrySet())
		{
			System.out.println(m.getKey()+" inxed position is "+m.getValue());
		}
		//System.out.println(map);
	

	}

}
