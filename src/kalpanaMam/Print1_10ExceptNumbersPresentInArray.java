package kalpanaMam;

public class Print1_10ExceptNumbersPresentInArray {

	public static void main(String[] args) {

 int a[]= {1,2,5};
 
 for(int i=1;i<=10;i++)
 {Boolean flag=true;
	 for(int j=0;j<a.length;j++)
	 {
		 if(a[j]==i)
		 {
			 flag=false;
		 }
		
	 }
		 if(flag)
		 {
			 System.out.println(i);
		 }
	 }
 }

	}


