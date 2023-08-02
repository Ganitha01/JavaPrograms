package strings;

import java.util.LinkedHashSet;

public class UniqueCharacters {

	public static void main(String[] args) {
		String s="Tester";
		String st=s.toLowerCase();
		LinkedHashSet<Character> set=new LinkedHashSet<Character>();
		for(int i=0;i<st.length();i++)
		{
			set.add(st.charAt(i));
			
		}
		System.out.println(set);
		
		String s1="nnjjndjw";
		char ch[]=s1.toCharArray();
		String s2="";
		for(int i=0;i<s1.length();i++)
		if(s2.indexOf(ch[i])==-1)
		{
			s2=s2+ch[i];
		}
		System.out.println(s2);
		}
		

	}

