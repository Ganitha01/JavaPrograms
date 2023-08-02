package kalpanaMam;

public class Vijay_Vivek_Jawahar_countOvels {

	public static void main(String[] args) {
		String str[]= {"Vijay","Vivek","Jawahar"};
		//String dp="aeiou";
		
		for(int i=0;i<str.length;i++)
		{int count=0;
			for(int j=0;j<str[i].length();j++)
			{ String s=str[i].toLowerCase();
				char ch=s.charAt(j);
				if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
				{
					count++;
				}
			}
			System.out.println(str[i]+" ----->"+count);
		}

	}

}
