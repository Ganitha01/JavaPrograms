package generalPrograms;

public class Practice {

	public static void main(String[] args) {
		String s=new String("java");
		String s1=new String("python");

		s=s+s1;//javapython

		s1=s.substring(0,s.length()-s1.length());//java
		s=s.substring(s1.length());

		System.out.println(s+" "+s1);

	}

}
