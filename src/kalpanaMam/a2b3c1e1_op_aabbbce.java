package kalpanaMam;

public class a2b3c1e1_op_aabbbce {

	public static void main(String[] args) {
		
		String s="a2b3c1e2";
		String op="";
		
		for(int i=1;i<s.length();i++)
		{
			char ch=s.charAt(i);
			
			int num=Character.getNumericValue(ch);
			//System.out.println(num);
			if(Character.isAlphabetic(s.charAt(i-1)))
			{
			 char alpha=s.charAt(i-1);
			
			
			for(int j=0;j<num;j++ )
			{
				//System.out.println(num);
				op=op+alpha;
			}
			}
		}
		System.out.println(op);

	}

}
