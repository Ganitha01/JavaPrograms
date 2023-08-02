package generalPrograms;

public class CombinationOfArray {

	public static void main(String[] args) {
		
		String s="welcome to tyss office bangalore";//welcome ot tyss eciffo bangalore
		String op="";
		StringBuilder s1=new StringBuilder();
		
		String str[]=s.split(" ");
		for(int i=0;i<str.length;i++)
		{s1.setLength(0);
			if(i%2!=0)
			{
				s1.append(str[i]);
			op=op+s1.reverse()+" ";
		//	System.out.println(s1);
				}
			else 
			{
	
		op=op+str[i]+" ";

		}}
		
			System.out.println(op);
			
			
		//find ovels from each word delete duplicates
		String[] str1=s.split(" ");
		
		for(int i=0;i<str1.length;i++)
		{int count=0;String dp="";
			for(int j=0;j<str1[i].length();j++)
			{
				char ch=str1[i].charAt(j);
				if((ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') && dp.indexOf(ch)==-1)
				{dp=dp+ch;
						count++;
						System.out.print(ch);
				}
			}
			System.out.println(count);
		}
		
			
		}}	

		



