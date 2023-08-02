package kalpanaMam;

import java.util.HashMap;

public class SumOfDigitsShouldBe9InArrayUsingHashMap {

	public static void main(String[] args) {

int a[]={7,2,12,7,2,15};
int x=9;
HashMap<Integer, Integer> map=new HashMap<>();

for(int i=0;i<a.length;i++)
{
	for(int j=i+1;j<a.length;j++)
	{
		if(a[i]+a[j]==9)
		{
			if(!map.containsKey(a[i])&& !map.containsKey(a[j]))
			{
				map.put(a[i], a[j]);//7 2
			}
		}
	}
}
System.out.println(map);

//int num=123456;
//num=num/6;
//System.out.println(num);
// int rem=num%10;
//System.out.println(rem);
	}

}
