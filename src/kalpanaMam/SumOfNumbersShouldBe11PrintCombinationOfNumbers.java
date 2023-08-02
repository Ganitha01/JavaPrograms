package kalpanaMam;

public class SumOfNumbersShouldBe11PrintCombinationOfNumbers {

	public static void main(String[] args) {
		int a[]= {10,25,28,27,38,40};
		int x=64;int sum=0;int num1=0;int num2=0;
		int min=Integer.MAX_VALUE;
		
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{								
				int n=0;					
				sum=a[i]+a[j];
				if(sum>x)//63>64
				{
					continue;
				}
				else
				{
					n=x-sum;//1
			if(n<min)//1<min
			{
				min=n;//22,3,2
				num1=a[i];//25,25
				num2=a[j];//38,40
			}}
		}
			
			
	}
		System.out.println(num1+" "+num2);
}
}
