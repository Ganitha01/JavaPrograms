package kalpanaMam;

import java.util.LinkedList;

public class InsertAStringIntoMiddleOfStringArray {

	public static void main(String[] args) {
		
		String str[]= {"Anitha", "is", "in" ,"bangalore"};
		String s="living";
		String str1[]=new String[str.length+1];
		//LinkedList<String> li=new LinkedList<>();
		int j=0;
		int length=str.length/2;
		
		for(int i=0;i<str.length;i++)
		{
				
			if(i==length)
			{
				//li.add(s);
				str1[j++]=s;
				
			}
			str1[j++]=str[i];
			
		}

		//System.out.println(li);
		for(int i=0;i<str1.length;i++)
		{
			System.out.print(str1[i]+" ");
		}
		
	}

}
