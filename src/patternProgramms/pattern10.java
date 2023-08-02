package patternProgramms;

public class pattern10 {
public static void main(String[] args) {
//	1 1 1 1 1 
//	2 2 2 2 2 
//	3 3 3 3 3 
//	4 4 4 4 4 
//	5 5 5 5 5 
	int k=1;
	for(int row=1;row<=5;row++)
	{
		for(int col=1;col<=5;col++)
		{
			if(k<=9 && k>=1)
			System.out.print(k+"  ");
			else
				System.out.print(k+" ");	
			k++;
		}
		System.out.println();
	}
}
}
