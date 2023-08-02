package arrays;

public class CombinationOfNumbers {

	public static void main(String[] args) {
		int[] a= {1,3,8,2,9,4,7};
		int num=11;
//		for(int i=0;i<a.length;i++)
//		{
//			for(int j=i+1;j<a.length;j++)
//			{
//			if(a[i]+a[j]==num)
//			{
//				System.out.println(a[i]+" "+a[j]);
//			}
//		}
//
//	}
		
		for(int i=0;i<a.length-1;i++)
		{
			if (a[i]+a[i+1]==num)
			{
				System.out.println(a[i]+" "+a[i+1]);
				
			}
		}
		}

}
