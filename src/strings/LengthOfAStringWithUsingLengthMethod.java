package strings;

public class LengthOfAStringWithUsingLengthMethod {

	public static void main(String[] args) {
		String s="njahsugbhjbjh";
		char str[]=s.toCharArray();
		int count=0;
		for(char c:str)
		{
			count++;
		}
		System.out.println(count);
		//System.out.println(s.length());
		

	}

}
