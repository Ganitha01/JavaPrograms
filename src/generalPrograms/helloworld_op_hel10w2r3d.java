package generalPrograms;

import java.util.LinkedHashSet;

public class helloworld_op_hel10w2r3d {

	public static void main(String[] args) {
		String s1="hello11 world";//op-[h, e, l, 1, o, 1, 2,  , w, 3, r, 4, d]
		int k=1;
		char arr[]=s1.toCharArray();
		LinkedHashSet<Object> set=new LinkedHashSet<Object>();
		
		for(char a:arr)
		{
			if(set.add(a)==false)
			{
				set.add(k++);
				
			}
			
			
		}
		System.out.println(set);

	}

}
