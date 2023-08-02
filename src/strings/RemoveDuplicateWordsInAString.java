package strings;

import java.util.LinkedHashSet;

public class RemoveDuplicateWordsInAString {

	public static void main(String[] args) {
		String s="we are test engineers we test applications engineers develop applications";
		//remove duplicates
		LinkedHashSet<String> set=new LinkedHashSet<String>();
		String str[]=s.split(" ");
		for(int i=0;i<str.length;i++)
		{
			set.add(str[i]);
		}
		System.out.println(set);
		
		//print duplicate words
		int numDuplicate=0;
		for(String c:set)
		{ int count=0;
		
		for(int i=0;i<str.length;i++)
		{
			if(str[i].equalsIgnoreCase(c))
					{
				count++;
					}
		}
		
		//System.out.println(c+" is present "+count +" times");
		
		if(count>1)
		{
			System.out.println(c+" is present "+count +" times");
			numDuplicate++;
			
		}
			
		}
		System.out.println("number of duplicate words are " +numDuplicate);

	}

}
