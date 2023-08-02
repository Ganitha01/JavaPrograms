package arrays;

import java.util.LinkedHashSet;


public class MinimumNumberWithoutBB {

	public static void main(String[] args) {
		int a[]= {0,0,0,2,5,7,6,9,3,1};
		LinkedHashSet<Integer> set=new LinkedHashSet<Integer>();
		for(int i=0;i<a.length;i++)
		{
			set.add(a[i]);
		}
		System.out.println(set);
		int k=0;
		int b[]=new int[set.size()];
	for(int arr:set)
		{
			b[k]=arr;
			k++;
		}
	int min=b[0];
	int secMin=b[1];
	int thirdMin=b[2];
	
	for(int i=0;i<b.length;i++)
	{
		if(b[i]<min)
		{	secMin=min;
			min=b[i];
		}
		else if(b[i]>min && b[i]<secMin)
		{
			thirdMin=secMin;
			secMin=b[i];
		}
		else if(b[i]>secMin && b[i]<thirdMin)
		{
			thirdMin=b[i];
		}
		
	}
	
	System.out.println(min+" "+secMin+" "+thirdMin);

	}
}


