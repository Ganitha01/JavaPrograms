package strings;

public class SwapFirstAndLastWords {

	public static void main(String[] args) {
		String s="I am a software Engineer";
		String str[]=s.split(" ");
		for(int i=0;i<str.length;i++)
		{
			String temp=str[str.length-1];
			str[str.length-1]=str[i];
			str[i]=temp;
		}
		for(int i=0;i<str.length;i++)
		{
		System.out.print(str[i]+" ");
		}
		
//		//reverse each word
		String rev="";
		for(int i=0;i<str.length;i++)
		{
			for(int j=str[i].length()-1;j>=0;j--)
			{
			char ch=str[i].charAt(j);
			rev=rev+ch;
			}
			
			rev=rev+" ";
		}
		System.out.println(rev);

	}

}
