package generalPrograms;

public class PercentageOfPositive_negative_zeroNumbers {
	public static void main(String[] args) {
		
		int a[]= {10,30,4,-9,-1,0,4,-6};
		int posCount=0;int negCount=0;int zeroCount=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>0)
			{
				posCount++;
			}
			else if(a[i]<0)
			{
				negCount++;
			}
			else
			{
				zeroCount++;
			}
		}
	
		System.out.println("positive percentage is: " +posCount*100/a.length+"%");
		System.out.println("negative percentage is: " +negCount*100/a.length+"%");
		System.out.println("zero percentage is: " +zeroCount*100/a.length+"%");
	}

}
