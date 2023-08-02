package kalpanaMam;

public class I_am_selenium_op_m_ui_nelesmai {

	public static void main(String[] args) {
		String s="i am selenium"; // o/p  m_ui_nelesmai
		String dp="";String op="";
		int length=0;int indexLength=0;
		for(int i=s.length()-1;i>=0;i--)
		{
			if(s.charAt(i)!=' ')
			{
			dp=dp+s.charAt(i);
			}

		}
		
		//System.out.println(dp);
		String str[]=s.split(" ");
		for(int i=0;i<str.length;i++)
		{
			
			length=length+str[i].length();
			op=op+dp.substring(indexLength,length)+" ";
			indexLength=length;
			
		}
		System.out.println(op);

	}

}
