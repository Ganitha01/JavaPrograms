package kalpanaMam;

public class ScreeningProgram {

	public static void main(String[] args) {
		String s1="!@#$/667ohuhjh8899%56/h257*kjkjkghrgherjkg/6hjk/7777/vjhghj%^&*&*(()";

		for(int i=0;i<s1.length()-3;i++)
		{
			if(s1.substring(i, i+4).equalsIgnoreCase("7777"))
			{
				System.out.println(s1.substring(i, i+4));
			}
		}

		

	}

}
