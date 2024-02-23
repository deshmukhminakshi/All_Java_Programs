package array_Programs;

import java.util.Scanner;

public class ToCheckGivenNo_IsPresentInAn_Array 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array: ");
		int N=sc.nextInt();
		System.out.println("Enter the array elements: ");
		int a1[]=new int[N];
		for(int i=0;i<N;i++)
		{
			a1[i]=sc.nextInt();
		}
		System.out.println("Enter key element");
		int key=sc.nextInt();
		for(int i=0;i<a1.length;i++)
		{
			if(a1[i]==key)
			{
				System.out.println("Element is present at: "+i);
				return;
			}
		}
		System.out.println(-1);
	}

}
