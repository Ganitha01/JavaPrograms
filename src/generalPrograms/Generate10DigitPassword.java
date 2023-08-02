package generalPrograms;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Random;

public class Generate10DigitPassword {
public static Character generateRandomCharacter(String characterSet)
{

	Random r=new Random();
	int random=r.nextInt(characterSet.length());
	char upper_case=characterSet.charAt(random);
	return upper_case;
	
}
public static void main(String []args)
{
	for(int i=0;i<10;i++)
	{
		System.out.println(GeneratePassword());
	}
	
}
	public static String GeneratePassword() {
		String uppercase="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String lowercase=uppercase.toLowerCase();
		String num="0123456789";
		String special="!@#$%^&*()-_";
		String password="";
		LinkedList<Character> list=new LinkedList<>();
		for(int i=0;i<3;i++)
		{
			list.add(generateRandomCharacter(uppercase));
			
		}
		for(int i=0;i<3;i++)
		{
			list.add(generateRandomCharacter(lowercase));
		
		}
		for(int i=0;i<2;i++)
		{
			list.add(generateRandomCharacter(num));
	
		}
		for(int i=0;i<2;i++)
		{
			list.add(generateRandomCharacter(special));
		}
			
			Collections.shuffle(list);
			//System.out.println(list);
			for(Character c:list)
			{
				password=password+c;
			}
			

			return password;
			
			
			
		}

	}

