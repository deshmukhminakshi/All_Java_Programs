package array_Programs;

import java.util.Arrays;

public class Desc_withoutusingMethod 
{

	public static void main(String[] args) 
	{
		int a1[]= {1,2,3,4,5,6,7,8,9,10};
		Arrays.sort(a1);
		reverse(a1);
		System.out.println(Arrays.toString(a1));
	}
	public static void reverse(int[] a1)
	{
		int a=a1.length;
		for(int i=0;i<a/2;i++)
		{
			int temp=a1[i];
			a1[i]=a1[a-i-1];
			a1[a-i-1]=temp;
		}
	}

}
