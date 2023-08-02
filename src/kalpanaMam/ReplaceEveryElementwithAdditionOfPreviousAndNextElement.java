package kalpanaMam;

public class ReplaceEveryElementwithAdditionOfPreviousAndNextElement {

	public static void main(String[] args) {
		int a[]= {1,2,3};//1+2, 1+3, 2+3
		int b[]=new int[a.length];
		
		for(int i=0;i<a.length;i++)
		{
			try {
				b[i]=a[i-1]+a[i+1];
			}
			catch (Exception e) {
				if(i==0)
				{
					b[i]=a[i]+a[i+1];
				}
				else if(i==a.length-1)
				{
					b[i]=a[i-1]+a[i];
				}
					
				
			}
			
			
		}
		for(int i=0;i<a.length;i++)
		{System.out.print(b[i]);}
//		
//		
//		long a=1;
//		long b=2;
//		for(int i=1;i<15-1;i++)
//		{//1,2,3,7,22}
//			
//			//System.out.println(a+" "+b);
//			long c=(a*b)+1;
//			a=b;
//			b=c;
//			System.out.println(c);
//}

	}

}
