package array_Programs;

public class Maximium_Minium_withouScanner 
{

	public static void main(String[] args) 
	{
		int[] arr= {1,2,3,4,5};
		
		//Initialize the minimum and maximum elements
		int min=arr[0];
		int max=arr[0];
		
		//Iterate over the array
		for(int i=1;i<arr.length;i++)
		{
			//Update the minimum element if necessary
			if(arr[i]<min)
			{
				min=arr[i];
			}
			//Update the maximum element if necessary
			if(arr[i]>max)
			{
				max=arr[i];
			}
		}
		//Print the maximum and minimum elements
		System.out.println("Minimum element: "+min);
		System.out.println("Maximum element: "+max);
	}

	}
