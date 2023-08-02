package generalPrograms;

public class a2a1b2c3 {

	public static void main(String[] args) {
		String s="a2a1b2c3";
		String op="";
		for (int i = 0; i < s.length(); i++) 
		{
			if(Character.isDigit(s.charAt(i)))
					{
				int num=Character.getNumericValue(s.charAt(i));
						for(int j=0;j<num;j++)
						{
							op=op+s.charAt(i-1);
						}
						
					}
			}
		System.out.println(op);
		

	}

}
