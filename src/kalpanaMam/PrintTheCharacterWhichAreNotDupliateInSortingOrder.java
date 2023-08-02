package kalpanaMam;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.TreeMap;

public class PrintTheCharacterWhichAreNotDupliateInSortingOrder {

	public static void main(String[] args) {

String s="automation";
TreeMap<Character, Integer> map=new TreeMap<>();
for(char c:s.toCharArray())
{
	map.put(c, map.getOrDefault(c, 0)+1);
}

for(Entry<Character, Integer> ch:map.entrySet() )
{
	if(ch.getValue()==1)
	{
		System.out.println(ch.getKey());
	}
}
	}

}
