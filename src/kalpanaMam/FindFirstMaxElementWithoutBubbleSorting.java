package kalpanaMam;

public class FindFirstMaxElementWithoutBubbleSorting {

	public static void main(String[] args) {
		
		
		int a[]={7, -3, 0, 2, 1, -9};
		
		int max=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
		}
		
		System.out.println(max+" is the maximum number");

	}

}
