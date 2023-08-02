package kalpanaMam;

public class PrimeNumberForRangeOfValues {
 int k=20;
	public static void main(String[] args) {
		int k=30;
		for(int i=1;i<=100;i++)
		{int count=0;
			int num=i;
			
			for(int j=1;j<=num;j++)
			{
				if(num%j==0)
				{
					count++;
				}
					
			}
			if(count==2)
			{
				System.out.println(i+"---> is a prime number");
			}
		}
//		PrimeNumberForRangeOfValues p=new PrimeNumberForRangeOfValues();
//		System.out.println(p.k);
//		System.out.println(k);

	}

}
