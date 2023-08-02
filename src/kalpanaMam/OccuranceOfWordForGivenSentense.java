package kalpanaMam;

import java.util.LinkedHashSet;

public class OccuranceOfWordForGivenSentense {

	public static void main(String[] args) {
	String s="My name is rishav it contains ri and shav";
	String str[]=s.split(" ");int count=0;
	LinkedHashSet<String> set=new LinkedHashSet<>();
	for(int i=0;i<str.length;i++)
	{
		set.add(str[i]);
	}
	//System.out.println(set);
	
	for(String c:set)
	{ count=0;
		for(int i=0;i<str.length;i++)
		{
			if(str[i].equalsIgnoreCase(c))
			{
				count++;
			}
		}
		System.out.println(c+"------->"+count+" time");
	}
	
	
	

	}

}
