package kalpanaMam;

public class RemoveWhiteSpaceReplaceWithCama {

	public static void main(String[] args) {
		String s="anitha mamatha sunitha geetha";
		
		s=s.replaceAll(" ",",");
		System.out.println(s);
		
		String s1="My name is Radha";
		
		s1=s1.replaceAll(" ", "");
		System.out.println(s1);

	}

}
