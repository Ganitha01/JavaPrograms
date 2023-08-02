package kalpanaMam;

public class SumOfFirst3MinimumElements {

	public static void main(String[] args) {
		int a[]= {7, -6, 11, 9, 0, 4};
		int sum=0;
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length-1;j++)
			{
				if(a[j]>a[j+1])
				{
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
//		for(int i=0;i<a.length;i++)
//		{
//		System.out.print(a[i]);
//		}
		
		sum=a[0]+a[1]+a[2];
		System.out.println(sum);
		

	}

}
