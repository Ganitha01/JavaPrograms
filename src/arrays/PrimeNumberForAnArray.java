package arrays;

public class PrimeNumberForAnArray {

	public static void main(String[] args) {
		
		int []a= {3,4,5,2,8,6};
		
		for(int i=0;i<a.length;i++)
		{
			int num=a[i];
			int count=0;
			for( int j=1;j<=num;j++)
			{
				if(num%j==0)
				{
					count++;
				}
				
			}
			if(count==2)
				System.out.println(a[i]+"--->is prime number");
			else
				System.out.println(a[i]+"---->is not prime number");
		}

	}

}
