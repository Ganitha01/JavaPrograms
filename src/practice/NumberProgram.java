package practice;

public class NumberProgram {

	public static void main(String[] args)
	{
		int num=12321;
		int sum=num;
		
		while(sum>9)
		{
			num=sum;
			sum=0;
			while(num>0)
			{ 
				int rem=num%10;
				sum=sum+rem;
				num=num/10;
			}

			//System.out.println(sum);
		}
		System.out.println(sum);

	}

}
