package patternProgramms;

public class pattern18 {

	public static void main(String[] args) {
		
//	     i
//	    ni
//	   dni
//	  idni
//	 aidni
				String s="india";
			
				for(int i=0;i<5;i++)
				{int k=i;
					for(int j=0;j<5;j++)
					{
					if(i+j>3)
					{
					System.out.print(s.charAt(k));
					k--;
					}
					else
					{
						System.out.print(" ");
					}
				}
					System.out.println();
				}
				
				//------------------------
				
//				
//				    i
//				   in
//				  ind
//				 indi
//				india
				for(int i=1;i<=s.length();i++)
				{int k=0;
					for(int j=1;j<=s.length();j++)
					{
					if(i+j>s.length())
					{
					System.out.print(s.charAt(k));
					k++;
					}
					else
					{
						System.out.print(" ");
					}
					
				}
					System.out.println();
				}
			}

}
