package strings;

public class ReverseAlphabets {

	public static void main(String[] args) {
		
		String s="a??b..cd!!e";
		//char str[]=s.toCharArray();
		String ch[]=s.split("[^a-zA-Z0-9]");
		int k=s.length()-1;
		for(int i=0;i<s.length();i++)
		{
			if(Character.isAlphabetic(s.charAt(k)))
			{System.out.print(s.charAt(k--));
				
			}
			else 
			{
				System.out.print(s.charAt(i));
			}
					
		}
				
//			for(String c: ch)
//			{
//
//		System.out.print(c);
//			}

	}

}
