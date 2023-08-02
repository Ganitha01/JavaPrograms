package arrays;

import java.util.LinkedHashSet;

public class RemoveDuplicatesInAString {

	public static void main(String[] args) {
		String s="Tester";
		String st=s.toLowerCase();
		LinkedHashSet<Character> set=new LinkedHashSet<Character>();
		for(int i=0;i<st.length();i++)
		{
			set.add(st.charAt(i));
			
		}
		
		for(char c:set)
		{ int count=0;
			for(int i=0;i<st.length();i++)
			{
				if(c==st.charAt(i))
				{
					count++;
				}
			}
if(count>1)
{
	System.out.println(c+" is repeated "+count+" times");
}
		}

	}

}
