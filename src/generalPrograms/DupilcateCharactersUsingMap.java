package generalPrograms;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class DupilcateCharactersUsingMap {

	public static void main(String[] args) {

 String s="automation";
 LinkedHashMap<Character, Integer> map=new LinkedHashMap<>();
 
 for(int i=0;i<s.length();i++)
 {
	 map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0)+1);
 }
 for(Entry<Character, Integer> m :map.entrySet())
 {
	 if(m.getValue()>1)
	 {
		 System.out.println(m.getKey());
	 }
 }

	}

}
