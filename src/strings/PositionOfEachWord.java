package strings;

import java.util.LinkedHashSet;

public class PositionOfEachWord {

	public static void main(String[] args) {
		String s="we are test engineers we test applications engineers develop applications";
		//position of each word with duplicates
		String str[]=s.split(" ");
		int index=0;
		for(int i=0;i<str.length;i++)
		{
		
			System.out.println(str[i]+" index position is "+index);
			 index=index+str[i].length()+1;
		}
		//without duplicates
LinkedHashSet<String > set=new LinkedHashSet<String>();
for(int i=0;i<str.length;i++)
{
	set.add(str[i]);
}
int position=0;
for(String c:set) 
{
	System.out.println(c+" index position is "+position);
	position=position+c.length()+1;
}
	}

}
