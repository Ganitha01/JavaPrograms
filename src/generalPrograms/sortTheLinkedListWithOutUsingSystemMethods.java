package generalPrograms;

import java.util.LinkedList;

public class sortTheLinkedListWithOutUsingSystemMethods {

	public static void main(String[] args) {
		LinkedList<Integer> list=new LinkedList<Integer>();
		//Scanner sc=new Scanner(System.in);
		//System.out.println("enter 5 values");
			list.add(5);list.add(3);list.add(9);list.add(6);list.add(0);
		System.out.println(list);
		System.out.println(list.size());
		int num=list.size();
	//sorting
		for(int i=0;i<num;i++)
		{
			for(int j=0;j<num-1;j++)
			{
				if(list.get(j)>list.get(j+1))
				{
				int temp=list.get(j);
				list.set(j, list.get(j+1));
				list.set(j+1, temp);
				}
			}
		}
		System.out.println(list);

	}

}
