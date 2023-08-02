package kalpanaMam;

import java.util.LinkedHashSet;

public class RemoveDuplicateWords {

	public static void main(String[] args) {
		
		
		String s="i am a test engineer i test application";
		
		//using HashSet fro remove duplicates
		
		LinkedHashSet<String> set=new LinkedHashSet<>();
		String str[]=s.split(" ");
		for(int i=0;i<str.length;i++)
		{
			set.add(str[i]);
		}
		
		System.out.println(set);
		
		//without using HashSet

		String dp="";
		for(int i=0;i<str.length;i++)
		{
			String str1[]=s.split(" ");
			if(dp.indexOf(str1[i])==-1)
			{
				dp=dp+str[i]+" ";
			}
		}
		
		System.out.println(dp);
	}

}
