package kalpanaMam;

import java.util.LinkedList;

public class PrintRepetedNumbers_11_22_33_44 {

	public static void main(String[] args) {
		//LinkedList<Integer> list=new LinkedList<>();
		int a[]=new int[3];int k=0;
		
		for(int i=1;i<=100;i++)
		{int num=i;
			while(num>0)
			{
				int rem=num%10;
				a[k]=rem;
				num=num/10;
				k++;
				
			}
			k=0;
			if(a[0]==a[1])
			{
				System.out.println(i);
			}
		}
	

	}

}
