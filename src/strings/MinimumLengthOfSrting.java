package strings;

public class MinimumLengthOfSrting {

	public static void main(String[] args) {
		String[] s= {"hhhjbhj","ab","bcde","hbvjk","ec","gh"};
		String min=s[0];
	
		for(int i=0;i<s.length;i++)
		{
			if(s[i].length()<min.length())
			{
				min=s[i];
			}
		}
		for(int j=0;j<s.length;j++)
		{
			if(s[j].length()==min.length())
			{
				System.out.println(s[j]+" "+j);
			}
		}
		

	}

}
