package kalpanaMam;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class RemoveDuplicateWordsFrom2Strings {

	public static void main(String[] args) {
		String s1="This is fun show";
		String s2="fun tv show";
		
		String s=s1+" "+s2;
		String str[]=s.split(" ");
		
		LinkedHashMap<String,Integer> map=new LinkedHashMap<>();
		
		for(int i=0;i<str.length;i++)
		{
			map.put(str[i],map.getOrDefault(str[i],0)+1);
		}
		
		for(Entry<String, Integer> m: map.entrySet())
		{
			if(m.getValue()==1)
			{
				System.out.print(m.getKey());
			}
		}
	

	}

}
