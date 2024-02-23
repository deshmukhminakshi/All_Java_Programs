package array_Programs;

import java.util.Arrays;

public class SortAscending_usingSort_Method 
{

	public static void main(String[] args) 
	{
		//defining an array of integer type
		int array[]=new int[] 
				{90,23,5,109,12,22,67,34};
		System.out.println("List of Elements: ");
        //sort method
		Arrays.sort(array);
		System.out.println("Sorted Elements in Ascending order: ");
		for(int i=0;i<array.length;i++)
		{
			System.out.println(array[i]);
		}
		
}
}