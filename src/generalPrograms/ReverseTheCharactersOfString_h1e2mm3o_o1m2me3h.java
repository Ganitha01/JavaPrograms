package generalPrograms;

public class ReverseTheCharactersOfString_h1e2mm3o_o1m2me3h {

	public static void main(String[] args) {
//		String s="h1e2mm3o";
//		String op="";
//		String op1="";int k=0;
//		for(int i=s.length()-1;i>=0;i--)
//		{
//			if(Character.isAlphabetic(s.charAt(i)))
//			{
//				op=op+s.charAt(i);
//				
//			}
//		}
//		for(int i=0;i<s.length();i++)
//		{
//			if(Character.isDigit(s.charAt(i)))
//			{
//				op1=op1+s.charAt(i);
//				
//			}
//			else
//			{
//				op1=op1+op.charAt(k);
//				k++;
//			}
//				
//		}
//		System.out.println(op1);
		
		String s="a??b..cd!!e";//op- e??d..cb!!a
		String s2=s.replaceAll("[^a-zA-Z]","");
		StringBuilder s1=new StringBuilder(s2);

		s1.reverse();
		for(int i=0;i<s.length();i++)
		{
			if(!Character.isAlphabetic(s.charAt(i)))
			{
				s1.insert(i, s.charAt(i));
			}
		}
		System.out.println(s1);
	}

}
