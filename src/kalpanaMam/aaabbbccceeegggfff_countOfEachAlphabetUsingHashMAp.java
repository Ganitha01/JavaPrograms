package kalpanaMam;

import java.util.LinkedHashMap;

public class aaabbbccceeegggfff_countOfEachAlphabetUsingHashMAp {

	public static void main(String[] args) {
		String s="aaabbbccceeegggff";
		
		LinkedHashMap<Character,Integer> map=new LinkedHashMap<>();
		
		for(int i=0;i<s.length();i++)
		{
			map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
		}
		
		System.out.println(map);

	}

}
