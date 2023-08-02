package strings;

public class SwapStrings {

	public static void main(String[] args) {
		String a="anithagutta";
		String b="mamatha";
		
	a=a+b;//anithamamatha

	b=a.substring(0,(a.length()-b.length()));
	
	a=a.substring(b.length());
	
	System.out.println(a+" "+b);

	}

}
