package generalPrograms;

import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args) {
	for(;;)
	{
	Scanner sc=new Scanner(System.in);
	int num=sc.nextInt();
	int count=0;
	for( int i=1;i<=num;i++)
	{
		if(num%i==0)
		{
			count++;
		}
		
	}
	if(count==2)
		System.out.println("Given number is prime number");
	else
		System.out.println("given number is not prime number");
	}

}
}
