package kalpanaMam;

import java.util.HashMap;
import java.util.Map.Entry;

public class BasedOnAsciWhichIsGreatest {

	public static void main(String[] args) {
		
		String s="AfgaDFkGda";int num=Integer.MIN_VALUE;char ch=s.charAt(0);
		for(int i=0;i<s.length();i++)
		{
			int num1=s.charAt(i);	
			if(num<num1)
			{
				num=num1;
				ch=s.charAt(i);
				
			}		
				
		}
		System.out.println(num+" "+ch);
		
		//Which is repeated more times
		
	HashMap<Character, Integer>  map=new HashMap<>();
	
	for(int i=0;i<s.length();i++)
	{
		map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0)+1);
	}
	
	for(Entry<Character, Integer> m:map.entrySet())
	{
		if(m.getValue()>1)
		{
			System.out.println(m.getKey());
		}
	}
	
	
		

	}

}
