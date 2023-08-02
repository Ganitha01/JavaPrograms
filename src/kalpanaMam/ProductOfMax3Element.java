package kalpanaMam;

public class ProductOfMax3Element {

	public static void main(String[] args) {

		int a[]={7, -3, 0, 2, 1, -9};
		
		int product;
		
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

		product=a[a.length-1]*a[a.length-2]*a[a.length-3];
		System.out.println(product);
	}

}
