package kalpanaMam;

public class PrintCharacterInAStringNotDuplicate {

	public static void main(String[] args) {
		String s="tester";
		String dp="";int count=0;
		for(int i=0;i<s.length();i++)
		{
			if(dp.indexOf(s.charAt(i))==-1)
			{
				dp=dp+s.charAt(i);
			}
		}
		
		for(int i=0;i<dp.length();i++)
		{count=0;
			for(int j=0;j<s.length();j++)
			{
				if(dp.charAt(i)==s.charAt(j))
				{
					count++;
				}
			}
			if(count==1)
			System.out.println(dp.charAt(i));
		}

	}

}
