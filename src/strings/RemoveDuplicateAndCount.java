package strings;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class RemoveDuplicateAndCount {

	public static void main(String[] args) {
		String st="TestYantra";
		String s=st.toLowerCase();
		LinkedHashMap<Character, Integer> map=new LinkedHashMap<Character, Integer>();
		
		for(int i=0;i<s.length();i++)
		{
			map.put(s.charAt(i), i);
		}
		//System.out.println(map);
		
		for(Entry<Character, Integer> m:map.entrySet())
		{	//remove duplicates
			//System.out.print(m.getKey());
			//count no of duplicates
			int count=0;
			for(int i=0;i<s.length();i++)
			{
				if(m.getKey()==s.charAt(i))
				{
					count++;
				}
			}
			if(count>1)
			System.out.println(m.getKey()+" is occured "+count+" times");
		}
		

	}

}
