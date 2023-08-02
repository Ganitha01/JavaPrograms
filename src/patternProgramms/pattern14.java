package patternProgramms;

public class pattern14 {

	public static void main(String[] args) {
		
//		A B C D E 
//		A B C D E 
//		A B C D E 
//		A B C D E 
//		A B C D E 
		for(int row=0;row<5;row++)
		{
			for(char clo='A';clo<'F';clo++)
			{
				System.out.print(clo+" ");
			}
			System.out.println();
		}

	}

}
