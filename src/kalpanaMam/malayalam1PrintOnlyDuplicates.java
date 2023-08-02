package kalpanaMam;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class malayalam1PrintOnlyDuplicates {

	public static void main(String[] args) {

String s="malayalam";
String s1="";

//print only duplicates without using hashMap
for(int i=0;i<s.length();i++)
{
	if(s1.indexOf(s.charAt(i))==-1)
	{
		s1=s1+s.charAt(i);
	}
}
for(int i=0;i<s1.length();i++)
{ int count=0;
	for(int j=0;j<s.length();j++)
	{
		if(s1.charAt(i)==s.charAt(j))
			count++;
	}
	if(count>1)
		System.out.println(s1.charAt(i));
}
//print only duplicates with using HashMap

LinkedHashMap<Character, Integer> map=new LinkedHashMap<>();

for(int i=0;i<s.length();i++)
{
	map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0)+1);
}
System.out.println(map);

for(Entry<Character, Integer> m:map.entrySet())
{
	if(m.getValue()>1)
		System.out.println(m.getKey());
}


	}

}
