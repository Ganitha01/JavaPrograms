package kalpanaMam;

public class CountOfCharacters {

	public static void main(String[] args) {
		String s="aweexxxyyyyyyy";
		String op="";
		for(int i=0;i<s.length();i++)
		{
			if(op.indexOf(s.charAt(i))==-1)
			{
				op=op+s.charAt(i);
			}
		}
		System.out.println(op);
		int count=0;
		for(int i=0;i<op.length();i++)
		{count=0;
			for(int j=0;j<s.length();j++)
			{
				if(op.charAt(i)==s.charAt(j))
				{
					count++;
				}
			}
			System.out.print(op.charAt(i)+":"+count);
		}
		

	}

}
