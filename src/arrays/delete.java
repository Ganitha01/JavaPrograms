package arrays;

public class delete {

	public static void main(String[] args) {
	int a[]= {6,1,5,7,1,4,3,1,7,2};
	int b[]=new int[a.length];
	int temp;
	
	
	for (int i=0;i<a.length;i++)
	{int k=i; b[k]=a[i];
		for (int j=i+1;j<a.length;j++)
		{
			if(a[i]!=a[j])
			{
				b[k]=a[j];
				
				k++;
				
			}
			for (int m=0;m<a.length;m++)
			{
				System.out.println(b[m]);
			}	
			
		}
		
		for (int s=0;s<b.length;s++)
		{
			a[s]=b[s];
		}
	}
for (int k=0;k<a.length;k++)
{
	System.out.print(a[k]);
}
}
	}