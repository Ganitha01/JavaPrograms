package kalpanaMam;

public class ReverseAlternativeWords {

	public static void main(String[] args) {
		String s="this is java programming question";
		String str[]=s.split(" ");
		String dp="";
		String op="";
		
		for(int i=1;i<=str.length;i++)
		{ int k=0;
			for(int j=str[i-1].length()-1;j>=0;j--)
			{
			if(i%2==0)
			{
				dp=dp+str[i-1].charAt(j);
			}
			else
			{
				
			dp=dp+str[i-1].charAt(k);
			k++;
			}
			
		}
			op=op+dp+" ";
			dp="";
			
			
			

	}
		System.out.println(op);

	}}
