package generalPrograms;

import java.util.Scanner;

public class FactorialOfAnumber {

	public static void main(String[] args) {
		for(;;)
		{
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int fact=1;
		for(int i=num;i>0;i--)
		{
			fact=fact*i;
		}
System.out.println("Factorial of given number is "+fact);
		}
	}

}
