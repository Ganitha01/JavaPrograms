package kalpanaMam;

public class Update_decline_accept_include_removeDotWithSpace {

	public static void main(String[] args) {
		String s= "update.decline.accept.include";
		String op="";
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)!='.')
			{
				op=op+s.charAt(i);
			}
			else
				op=op+" ";
			
		}
		System.out.println(op);

	}

}
