package kalpanaMam;

public class aaabbcdddfOP_a3b2cd3f {

	public static void main(String[] args) {
	
		String s="aacabbcddd";//a3b2cd3f
		int count=1;
	
			for(int j=0;j<s.length()-1;j++)
			{ 
				if(s.charAt(j)==s.charAt(j+1))
				{
					count++;
					if(j==s.length()-2)
					{
						System.out.print(s.charAt(j)+""+count);
					}
					
				}
				else
				{
					System.out.print(s.charAt(j)+""+count);
					count=1;
					if(j==s.length()-2)
					{
						System.out.print(s.charAt(j+1)+""+count);
					}
				}
			
			}
			
				

		
		
		
		
//		int count=0;
//		String op="";
//		char prechar=s.charAt(0);
//		for(int i=0;i<s.length();i++)
//		{
//			char curchar=s.charAt(i);
//			if(prechar==curchar)
//			{
//				count++;
//				if(i==s.length()-1)
//				{
//					op=op+prechar;
//					op=op+count;
//				}
//			}
//			
//			else
//			{
//				op=op+prechar;
//				if(count>1)
//				{
//				op=op+count;
//				}
//				count=0;
//				prechar=curchar;
//				count++;
//				if(i==s.length()-1)
//				{
//					op=op+prechar;
//				}
//				
//			}
//		}
//		System.out.println(op);

	}

}
