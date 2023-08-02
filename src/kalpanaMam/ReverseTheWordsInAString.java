
package kalpanaMam;

public class ReverseTheWordsInAString {

	public static void main(String[] args) {
		String s="Anitha is living in bangalore";
		String dp="";
		String str[]=s.split(" ");
		
		for(int i=0;i<str.length;i++)
		{
			
			for(int j=str[i].length()-1;j>=0;j--)
			{
				char ch=str[i].charAt(j);
				dp=dp+ch;
			}
			dp=dp+" ";
		}
		

		System.out.println(dp);
	}

}
