package generalPrograms;

public class CheckTheGivenNumberIsFabinocci {

	public static void main(String[] args) {
		int num=4;
		if(num>0)
		{
			int n=5*num*num+4;
			int n1=5*num*num-4;
			int sq=(int) Math.sqrt(n);
			System.out.println(sq);
			if(sq*sq==n || sq*sq==n1)
			{
				System.out.println("the given number is fabinocci number");
			}
			else
				System.out.println("the given number is not fabinocci number");
			
			
		}

	}

}
