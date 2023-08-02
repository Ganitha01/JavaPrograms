package kalpanaMam;

public class WelcomeToExpleo {

	public static void main(String[] args) {
		String s="welcome to explepo";  //o/p ----->explepo to welcome 
		String []str=s.split(" ");
		for(int i=str.length-1;i>=0;i--)
		{
			System.out.print(str[i]+" ");
		}

	}

}
