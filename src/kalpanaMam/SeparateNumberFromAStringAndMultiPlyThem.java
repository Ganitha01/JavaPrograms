package kalpanaMam;

public class SeparateNumberFromAStringAndMultiPlyThem {

	public static void main(String[] args) {
		String s="i a1m goi123ng to fi3215an pro234duct for thenum1212bers ins1212ide th1212is st3245ring";
		String str[]=s.split(" ");
		long dp=0;long pro=1;
		
			for(int j=0;j<str.length;j++)
			{dp=0;
				for(int i=0;i<str[j].length();i++)
				{ 
			char ch=str[j].charAt(i);
			
					if(ch>='0' && ch<='9')
					{
						int num=Character.getNumericValue(ch);
						dp=dp*10+num;
					
					}
					
					
			}
				System.out.println(dp);
				if(dp>0)
				{
			pro=pro*dp;
				}
			
			
		}
			System.out.println(pro);

	}

}
