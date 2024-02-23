package array_Programs;

import java.util.Scanner;

public class Minimium_Maximium 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Size of Array: ");
		int n=sc.nextInt();
		int i,sum=0;
		int arr[]=new int[n]; //Creating N-size
		
		for(i=0;i<n;i++)
		{
			System.out.println("Enter No's: ");
			arr[i]=sc.nextInt();
		}
		int max_element=arr[0],min_element=arr[0]; //Initializing 1st element
		
		for(i=0;i<n;i++)
		{
			if(arr[i]> max_element)
			{
				max_element=arr[i];
			}
			if(arr[i]<min_element)
			{
				min_element=arr[i];
			}
		}
		
		//Printing Result
		System.out.println("Maximum Number: "+max_element);
		System.out.println("Minimum Number: "+min_element);
		
	}

}
