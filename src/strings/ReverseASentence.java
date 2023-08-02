package strings;

public class ReverseASentence {

	public static void main(String[] args) {
		String s="I am a software Engineer";
		String str[]=s.split(" ");
	
		String rev="";
		for(int i=s.length()-1;i>=0;i--)
		{
			if(s.charAt(i)!=' ')
				rev=rev+s.charAt(i);
		}
		//System.out.println(rev);
		String result="";
		int position=0;
		for(int i=0;i<str.length;i++)
		{
			int len=str[i].length();
			result=result+rev.subSequence(position, position+len)+" ";
			position=position+len;
			//System.out.println(result);
			
		}
		System.out.println(result);
		

}
}
