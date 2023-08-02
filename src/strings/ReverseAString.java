package strings;

public class ReverseAString {

	public static void main(String[] args) {
		String s="anitha";
		for(int i=s.length()-1;i>=0;i--)
		{
			char ch=s.charAt(i);
			System.out.print(ch);
		}
		System.out.println();
		
		
StringBuilder s1=new StringBuilder("software");
System.out.println(s1.reverse());


String s2="automation";
char ch[]=s2.toCharArray();
int count=0;
for(char c:ch)
{
	count++;
}
for(int i=count-1;i>=0;i--)
{
	System.out.print(ch[i]);
}


	}

}
