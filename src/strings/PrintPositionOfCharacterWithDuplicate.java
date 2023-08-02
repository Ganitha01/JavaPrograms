package strings;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class PrintPositionOfCharacterWithDuplicate {

	public static void main(String[] args) {
		String s="tester";
		//with duplicate 
//		for(int i=0;i<s.length();i++)
//		{
//			System.out.println(s.charAt(i)+"is present in "+(i+1)+" position");
//		}
		//with out duplicate
		LinkedHashSet<Character> set=new LinkedHashSet<Character>();
		
		for(int i=0;i<s.length();i++)
		{
			set.add(s.charAt(i));
			
		}
		for(char ch:set)
		{
			for(int i=0;i<s.length();i++)
			{
				if(ch==s.charAt(i))
				{
					System.out.println(ch+" is present in"+ (i+1)+" positions");
					break;
				}
			}
		}
		//reverse order
		for(char ch:set)
		{
			for(int i=s.length()-1;i>=0;i--)
			{
				if(ch==s.charAt(i))
				{
					System.out.println(ch+" is present in"+ (i+1)+" positions");
					break;
				}
			}
		}

	}

}
