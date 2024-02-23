package array_Programs;

import java.util.Scanner;

public class ArrayInput_FromTheUser_UsingScannerClass 
{

	public static void main(String[] args) 
	{
		int a;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number of elements you want to store: ");
		a=sc.nextInt();
		int a1[]=new int[10];
		System.out.println("Enter the elements of the array: ");
		for(int i=0;i<a;i++)
		{
			a1[i]=sc.nextInt();
		}
		System.out.println("Array elements are: ");
        for(int i=0;i<a;i++)
       {
	    System.out.println(a1[i]);
       }
	  }

}
