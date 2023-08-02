package kalpanaMam;


public class InterviewProgram {
	public static void main(String[] args) {
		int a[]= {10,22,28,29,30,25};//32,50,57,59,70
		int x=54;
		int sum=0;
		int min=Integer.MAX_VALUE;
		int num1=0;int num2=0;

		
		
		for(int i=0;i<a.length-1;i++)
		{
			int n=0;
			sum=a[i]+a[i+1];
			if(sum>x)
			{
				n=sum=x;
			}
			else
			{
				n=x-sum;
			}
			if(n<min)
			{
				min=n;
						num1=a[i];
				num2=a[i+1];
			}
			
		
	}
		System.out.println(num1+" "+num2);

}
}
