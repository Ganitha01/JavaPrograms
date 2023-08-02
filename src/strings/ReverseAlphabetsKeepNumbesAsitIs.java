package strings;

public class ReverseAlphabetsKeepNumbesAsitIs {

	public static void main(String[] args) {

		String s = "abc123efj456";
		StringBuilder op = new StringBuilder();
		String op1 = "";

		for (int i = 0; i < s.length(); i++) {
			if (Character.isAlphabetic(s.charAt(i))) {
				op.append(s.charAt(i));
			} else {
				op.reverse();
				op1 = op1 + op + s.charAt(i);
				op.setLength(0);
			}
		}
		System.out.println(op1);
	}
}
