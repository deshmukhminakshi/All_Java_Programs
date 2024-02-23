package array_Programs;

public class Sor_WithoutUsingMethod_AscendingSorting
{

	public static void main(String[] args) 
	{
		int[]a1=new int[]
		{78,43,90,43,23,12,0,-12};
		System.out.println("Array elements after sorting: ");
		for(int i=0;i<a1.length;i++)
		{
			for(int j=i+1;j<a1.length;j++)
			{
				int tmp=0;
				if(a1[i]>a1[j])
				{
					tmp=a1[i];
					a1[i]=a1[j];
					a1[j]=tmp;
				}
			}
			System.out.println(a1[i]);
		}

	}

}
