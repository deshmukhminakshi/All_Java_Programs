package array_Programs;

public class Iterating_array 
{

	public static void main(String[] args) 
	{
		//Initialize array
		int[] a1= {1,2,3,4,5};
		
		//Create another array a2 with the size of a1
		int a2[]=new int[a1.length];
		
		//Copy all elements of one array into another
		for(int i=0;i<a1.length;i++)
		{
			a2[i]=a1[i];
		}
		
		System.out.println("Copied array: ");
		for(int i=0;i<a2.length;i++)
		{
			System.out.print(a2[i]+" ");
		}
	}

	}


