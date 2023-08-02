package patternProgramms;

public class pattern4 {

	public static void main(String[] args) {
//        * 
//      * * 
//    * * * 
//  * * * * 
//* * * * * 
		int k=1;
		for(int i=1;i<=3;i++)
		{
			for(int j=1;j<=3;j++)
			{
				if(i+j>3)
					{System.out.print(k+" ");k++;}
				else
					System.out.print("  ");
			}
			System.out.println();
		}

	}

}
