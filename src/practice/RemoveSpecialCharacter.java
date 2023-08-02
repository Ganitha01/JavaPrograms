package practice;

public class RemoveSpecialCharacter {

	public static void main(String[] args) {
		String s="ann@ia#tt@ha";
		StringBuilder op=new StringBuilder(s);
		
		for(int i=0;i<op.length();i++)
		{if (!Character.isLetterOrDigit(op.charAt(i))) {
			op.deleteCharAt(i);
			op.deleteCharAt(i-1);
			
		}}
		System.out.println(op);


	}
	

}
