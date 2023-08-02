package kalpanaMam;

public class PatternProgram {

	public static void main(String[] args) {
		
		 
//		A  
//		A B  
//		A B C  
//		A B C D  
//		A B C D E 
		
		
		for(char ch='A';ch<'G';ch++)
		{
			for(char ch1='A';ch1<ch;ch1++)
			{
				System.out.print(ch1+" " );
			}
			System.out.println(" ");
		}

	}

}
