package kalpanaMam;

public class ArrayRotation {

	public static void main(String[] args) {

int a[]= {1,3,5,7,9};int temp;

//one position shifting

for(int i=a.length-2;i>=0;i--)
{
	temp=a[i];
	a[i]=a[i+1];
	a[i+1]=temp;
}
for(int i=0;i<a.length;i++)
{
System.out.print(a[i]);
}
System.out.println();



////multiple position shifting
//for(int j=0;j<2;j++)
//{
//for(int i=0;i<a.length-1;i++)
//{
//	temp=a[i];
//	a[i]=a[i+1];
//	a[i+1]=temp;
//}
//}
//for(int i=0;i<a.length;i++)
//{
//System.out.print(a[i]);
//}


	}

}
