package generalPrograms;

public class ProgrameToFindCommonElementsOfArray {

	public static void main(String[] args) {
		
		int[] a= {2,5,1,6,8,4,4};
		int[] b= {5,9,3,7,6,1,6,7};
		int length=a.length;
		if(b.length>a.length)
		{
			length=b.length;
		}
		for(int i=0;i<length;i++)
		{
			for(int j=0;j<length;j++)
			{
				try {
					
				if(a[i]==b[j])
				{
					System.out.println(a[i]);
				}
				}
				catch (Exception e) {
				continue;
				}
			}
		}

	}

}
