package strings;

import java.util.LinkedHashSet;

public class CountOvels {

	public static void main(String[] args) {
		String s="bangalore";
		//with duplicates
		int count=0;
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
			{
				count++;
			}
		}
		System.out.println("number of ovels present are "+count);
		
		//with out duplicates
		LinkedHashSet<Character> set=new LinkedHashSet<Character>();
		int countd=0;
		for(int i=0;i<s.length();i++)
		{
			set.add(s.charAt(i));
		}
		
		for(char c: set)
		{
			if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
			{
				countd++;
			}
		}
		
		System.out.println("number of ovels present are "+countd);

	}

}
