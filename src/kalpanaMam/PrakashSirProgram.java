package kalpanaMam;

import java.util.ArrayList;
public class PrakashSirProgram {
	public static void main(String[] args) {

int a[]= {1,3,5,4};
int b[]= {9,8,7,4,5,6};//op{1,0,1,1,1,2,8,5,6}
int sum=0;String tsum="";
ArrayList<Integer> list=new ArrayList<>();
int length=a.length;

if(a.length<b.length)
{
	length=b.length;
}

for(int i=0;i<length;i++)
{
	try {
		sum=a[i]+b[i];
	}
	catch (Exception e) {
		if(b.length<a.length)
		{
		sum=a[i];
		}
		else
			sum=b[i];
	}

	
	tsum=tsum+Integer.toString(sum);

}
System.out.println(tsum);
for(int i=0;i<tsum.length();i++)
{
	list.add(Character.getNumericValue(tsum.charAt(i)));
}

System.out.println(list);
	}

}
