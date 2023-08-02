package strings;

public class RemoveSpacesInAString {

	public static void main(String[] args) {
		String s="I am a test Engineer";
		String sr[]=s.split(" ");
		//remove spaces in a string
		String s1=s.replace(" ", "");
		System.out.println(s1);
		//remove spaces in a string
		for(int i=0;i<sr.length;i++)
		{
			System.out.print(sr[i]);
		}
		System.out.println();
		//reverse of String sentance
		for(int i=sr.length-1;i>=0;i--)
		{
			System.out.print(sr[i]+" ");
		}

	}

}
