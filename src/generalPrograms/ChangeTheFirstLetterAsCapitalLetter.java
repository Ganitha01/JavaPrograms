package generalPrograms;

public class ChangeTheFirstLetterAsCapitalLetter {

	public static void main(String[] args) {
		String s="welcome to tyss office";//op-Welcome To Tyss Office 
		String str[]=s.split(" ");

		for(int i=0;i<str.length;i++)
		{char ch=Character.toUpperCase(str[i].charAt(0));
		str[i]=str[i].replace(str[i].charAt(0),ch);
		
		}
		for(int i=0;i<str.length;i++)
		{
		System.out.print(str[i]+" ");
		}
		
		System.out.println();

	}

}
