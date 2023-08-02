package patternProgramms;

public class pattern16 {

	public static void main(String[] args) {
int star=1;
for(int i=1;i<10;i++)
{for(int j=1;j<=star;j++)
	{
		if(i%2!=0)
		{
		if(j%2==0)
		{
		System.out.print("* ");
		}
		else
		{
		System.out.print("  ");
		}}
		else
		{
			if(j%2!=0)
			{
			System.out.print("* ");
			}
			else
			{
			System.out.print("  ");
		}
		
	}
	}

	if(i<=4)
	{
		star=star+1;
	}
	else {
		star=star-1;
	}
	System.out.println();
}

	}

}
