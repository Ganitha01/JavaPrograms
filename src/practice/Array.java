package practice;

public class Array {
	public static void main(String[] args) {
		String data="abaaccc";

StringBuilder outBuilder = new StringBuilder();
char prevChar = data.charAt(0);
int counter = 0;
char currChar;
for (int i = 0; i < data.length(); i++) {
currChar = data.charAt(i);
if (currChar == prevChar) {
counter++;//1 2
// For the last unique characters
if (i == data.length() - 1) {
outBuilder.append(currChar);
outBuilder.append(counter);

}
continue;
} else {
outBuilder.append(prevChar);
outBuilder.append(counter);
prevChar = currChar;
counter = 1;
if(i==data.length()-1)
{
outBuilder.append(currChar);
outBuilder.append(counter);
			 
	}
}

}
System.out.println(outBuilder);
	}}


