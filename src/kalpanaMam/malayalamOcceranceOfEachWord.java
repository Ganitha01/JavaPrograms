package kalpanaMam;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class malayalamOcceranceOfEachWord {

	public static void main(String[] args) {

String s="malayalam is a a palindrome malayalam is not a pali it is language";
String str[]=s.split(" ");
String op="";

//remove duplicates without HashMap
for(int i=0;i<str.length;i++)
{int count=1;
	for(int j=i+1;j<str.length;j++)
	{
		if(str[i].equalsIgnoreCase(str[j]))
		{
			str[j]="";
			count++;
		}
	}
	//each word repeated number of times without HashMap
	if(str[i]!="")
		System.out.println(str[i]+"--->"+count);
}
for(int i=0;i<str.length;i++)
{
	if(str[i]!="")
	System.out.print(str[i]+" ");
}

//remove dulicates with HashMap
String str1[]=s.split(" ");
LinkedHashMap<String, Integer> map=new LinkedHashMap<>();

for(int i=0;i<str1.length;i++)
{
	map.put(str1[i], map.getOrDefault(str1[i], 0)+1);
}
System.out.println(map);

for(Entry<String, Integer> m:map.entrySet())
{
	if(m.getValue()>1)
	{
		System.out.println(m.getKey());
	}
}



	}

}
