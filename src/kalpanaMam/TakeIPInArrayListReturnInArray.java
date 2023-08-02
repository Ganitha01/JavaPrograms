package kalpanaMam;

import java.util.ArrayList;
import java.util.Scanner;

public class TakeIPInArrayListReturnInArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ArrayList<Integer> list=new ArrayList<>();
System.out.println("enter the numbers");
		for(int i=0;i<5;i++)
		{
			list.add(sc.nextInt());
		}
		
		System.out.println("wait for the op");
		
		Object[] arr=list.toArray();
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}

	}

}
