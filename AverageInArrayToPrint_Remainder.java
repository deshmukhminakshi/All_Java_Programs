package array_Programs;

public class AverageInArrayToPrint_Remainder 
{

	public static void main(String[] args) 
	{
		int nums[]= {3,4,5,6,7};
		int sum=0;
		for(int i=0;i<nums.length;i++)
		{
			sum += nums[i];
		}
        float average=sum/nums.length;
        System.out.println(average);
	}

}
