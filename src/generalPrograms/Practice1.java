package generalPrograms;

public class Practice1 {

	public static void main(String[] args) {
		String s="12abc@456%10xyz5";//op-12+456+10+5
		int num=0;int sum=0;
		for(int i=0;i<s.length();i++)
		{
			
			if(Character.isDigit(s.charAt(i)))
			{
			num=num*10+Character.getNumericValue(s.charAt(i));
			if(i==s.length()-1)
			{
				sum=sum+num;
			}
			}
			else
			{
				sum=sum+num;
				num=0;
			}
		}
		
		System.out.println(sum);
				
		
//		int op=0;int sum=0;//483
//		
//		for(int i=0;i<s.length();i++)
//		{
//			char ch=s.charAt(i);
//			if(ch<='9' && ch>='0')
//			{
//				op=op*10+Character.getNumericValue(ch);
//				if(i==s.length()-1)
//				{
//					sum=sum+op;
//				}
//			}
//			else
//			{
//				sum=sum+op;
//				op=0;
//			}
//			
//			
//		}
//		
//		System.out.println(sum);
		
		

	}

}
