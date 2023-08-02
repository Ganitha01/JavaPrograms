package generalPrograms;

import java.util.LinkedHashSet;

public class ProductOf3minNumbers {

	public static void main(String[] args) {
		
		int a[]= {1,2,8,1,9,8,6,7,1,2,4};
		LinkedHashSet<Integer> set=new LinkedHashSet<Integer>();
		LinkedHashSet<Integer> set1=new LinkedHashSet<Integer>();
		for(int arr:a)
		{
			if(set.add(arr)==false)
			{
				set1.add(arr);
			}
		}
		System.out.println(set1);
		
//		LinkedHashMap<Integer, Integer> map=new LinkedHashMap<Integer, Integer>();
//		
//		for(int i=0;i<a.length;i++)
//		{
//			map.put(a[i], map.getOrDefault(a[i], 0)+1);
//		}
//		System.out.println(map);
//		for(Entry<Integer, Integer> m:map.entrySet())
//		{
//			if(m.getValue()>1)
//			{
//				System.out.println(m.getKey());
//			}
//		}
//		
//		
		
		//		LinkedHashSet<Integer> set=new LinkedHashSet<Integer>();
//		for(int i=0;i<a.length;i++)
//		{
//			set.add(a[i]);
//		}
//	//	int b[]=new int[set.size()];
//		int k=0;
//		Object[] b=set.toArray();
//		System.out.println(Arrays.toString(b));
////	for(Integer i:set)
////	{
////		b[k++]=i;
////		
////	}
//		int min=(Integer) b[0];
//		System.out.println(min);
//	int secMin=(Integer) b[1];
//	int thirdMin=(Integer) b[2];
//		
//		for(int i=1;i<b.length;i++)
//		{
//			int num=(Integer) b[i];
//			if(num<min)
//			{
//				secMin=min;
//				min=num;
//			}
//			else if(num<secMin && num>min)
//			{
//				thirdMin=secMin;
//				secMin=num;
//			}
//			else
//			{
//				thirdMin=num;
//			}
//		}
//		System.out.println(min+" "+secMin+" "+thirdMin);

	}

}
