package kalpanaMam;

import java.util.LinkedHashMap;

public class IMMUNUTIES_countUalphabets {

	public static void main(String[] args) {
	String s="IMMUNUTIES";int count=0;
	//using map
	LinkedHashMap<Character, Integer> map=new LinkedHashMap<>();
	
	for(int i=0;i<s.length();i++)
	{
		if(s.charAt(i)=='U')
		map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0)+1);
	}
	
	System.out.println(map);


	
	for(int i=0;i<s.length();i++)
	{
		if(s.charAt(i)=='U')
		{
			count++;
		}
	}
	
	System.out.println("u ---->"+count);

}
}
