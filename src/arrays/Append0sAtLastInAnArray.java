package arrays;

public class Append0sAtLastInAnArray {

	public static void main(String[] args) {
	int[] a= {0,1,1,0,1,-2};//1,1,1,0,0
	int min=0;
	int b[]=new int[a.length];
	
	for(int i=0;i<a.length;i++)
	{int k=1;
		if(a[i]==0)
		{
			b[b.length-k]=a[i];
			k++;
		}
		else
		{
			b[min]=a[i];
			min++;
		}
	}
	for (int i=0;i<a.length;i++)
	{
	System.out.print(b[i]);
	}

	
	
//	int b[]=new int[a.length];
//	int m=0;
//	int n=a.length-1;
//	for (int i=0;i<a.length;i++)
//	{
//		if(a[i]!=0)
//		{
//			b[m]=a[i];
//			m++;
//			
//		}
//		else
//		{
//			b[n]=a[i];
//			n--;
//		}
//	}
//	for (int i=0;i<a.length;i++)
//		{
//		System.out.print(b[i]);
//		}
	
	}

}
