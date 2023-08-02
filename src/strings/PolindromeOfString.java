package strings;

import java.util.Scanner;

public class PolindromeOfString {

	public static void main(String[] args) {
		for(;;)
		{
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		String rev="";
		for (int i=s.length()-1;i>=0;i--)
		{
			char ch=s.charAt(i);
			rev=rev+ch;
		}

if(rev.equals(s))
{
	System.out.println("given word is polindrome");
}
else
{
	System.out.println("given word is not polydrome");
}
		

	}
	}
}
