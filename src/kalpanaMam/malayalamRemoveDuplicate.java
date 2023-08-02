package kalpanaMam;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class malayalamRemoveDuplicate {

	public static void main(String[] args) {
		String s="malayalam";
		String s1="";
		// remove duplicates with out using HashMap
		
		for(int i=0;i<s.length();i++)
		{
			if(s1.indexOf(s.charAt(i))==-1)
			{
				s1=s1+s.charAt(i);
			}
		}
		System.out.println(s1);
		
		//remove duplicate using HashMap
		
		LinkedHashMap<Character, Integer> map=new LinkedHashMap<>();
		
		for(int i=0;i<s.length();i++)
		{
			map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0)+1);
		}
	for(Entry<Character, Integer> m:map.entrySet())
	{
		System.out.print(m.getKey());
	}

	}

}
