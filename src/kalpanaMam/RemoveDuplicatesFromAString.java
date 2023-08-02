package kalpanaMam;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class RemoveDuplicatesFromAString {

	public static void main(String[] args) {
		String s="tester";
		
		//remove duplicates from string using HasSet
		
		LinkedHashSet<Character> set=new LinkedHashSet<Character>();
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			set.add(ch);
			
		}
		Iterator<Character> itr=set.iterator();
		while(itr.hasNext())
		{
			System.out.print(itr.next());
		}
		
		System.out.println();
		
		
		//remove duplicates using indexOf method
		
		String dp="";
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if(dp.indexOf(ch)==-1)
			{
				dp=dp+ch;
			}
		}
		
		System.out.println(dp);

	}

}
