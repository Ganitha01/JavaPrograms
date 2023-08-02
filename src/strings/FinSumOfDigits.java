package strings;

public class FinSumOfDigits {

	public static void main(String[] args) {
		String s="a3b2d4";
		//char str[]=s.toCharArray();
		
		int sum=0;
		for(int i=0;i<s.length();i++)
		{
			char str=s.charAt(i);
			if(str>='0'&&str<='9')
			{
				sum=sum+(str-48);
			}
		}
		System.out.println(sum);

	}

}
