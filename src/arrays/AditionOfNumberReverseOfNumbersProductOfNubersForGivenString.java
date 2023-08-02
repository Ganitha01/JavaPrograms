package arrays;

public class AditionOfNumberReverseOfNumbersProductOfNubersForGivenString {

	public static void main(String[] args) {
		
		
		String s="123abc98fgf255";//op-476,321abc89fgf552,123*98*255
		int num=0;int tsum=0;
		for(int i=0;i<s.length();i++)
		{
			if(Character.isDigit(s.charAt(i)))
			{
				num=num*10+Character.getNumericValue(s.charAt(i));
				if(i==s.length()-1)
				{
					tsum=tsum+num;
				}
			}
			else
			{
				tsum=tsum+num;
				num=0;
			}
		}
		System.out.println(tsum);
		StringBuffer op=new StringBuffer();
		String op1="";
	//-----------------------------------------------------------------	
		for(int i=0;i<s.length();i++)
		{
			if(Character.isDigit(s.charAt(i)))
			{ 
				op.append(s.charAt(i));
				if(i==s.length()-1)
				{
					op1=op1+op.reverse();
				}
				
			}
			else
			{
				
				op1=op1+op.reverse()+s.charAt(i);
				op.setLength(0);
			}
		}
		System.out.println(op1);
		//---------------------------------------------
		String dp="";int count=1;
		for(int i=0;i<s.length();i++)
		{
				if(Character.isDigit(s.charAt(i)))
				{
					dp=dp+s.charAt(i);
					count=1;
				}
			else
			{
				if(count==1)
				{
				dp=dp+"*";
				}
				count++;
				
			}
		}
		System.out.println(dp);

	}

}
