package kalpanaMam;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
public class AnnaGramOf6digitNumber {
	public static void main(String[] args) {
		int num=125874;
		int pro=num*2;
		int ipLength=String.valueOf(num).length();
		int opLength=String.valueOf(pro).length();
		int count=ipLength;
		if(ipLength<opLength)
		count=opLength;
		LinkedList<Integer> num1=new LinkedList<>();
		LinkedList<Integer> pro1=new LinkedList<>();
		for(int i=0;i<count;i++)
		{
			int rem=num%10;
			num=num/10;
			num1.add(rem);
			int rem1=pro%10;
			pro=pro/10;
			pro1.add(rem1);
			
		}
		Collections.sort(num1);
		Collections.sort(pro1);
		System.out.println(num1);
			if(num1.containsAll(pro1))
				System.out.println("annagram");
		
		
		
//		for(int i=100000;i<=300000;i++)
//		{
//			int a[]=new int[7];
//			int b[]=new int[7];
//			Boolean flag=true;
//			int num=i*2;
//		String n=String.valueOf(i);
//		String s=String.valueOf(num);
//		for(int j=0;j<s.length();j++)
//		{
//			a[j]=Character.getNumericValue(s.charAt(j));
//			b[j]=Character.getNumericValue(n.charAt(j));
//		}
//Arrays.sort(a);
//Arrays.sort(b);
//
//for(int k=0;k<a.length;k++)
//{
//	if(a[k]==b[k])
//	{
//		
//	}
//	else
//	{
//		flag=false;
//	}
//	
//}
//if(flag)
//{
//	System.out.println(i+"is a annagram");
//}
//	}
//		
		
	}
}

